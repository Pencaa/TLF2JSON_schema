
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
 * The 28 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "EXP-DAT",
    "CUR-AUTH-AMT",
    "PEND-AUTHS",
    "PREFIX-LGTH",
    "OPEN-TO-BUY",
    "AUTH-LMT",
    "AUTH-BAL",
    "LAST-PMNT-DAT",
    "LAST-PMNT-AMT",
    "ACCT-STAT",
    "CRD-STAT",
    "AUTH-LMT-IND",
    "USER-FLD1"
})
public class _28 {

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
     * The EXP-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("EXP-DAT")
    private String eXPDAT = "";
    /**
     * The CUR-AUTH-AMT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CUR-AUTH-AMT")
    private String cURAUTHAMT = "";
    /**
     * The PEND-AUTHS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PEND-AUTHS")
    private String pENDAUTHS = "";
    /**
     * The PREFIX-LGTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PREFIX-LGTH")
    private String pREFIXLGTH = "";
    /**
     * The OPEN-TO-BUY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("OPEN-TO-BUY")
    private String oPENTOBUY = "";
    /**
     * The AUTH-LMT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH-LMT")
    private String aUTHLMT = "";
    /**
     * The AUTH-BAL Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH-BAL")
    private String aUTHBAL = "";
    /**
     * The LAST-PMNT-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LAST-PMNT-DAT")
    private String lASTPMNTDAT = "";
    /**
     * The LAST-PMNT-AMT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LAST-PMNT-AMT")
    private String lASTPMNTAMT = "";
    /**
     * The ACCT-STAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ACCT-STAT")
    private String aCCTSTAT = "";
    /**
     * The CRD-STAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-STAT")
    private String cRDSTAT = "";
    /**
     * The AUTH-LMT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH-LMT-IND")
    private String aUTHLMTIND = "";
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
     * The CUR-AUTH-AMT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CUR-AUTH-AMT")
    public String getCURAUTHAMT() {
        return cURAUTHAMT;
    }

    /**
     * The CUR-AUTH-AMT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CUR-AUTH-AMT")
    public void setCURAUTHAMT(String cURAUTHAMT) {
        this.cURAUTHAMT = cURAUTHAMT;
    }

    /**
     * The PEND-AUTHS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PEND-AUTHS")
    public String getPENDAUTHS() {
        return pENDAUTHS;
    }

    /**
     * The PEND-AUTHS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PEND-AUTHS")
    public void setPENDAUTHS(String pENDAUTHS) {
        this.pENDAUTHS = pENDAUTHS;
    }

    /**
     * The PREFIX-LGTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PREFIX-LGTH")
    public String getPREFIXLGTH() {
        return pREFIXLGTH;
    }

    /**
     * The PREFIX-LGTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PREFIX-LGTH")
    public void setPREFIXLGTH(String pREFIXLGTH) {
        this.pREFIXLGTH = pREFIXLGTH;
    }

    /**
     * The OPEN-TO-BUY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("OPEN-TO-BUY")
    public String getOPENTOBUY() {
        return oPENTOBUY;
    }

    /**
     * The OPEN-TO-BUY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("OPEN-TO-BUY")
    public void setOPENTOBUY(String oPENTOBUY) {
        this.oPENTOBUY = oPENTOBUY;
    }

    /**
     * The AUTH-LMT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH-LMT")
    public String getAUTHLMT() {
        return aUTHLMT;
    }

    /**
     * The AUTH-LMT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH-LMT")
    public void setAUTHLMT(String aUTHLMT) {
        this.aUTHLMT = aUTHLMT;
    }

    /**
     * The AUTH-BAL Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH-BAL")
    public String getAUTHBAL() {
        return aUTHBAL;
    }

    /**
     * The AUTH-BAL Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH-BAL")
    public void setAUTHBAL(String aUTHBAL) {
        this.aUTHBAL = aUTHBAL;
    }

    /**
     * The LAST-PMNT-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LAST-PMNT-DAT")
    public String getLASTPMNTDAT() {
        return lASTPMNTDAT;
    }

    /**
     * The LAST-PMNT-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LAST-PMNT-DAT")
    public void setLASTPMNTDAT(String lASTPMNTDAT) {
        this.lASTPMNTDAT = lASTPMNTDAT;
    }

    /**
     * The LAST-PMNT-AMT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LAST-PMNT-AMT")
    public String getLASTPMNTAMT() {
        return lASTPMNTAMT;
    }

    /**
     * The LAST-PMNT-AMT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LAST-PMNT-AMT")
    public void setLASTPMNTAMT(String lASTPMNTAMT) {
        this.lASTPMNTAMT = lASTPMNTAMT;
    }

    /**
     * The ACCT-STAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ACCT-STAT")
    public String getACCTSTAT() {
        return aCCTSTAT;
    }

    /**
     * The ACCT-STAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ACCT-STAT")
    public void setACCTSTAT(String aCCTSTAT) {
        this.aCCTSTAT = aCCTSTAT;
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

    /**
     * The AUTH-LMT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH-LMT-IND")
    public String getAUTHLMTIND() {
        return aUTHLMTIND;
    }

    /**
     * The AUTH-LMT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH-LMT-IND")
    public void setAUTHLMTIND(String aUTHLMTIND) {
        this.aUTHLMTIND = aUTHLMTIND;
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
        return new HashCodeBuilder().append(tKNLEN).append(eXPDAT).append(cURAUTHAMT).append(pENDAUTHS).append(pREFIXLGTH).append(oPENTOBUY).append(aUTHLMT).append(aUTHBAL).append(lASTPMNTDAT).append(lASTPMNTAMT).append(aCCTSTAT).append(cRDSTAT).append(aUTHLMTIND).append(uSERFLD1).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _28) == false) {
            return false;
        }
        _28 rhs = ((_28) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(eXPDAT, rhs.eXPDAT).append(cURAUTHAMT, rhs.cURAUTHAMT).append(pENDAUTHS, rhs.pENDAUTHS).append(pREFIXLGTH, rhs.pREFIXLGTH).append(oPENTOBUY, rhs.oPENTOBUY).append(aUTHLMT, rhs.aUTHLMT).append(aUTHBAL, rhs.aUTHBAL).append(lASTPMNTDAT, rhs.lASTPMNTDAT).append(lASTPMNTAMT, rhs.lASTPMNTAMT).append(aCCTSTAT, rhs.aCCTSTAT).append(cRDSTAT, rhs.cRDSTAT).append(aUTHLMTIND, rhs.aUTHLMTIND).append(uSERFLD1, rhs.uSERFLD1).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
