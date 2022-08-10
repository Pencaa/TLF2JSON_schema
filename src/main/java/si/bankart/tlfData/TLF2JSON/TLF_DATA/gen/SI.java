
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
 * The SI Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "FRMT-CDE",
    "LGTH",
    "ACCT-NUM",
    "FIRST-NAME",
    "MIDDLE-NAME",
    "LAST-NAM",
    "STREET-ADDR",
    "CITY",
    "ST",
    "CNTRY",
    "POSTAL-CDE",
    "PHN-NUM",
    "DOB",
    "ID-TYP",
    "ID-NUM",
    "ID-CNTRY-CDE",
    "ID-EXP-DAT",
    "NATL-CNTRY-CDE",
    "BIRTH-CNTRY-CDE",
    "USER-FLD-MC"
})
public class SI {

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
     * The LGTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LGTH")
    private String lGTH = "";
    /**
     * The ACCT-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ACCT-NUM")
    private String aCCTNUM = "";
    /**
     * The FIRST-NAME Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FIRST-NAME")
    private String fIRSTNAME = "";
    /**
     * The MIDDLE-NAME Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MIDDLE-NAME")
    private String mIDDLENAME = "";
    /**
     * The LAST-NAM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LAST-NAM")
    private String lASTNAM = "";
    /**
     * The STREET-ADDR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("STREET-ADDR")
    private String sTREETADDR = "";
    /**
     * The CITY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CITY")
    private String cITY = "";
    /**
     * The ST Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ST")
    private String sT = "";
    /**
     * The CNTRY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CNTRY")
    private String cNTRY = "";
    /**
     * The POSTAL-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("POSTAL-CDE")
    private String pOSTALCDE = "";
    /**
     * The PHN-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PHN-NUM")
    private String pHNNUM = "";
    /**
     * The DOB Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DOB")
    private String dOB = "";
    /**
     * The ID-TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ID-TYP")
    private String iDTYP = "";
    /**
     * The ID-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ID-NUM")
    private String iDNUM = "";
    /**
     * The ID-CNTRY-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ID-CNTRY-CDE")
    private String iDCNTRYCDE = "";
    /**
     * The ID-EXP-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ID-EXP-DAT")
    private String iDEXPDAT = "";
    /**
     * The NATL-CNTRY-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NATL-CNTRY-CDE")
    private String nATLCNTRYCDE = "";
    /**
     * The BIRTH-CNTRY-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BIRTH-CNTRY-CDE")
    private String bIRTHCNTRYCDE = "";
    /**
     * The USER-FLD-MC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD-MC")
    private String uSERFLDMC = "";
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
     * The LGTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LGTH")
    public String getLGTH() {
        return lGTH;
    }

    /**
     * The LGTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LGTH")
    public void setLGTH(String lGTH) {
        this.lGTH = lGTH;
    }

    /**
     * The ACCT-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ACCT-NUM")
    public String getACCTNUM() {
        return aCCTNUM;
    }

    /**
     * The ACCT-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ACCT-NUM")
    public void setACCTNUM(String aCCTNUM) {
        this.aCCTNUM = aCCTNUM;
    }

    /**
     * The FIRST-NAME Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FIRST-NAME")
    public String getFIRSTNAME() {
        return fIRSTNAME;
    }

    /**
     * The FIRST-NAME Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FIRST-NAME")
    public void setFIRSTNAME(String fIRSTNAME) {
        this.fIRSTNAME = fIRSTNAME;
    }

    /**
     * The MIDDLE-NAME Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MIDDLE-NAME")
    public String getMIDDLENAME() {
        return mIDDLENAME;
    }

    /**
     * The MIDDLE-NAME Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MIDDLE-NAME")
    public void setMIDDLENAME(String mIDDLENAME) {
        this.mIDDLENAME = mIDDLENAME;
    }

    /**
     * The LAST-NAM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LAST-NAM")
    public String getLASTNAM() {
        return lASTNAM;
    }

    /**
     * The LAST-NAM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LAST-NAM")
    public void setLASTNAM(String lASTNAM) {
        this.lASTNAM = lASTNAM;
    }

    /**
     * The STREET-ADDR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("STREET-ADDR")
    public String getSTREETADDR() {
        return sTREETADDR;
    }

    /**
     * The STREET-ADDR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("STREET-ADDR")
    public void setSTREETADDR(String sTREETADDR) {
        this.sTREETADDR = sTREETADDR;
    }

    /**
     * The CITY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CITY")
    public String getCITY() {
        return cITY;
    }

    /**
     * The CITY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CITY")
    public void setCITY(String cITY) {
        this.cITY = cITY;
    }

    /**
     * The ST Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ST")
    public String getST() {
        return sT;
    }

    /**
     * The ST Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ST")
    public void setST(String sT) {
        this.sT = sT;
    }

    /**
     * The CNTRY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CNTRY")
    public String getCNTRY() {
        return cNTRY;
    }

    /**
     * The CNTRY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CNTRY")
    public void setCNTRY(String cNTRY) {
        this.cNTRY = cNTRY;
    }

    /**
     * The POSTAL-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("POSTAL-CDE")
    public String getPOSTALCDE() {
        return pOSTALCDE;
    }

    /**
     * The POSTAL-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("POSTAL-CDE")
    public void setPOSTALCDE(String pOSTALCDE) {
        this.pOSTALCDE = pOSTALCDE;
    }

    /**
     * The PHN-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PHN-NUM")
    public String getPHNNUM() {
        return pHNNUM;
    }

    /**
     * The PHN-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PHN-NUM")
    public void setPHNNUM(String pHNNUM) {
        this.pHNNUM = pHNNUM;
    }

    /**
     * The DOB Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DOB")
    public String getDOB() {
        return dOB;
    }

    /**
     * The DOB Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DOB")
    public void setDOB(String dOB) {
        this.dOB = dOB;
    }

    /**
     * The ID-TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ID-TYP")
    public String getIDTYP() {
        return iDTYP;
    }

    /**
     * The ID-TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ID-TYP")
    public void setIDTYP(String iDTYP) {
        this.iDTYP = iDTYP;
    }

    /**
     * The ID-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ID-NUM")
    public String getIDNUM() {
        return iDNUM;
    }

    /**
     * The ID-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ID-NUM")
    public void setIDNUM(String iDNUM) {
        this.iDNUM = iDNUM;
    }

    /**
     * The ID-CNTRY-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ID-CNTRY-CDE")
    public String getIDCNTRYCDE() {
        return iDCNTRYCDE;
    }

    /**
     * The ID-CNTRY-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ID-CNTRY-CDE")
    public void setIDCNTRYCDE(String iDCNTRYCDE) {
        this.iDCNTRYCDE = iDCNTRYCDE;
    }

    /**
     * The ID-EXP-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ID-EXP-DAT")
    public String getIDEXPDAT() {
        return iDEXPDAT;
    }

    /**
     * The ID-EXP-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ID-EXP-DAT")
    public void setIDEXPDAT(String iDEXPDAT) {
        this.iDEXPDAT = iDEXPDAT;
    }

    /**
     * The NATL-CNTRY-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NATL-CNTRY-CDE")
    public String getNATLCNTRYCDE() {
        return nATLCNTRYCDE;
    }

    /**
     * The NATL-CNTRY-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NATL-CNTRY-CDE")
    public void setNATLCNTRYCDE(String nATLCNTRYCDE) {
        this.nATLCNTRYCDE = nATLCNTRYCDE;
    }

    /**
     * The BIRTH-CNTRY-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BIRTH-CNTRY-CDE")
    public String getBIRTHCNTRYCDE() {
        return bIRTHCNTRYCDE;
    }

    /**
     * The BIRTH-CNTRY-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BIRTH-CNTRY-CDE")
    public void setBIRTHCNTRYCDE(String bIRTHCNTRYCDE) {
        this.bIRTHCNTRYCDE = bIRTHCNTRYCDE;
    }

    /**
     * The USER-FLD-MC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD-MC")
    public String getUSERFLDMC() {
        return uSERFLDMC;
    }

    /**
     * The USER-FLD-MC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD-MC")
    public void setUSERFLDMC(String uSERFLDMC) {
        this.uSERFLDMC = uSERFLDMC;
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
        return new HashCodeBuilder().append(tKNLEN).append(fRMTCDE).append(lGTH).append(aCCTNUM).append(fIRSTNAME).append(mIDDLENAME).append(lASTNAM).append(sTREETADDR).append(cITY).append(sT).append(cNTRY).append(pOSTALCDE).append(pHNNUM).append(dOB).append(iDTYP).append(iDNUM).append(iDCNTRYCDE).append(iDEXPDAT).append(nATLCNTRYCDE).append(bIRTHCNTRYCDE).append(uSERFLDMC).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SI) == false) {
            return false;
        }
        SI rhs = ((SI) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(fRMTCDE, rhs.fRMTCDE).append(lGTH, rhs.lGTH).append(aCCTNUM, rhs.aCCTNUM).append(fIRSTNAME, rhs.fIRSTNAME).append(mIDDLENAME, rhs.mIDDLENAME).append(lASTNAM, rhs.lASTNAM).append(sTREETADDR, rhs.sTREETADDR).append(cITY, rhs.cITY).append(sT, rhs.sT).append(cNTRY, rhs.cNTRY).append(pOSTALCDE, rhs.pOSTALCDE).append(pHNNUM, rhs.pHNNUM).append(dOB, rhs.dOB).append(iDTYP, rhs.iDTYP).append(iDNUM, rhs.iDNUM).append(iDCNTRYCDE, rhs.iDCNTRYCDE).append(iDEXPDAT, rhs.iDEXPDAT).append(nATLCNTRYCDE, rhs.nATLCNTRYCDE).append(bIRTHCNTRYCDE, rhs.bIRTHCNTRYCDE).append(uSERFLDMC, rhs.uSERFLDMC).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
