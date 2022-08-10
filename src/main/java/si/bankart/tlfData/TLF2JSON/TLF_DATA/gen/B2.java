
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
 * The B2 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "BIT-MAP",
    "USER-FLD1",
    "CRYPTO-INFO-DATA",
    "TVR",
    "ARQC",
    "AMT-AUTH",
    "AMT-OTHER",
    "AIP",
    "ATC",
    "TERM-CNTRY-CDE",
    "TRAN-CRNCY-CDE",
    "TRAN-DAT",
    "TRAN-TYPE",
    "UNPREDICT-NUM",
    "ISS-APPL-DATA-LGTH",
    "LGTH",
    "DERIV-KEY-INDEX",
    "CRYPTO-VER-NUM",
    "CRD-VRFY-RSLTS",
    "INFO"
})
public class B2 {

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
     * The BIT-MAP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BIT-MAP")
    private String bITMAP = "";
    /**
     * The USER-FLD1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD1")
    private String uSERFLD1 = "";
    /**
     * The CRYPTO-INFO-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRYPTO-INFO-DATA")
    private String cRYPTOINFODATA = "";
    /**
     * The TVR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TVR")
    private String tVR = "";
    /**
     * The ARQC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ARQC")
    private String aRQC = "";
    /**
     * The AMT-AUTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AMT-AUTH")
    private String aMTAUTH = "";
    /**
     * The AMT-OTHER Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AMT-OTHER")
    private String aMTOTHER = "";
    /**
     * The AIP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AIP")
    private String aIP = "";
    /**
     * The ATC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ATC")
    private String aTC = "";
    /**
     * The TERM-CNTRY-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-CNTRY-CDE")
    private String tERMCNTRYCDE = "";
    /**
     * The TRAN-CRNCY-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRAN-CRNCY-CDE")
    private String tRANCRNCYCDE = "";
    /**
     * The TRAN-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRAN-DAT")
    private String tRANDAT = "";
    /**
     * The TRAN-TYPE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRAN-TYPE")
    private String tRANTYPE = "";
    /**
     * The UNPREDICT-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UNPREDICT-NUM")
    private String uNPREDICTNUM = "";
    /**
     * The ISS-APPL-DATA-LGTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISS-APPL-DATA-LGTH")
    private String iSSAPPLDATALGTH = "";
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
     * The DERIV-KEY-INDEX Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DERIV-KEY-INDEX")
    private String dERIVKEYINDEX = "";
    /**
     * The CRYPTO-VER-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRYPTO-VER-NUM")
    private String cRYPTOVERNUM = "";
    /**
     * The CRD-VRFY-RSLTS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-VRFY-RSLTS")
    private String cRDVRFYRSLTS = "";
    /**
     * The INFO Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("INFO")
    private String iNFO = "";
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
     * The BIT-MAP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BIT-MAP")
    public String getBITMAP() {
        return bITMAP;
    }

    /**
     * The BIT-MAP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BIT-MAP")
    public void setBITMAP(String bITMAP) {
        this.bITMAP = bITMAP;
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

    /**
     * The CRYPTO-INFO-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRYPTO-INFO-DATA")
    public String getCRYPTOINFODATA() {
        return cRYPTOINFODATA;
    }

    /**
     * The CRYPTO-INFO-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRYPTO-INFO-DATA")
    public void setCRYPTOINFODATA(String cRYPTOINFODATA) {
        this.cRYPTOINFODATA = cRYPTOINFODATA;
    }

    /**
     * The TVR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TVR")
    public String getTVR() {
        return tVR;
    }

    /**
     * The TVR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TVR")
    public void setTVR(String tVR) {
        this.tVR = tVR;
    }

    /**
     * The ARQC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ARQC")
    public String getARQC() {
        return aRQC;
    }

    /**
     * The ARQC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ARQC")
    public void setARQC(String aRQC) {
        this.aRQC = aRQC;
    }

    /**
     * The AMT-AUTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AMT-AUTH")
    public String getAMTAUTH() {
        return aMTAUTH;
    }

    /**
     * The AMT-AUTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AMT-AUTH")
    public void setAMTAUTH(String aMTAUTH) {
        this.aMTAUTH = aMTAUTH;
    }

    /**
     * The AMT-OTHER Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AMT-OTHER")
    public String getAMTOTHER() {
        return aMTOTHER;
    }

    /**
     * The AMT-OTHER Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AMT-OTHER")
    public void setAMTOTHER(String aMTOTHER) {
        this.aMTOTHER = aMTOTHER;
    }

    /**
     * The AIP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AIP")
    public String getAIP() {
        return aIP;
    }

    /**
     * The AIP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AIP")
    public void setAIP(String aIP) {
        this.aIP = aIP;
    }

    /**
     * The ATC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ATC")
    public String getATC() {
        return aTC;
    }

    /**
     * The ATC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ATC")
    public void setATC(String aTC) {
        this.aTC = aTC;
    }

    /**
     * The TERM-CNTRY-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-CNTRY-CDE")
    public String getTERMCNTRYCDE() {
        return tERMCNTRYCDE;
    }

    /**
     * The TERM-CNTRY-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-CNTRY-CDE")
    public void setTERMCNTRYCDE(String tERMCNTRYCDE) {
        this.tERMCNTRYCDE = tERMCNTRYCDE;
    }

    /**
     * The TRAN-CRNCY-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRAN-CRNCY-CDE")
    public String getTRANCRNCYCDE() {
        return tRANCRNCYCDE;
    }

    /**
     * The TRAN-CRNCY-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRAN-CRNCY-CDE")
    public void setTRANCRNCYCDE(String tRANCRNCYCDE) {
        this.tRANCRNCYCDE = tRANCRNCYCDE;
    }

    /**
     * The TRAN-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRAN-DAT")
    public String getTRANDAT() {
        return tRANDAT;
    }

    /**
     * The TRAN-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRAN-DAT")
    public void setTRANDAT(String tRANDAT) {
        this.tRANDAT = tRANDAT;
    }

    /**
     * The TRAN-TYPE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRAN-TYPE")
    public String getTRANTYPE() {
        return tRANTYPE;
    }

    /**
     * The TRAN-TYPE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRAN-TYPE")
    public void setTRANTYPE(String tRANTYPE) {
        this.tRANTYPE = tRANTYPE;
    }

    /**
     * The UNPREDICT-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UNPREDICT-NUM")
    public String getUNPREDICTNUM() {
        return uNPREDICTNUM;
    }

    /**
     * The UNPREDICT-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UNPREDICT-NUM")
    public void setUNPREDICTNUM(String uNPREDICTNUM) {
        this.uNPREDICTNUM = uNPREDICTNUM;
    }

    /**
     * The ISS-APPL-DATA-LGTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISS-APPL-DATA-LGTH")
    public String getISSAPPLDATALGTH() {
        return iSSAPPLDATALGTH;
    }

    /**
     * The ISS-APPL-DATA-LGTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISS-APPL-DATA-LGTH")
    public void setISSAPPLDATALGTH(String iSSAPPLDATALGTH) {
        this.iSSAPPLDATALGTH = iSSAPPLDATALGTH;
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
     * The DERIV-KEY-INDEX Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DERIV-KEY-INDEX")
    public String getDERIVKEYINDEX() {
        return dERIVKEYINDEX;
    }

    /**
     * The DERIV-KEY-INDEX Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DERIV-KEY-INDEX")
    public void setDERIVKEYINDEX(String dERIVKEYINDEX) {
        this.dERIVKEYINDEX = dERIVKEYINDEX;
    }

    /**
     * The CRYPTO-VER-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRYPTO-VER-NUM")
    public String getCRYPTOVERNUM() {
        return cRYPTOVERNUM;
    }

    /**
     * The CRYPTO-VER-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRYPTO-VER-NUM")
    public void setCRYPTOVERNUM(String cRYPTOVERNUM) {
        this.cRYPTOVERNUM = cRYPTOVERNUM;
    }

    /**
     * The CRD-VRFY-RSLTS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-VRFY-RSLTS")
    public String getCRDVRFYRSLTS() {
        return cRDVRFYRSLTS;
    }

    /**
     * The CRD-VRFY-RSLTS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-VRFY-RSLTS")
    public void setCRDVRFYRSLTS(String cRDVRFYRSLTS) {
        this.cRDVRFYRSLTS = cRDVRFYRSLTS;
    }

    /**
     * The INFO Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("INFO")
    public String getINFO() {
        return iNFO;
    }

    /**
     * The INFO Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("INFO")
    public void setINFO(String iNFO) {
        this.iNFO = iNFO;
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
        return new HashCodeBuilder().append(tKNLEN).append(bITMAP).append(uSERFLD1).append(cRYPTOINFODATA).append(tVR).append(aRQC).append(aMTAUTH).append(aMTOTHER).append(aIP).append(aTC).append(tERMCNTRYCDE).append(tRANCRNCYCDE).append(tRANDAT).append(tRANTYPE).append(uNPREDICTNUM).append(iSSAPPLDATALGTH).append(lGTH).append(dERIVKEYINDEX).append(cRYPTOVERNUM).append(cRDVRFYRSLTS).append(iNFO).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof B2) == false) {
            return false;
        }
        B2 rhs = ((B2) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(bITMAP, rhs.bITMAP).append(uSERFLD1, rhs.uSERFLD1).append(cRYPTOINFODATA, rhs.cRYPTOINFODATA).append(tVR, rhs.tVR).append(aRQC, rhs.aRQC).append(aMTAUTH, rhs.aMTAUTH).append(aMTOTHER, rhs.aMTOTHER).append(aIP, rhs.aIP).append(aTC, rhs.aTC).append(tERMCNTRYCDE, rhs.tERMCNTRYCDE).append(tRANCRNCYCDE, rhs.tRANCRNCYCDE).append(tRANDAT, rhs.tRANDAT).append(tRANTYPE, rhs.tRANTYPE).append(uNPREDICTNUM, rhs.uNPREDICTNUM).append(iSSAPPLDATALGTH, rhs.iSSAPPLDATALGTH).append(lGTH, rhs.lGTH).append(dERIVKEYINDEX, rhs.dERIVKEYINDEX).append(cRYPTOVERNUM, rhs.cRYPTOVERNUM).append(cRDVRFYRSLTS, rhs.cRDVRFYRSLTS).append(iNFO, rhs.iNFO).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
