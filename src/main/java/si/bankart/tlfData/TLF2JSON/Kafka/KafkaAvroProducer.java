package si.bankart.tlfData.TLF2JSON.Kafka;

import org.codehaus.jackson.schema.JsonSerializableSchema;
import si.bankart.tlfData.TLF2JSON.TLF_DATA.gen.TLF_DATA;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import java.util.HashMap;
import java.util.Map;


@Configuration
public class KafkaAvroProducer {
    @Value("${spring.kafka.bootstrap-servers}")
    private String bootstrapServers;

    @Bean
    public ProducerFactory<String, TLF_DATA> producerFactoryTlf() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put("key.converter.schema.registry.url", "http://ckafkadevl.tbankart.si:8081/");
        configProps.put("value.converter.schema.registry.url", "http://ckafkadevl.tbankart.si:8081/");
        configProps.put("schema.registry.url", "http://ckafkadevl.tbankart.si:8081/");

        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializableSchema.class);
        configProps.put(ProducerConfig.SCHEMA_REGISTRY_URL_CONFIG,"http://ckafkadevl.tbankart.si:8081/");
        return new DefaultKafkaProducerFactory<>(configProps);
    }

    @Bean
    public KafkaTemplate<String, TLF_DATA> kafkaTemplateTlf() {
        return new KafkaTemplate<String, TLF_DATA>(producerFactoryTlf());
    }
    @Bean
    public ProducerFactory<String, String> producerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put("key.converter.schema.registry.url", "http://ckafkadevl.tbankart.si:8081/");
        configProps.put("value.converter.schema.registry.url", "http://ckafkadevl.tbankart.si:8081/");
        configProps.put("schema.registry.url", "http://ckafkadevl.tbankart.si:8081/");

        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class.getName());
        configProps.put(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG,"http://ckafkadevl.tbankart.si:8081/");
        return new DefaultKafkaProducerFactory(configProps);
    }
    @Bean
    public KafkaTemplate<String, String> kafkaTemplate() {
        return new KafkaTemplate<String, String>(producerFactory());
    }
}

