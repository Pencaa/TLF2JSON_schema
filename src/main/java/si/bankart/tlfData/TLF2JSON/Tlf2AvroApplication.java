package si.bankart.tlfData.TLF2JSON;

import si.bankart.tlfData.TLF2JSON.TLF_DATA.gen.TLF_DATA;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import si.bankart.tlfData.TLF2JSON.Kafka.KafkaConsumer;
import si.bankart.tlfData.TLF2JSON.Utilities.Utils;

import java.io.IOException;

@SpringBootApplication
@EnableKafka
public class Tlf2AvroApplication implements ApplicationRunner {
	private static final Logger LOGGER = LoggerFactory.getLogger(Tlf2AvroApplication.class);

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	@Autowired
	private KafkaTemplate<String, TLF_DATA> kafkaTemplate1;

	@Value("${spring.kafka.producer.topic}")
	private String topicForProducer;

	@Value("${spring.kafka.consumer.topic}")
	private String topicForConsumer;

	public void sendMessage(String msg) {
		kafkaTemplate.send(topicForProducer, msg);
	}

	public static void main(String[] args) {
		SpringApplication.run(Tlf2AvroApplication.class, args);
	}

	@KafkaListener(topics = "${spring.kafka.consumer.topic}", groupId = "${spring.kafka.consumer.group-id}")
	public void listen(String message) throws IOException {

		LOGGER.info("Received Messasge");

		TLF_DATA data =  KafkaConsumer.consume(message);
		if(Utils.substring(message, 8, 2).equals("01")){
			ListenableFuture<SendResult<String, TLF_DATA>> future = kafkaTemplate1.send(topicForProducer, data);
			future.addCallback(
					new ListenableFutureCallback<SendResult<String, TLF_DATA>>() {
						@Override
						public void onSuccess(SendResult<String, TLF_DATA> result) {
							LOGGER.info(
									"Sent message=[{}] with offset=[{}]", data, result.getRecordMetadata().offset());
						}
						@Override
						public void onFailure(Throwable ex) {
							LOGGER.info("Unable to send message=[{}] due to : {}", data, ex.getMessage());
						}
					});
		}
		else{
			LOGGER.info("Ni pravi format");
		}

	}
	@Override
	public void run(ApplicationArguments args) throws Exception {

	}
}
