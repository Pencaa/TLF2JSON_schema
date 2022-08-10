
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
 * The C0 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "CVD-FLD",
    "RESUB-STAT",
    "RESUB-CNTR",
    "TERM-POSTAL-CDE",
    "E-COM-FLG",
    "CMRCL-CRD-TYP",
    "ADNL-DATA-IND",
    "CVD-FLD-PRESENT",
    "SAF-OR-FORCE-POST",
    "AUTHN-COLL-IND",
    "FRD-PRN-FLG",
    "CAVV-AAV-RSLT-CDE"
})
public class C0 {

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
     * The CVD-FLD Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CVD-FLD")
    private String cVDFLD = "";
    /**
     * The RESUB-STAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RESUB-STAT")
    private String rESUBSTAT = "";
    /**
     * The RESUB-CNTR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RESUB-CNTR")
    private String rESUBCNTR = "";
    /**
     * The TERM-POSTAL-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-POSTAL-CDE")
    private String tERMPOSTALCDE = "";
    /**
     * The E-COM-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("E-COM-FLG")
    private String eCOMFLG = "";
    /**
     * The CMRCL-CRD-TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CMRCL-CRD-TYP")
    private String cMRCLCRDTYP = "";
    /**
     * The ADNL-DATA-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ADNL-DATA-IND")
    private String aDNLDATAIND = "";
    /**
     * The CVD-FLD-PRESENT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CVD-FLD-PRESENT")
    private String cVDFLDPRESENT = "";
    /**
     * The SAF-OR-FORCE-POST Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SAF-OR-FORCE-POST")
    private String sAFORFORCEPOST = "";
    /**
     * The AUTHN-COLL-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTHN-COLL-IND")
    private String aUTHNCOLLIND = "";
    /**
     * The FRD-PRN-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FRD-PRN-FLG")
    private String fRDPRNFLG = "";
    /**
     * The CAVV-AAV-RSLT-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CAVV-AAV-RSLT-CDE")
    private String cAVVAAVRSLTCDE = "";
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
     * The CVD-FLD Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CVD-FLD")
    public String getCVDFLD() {
        return cVDFLD;
    }

    /**
     * The CVD-FLD Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CVD-FLD")
    public void setCVDFLD(String cVDFLD) {
        this.cVDFLD = cVDFLD;
    }

    /**
     * The RESUB-STAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RESUB-STAT")
    public String getRESUBSTAT() {
        return rESUBSTAT;
    }

    /**
     * The RESUB-STAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RESUB-STAT")
    public void setRESUBSTAT(String rESUBSTAT) {
        this.rESUBSTAT = rESUBSTAT;
    }

    /**
     * The RESUB-CNTR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RESUB-CNTR")
    public String getRESUBCNTR() {
        return rESUBCNTR;
    }

    /**
     * The RESUB-CNTR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RESUB-CNTR")
    public void setRESUBCNTR(String rESUBCNTR) {
        this.rESUBCNTR = rESUBCNTR;
    }

    /**
     * The TERM-POSTAL-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-POSTAL-CDE")
    public String getTERMPOSTALCDE() {
        return tERMPOSTALCDE;
    }

    /**
     * The TERM-POSTAL-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-POSTAL-CDE")
    public void setTERMPOSTALCDE(String tERMPOSTALCDE) {
        this.tERMPOSTALCDE = tERMPOSTALCDE;
    }

    /**
     * The E-COM-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("E-COM-FLG")
    public String getECOMFLG() {
        return eCOMFLG;
    }

    /**
     * The E-COM-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("E-COM-FLG")
    public void setECOMFLG(String eCOMFLG) {
        this.eCOMFLG = eCOMFLG;
    }

    /**
     * The CMRCL-CRD-TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CMRCL-CRD-TYP")
    public String getCMRCLCRDTYP() {
        return cMRCLCRDTYP;
    }

    /**
     * The CMRCL-CRD-TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CMRCL-CRD-TYP")
    public void setCMRCLCRDTYP(String cMRCLCRDTYP) {
        this.cMRCLCRDTYP = cMRCLCRDTYP;
    }

    /**
     * The ADNL-DATA-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ADNL-DATA-IND")
    public String getADNLDATAIND() {
        return aDNLDATAIND;
    }

    /**
     * The ADNL-DATA-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ADNL-DATA-IND")
    public void setADNLDATAIND(String aDNLDATAIND) {
        this.aDNLDATAIND = aDNLDATAIND;
    }

    /**
     * The CVD-FLD-PRESENT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CVD-FLD-PRESENT")
    public String getCVDFLDPRESENT() {
        return cVDFLDPRESENT;
    }

    /**
     * The CVD-FLD-PRESENT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CVD-FLD-PRESENT")
    public void setCVDFLDPRESENT(String cVDFLDPRESENT) {
        this.cVDFLDPRESENT = cVDFLDPRESENT;
    }

    /**
     * The SAF-OR-FORCE-POST Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SAF-OR-FORCE-POST")
    public String getSAFORFORCEPOST() {
        return sAFORFORCEPOST;
    }

    /**
     * The SAF-OR-FORCE-POST Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SAF-OR-FORCE-POST")
    public void setSAFORFORCEPOST(String sAFORFORCEPOST) {
        this.sAFORFORCEPOST = sAFORFORCEPOST;
    }

    /**
     * The AUTHN-COLL-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTHN-COLL-IND")
    public String getAUTHNCOLLIND() {
        return aUTHNCOLLIND;
    }

    /**
     * The AUTHN-COLL-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTHN-COLL-IND")
    public void setAUTHNCOLLIND(String aUTHNCOLLIND) {
        this.aUTHNCOLLIND = aUTHNCOLLIND;
    }

    /**
     * The FRD-PRN-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FRD-PRN-FLG")
    public String getFRDPRNFLG() {
        return fRDPRNFLG;
    }

    /**
     * The FRD-PRN-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FRD-PRN-FLG")
    public void setFRDPRNFLG(String fRDPRNFLG) {
        this.fRDPRNFLG = fRDPRNFLG;
    }

    /**
     * The CAVV-AAV-RSLT-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CAVV-AAV-RSLT-CDE")
    public String getCAVVAAVRSLTCDE() {
        return cAVVAAVRSLTCDE;
    }

    /**
     * The CAVV-AAV-RSLT-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CAVV-AAV-RSLT-CDE")
    public void setCAVVAAVRSLTCDE(String cAVVAAVRSLTCDE) {
        this.cAVVAAVRSLTCDE = cAVVAAVRSLTCDE;
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
        return new HashCodeBuilder().append(tKNLEN).append(cVDFLD).append(rESUBSTAT).append(rESUBCNTR).append(tERMPOSTALCDE).append(eCOMFLG).append(cMRCLCRDTYP).append(aDNLDATAIND).append(cVDFLDPRESENT).append(sAFORFORCEPOST).append(aUTHNCOLLIND).append(fRDPRNFLG).append(cAVVAAVRSLTCDE).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof C0) == false) {
            return false;
        }
        C0 rhs = ((C0) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(cVDFLD, rhs.cVDFLD).append(rESUBSTAT, rhs.rESUBSTAT).append(rESUBCNTR, rhs.rESUBCNTR).append(tERMPOSTALCDE, rhs.tERMPOSTALCDE).append(eCOMFLG, rhs.eCOMFLG).append(cMRCLCRDTYP, rhs.cMRCLCRDTYP).append(aDNLDATAIND, rhs.aDNLDATAIND).append(cVDFLDPRESENT, rhs.cVDFLDPRESENT).append(sAFORFORCEPOST, rhs.sAFORFORCEPOST).append(aUTHNCOLLIND, rhs.aUTHNCOLLIND).append(fRDPRNFLG, rhs.fRDPRNFLG).append(cAVVAAVRSLTCDE, rhs.cAVVAAVRSLTCDE).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
