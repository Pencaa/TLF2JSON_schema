
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
 * The SC Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "FRMT-CDE",
    "PAN-TKN-DATA",
    "TKN-ASSURANCE-LVL",
    "TKN-RQ-ID",
    "PAN-TKN-IND",
    "PAN-TKN-EXP-DAT",
    "TKN-TYP",
    "TXN-TYP",
    "USER-FLD1-ACI",
    "PAN-LAST-FOUR-DGT",
    "ACCT-STAT",
    "ACT-IND",
    "RPLMT-PAN-EXP-DAT",
    "TKN-STAT",
    "USER-FLD-ACI"
})
public class SC {

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
     * The FRMT-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FRMT-CDE")
    private String fRMTCDE = "";
    /**
     * The PAN-TKN-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PAN-TKN-DATA")
    private String pANTKNDATA = "";
    /**
     * The TKN-ASSURANCE-LVL Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TKN-ASSURANCE-LVL")
    private String tKNASSURANCELVL = "";
    /**
     * The TKN-RQ-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TKN-RQ-ID")
    private String tKNRQID = "";
    /**
     * The PAN-TKN-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PAN-TKN-IND")
    private String pANTKNIND = "";
    /**
     * The PAN-TKN-EXP-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PAN-TKN-EXP-DAT")
    private String pANTKNEXPDAT = "";
    /**
     * The TKN-TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TKN-TYP")
    private String tKNTYP = "";
    /**
     * The TXN-TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TXN-TYP")
    private String tXNTYP = "";
    /**
     * The USER-FLD1-ACI Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD1-ACI")
    private String uSERFLD1ACI = "";
    /**
     * The PAN-LAST-FOUR-DGT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PAN-LAST-FOUR-DGT")
    private String pANLASTFOURDGT = "";
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
     * The ACT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ACT-IND")
    private String aCTIND = "";
    /**
     * The RPLMT-PAN-EXP-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RPLMT-PAN-EXP-DAT")
    private String rPLMTPANEXPDAT = "";
    /**
     * The TKN-STAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TKN-STAT")
    private String tKNSTAT = "";
    /**
     * The USER-FLD-ACI Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD-ACI")
    private String uSERFLDACI = "";
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
     * The FRMT-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FRMT-CDE")
    public String getFRMTCDE() {
        return fRMTCDE;
    }

    /**
     * The FRMT-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FRMT-CDE")
    public void setFRMTCDE(String fRMTCDE) {
        this.fRMTCDE = fRMTCDE;
    }

    /**
     * The PAN-TKN-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PAN-TKN-DATA")
    public String getPANTKNDATA() {
        return pANTKNDATA;
    }

    /**
     * The PAN-TKN-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PAN-TKN-DATA")
    public void setPANTKNDATA(String pANTKNDATA) {
        this.pANTKNDATA = pANTKNDATA;
    }

    /**
     * The TKN-ASSURANCE-LVL Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TKN-ASSURANCE-LVL")
    public String getTKNASSURANCELVL() {
        return tKNASSURANCELVL;
    }

    /**
     * The TKN-ASSURANCE-LVL Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TKN-ASSURANCE-LVL")
    public void setTKNASSURANCELVL(String tKNASSURANCELVL) {
        this.tKNASSURANCELVL = tKNASSURANCELVL;
    }

    /**
     * The TKN-RQ-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TKN-RQ-ID")
    public String getTKNRQID() {
        return tKNRQID;
    }

    /**
     * The TKN-RQ-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TKN-RQ-ID")
    public void setTKNRQID(String tKNRQID) {
        this.tKNRQID = tKNRQID;
    }

    /**
     * The PAN-TKN-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PAN-TKN-IND")
    public String getPANTKNIND() {
        return pANTKNIND;
    }

    /**
     * The PAN-TKN-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PAN-TKN-IND")
    public void setPANTKNIND(String pANTKNIND) {
        this.pANTKNIND = pANTKNIND;
    }

    /**
     * The PAN-TKN-EXP-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PAN-TKN-EXP-DAT")
    public String getPANTKNEXPDAT() {
        return pANTKNEXPDAT;
    }

    /**
     * The PAN-TKN-EXP-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PAN-TKN-EXP-DAT")
    public void setPANTKNEXPDAT(String pANTKNEXPDAT) {
        this.pANTKNEXPDAT = pANTKNEXPDAT;
    }

    /**
     * The TKN-TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TKN-TYP")
    public String getTKNTYP() {
        return tKNTYP;
    }

    /**
     * The TKN-TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TKN-TYP")
    public void setTKNTYP(String tKNTYP) {
        this.tKNTYP = tKNTYP;
    }

    /**
     * The TXN-TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TXN-TYP")
    public String getTXNTYP() {
        return tXNTYP;
    }

    /**
     * The TXN-TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TXN-TYP")
    public void setTXNTYP(String tXNTYP) {
        this.tXNTYP = tXNTYP;
    }

    /**
     * The USER-FLD1-ACI Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD1-ACI")
    public String getUSERFLD1ACI() {
        return uSERFLD1ACI;
    }

    /**
     * The USER-FLD1-ACI Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD1-ACI")
    public void setUSERFLD1ACI(String uSERFLD1ACI) {
        this.uSERFLD1ACI = uSERFLD1ACI;
    }

    /**
     * The PAN-LAST-FOUR-DGT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PAN-LAST-FOUR-DGT")
    public String getPANLASTFOURDGT() {
        return pANLASTFOURDGT;
    }

    /**
     * The PAN-LAST-FOUR-DGT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PAN-LAST-FOUR-DGT")
    public void setPANLASTFOURDGT(String pANLASTFOURDGT) {
        this.pANLASTFOURDGT = pANLASTFOURDGT;
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
     * The ACT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ACT-IND")
    public String getACTIND() {
        return aCTIND;
    }

    /**
     * The ACT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ACT-IND")
    public void setACTIND(String aCTIND) {
        this.aCTIND = aCTIND;
    }

    /**
     * The RPLMT-PAN-EXP-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RPLMT-PAN-EXP-DAT")
    public String getRPLMTPANEXPDAT() {
        return rPLMTPANEXPDAT;
    }

    /**
     * The RPLMT-PAN-EXP-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RPLMT-PAN-EXP-DAT")
    public void setRPLMTPANEXPDAT(String rPLMTPANEXPDAT) {
        this.rPLMTPANEXPDAT = rPLMTPANEXPDAT;
    }

    /**
     * The TKN-STAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TKN-STAT")
    public String getTKNSTAT() {
        return tKNSTAT;
    }

    /**
     * The TKN-STAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TKN-STAT")
    public void setTKNSTAT(String tKNSTAT) {
        this.tKNSTAT = tKNSTAT;
    }

    /**
     * The USER-FLD-ACI Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD-ACI")
    public String getUSERFLDACI() {
        return uSERFLDACI;
    }

    /**
     * The USER-FLD-ACI Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD-ACI")
    public void setUSERFLDACI(String uSERFLDACI) {
        this.uSERFLDACI = uSERFLDACI;
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
        return new HashCodeBuilder().append(tKNLEN).append(fRMTCDE).append(pANTKNDATA).append(tKNASSURANCELVL).append(tKNRQID).append(pANTKNIND).append(pANTKNEXPDAT).append(tKNTYP).append(tXNTYP).append(uSERFLD1ACI).append(pANLASTFOURDGT).append(aCCTSTAT).append(aCTIND).append(rPLMTPANEXPDAT).append(tKNSTAT).append(uSERFLDACI).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SC) == false) {
            return false;
        }
        SC rhs = ((SC) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(fRMTCDE, rhs.fRMTCDE).append(pANTKNDATA, rhs.pANTKNDATA).append(tKNASSURANCELVL, rhs.tKNASSURANCELVL).append(tKNRQID, rhs.tKNRQID).append(pANTKNIND, rhs.pANTKNIND).append(pANTKNEXPDAT, rhs.pANTKNEXPDAT).append(tKNTYP, rhs.tKNTYP).append(tXNTYP, rhs.tXNTYP).append(uSERFLD1ACI, rhs.uSERFLD1ACI).append(pANLASTFOURDGT, rhs.pANLASTFOURDGT).append(aCCTSTAT, rhs.aCCTSTAT).append(aCTIND, rhs.aCTIND).append(rPLMTPANEXPDAT, rhs.rPLMTPANEXPDAT).append(tKNSTAT, rhs.tKNSTAT).append(uSERFLDACI, rhs.uSERFLDACI).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
