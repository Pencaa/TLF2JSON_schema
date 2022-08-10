
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
 * The 24 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "CRD-TYP",
    "AUTH-ONLY",
    "SVC-IND",
    "EXP-DAT",
    "CASH-DEP-FLG",
    "CRD-STAT"
})
public class _24 {

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
     * The CRD-TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-TYP")
    private String cRDTYP = "";
    /**
     * The AUTH-ONLY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH-ONLY")
    private String aUTHONLY = "";
    /**
     * The SVC-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SVC-IND")
    private String sVCIND = "";
    /**
     * The EXP-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("EXP-DAT")
    private String eXPDAT = "";
    /**
     * The CASH-DEP-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CASH-DEP-FLG")
    private String cASHDEPFLG = "";
    /**
     * The CRD-STAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-STAT")
    private String cRDSTAT = "";
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
     * The CRD-TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-TYP")
    public String getCRDTYP() {
        return cRDTYP;
    }

    /**
     * The CRD-TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-TYP")
    public void setCRDTYP(String cRDTYP) {
        this.cRDTYP = cRDTYP;
    }

    /**
     * The AUTH-ONLY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH-ONLY")
    public String getAUTHONLY() {
        return aUTHONLY;
    }

    /**
     * The AUTH-ONLY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH-ONLY")
    public void setAUTHONLY(String aUTHONLY) {
        this.aUTHONLY = aUTHONLY;
    }

    /**
     * The SVC-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SVC-IND")
    public String getSVCIND() {
        return sVCIND;
    }

    /**
     * The SVC-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SVC-IND")
    public void setSVCIND(String sVCIND) {
        this.sVCIND = sVCIND;
    }

    /**
     * The EXP-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("EXP-DAT")
    public String getEXPDAT() {
        return eXPDAT;
    }

    /**
     * The EXP-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("EXP-DAT")
    public void setEXPDAT(String eXPDAT) {
        this.eXPDAT = eXPDAT;
    }

    /**
     * The CASH-DEP-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CASH-DEP-FLG")
    public String getCASHDEPFLG() {
        return cASHDEPFLG;
    }

    /**
     * The CASH-DEP-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CASH-DEP-FLG")
    public void setCASHDEPFLG(String cASHDEPFLG) {
        this.cASHDEPFLG = cASHDEPFLG;
    }

    /**
     * The CRD-STAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-STAT")
    public String getCRDSTAT() {
        return cRDSTAT;
    }

    /**
     * The CRD-STAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-STAT")
    public void setCRDSTAT(String cRDSTAT) {
        this.cRDSTAT = cRDSTAT;
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
        return new HashCodeBuilder().append(tKNLEN).append(cRDTYP).append(aUTHONLY).append(sVCIND).append(eXPDAT).append(cASHDEPFLG).append(cRDSTAT).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _24) == false) {
            return false;
        }
        _24 rhs = ((_24) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(cRDTYP, rhs.cRDTYP).append(aUTHONLY, rhs.aUTHONLY).append(sVCIND, rhs.sVCIND).append(eXPDAT, rhs.eXPDAT).append(cASHDEPFLG, rhs.cASHDEPFLG).append(cRDSTAT, rhs.cRDSTAT).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
