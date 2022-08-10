
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
 * The CI Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "E-COMM-GOODS-IND",
    "EXISTING-DEBT-IND",
    "DEFERRED-BILLING-IND",
    "RELN-PARTICIPANT-IND",
    "DPC-NUM",
    "PINPAD-ID",
    "ACQ-TERM-ID",
    "RCNCL-ENT",
    "ACQ-TERM-POST-DAT",
    "PRE-AUTH-CHRGBK",
    "ENHANCED-PRE-AUTH",
    "ADNL-RESP-CDE",
    "MC-ELEC-ACCPT-IND",
    "MRCH-ID",
    "PGM-IND",
    "USER-FLD1"
})
public class CI {

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
     * The E-COMM-GOODS-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("E-COMM-GOODS-IND")
    private String eCOMMGOODSIND = "";
    /**
     * The EXISTING-DEBT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("EXISTING-DEBT-IND")
    private String eXISTINGDEBTIND = "";
    /**
     * The DEFERRED-BILLING-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DEFERRED-BILLING-IND")
    private String dEFERREDBILLINGIND = "";
    /**
     * The RELN-PARTICIPANT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RELN-PARTICIPANT-IND")
    private String rELNPARTICIPANTIND = "";
    /**
     * The DPC-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DPC-NUM")
    private String dPCNUM = "";
    /**
     * The PINPAD-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PINPAD-ID")
    private String pINPADID = "";
    /**
     * The ACQ-TERM-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ACQ-TERM-ID")
    private String aCQTERMID = "";
    /**
     * The RCNCL-ENT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RCNCL-ENT")
    private String rCNCLENT = "";
    /**
     * The ACQ-TERM-POST-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ACQ-TERM-POST-DAT")
    private String aCQTERMPOSTDAT = "";
    /**
     * The PRE-AUTH-CHRGBK Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PRE-AUTH-CHRGBK")
    private String pREAUTHCHRGBK = "";
    /**
     * The ENHANCED-PRE-AUTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ENHANCED-PRE-AUTH")
    private String eNHANCEDPREAUTH = "";
    /**
     * The ADNL-RESP-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ADNL-RESP-CDE")
    private String aDNLRESPCDE = "";
    /**
     * The MC-ELEC-ACCPT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MC-ELEC-ACCPT-IND")
    private String mCELECACCPTIND = "";
    /**
     * The MRCH-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MRCH-ID")
    private String mRCHID = "";
    /**
     * The PGM-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PGM-IND")
    private String pGMIND = "";
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
     * The E-COMM-GOODS-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("E-COMM-GOODS-IND")
    public String getECOMMGOODSIND() {
        return eCOMMGOODSIND;
    }

    /**
     * The E-COMM-GOODS-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("E-COMM-GOODS-IND")
    public void setECOMMGOODSIND(String eCOMMGOODSIND) {
        this.eCOMMGOODSIND = eCOMMGOODSIND;
    }

    /**
     * The EXISTING-DEBT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("EXISTING-DEBT-IND")
    public String getEXISTINGDEBTIND() {
        return eXISTINGDEBTIND;
    }

    /**
     * The EXISTING-DEBT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("EXISTING-DEBT-IND")
    public void setEXISTINGDEBTIND(String eXISTINGDEBTIND) {
        this.eXISTINGDEBTIND = eXISTINGDEBTIND;
    }

    /**
     * The DEFERRED-BILLING-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DEFERRED-BILLING-IND")
    public String getDEFERREDBILLINGIND() {
        return dEFERREDBILLINGIND;
    }

    /**
     * The DEFERRED-BILLING-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DEFERRED-BILLING-IND")
    public void setDEFERREDBILLINGIND(String dEFERREDBILLINGIND) {
        this.dEFERREDBILLINGIND = dEFERREDBILLINGIND;
    }

    /**
     * The RELN-PARTICIPANT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RELN-PARTICIPANT-IND")
    public String getRELNPARTICIPANTIND() {
        return rELNPARTICIPANTIND;
    }

    /**
     * The RELN-PARTICIPANT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RELN-PARTICIPANT-IND")
    public void setRELNPARTICIPANTIND(String rELNPARTICIPANTIND) {
        this.rELNPARTICIPANTIND = rELNPARTICIPANTIND;
    }

    /**
     * The DPC-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DPC-NUM")
    public String getDPCNUM() {
        return dPCNUM;
    }

    /**
     * The DPC-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DPC-NUM")
    public void setDPCNUM(String dPCNUM) {
        this.dPCNUM = dPCNUM;
    }

    /**
     * The PINPAD-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PINPAD-ID")
    public String getPINPADID() {
        return pINPADID;
    }

    /**
     * The PINPAD-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PINPAD-ID")
    public void setPINPADID(String pINPADID) {
        this.pINPADID = pINPADID;
    }

    /**
     * The ACQ-TERM-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ACQ-TERM-ID")
    public String getACQTERMID() {
        return aCQTERMID;
    }

    /**
     * The ACQ-TERM-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ACQ-TERM-ID")
    public void setACQTERMID(String aCQTERMID) {
        this.aCQTERMID = aCQTERMID;
    }

    /**
     * The RCNCL-ENT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RCNCL-ENT")
    public String getRCNCLENT() {
        return rCNCLENT;
    }

    /**
     * The RCNCL-ENT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RCNCL-ENT")
    public void setRCNCLENT(String rCNCLENT) {
        this.rCNCLENT = rCNCLENT;
    }

    /**
     * The ACQ-TERM-POST-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ACQ-TERM-POST-DAT")
    public String getACQTERMPOSTDAT() {
        return aCQTERMPOSTDAT;
    }

    /**
     * The ACQ-TERM-POST-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ACQ-TERM-POST-DAT")
    public void setACQTERMPOSTDAT(String aCQTERMPOSTDAT) {
        this.aCQTERMPOSTDAT = aCQTERMPOSTDAT;
    }

    /**
     * The PRE-AUTH-CHRGBK Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PRE-AUTH-CHRGBK")
    public String getPREAUTHCHRGBK() {
        return pREAUTHCHRGBK;
    }

    /**
     * The PRE-AUTH-CHRGBK Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PRE-AUTH-CHRGBK")
    public void setPREAUTHCHRGBK(String pREAUTHCHRGBK) {
        this.pREAUTHCHRGBK = pREAUTHCHRGBK;
    }

    /**
     * The ENHANCED-PRE-AUTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ENHANCED-PRE-AUTH")
    public String getENHANCEDPREAUTH() {
        return eNHANCEDPREAUTH;
    }

    /**
     * The ENHANCED-PRE-AUTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ENHANCED-PRE-AUTH")
    public void setENHANCEDPREAUTH(String eNHANCEDPREAUTH) {
        this.eNHANCEDPREAUTH = eNHANCEDPREAUTH;
    }

    /**
     * The ADNL-RESP-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ADNL-RESP-CDE")
    public String getADNLRESPCDE() {
        return aDNLRESPCDE;
    }

    /**
     * The ADNL-RESP-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ADNL-RESP-CDE")
    public void setADNLRESPCDE(String aDNLRESPCDE) {
        this.aDNLRESPCDE = aDNLRESPCDE;
    }

    /**
     * The MC-ELEC-ACCPT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MC-ELEC-ACCPT-IND")
    public String getMCELECACCPTIND() {
        return mCELECACCPTIND;
    }

    /**
     * The MC-ELEC-ACCPT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MC-ELEC-ACCPT-IND")
    public void setMCELECACCPTIND(String mCELECACCPTIND) {
        this.mCELECACCPTIND = mCELECACCPTIND;
    }

    /**
     * The MRCH-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MRCH-ID")
    public String getMRCHID() {
        return mRCHID;
    }

    /**
     * The MRCH-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MRCH-ID")
    public void setMRCHID(String mRCHID) {
        this.mRCHID = mRCHID;
    }

    /**
     * The PGM-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PGM-IND")
    public String getPGMIND() {
        return pGMIND;
    }

    /**
     * The PGM-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PGM-IND")
    public void setPGMIND(String pGMIND) {
        this.pGMIND = pGMIND;
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
        return new HashCodeBuilder().append(tKNLEN).append(eCOMMGOODSIND).append(eXISTINGDEBTIND).append(dEFERREDBILLINGIND).append(rELNPARTICIPANTIND).append(dPCNUM).append(pINPADID).append(aCQTERMID).append(rCNCLENT).append(aCQTERMPOSTDAT).append(pREAUTHCHRGBK).append(eNHANCEDPREAUTH).append(aDNLRESPCDE).append(mCELECACCPTIND).append(mRCHID).append(pGMIND).append(uSERFLD1).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CI) == false) {
            return false;
        }
        CI rhs = ((CI) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(eCOMMGOODSIND, rhs.eCOMMGOODSIND).append(eXISTINGDEBTIND, rhs.eXISTINGDEBTIND).append(dEFERREDBILLINGIND, rhs.dEFERREDBILLINGIND).append(rELNPARTICIPANTIND, rhs.rELNPARTICIPANTIND).append(dPCNUM, rhs.dPCNUM).append(pINPADID, rhs.pINPADID).append(aCQTERMID, rhs.aCQTERMID).append(rCNCLENT, rhs.rCNCLENT).append(aCQTERMPOSTDAT, rhs.aCQTERMPOSTDAT).append(pREAUTHCHRGBK, rhs.pREAUTHCHRGBK).append(eNHANCEDPREAUTH, rhs.eNHANCEDPREAUTH).append(aDNLRESPCDE, rhs.aDNLRESPCDE).append(mCELECACCPTIND, rhs.mCELECACCPTIND).append(mRCHID, rhs.mRCHID).append(pGMIND, rhs.pGMIND).append(uSERFLD1, rhs.uSERFLD1).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
