
package si.bankart.tlfData.TLF2JSON.TLF_DATA.gen;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * The 32 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "REAL-TIME-REQ-TYPE",
    "PIP-RESPONSE-REQUEST",
    "REAL-TIME-STATUS",
    "REAL-TIME-SCORE",
    "RTR-RULE-FIRED",
    "RTR-DISPOSITION",
    "RTR-FILLER"
})
public class _32 {

    /**
     * The TKN_LEN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TKN_LEN")
    private Integer tKNLEN = 0;
    /**
     * The REAL-TIME-REQ-TYPE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("REAL-TIME-REQ-TYPE")
    private String rEALTIMEREQTYPE = "";
    /**
     * The PIP-RESPONSE-REQUEST Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PIP-RESPONSE-REQUEST")
    private String pIPRESPONSEREQUEST = "";
    /**
     * The REAL-TIME-STATUS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("REAL-TIME-STATUS")
    private String rEALTIMESTATUS = "";
    /**
     * The REAL-TIME-SCORE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("REAL-TIME-SCORE")
    private String rEALTIMESCORE = "";
    /**
     * The RTR-RULE-FIRED Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RTR-RULE-FIRED")
    private String rTRRULEFIRED = "";
    /**
     * The RTR-DISPOSITION Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RTR-DISPOSITION")
    private String rTRDISPOSITION = "";
    /**
     * The RTR-FILLER Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RTR-FILLER")
    private String rTRFILLER = "";
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The TKN_LEN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TKN_LEN")
    public Integer getTKNLEN() {
        return tKNLEN;
    }

    /**
     * The TKN_LEN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TKN_LEN")
    public void setTKNLEN(Integer tKNLEN) {
        this.tKNLEN = tKNLEN;
    }

    /**
     * The REAL-TIME-REQ-TYPE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("REAL-TIME-REQ-TYPE")
    public String getREALTIMEREQTYPE() {
        return rEALTIMEREQTYPE;
    }

    /**
     * The REAL-TIME-REQ-TYPE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("REAL-TIME-REQ-TYPE")
    public void setREALTIMEREQTYPE(String rEALTIMEREQTYPE) {
        this.rEALTIMEREQTYPE = rEALTIMEREQTYPE;
    }

    /**
     * The PIP-RESPONSE-REQUEST Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PIP-RESPONSE-REQUEST")
    public String getPIPRESPONSEREQUEST() {
        return pIPRESPONSEREQUEST;
    }

    /**
     * The PIP-RESPONSE-REQUEST Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PIP-RESPONSE-REQUEST")
    public void setPIPRESPONSEREQUEST(String pIPRESPONSEREQUEST) {
        this.pIPRESPONSEREQUEST = pIPRESPONSEREQUEST;
    }

    /**
     * The REAL-TIME-STATUS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("REAL-TIME-STATUS")
    public String getREALTIMESTATUS() {
        return rEALTIMESTATUS;
    }

    /**
     * The REAL-TIME-STATUS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("REAL-TIME-STATUS")
    public void setREALTIMESTATUS(String rEALTIMESTATUS) {
        this.rEALTIMESTATUS = rEALTIMESTATUS;
    }

    /**
     * The REAL-TIME-SCORE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("REAL-TIME-SCORE")
    public String getREALTIMESCORE() {
        return rEALTIMESCORE;
    }

    /**
     * The REAL-TIME-SCORE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("REAL-TIME-SCORE")
    public void setREALTIMESCORE(String rEALTIMESCORE) {
        this.rEALTIMESCORE = rEALTIMESCORE;
    }

    /**
     * The RTR-RULE-FIRED Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RTR-RULE-FIRED")
    public String getRTRRULEFIRED() {
        return rTRRULEFIRED;
    }

    /**
     * The RTR-RULE-FIRED Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RTR-RULE-FIRED")
    public void setRTRRULEFIRED(String rTRRULEFIRED) {
        this.rTRRULEFIRED = rTRRULEFIRED;
    }

    /**
     * The RTR-DISPOSITION Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RTR-DISPOSITION")
    public String getRTRDISPOSITION() {
        return rTRDISPOSITION;
    }

    /**
     * The RTR-DISPOSITION Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RTR-DISPOSITION")
    public void setRTRDISPOSITION(String rTRDISPOSITION) {
        this.rTRDISPOSITION = rTRDISPOSITION;
    }

    /**
     * The RTR-FILLER Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RTR-FILLER")
    public String getRTRFILLER() {
        return rTRFILLER;
    }

    /**
     * The RTR-FILLER Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RTR-FILLER")
    public void setRTRFILLER(String rTRFILLER) {
        this.rTRFILLER = rTRFILLER;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tKNLEN).append(rEALTIMEREQTYPE).append(pIPRESPONSEREQUEST).append(rEALTIMESTATUS).append(rEALTIMESCORE).append(rTRRULEFIRED).append(rTRDISPOSITION).append(rTRFILLER).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _32) == false) {
            return false;
        }
        _32 rhs = ((_32) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(rEALTIMEREQTYPE, rhs.rEALTIMEREQTYPE).append(pIPRESPONSEREQUEST, rhs.pIPRESPONSEREQUEST).append(rEALTIMESTATUS, rhs.rEALTIMESTATUS).append(rEALTIMESCORE, rhs.rEALTIMESCORE).append(rTRRULEFIRED, rhs.rTRRULEFIRED).append(rTRDISPOSITION, rhs.rTRDISPOSITION).append(rTRFILLER, rhs.rTRFILLER).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
