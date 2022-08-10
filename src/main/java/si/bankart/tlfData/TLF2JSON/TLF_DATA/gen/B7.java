
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
    "RBA",
    "TLF-NAM",
    "TKN-RETRV-OPT",
    "KEY-DATA",
    "FILE-FRMT",
    "USER-FLD1"
})
public class B7 {

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
     * The RBA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RBA")
    private String rBA = "";
    /**
     * The TLF-NAM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TLF-NAM")
    private String tLFNAM = "";
    /**
     * The TKN-RETRV-OPT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TKN-RETRV-OPT")
    private String tKNRETRVOPT = "";
    /**
     * The KEY-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KEY-DATA")
    private String kEYDATA = "";
    /**
     * The FILE-FRMT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FILE-FRMT")
    private String fILEFRMT = "";
    /**
     * The USER-FLD1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD1")
    private String uSERFLD1 = "";
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
     * The RBA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RBA")
    public String getRBA() {
        return rBA;
    }

    /**
     * The RBA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RBA")
    public void setRBA(String rBA) {
        this.rBA = rBA;
    }

    /**
     * The TLF-NAM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TLF-NAM")
    public String getTLFNAM() {
        return tLFNAM;
    }

    /**
     * The TLF-NAM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TLF-NAM")
    public void setTLFNAM(String tLFNAM) {
        this.tLFNAM = tLFNAM;
    }

    /**
     * The TKN-RETRV-OPT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TKN-RETRV-OPT")
    public String getTKNRETRVOPT() {
        return tKNRETRVOPT;
    }

    /**
     * The TKN-RETRV-OPT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TKN-RETRV-OPT")
    public void setTKNRETRVOPT(String tKNRETRVOPT) {
        this.tKNRETRVOPT = tKNRETRVOPT;
    }

    /**
     * The KEY-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KEY-DATA")
    public String getKEYDATA() {
        return kEYDATA;
    }

    /**
     * The KEY-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("KEY-DATA")
    public void setKEYDATA(String kEYDATA) {
        this.kEYDATA = kEYDATA;
    }

    /**
     * The FILE-FRMT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FILE-FRMT")
    public String getFILEFRMT() {
        return fILEFRMT;
    }

    /**
     * The FILE-FRMT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FILE-FRMT")
    public void setFILEFRMT(String fILEFRMT) {
        this.fILEFRMT = fILEFRMT;
    }

    /**
     * The USER-FLD1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD1")
    public String getUSERFLD1() {
        return uSERFLD1;
    }

    /**
     * The USER-FLD1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD1")
    public void setUSERFLD1(String uSERFLD1) {
        this.uSERFLD1 = uSERFLD1;
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
        return new HashCodeBuilder().append(tKNLEN).append(rBA).append(tLFNAM).append(tKNRETRVOPT).append(kEYDATA).append(fILEFRMT).append(uSERFLD1).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof B7) == false) {
            return false;
        }
        B7 rhs = ((B7) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(rBA, rhs.rBA).append(tLFNAM, rhs.tLFNAM).append(tKNRETRVOPT, rhs.tKNRETRVOPT).append(kEYDATA, rhs.kEYDATA).append(fILEFRMT, rhs.fILEFRMT).append(uSERFLD1, rhs.uSERFLD1).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
