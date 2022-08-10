
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
 * The BE Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "AMT-1",
    "AMT-2",
    "CRNCY-CDE",
    "CONV-RATE",
    "CONV-DAT",
    "CONV-IND",
    "USER-FLD1"
})
public class BE {

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
     * The AMT-1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AMT-1")
    private Integer aMT1;
    /**
     * The AMT-2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AMT-2")
    private Integer aMT2;
    /**
     * The CRNCY-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRNCY-CDE")
    private String cRNCYCDE = "";
    /**
     * The CONV-RATE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CONV-RATE")
    private String cONVRATE = "";
    /**
     * The CONV-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CONV-DAT")
    private String cONVDAT = "";
    /**
     * The CONV-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CONV-IND")
    private String cONVIND = "";
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
     * The AMT-1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AMT-1")
    public Integer getAMT1() {
        return aMT1;
    }

    /**
     * The AMT-1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AMT-1")
    public void setAMT1(Integer aMT1) {
        this.aMT1 = aMT1;
    }

    /**
     * The AMT-2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AMT-2")
    public Integer getAMT2() {
        return aMT2;
    }

    /**
     * The AMT-2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AMT-2")
    public void setAMT2(Integer aMT2) {
        this.aMT2 = aMT2;
    }

    /**
     * The CRNCY-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRNCY-CDE")
    public String getCRNCYCDE() {
        return cRNCYCDE;
    }

    /**
     * The CRNCY-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRNCY-CDE")
    public void setCRNCYCDE(String cRNCYCDE) {
        this.cRNCYCDE = cRNCYCDE;
    }

    /**
     * The CONV-RATE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CONV-RATE")
    public String getCONVRATE() {
        return cONVRATE;
    }

    /**
     * The CONV-RATE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CONV-RATE")
    public void setCONVRATE(String cONVRATE) {
        this.cONVRATE = cONVRATE;
    }

    /**
     * The CONV-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CONV-DAT")
    public String getCONVDAT() {
        return cONVDAT;
    }

    /**
     * The CONV-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CONV-DAT")
    public void setCONVDAT(String cONVDAT) {
        this.cONVDAT = cONVDAT;
    }

    /**
     * The CONV-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CONV-IND")
    public String getCONVIND() {
        return cONVIND;
    }

    /**
     * The CONV-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CONV-IND")
    public void setCONVIND(String cONVIND) {
        this.cONVIND = cONVIND;
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
        return new HashCodeBuilder().append(tKNLEN).append(aMT1).append(aMT2).append(cRNCYCDE).append(cONVRATE).append(cONVDAT).append(cONVIND).append(uSERFLD1).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BE) == false) {
            return false;
        }
        BE rhs = ((BE) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(aMT1, rhs.aMT1).append(aMT2, rhs.aMT2).append(cRNCYCDE, rhs.cRNCYCDE).append(cONVRATE, rhs.cONVRATE).append(cONVDAT, rhs.cONVDAT).append(cONVIND, rhs.cONVIND).append(uSERFLD1, rhs.uSERFLD1).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
