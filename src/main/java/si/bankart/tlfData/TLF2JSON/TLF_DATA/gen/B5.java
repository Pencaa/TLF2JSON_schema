
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
 * The B7 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "ISS-AUTH-DATA-LGTH",
    "ARPC",
    "ADDL-DATA",
    "SEND-CRD-BLK",
    "SEND-PUT-DATA"
})
public class B5 {

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
     * The ISS-AUTH-DATA-LGTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISS-AUTH-DATA-LGTH")
    private Integer iSSAUTHDATALGTH = 0;
    /**
     * The ARPC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ARPC")
    private String aRPC = "";
    /**
     * The ADDL-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ADDL-DATA")
    private String aDDLDATA = "";
    /**
     * The SEND-CRD-BLK Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SEND-CRD-BLK")
    private String sENDCRDBLK = "";
    /**
     * The SEND-PUT-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SEND-PUT-DATA")
    private String sENDPUTDATA = "";
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
     * The ISS-AUTH-DATA-LGTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISS-AUTH-DATA-LGTH")
    public Integer getISSAUTHDATALGTH() {
        return iSSAUTHDATALGTH;
    }

    /**
     * The ISS-AUTH-DATA-LGTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISS-AUTH-DATA-LGTH")
    public void setISSAUTHDATALGTH(Integer iSSAUTHDATALGTH) {
        this.iSSAUTHDATALGTH = iSSAUTHDATALGTH;
    }

    /**
     * The ARPC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ARPC")
    public String getARPC() {
        return aRPC;
    }

    /**
     * The ARPC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ARPC")
    public void setARPC(String aRPC) {
        this.aRPC = aRPC;
    }

    /**
     * The ADDL-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ADDL-DATA")
    public String getADDLDATA() {
        return aDDLDATA;
    }

    /**
     * The ADDL-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ADDL-DATA")
    public void setADDLDATA(String aDDLDATA) {
        this.aDDLDATA = aDDLDATA;
    }

    /**
     * The SEND-CRD-BLK Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SEND-CRD-BLK")
    public String getSENDCRDBLK() {
        return sENDCRDBLK;
    }

    /**
     * The SEND-CRD-BLK Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SEND-CRD-BLK")
    public void setSENDCRDBLK(String sENDCRDBLK) {
        this.sENDCRDBLK = sENDCRDBLK;
    }

    /**
     * The SEND-PUT-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SEND-PUT-DATA")
    public String getSENDPUTDATA() {
        return sENDPUTDATA;
    }

    /**
     * The SEND-PUT-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SEND-PUT-DATA")
    public void setSENDPUTDATA(String sENDPUTDATA) {
        this.sENDPUTDATA = sENDPUTDATA;
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
        return new HashCodeBuilder().append(tKNLEN).append(iSSAUTHDATALGTH).append(aRPC).append(aDDLDATA).append(sENDCRDBLK).append(sENDPUTDATA).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof B5) == false) {
            return false;
        }
        B5 rhs = ((B5) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(iSSAUTHDATALGTH, rhs.iSSAUTHDATALGTH).append(aRPC, rhs.aRPC).append(aDDLDATA, rhs.aDDLDATA).append(sENDCRDBLK, rhs.sENDCRDBLK).append(sENDPUTDATA, rhs.sENDPUTDATA).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
