
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
 * The P9 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "MESSAGE-TYPE",
    "CORRELATION-ID",
    "NUM-ACTIVE-TKNS",
    "ISSUER-PROD-CONFIG-ID",
    "CONSUMER-LANG",
    "DEVICE-NAME",
    "FINAL-TKN-DECISION",
    "FINAL-TKN-DECISION-IND",
    "TERMS-COND-ID",
    "TERMS-COND-DAT-TIM",
    "NUM-ACT-ATTEMPTS",
    "TKN-UNIQUE-REF",
    "PAN-UNIQUE-REF",
    "TOKEN-TYPE"
})
public class P9 {

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
     * The MESSAGE-TYPE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MESSAGE-TYPE")
    private String mESSAGETYPE = "";
    /**
     * The CORRELATION-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CORRELATION-ID")
    private String cORRELATIONID = "";
    /**
     * The NUM-ACTIVE-TKNS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NUM-ACTIVE-TKNS")
    private String nUMACTIVETKNS = "";
    /**
     * The ISSUER-PROD-CONFIG-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISSUER-PROD-CONFIG-ID")
    private String iSSUERPRODCONFIGID = "";
    /**
     * The CONSUMER-LANG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CONSUMER-LANG")
    private String cONSUMERLANG = "";
    /**
     * The DEVICE-NAME Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DEVICE-NAME")
    private String dEVICENAME = "";
    /**
     * The FINAL-TKN-DECISION Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FINAL-TKN-DECISION")
    private String fINALTKNDECISION = "";
    /**
     * The FINAL-TKN-DECISION-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FINAL-TKN-DECISION-IND")
    private String fINALTKNDECISIONIND = "";
    /**
     * The TERMS-COND-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERMS-COND-ID")
    private String tERMSCONDID = "";
    /**
     * The TERMS-COND-DAT-TIM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERMS-COND-DAT-TIM")
    private String tERMSCONDDATTIM = "";
    /**
     * The NUM-ACT-ATTEMPTS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NUM-ACT-ATTEMPTS")
    private String nUMACTATTEMPTS = "";
    /**
     * The TKN-UNIQUE-REF Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TKN-UNIQUE-REF")
    private String tKNUNIQUEREF = "";
    /**
     * The PAN-UNIQUE-REF Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PAN-UNIQUE-REF")
    private String pANUNIQUEREF = "";
    /**
     * The TOKEN-TYPE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TOKEN-TYPE")
    private String tOKENTYPE = "";
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
     * The MESSAGE-TYPE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MESSAGE-TYPE")
    public String getMESSAGETYPE() {
        return mESSAGETYPE;
    }

    /**
     * The MESSAGE-TYPE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MESSAGE-TYPE")
    public void setMESSAGETYPE(String mESSAGETYPE) {
        this.mESSAGETYPE = mESSAGETYPE;
    }

    /**
     * The CORRELATION-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CORRELATION-ID")
    public String getCORRELATIONID() {
        return cORRELATIONID;
    }

    /**
     * The CORRELATION-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CORRELATION-ID")
    public void setCORRELATIONID(String cORRELATIONID) {
        this.cORRELATIONID = cORRELATIONID;
    }

    /**
     * The NUM-ACTIVE-TKNS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NUM-ACTIVE-TKNS")
    public String getNUMACTIVETKNS() {
        return nUMACTIVETKNS;
    }

    /**
     * The NUM-ACTIVE-TKNS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NUM-ACTIVE-TKNS")
    public void setNUMACTIVETKNS(String nUMACTIVETKNS) {
        this.nUMACTIVETKNS = nUMACTIVETKNS;
    }

    /**
     * The ISSUER-PROD-CONFIG-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISSUER-PROD-CONFIG-ID")
    public String getISSUERPRODCONFIGID() {
        return iSSUERPRODCONFIGID;
    }

    /**
     * The ISSUER-PROD-CONFIG-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISSUER-PROD-CONFIG-ID")
    public void setISSUERPRODCONFIGID(String iSSUERPRODCONFIGID) {
        this.iSSUERPRODCONFIGID = iSSUERPRODCONFIGID;
    }

    /**
     * The CONSUMER-LANG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CONSUMER-LANG")
    public String getCONSUMERLANG() {
        return cONSUMERLANG;
    }

    /**
     * The CONSUMER-LANG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CONSUMER-LANG")
    public void setCONSUMERLANG(String cONSUMERLANG) {
        this.cONSUMERLANG = cONSUMERLANG;
    }

    /**
     * The DEVICE-NAME Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DEVICE-NAME")
    public String getDEVICENAME() {
        return dEVICENAME;
    }

    /**
     * The DEVICE-NAME Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DEVICE-NAME")
    public void setDEVICENAME(String dEVICENAME) {
        this.dEVICENAME = dEVICENAME;
    }

    /**
     * The FINAL-TKN-DECISION Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FINAL-TKN-DECISION")
    public String getFINALTKNDECISION() {
        return fINALTKNDECISION;
    }

    /**
     * The FINAL-TKN-DECISION Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FINAL-TKN-DECISION")
    public void setFINALTKNDECISION(String fINALTKNDECISION) {
        this.fINALTKNDECISION = fINALTKNDECISION;
    }

    /**
     * The FINAL-TKN-DECISION-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FINAL-TKN-DECISION-IND")
    public String getFINALTKNDECISIONIND() {
        return fINALTKNDECISIONIND;
    }

    /**
     * The FINAL-TKN-DECISION-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FINAL-TKN-DECISION-IND")
    public void setFINALTKNDECISIONIND(String fINALTKNDECISIONIND) {
        this.fINALTKNDECISIONIND = fINALTKNDECISIONIND;
    }

    /**
     * The TERMS-COND-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERMS-COND-ID")
    public String getTERMSCONDID() {
        return tERMSCONDID;
    }

    /**
     * The TERMS-COND-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERMS-COND-ID")
    public void setTERMSCONDID(String tERMSCONDID) {
        this.tERMSCONDID = tERMSCONDID;
    }

    /**
     * The TERMS-COND-DAT-TIM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERMS-COND-DAT-TIM")
    public String getTERMSCONDDATTIM() {
        return tERMSCONDDATTIM;
    }

    /**
     * The TERMS-COND-DAT-TIM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERMS-COND-DAT-TIM")
    public void setTERMSCONDDATTIM(String tERMSCONDDATTIM) {
        this.tERMSCONDDATTIM = tERMSCONDDATTIM;
    }

    /**
     * The NUM-ACT-ATTEMPTS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NUM-ACT-ATTEMPTS")
    public String getNUMACTATTEMPTS() {
        return nUMACTATTEMPTS;
    }

    /**
     * The NUM-ACT-ATTEMPTS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NUM-ACT-ATTEMPTS")
    public void setNUMACTATTEMPTS(String nUMACTATTEMPTS) {
        this.nUMACTATTEMPTS = nUMACTATTEMPTS;
    }

    /**
     * The TKN-UNIQUE-REF Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TKN-UNIQUE-REF")
    public String getTKNUNIQUEREF() {
        return tKNUNIQUEREF;
    }

    /**
     * The TKN-UNIQUE-REF Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TKN-UNIQUE-REF")
    public void setTKNUNIQUEREF(String tKNUNIQUEREF) {
        this.tKNUNIQUEREF = tKNUNIQUEREF;
    }

    /**
     * The PAN-UNIQUE-REF Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PAN-UNIQUE-REF")
    public String getPANUNIQUEREF() {
        return pANUNIQUEREF;
    }

    /**
     * The PAN-UNIQUE-REF Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PAN-UNIQUE-REF")
    public void setPANUNIQUEREF(String pANUNIQUEREF) {
        this.pANUNIQUEREF = pANUNIQUEREF;
    }

    /**
     * The TOKEN-TYPE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TOKEN-TYPE")
    public String getTOKENTYPE() {
        return tOKENTYPE;
    }

    /**
     * The TOKEN-TYPE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TOKEN-TYPE")
    public void setTOKENTYPE(String tOKENTYPE) {
        this.tOKENTYPE = tOKENTYPE;
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
        return new HashCodeBuilder().append(tKNLEN).append(mESSAGETYPE).append(cORRELATIONID).append(nUMACTIVETKNS).append(iSSUERPRODCONFIGID).append(cONSUMERLANG).append(dEVICENAME).append(fINALTKNDECISION).append(fINALTKNDECISIONIND).append(tERMSCONDID).append(tERMSCONDDATTIM).append(nUMACTATTEMPTS).append(tKNUNIQUEREF).append(pANUNIQUEREF).append(tOKENTYPE).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof P9) == false) {
            return false;
        }
        P9 rhs = ((P9) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(mESSAGETYPE, rhs.mESSAGETYPE).append(cORRELATIONID, rhs.cORRELATIONID).append(nUMACTIVETKNS, rhs.nUMACTIVETKNS).append(iSSUERPRODCONFIGID, rhs.iSSUERPRODCONFIGID).append(cONSUMERLANG, rhs.cONSUMERLANG).append(dEVICENAME, rhs.dEVICENAME).append(fINALTKNDECISION, rhs.fINALTKNDECISION).append(fINALTKNDECISIONIND, rhs.fINALTKNDECISIONIND).append(tERMSCONDID, rhs.tERMSCONDID).append(tERMSCONDDATTIM, rhs.tERMSCONDDATTIM).append(nUMACTATTEMPTS, rhs.nUMACTATTEMPTS).append(tKNUNIQUEREF, rhs.tKNUNIQUEREF).append(pANUNIQUEREF, rhs.pANUNIQUEREF).append(tOKENTYPE, rhs.tOKENTYPE).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
