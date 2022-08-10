
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
 * The 03 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "ERR-FLG",
    "LOCL-PIN-VRFY-FLG",
    "CRD-VRFY-FLG",
    "COMPLETE-TRACK2-DATA",
    "UAF-FLG",
    "RCPT-RQSTD"
})
public class _03 {

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
     * The ERR-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ERR-FLG")
    private String eRRFLG = "";
    /**
     * The LOCL-PIN-VRFY-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LOCL-PIN-VRFY-FLG")
    private String lOCLPINVRFYFLG = "";
    /**
     * The CRD-VRFY-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-VRFY-FLG")
    private String cRDVRFYFLG = "";
    /**
     * The COMPLETE-TRACK2-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("COMPLETE-TRACK2-DATA")
    private String cOMPLETETRACK2DATA = "";
    /**
     * The UAF-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UAF-FLG")
    private String uAFFLG = "";
    /**
     * The RCPT-RQSTD Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RCPT-RQSTD")
    private String rCPTRQSTD = "";
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
     * The ERR-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ERR-FLG")
    public String getERRFLG() {
        return eRRFLG;
    }

    /**
     * The ERR-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ERR-FLG")
    public void setERRFLG(String eRRFLG) {
        this.eRRFLG = eRRFLG;
    }

    /**
     * The LOCL-PIN-VRFY-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LOCL-PIN-VRFY-FLG")
    public String getLOCLPINVRFYFLG() {
        return lOCLPINVRFYFLG;
    }

    /**
     * The LOCL-PIN-VRFY-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LOCL-PIN-VRFY-FLG")
    public void setLOCLPINVRFYFLG(String lOCLPINVRFYFLG) {
        this.lOCLPINVRFYFLG = lOCLPINVRFYFLG;
    }

    /**
     * The CRD-VRFY-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-VRFY-FLG")
    public String getCRDVRFYFLG() {
        return cRDVRFYFLG;
    }

    /**
     * The CRD-VRFY-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-VRFY-FLG")
    public void setCRDVRFYFLG(String cRDVRFYFLG) {
        this.cRDVRFYFLG = cRDVRFYFLG;
    }

    /**
     * The COMPLETE-TRACK2-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("COMPLETE-TRACK2-DATA")
    public String getCOMPLETETRACK2DATA() {
        return cOMPLETETRACK2DATA;
    }

    /**
     * The COMPLETE-TRACK2-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("COMPLETE-TRACK2-DATA")
    public void setCOMPLETETRACK2DATA(String cOMPLETETRACK2DATA) {
        this.cOMPLETETRACK2DATA = cOMPLETETRACK2DATA;
    }

    /**
     * The UAF-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UAF-FLG")
    public String getUAFFLG() {
        return uAFFLG;
    }

    /**
     * The UAF-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UAF-FLG")
    public void setUAFFLG(String uAFFLG) {
        this.uAFFLG = uAFFLG;
    }

    /**
     * The RCPT-RQSTD Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RCPT-RQSTD")
    public String getRCPTRQSTD() {
        return rCPTRQSTD;
    }

    /**
     * The RCPT-RQSTD Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RCPT-RQSTD")
    public void setRCPTRQSTD(String rCPTRQSTD) {
        this.rCPTRQSTD = rCPTRQSTD;
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
        return new HashCodeBuilder().append(tKNLEN).append(eRRFLG).append(lOCLPINVRFYFLG).append(cRDVRFYFLG).append(cOMPLETETRACK2DATA).append(uAFFLG).append(rCPTRQSTD).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _03) == false) {
            return false;
        }
        _03 rhs = ((_03) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(eRRFLG, rhs.eRRFLG).append(lOCLPINVRFYFLG, rhs.lOCLPINVRFYFLG).append(cRDVRFYFLG, rhs.cRDVRFYFLG).append(cOMPLETETRACK2DATA, rhs.cOMPLETETRACK2DATA).append(uAFFLG, rhs.uAFFLG).append(rCPTRQSTD, rhs.rCPTRQSTD).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
