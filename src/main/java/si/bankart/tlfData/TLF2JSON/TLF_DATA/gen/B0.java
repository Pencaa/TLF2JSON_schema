
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
 * The B0 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "LGHT",
    "FIID",
    "VER-ID",
    "LOCAL-TIM",
    "LOCAL-DAT",
    "ADVICE-RSN-CDE",
    "POS-ENTRY-MDE",
    "RESP-CDE",
    "CRD-VRFY-RESULT",
    "VISA-ACCT-STAT-IND",
    "AUTHN-IND",
    "USER-FLD-ACI2",
    "PROC-CDE",
    "ON-BEHALF",
    "MCHIP-PRO-IND",
    "MCHIP-PROC-INFO",
    "TRAN-FEE",
    "E-COM-SEC-LVL-IND",
    "AVS-RESULT",
    "ACCT-NUM-IND",
    "ADVC-DETL-CDE",
    "AUTH-AGENT-ID-CDE",
    "PMNT-TXN-TYP-IND",
    "CHIP-BIT-ERR-RSLTS",
    "CRD-LVL-RSLT",
    "MC-GTWY-TXN-IND",
    "MC-ASGN-ID-SUB-FLD-32",
    "VPAN",
    "RTE-IND",
    "VISA-MKT-SPCFC-DATA",
    "NTL-POS-DATA",
    "PIN-SVC-CDE",
    "PIN-CAP-CDE",
    "AUTH-SYS-ADV-DAT-TIM",
    "FRAUD-DATA",
    "PMNT-INITIATION-CHAN",
    "TLE-COMPLIANT-IND",
    "UKPT-COMPLIANT-IND",
    "SANCTION-SCRN-SCORE",
    "VISA-SPEND-QUALIFIED-IND",
    "TXN-INTGTY-CLAS",
    "ORIG-E-COM-SEC-LVL-IND",
    "E-COM-SEC-DOWNGRADE-RSN",
    "ADVC-DETL-TXT",
    "WALLET-ID"
})
public class B0 {

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
     * The LGHT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LGHT")
    private Integer lGHT = 0;
    /**
     * The FIID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FIID")
    private String fIID = "";
    /**
     * The VER-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VER-ID")
    private String vERID = "";
    /**
     * The LOCAL-TIM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LOCAL-TIM")
    private String lOCALTIM = "";
    /**
     * The LOCAL-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LOCAL-DAT")
    private String lOCALDAT = "";
    /**
     * The ADVICE-RSN-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ADVICE-RSN-CDE")
    private String aDVICERSNCDE = "";
    /**
     * The POS-ENTRY-MDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("POS-ENTRY-MDE")
    private String pOSENTRYMDE = "";
    /**
     * The RESP-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RESP-CDE")
    private String rESPCDE = "";
    /**
     * The CRD-VRFY-RESULT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-VRFY-RESULT")
    private String cRDVRFYRESULT = "";
    /**
     * The VISA-ACCT-STAT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VISA-ACCT-STAT-IND")
    private String vISAACCTSTATIND = "";
    /**
     * The AUTHN-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTHN-IND")
    private String aUTHNIND = "";
    /**
     * The USER-FLD-ACI2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD-ACI2")
    private String uSERFLDACI2 = "";
    /**
     * The PROC-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PROC-CDE")
    private String pROCCDE = "";
    /**
     * The ON-BEHALF Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ON-BEHALF")
    private String oNBEHALF = "";
    /**
     * The MCHIP-PRO-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MCHIP-PRO-IND")
    private String mCHIPPROIND = "";
    /**
     * The MCHIP-PROC-INFO Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MCHIP-PROC-INFO")
    private String mCHIPPROCINFO = "";
    /**
     * The TRAN-FEE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRAN-FEE")
    private String tRANFEE = "";
    /**
     * The E-COM-SEC-LVL-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("E-COM-SEC-LVL-IND")
    private String eCOMSECLVLIND = "";
    /**
     * The AVS-RESULT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AVS-RESULT")
    private String aVSRESULT = "";
    /**
     * The ACCT-NUM-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ACCT-NUM-IND")
    private String aCCTNUMIND = "";
    /**
     * The ADVC-DETL-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ADVC-DETL-CDE")
    private String aDVCDETLCDE = "";
    /**
     * The AUTH-AGENT-ID-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH-AGENT-ID-CDE")
    private String aUTHAGENTIDCDE = "";
    /**
     * The PMNT-TXN-TYP-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PMNT-TXN-TYP-IND")
    private String pMNTTXNTYPIND = "";
    /**
     * The CHIP-BIT-ERR-RSLTS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CHIP-BIT-ERR-RSLTS")
    private String cHIPBITERRRSLTS = "";
    /**
     * The CRD-LVL-RSLT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-LVL-RSLT")
    private String cRDLVLRSLT = "";
    /**
     * The MC-GTWY-TXN-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MC-GTWY-TXN-IND")
    private String mCGTWYTXNIND = "";
    /**
     * The MC-ASGN-ID-SUB-FLD-32 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MC-ASGN-ID-SUB-FLD-32")
    private String mCASGNIDSUBFLD32 = "";
    /**
     * The VPAN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VPAN")
    private String vPAN = "";
    /**
     * The RTE-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RTE-IND")
    private String rTEIND = "";
    /**
     * The VISA-MKT-SPCFC-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VISA-MKT-SPCFC-DATA")
    private String vISAMKTSPCFCDATA = "";
    /**
     * The NTL-POS-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NTL-POS-DATA")
    private String nTLPOSDATA = "";
    /**
     * The PIN-SVC-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PIN-SVC-CDE")
    private String pINSVCCDE = "";
    /**
     * The PIN-CAP-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PIN-CAP-CDE")
    private String pINCAPCDE = "";
    /**
     * The AUTH-SYS-ADV-DAT-TIM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH-SYS-ADV-DAT-TIM")
    private String aUTHSYSADVDATTIM = "";
    /**
     * The FRAUD-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FRAUD-DATA")
    private String fRAUDDATA = "";
    /**
     * The PMNT-INITIATION-CHAN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PMNT-INITIATION-CHAN")
    private String pMNTINITIATIONCHAN = "";
    /**
     * The TLE-COMPLIANT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TLE-COMPLIANT-IND")
    private String tLECOMPLIANTIND = "";
    /**
     * The UKPT-COMPLIANT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UKPT-COMPLIANT-IND")
    private String uKPTCOMPLIANTIND = "";
    /**
     * The SANCTION-SCRN-SCORE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SANCTION-SCRN-SCORE")
    private String sANCTIONSCRNSCORE = "";
    /**
     * The VISA-SPEND-QUALIFIED-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VISA-SPEND-QUALIFIED-IND")
    private String vISASPENDQUALIFIEDIND = "";
    /**
     * The TXN-INTGTY-CLAS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TXN-INTGTY-CLAS")
    private String tXNINTGTYCLAS = "";
    /**
     * The ORIG-E-COM-SEC-LVL-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ORIG-E-COM-SEC-LVL-IND")
    private String oRIGECOMSECLVLIND = "";
    /**
     * The E-COM-SEC-DOWNGRADE-RSN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("E-COM-SEC-DOWNGRADE-RSN")
    private String eCOMSECDOWNGRADERSN = "";
    /**
     * The ADVC-DETL-TXT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ADVC-DETL-TXT")
    private String aDVCDETLTXT = "";
    /**
     * The WALLET-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("WALLET-ID")
    private String wALLETID = "";
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
     * The LGHT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LGHT")
    public Integer getLGHT() {
        return lGHT;
    }

    /**
     * The LGHT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LGHT")
    public void setLGHT(Integer lGHT) {
        this.lGHT = lGHT;
    }

    /**
     * The FIID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FIID")
    public String getFIID() {
        return fIID;
    }

    /**
     * The FIID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FIID")
    public void setFIID(String fIID) {
        this.fIID = fIID;
    }

    /**
     * The VER-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VER-ID")
    public String getVERID() {
        return vERID;
    }

    /**
     * The VER-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VER-ID")
    public void setVERID(String vERID) {
        this.vERID = vERID;
    }

    /**
     * The LOCAL-TIM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LOCAL-TIM")
    public String getLOCALTIM() {
        return lOCALTIM;
    }

    /**
     * The LOCAL-TIM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LOCAL-TIM")
    public void setLOCALTIM(String lOCALTIM) {
        this.lOCALTIM = lOCALTIM;
    }

    /**
     * The LOCAL-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LOCAL-DAT")
    public String getLOCALDAT() {
        return lOCALDAT;
    }

    /**
     * The LOCAL-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LOCAL-DAT")
    public void setLOCALDAT(String lOCALDAT) {
        this.lOCALDAT = lOCALDAT;
    }

    /**
     * The ADVICE-RSN-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ADVICE-RSN-CDE")
    public String getADVICERSNCDE() {
        return aDVICERSNCDE;
    }

    /**
     * The ADVICE-RSN-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ADVICE-RSN-CDE")
    public void setADVICERSNCDE(String aDVICERSNCDE) {
        this.aDVICERSNCDE = aDVICERSNCDE;
    }

    /**
     * The POS-ENTRY-MDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("POS-ENTRY-MDE")
    public String getPOSENTRYMDE() {
        return pOSENTRYMDE;
    }

    /**
     * The POS-ENTRY-MDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("POS-ENTRY-MDE")
    public void setPOSENTRYMDE(String pOSENTRYMDE) {
        this.pOSENTRYMDE = pOSENTRYMDE;
    }

    /**
     * The RESP-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RESP-CDE")
    public String getRESPCDE() {
        return rESPCDE;
    }

    /**
     * The RESP-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RESP-CDE")
    public void setRESPCDE(String rESPCDE) {
        this.rESPCDE = rESPCDE;
    }

    /**
     * The CRD-VRFY-RESULT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-VRFY-RESULT")
    public String getCRDVRFYRESULT() {
        return cRDVRFYRESULT;
    }

    /**
     * The CRD-VRFY-RESULT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-VRFY-RESULT")
    public void setCRDVRFYRESULT(String cRDVRFYRESULT) {
        this.cRDVRFYRESULT = cRDVRFYRESULT;
    }

    /**
     * The VISA-ACCT-STAT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VISA-ACCT-STAT-IND")
    public String getVISAACCTSTATIND() {
        return vISAACCTSTATIND;
    }

    /**
     * The VISA-ACCT-STAT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VISA-ACCT-STAT-IND")
    public void setVISAACCTSTATIND(String vISAACCTSTATIND) {
        this.vISAACCTSTATIND = vISAACCTSTATIND;
    }

    /**
     * The AUTHN-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTHN-IND")
    public String getAUTHNIND() {
        return aUTHNIND;
    }

    /**
     * The AUTHN-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTHN-IND")
    public void setAUTHNIND(String aUTHNIND) {
        this.aUTHNIND = aUTHNIND;
    }

    /**
     * The USER-FLD-ACI2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD-ACI2")
    public String getUSERFLDACI2() {
        return uSERFLDACI2;
    }

    /**
     * The USER-FLD-ACI2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD-ACI2")
    public void setUSERFLDACI2(String uSERFLDACI2) {
        this.uSERFLDACI2 = uSERFLDACI2;
    }

    /**
     * The PROC-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PROC-CDE")
    public String getPROCCDE() {
        return pROCCDE;
    }

    /**
     * The PROC-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PROC-CDE")
    public void setPROCCDE(String pROCCDE) {
        this.pROCCDE = pROCCDE;
    }

    /**
     * The ON-BEHALF Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ON-BEHALF")
    public String getONBEHALF() {
        return oNBEHALF;
    }

    /**
     * The ON-BEHALF Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ON-BEHALF")
    public void setONBEHALF(String oNBEHALF) {
        this.oNBEHALF = oNBEHALF;
    }

    /**
     * The MCHIP-PRO-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MCHIP-PRO-IND")
    public String getMCHIPPROIND() {
        return mCHIPPROIND;
    }

    /**
     * The MCHIP-PRO-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MCHIP-PRO-IND")
    public void setMCHIPPROIND(String mCHIPPROIND) {
        this.mCHIPPROIND = mCHIPPROIND;
    }

    /**
     * The MCHIP-PROC-INFO Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MCHIP-PROC-INFO")
    public String getMCHIPPROCINFO() {
        return mCHIPPROCINFO;
    }

    /**
     * The MCHIP-PROC-INFO Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MCHIP-PROC-INFO")
    public void setMCHIPPROCINFO(String mCHIPPROCINFO) {
        this.mCHIPPROCINFO = mCHIPPROCINFO;
    }

    /**
     * The TRAN-FEE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRAN-FEE")
    public String getTRANFEE() {
        return tRANFEE;
    }

    /**
     * The TRAN-FEE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRAN-FEE")
    public void setTRANFEE(String tRANFEE) {
        this.tRANFEE = tRANFEE;
    }

    /**
     * The E-COM-SEC-LVL-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("E-COM-SEC-LVL-IND")
    public String getECOMSECLVLIND() {
        return eCOMSECLVLIND;
    }

    /**
     * The E-COM-SEC-LVL-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("E-COM-SEC-LVL-IND")
    public void setECOMSECLVLIND(String eCOMSECLVLIND) {
        this.eCOMSECLVLIND = eCOMSECLVLIND;
    }

    /**
     * The AVS-RESULT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AVS-RESULT")
    public String getAVSRESULT() {
        return aVSRESULT;
    }

    /**
     * The AVS-RESULT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AVS-RESULT")
    public void setAVSRESULT(String aVSRESULT) {
        this.aVSRESULT = aVSRESULT;
    }

    /**
     * The ACCT-NUM-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ACCT-NUM-IND")
    public String getACCTNUMIND() {
        return aCCTNUMIND;
    }

    /**
     * The ACCT-NUM-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ACCT-NUM-IND")
    public void setACCTNUMIND(String aCCTNUMIND) {
        this.aCCTNUMIND = aCCTNUMIND;
    }

    /**
     * The ADVC-DETL-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ADVC-DETL-CDE")
    public String getADVCDETLCDE() {
        return aDVCDETLCDE;
    }

    /**
     * The ADVC-DETL-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ADVC-DETL-CDE")
    public void setADVCDETLCDE(String aDVCDETLCDE) {
        this.aDVCDETLCDE = aDVCDETLCDE;
    }

    /**
     * The AUTH-AGENT-ID-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH-AGENT-ID-CDE")
    public String getAUTHAGENTIDCDE() {
        return aUTHAGENTIDCDE;
    }

    /**
     * The AUTH-AGENT-ID-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH-AGENT-ID-CDE")
    public void setAUTHAGENTIDCDE(String aUTHAGENTIDCDE) {
        this.aUTHAGENTIDCDE = aUTHAGENTIDCDE;
    }

    /**
     * The PMNT-TXN-TYP-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PMNT-TXN-TYP-IND")
    public String getPMNTTXNTYPIND() {
        return pMNTTXNTYPIND;
    }

    /**
     * The PMNT-TXN-TYP-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PMNT-TXN-TYP-IND")
    public void setPMNTTXNTYPIND(String pMNTTXNTYPIND) {
        this.pMNTTXNTYPIND = pMNTTXNTYPIND;
    }

    /**
     * The CHIP-BIT-ERR-RSLTS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CHIP-BIT-ERR-RSLTS")
    public String getCHIPBITERRRSLTS() {
        return cHIPBITERRRSLTS;
    }

    /**
     * The CHIP-BIT-ERR-RSLTS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CHIP-BIT-ERR-RSLTS")
    public void setCHIPBITERRRSLTS(String cHIPBITERRRSLTS) {
        this.cHIPBITERRRSLTS = cHIPBITERRRSLTS;
    }

    /**
     * The CRD-LVL-RSLT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-LVL-RSLT")
    public String getCRDLVLRSLT() {
        return cRDLVLRSLT;
    }

    /**
     * The CRD-LVL-RSLT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-LVL-RSLT")
    public void setCRDLVLRSLT(String cRDLVLRSLT) {
        this.cRDLVLRSLT = cRDLVLRSLT;
    }

    /**
     * The MC-GTWY-TXN-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MC-GTWY-TXN-IND")
    public String getMCGTWYTXNIND() {
        return mCGTWYTXNIND;
    }

    /**
     * The MC-GTWY-TXN-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MC-GTWY-TXN-IND")
    public void setMCGTWYTXNIND(String mCGTWYTXNIND) {
        this.mCGTWYTXNIND = mCGTWYTXNIND;
    }

    /**
     * The MC-ASGN-ID-SUB-FLD-32 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MC-ASGN-ID-SUB-FLD-32")
    public String getMCASGNIDSUBFLD32() {
        return mCASGNIDSUBFLD32;
    }

    /**
     * The MC-ASGN-ID-SUB-FLD-32 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MC-ASGN-ID-SUB-FLD-32")
    public void setMCASGNIDSUBFLD32(String mCASGNIDSUBFLD32) {
        this.mCASGNIDSUBFLD32 = mCASGNIDSUBFLD32;
    }

    /**
     * The VPAN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VPAN")
    public String getVPAN() {
        return vPAN;
    }

    /**
     * The VPAN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VPAN")
    public void setVPAN(String vPAN) {
        this.vPAN = vPAN;
    }

    /**
     * The RTE-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RTE-IND")
    public String getRTEIND() {
        return rTEIND;
    }

    /**
     * The RTE-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RTE-IND")
    public void setRTEIND(String rTEIND) {
        this.rTEIND = rTEIND;
    }

    /**
     * The VISA-MKT-SPCFC-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VISA-MKT-SPCFC-DATA")
    public String getVISAMKTSPCFCDATA() {
        return vISAMKTSPCFCDATA;
    }

    /**
     * The VISA-MKT-SPCFC-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VISA-MKT-SPCFC-DATA")
    public void setVISAMKTSPCFCDATA(String vISAMKTSPCFCDATA) {
        this.vISAMKTSPCFCDATA = vISAMKTSPCFCDATA;
    }

    /**
     * The NTL-POS-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NTL-POS-DATA")
    public String getNTLPOSDATA() {
        return nTLPOSDATA;
    }

    /**
     * The NTL-POS-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NTL-POS-DATA")
    public void setNTLPOSDATA(String nTLPOSDATA) {
        this.nTLPOSDATA = nTLPOSDATA;
    }

    /**
     * The PIN-SVC-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PIN-SVC-CDE")
    public String getPINSVCCDE() {
        return pINSVCCDE;
    }

    /**
     * The PIN-SVC-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PIN-SVC-CDE")
    public void setPINSVCCDE(String pINSVCCDE) {
        this.pINSVCCDE = pINSVCCDE;
    }

    /**
     * The PIN-CAP-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PIN-CAP-CDE")
    public String getPINCAPCDE() {
        return pINCAPCDE;
    }

    /**
     * The PIN-CAP-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PIN-CAP-CDE")
    public void setPINCAPCDE(String pINCAPCDE) {
        this.pINCAPCDE = pINCAPCDE;
    }

    /**
     * The AUTH-SYS-ADV-DAT-TIM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH-SYS-ADV-DAT-TIM")
    public String getAUTHSYSADVDATTIM() {
        return aUTHSYSADVDATTIM;
    }

    /**
     * The AUTH-SYS-ADV-DAT-TIM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH-SYS-ADV-DAT-TIM")
    public void setAUTHSYSADVDATTIM(String aUTHSYSADVDATTIM) {
        this.aUTHSYSADVDATTIM = aUTHSYSADVDATTIM;
    }

    /**
     * The FRAUD-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FRAUD-DATA")
    public String getFRAUDDATA() {
        return fRAUDDATA;
    }

    /**
     * The FRAUD-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FRAUD-DATA")
    public void setFRAUDDATA(String fRAUDDATA) {
        this.fRAUDDATA = fRAUDDATA;
    }

    /**
     * The PMNT-INITIATION-CHAN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PMNT-INITIATION-CHAN")
    public String getPMNTINITIATIONCHAN() {
        return pMNTINITIATIONCHAN;
    }

    /**
     * The PMNT-INITIATION-CHAN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PMNT-INITIATION-CHAN")
    public void setPMNTINITIATIONCHAN(String pMNTINITIATIONCHAN) {
        this.pMNTINITIATIONCHAN = pMNTINITIATIONCHAN;
    }

    /**
     * The TLE-COMPLIANT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TLE-COMPLIANT-IND")
    public String getTLECOMPLIANTIND() {
        return tLECOMPLIANTIND;
    }

    /**
     * The TLE-COMPLIANT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TLE-COMPLIANT-IND")
    public void setTLECOMPLIANTIND(String tLECOMPLIANTIND) {
        this.tLECOMPLIANTIND = tLECOMPLIANTIND;
    }

    /**
     * The UKPT-COMPLIANT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UKPT-COMPLIANT-IND")
    public String getUKPTCOMPLIANTIND() {
        return uKPTCOMPLIANTIND;
    }

    /**
     * The UKPT-COMPLIANT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UKPT-COMPLIANT-IND")
    public void setUKPTCOMPLIANTIND(String uKPTCOMPLIANTIND) {
        this.uKPTCOMPLIANTIND = uKPTCOMPLIANTIND;
    }

    /**
     * The SANCTION-SCRN-SCORE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SANCTION-SCRN-SCORE")
    public String getSANCTIONSCRNSCORE() {
        return sANCTIONSCRNSCORE;
    }

    /**
     * The SANCTION-SCRN-SCORE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SANCTION-SCRN-SCORE")
    public void setSANCTIONSCRNSCORE(String sANCTIONSCRNSCORE) {
        this.sANCTIONSCRNSCORE = sANCTIONSCRNSCORE;
    }

    /**
     * The VISA-SPEND-QUALIFIED-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VISA-SPEND-QUALIFIED-IND")
    public String getVISASPENDQUALIFIEDIND() {
        return vISASPENDQUALIFIEDIND;
    }

    /**
     * The VISA-SPEND-QUALIFIED-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VISA-SPEND-QUALIFIED-IND")
    public void setVISASPENDQUALIFIEDIND(String vISASPENDQUALIFIEDIND) {
        this.vISASPENDQUALIFIEDIND = vISASPENDQUALIFIEDIND;
    }

    /**
     * The TXN-INTGTY-CLAS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TXN-INTGTY-CLAS")
    public String getTXNINTGTYCLAS() {
        return tXNINTGTYCLAS;
    }

    /**
     * The TXN-INTGTY-CLAS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TXN-INTGTY-CLAS")
    public void setTXNINTGTYCLAS(String tXNINTGTYCLAS) {
        this.tXNINTGTYCLAS = tXNINTGTYCLAS;
    }

    /**
     * The ORIG-E-COM-SEC-LVL-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ORIG-E-COM-SEC-LVL-IND")
    public String getORIGECOMSECLVLIND() {
        return oRIGECOMSECLVLIND;
    }

    /**
     * The ORIG-E-COM-SEC-LVL-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ORIG-E-COM-SEC-LVL-IND")
    public void setORIGECOMSECLVLIND(String oRIGECOMSECLVLIND) {
        this.oRIGECOMSECLVLIND = oRIGECOMSECLVLIND;
    }

    /**
     * The E-COM-SEC-DOWNGRADE-RSN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("E-COM-SEC-DOWNGRADE-RSN")
    public String getECOMSECDOWNGRADERSN() {
        return eCOMSECDOWNGRADERSN;
    }

    /**
     * The E-COM-SEC-DOWNGRADE-RSN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("E-COM-SEC-DOWNGRADE-RSN")
    public void setECOMSECDOWNGRADERSN(String eCOMSECDOWNGRADERSN) {
        this.eCOMSECDOWNGRADERSN = eCOMSECDOWNGRADERSN;
    }

    /**
     * The ADVC-DETL-TXT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ADVC-DETL-TXT")
    public String getADVCDETLTXT() {
        return aDVCDETLTXT;
    }

    /**
     * The ADVC-DETL-TXT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ADVC-DETL-TXT")
    public void setADVCDETLTXT(String aDVCDETLTXT) {
        this.aDVCDETLTXT = aDVCDETLTXT;
    }

    /**
     * The WALLET-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("WALLET-ID")
    public String getWALLETID() {
        return wALLETID;
    }

    /**
     * The WALLET-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("WALLET-ID")
    public void setWALLETID(String wALLETID) {
        this.wALLETID = wALLETID;
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
        return new HashCodeBuilder().append(tKNLEN).append(lGHT).append(fIID).append(vERID).append(lOCALTIM).append(lOCALDAT).append(aDVICERSNCDE).append(pOSENTRYMDE).append(rESPCDE).append(cRDVRFYRESULT).append(vISAACCTSTATIND).append(aUTHNIND).append(uSERFLDACI2).append(pROCCDE).append(oNBEHALF).append(mCHIPPROIND).append(mCHIPPROCINFO).append(tRANFEE).append(eCOMSECLVLIND).append(aVSRESULT).append(aCCTNUMIND).append(aDVCDETLCDE).append(aUTHAGENTIDCDE).append(pMNTTXNTYPIND).append(cHIPBITERRRSLTS).append(cRDLVLRSLT).append(mCGTWYTXNIND).append(mCASGNIDSUBFLD32).append(vPAN).append(rTEIND).append(vISAMKTSPCFCDATA).append(nTLPOSDATA).append(pINSVCCDE).append(pINCAPCDE).append(aUTHSYSADVDATTIM).append(fRAUDDATA).append(pMNTINITIATIONCHAN).append(tLECOMPLIANTIND).append(uKPTCOMPLIANTIND).append(sANCTIONSCRNSCORE).append(vISASPENDQUALIFIEDIND).append(tXNINTGTYCLAS).append(oRIGECOMSECLVLIND).append(eCOMSECDOWNGRADERSN).append(aDVCDETLTXT).append(wALLETID).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof B0) == false) {
            return false;
        }
        B0 rhs = ((B0) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(lGHT, rhs.lGHT).append(fIID, rhs.fIID).append(vERID, rhs.vERID).append(lOCALTIM, rhs.lOCALTIM).append(lOCALDAT, rhs.lOCALDAT).append(aDVICERSNCDE, rhs.aDVICERSNCDE).append(pOSENTRYMDE, rhs.pOSENTRYMDE).append(rESPCDE, rhs.rESPCDE).append(cRDVRFYRESULT, rhs.cRDVRFYRESULT).append(vISAACCTSTATIND, rhs.vISAACCTSTATIND).append(aUTHNIND, rhs.aUTHNIND).append(uSERFLDACI2, rhs.uSERFLDACI2).append(pROCCDE, rhs.pROCCDE).append(oNBEHALF, rhs.oNBEHALF).append(mCHIPPROIND, rhs.mCHIPPROIND).append(mCHIPPROCINFO, rhs.mCHIPPROCINFO).append(tRANFEE, rhs.tRANFEE).append(eCOMSECLVLIND, rhs.eCOMSECLVLIND).append(aVSRESULT, rhs.aVSRESULT).append(aCCTNUMIND, rhs.aCCTNUMIND).append(aDVCDETLCDE, rhs.aDVCDETLCDE).append(aUTHAGENTIDCDE, rhs.aUTHAGENTIDCDE).append(pMNTTXNTYPIND, rhs.pMNTTXNTYPIND).append(cHIPBITERRRSLTS, rhs.cHIPBITERRRSLTS).append(cRDLVLRSLT, rhs.cRDLVLRSLT).append(mCGTWYTXNIND, rhs.mCGTWYTXNIND).append(mCASGNIDSUBFLD32, rhs.mCASGNIDSUBFLD32).append(vPAN, rhs.vPAN).append(rTEIND, rhs.rTEIND).append(vISAMKTSPCFCDATA, rhs.vISAMKTSPCFCDATA).append(nTLPOSDATA, rhs.nTLPOSDATA).append(pINSVCCDE, rhs.pINSVCCDE).append(pINCAPCDE, rhs.pINCAPCDE).append(aUTHSYSADVDATTIM, rhs.aUTHSYSADVDATTIM).append(fRAUDDATA, rhs.fRAUDDATA).append(pMNTINITIATIONCHAN, rhs.pMNTINITIATIONCHAN).append(tLECOMPLIANTIND, rhs.tLECOMPLIANTIND).append(uKPTCOMPLIANTIND, rhs.uKPTCOMPLIANTIND).append(sANCTIONSCRNSCORE, rhs.sANCTIONSCRNSCORE).append(vISASPENDQUALIFIEDIND, rhs.vISASPENDQUALIFIEDIND).append(tXNINTGTYCLAS, rhs.tXNINTGTYCLAS).append(oRIGECOMSECLVLIND, rhs.oRIGECOMSECLVLIND).append(eCOMSECDOWNGRADERSN, rhs.eCOMSECDOWNGRADERSN).append(aDVCDETLTXT, rhs.aDVCDETLTXT).append(wALLETID, rhs.wALLETID).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
