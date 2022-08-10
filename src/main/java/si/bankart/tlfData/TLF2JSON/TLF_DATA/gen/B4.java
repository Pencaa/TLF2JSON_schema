
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
 * The B4 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "PT-SRV-ENTRY-MDE",
    "TERM-ENTRY-CAP",
    "LAST-EMV-STAT",
    "DATA-SUSPECT",
    "APPL-PAN-SEQ-NUM",
    "APPRVD-RC",
    "ATC-VRFY",
    "USER-FLD-ACI",
    "RSN-ONL-CDE",
    "ARQC-VRFY",
    "ISO-RC-IND"
})
public class B4 {

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
     * The PT-SRV-ENTRY-MDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PT-SRV-ENTRY-MDE")
    private String pTSRVENTRYMDE = "";
    /**
     * The TERM-ENTRY-CAP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-ENTRY-CAP")
    private String tERMENTRYCAP = "";
    /**
     * The LAST-EMV-STAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LAST-EMV-STAT")
    private String lASTEMVSTAT = "";
    /**
     * The DATA-SUSPECT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DATA-SUSPECT")
    private String dATASUSPECT = "";
    /**
     * The APPL-PAN-SEQ-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("APPL-PAN-SEQ-NUM")
    private String aPPLPANSEQNUM = "";
    /**
     * The APPRVD-RC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("APPRVD-RC")
    private String aPPRVDRC = "";
    /**
     * The ATC-VRFY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ATC-VRFY")
    private String aTCVRFY = "";
    /**
     * The USER-FLD-ACI Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD-ACI")
    private String uSERFLDACI = "";
    /**
     * The RSN-ONL-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RSN-ONL-CDE")
    private String rSNONLCDE = "";
    /**
     * The ARQC-VRFY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ARQC-VRFY")
    private String aRQCVRFY = "";
    /**
     * The ISO-RC-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISO-RC-IND")
    private String iSORCIND = "";
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
     * The PT-SRV-ENTRY-MDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PT-SRV-ENTRY-MDE")
    public String getPTSRVENTRYMDE() {
        return pTSRVENTRYMDE;
    }

    /**
     * The PT-SRV-ENTRY-MDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PT-SRV-ENTRY-MDE")
    public void setPTSRVENTRYMDE(String pTSRVENTRYMDE) {
        this.pTSRVENTRYMDE = pTSRVENTRYMDE;
    }

    /**
     * The TERM-ENTRY-CAP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-ENTRY-CAP")
    public String getTERMENTRYCAP() {
        return tERMENTRYCAP;
    }

    /**
     * The TERM-ENTRY-CAP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-ENTRY-CAP")
    public void setTERMENTRYCAP(String tERMENTRYCAP) {
        this.tERMENTRYCAP = tERMENTRYCAP;
    }

    /**
     * The LAST-EMV-STAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LAST-EMV-STAT")
    public String getLASTEMVSTAT() {
        return lASTEMVSTAT;
    }

    /**
     * The LAST-EMV-STAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LAST-EMV-STAT")
    public void setLASTEMVSTAT(String lASTEMVSTAT) {
        this.lASTEMVSTAT = lASTEMVSTAT;
    }

    /**
     * The DATA-SUSPECT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DATA-SUSPECT")
    public String getDATASUSPECT() {
        return dATASUSPECT;
    }

    /**
     * The DATA-SUSPECT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DATA-SUSPECT")
    public void setDATASUSPECT(String dATASUSPECT) {
        this.dATASUSPECT = dATASUSPECT;
    }

    /**
     * The APPL-PAN-SEQ-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("APPL-PAN-SEQ-NUM")
    public String getAPPLPANSEQNUM() {
        return aPPLPANSEQNUM;
    }

    /**
     * The APPL-PAN-SEQ-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("APPL-PAN-SEQ-NUM")
    public void setAPPLPANSEQNUM(String aPPLPANSEQNUM) {
        this.aPPLPANSEQNUM = aPPLPANSEQNUM;
    }

    /**
     * The APPRVD-RC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("APPRVD-RC")
    public String getAPPRVDRC() {
        return aPPRVDRC;
    }

    /**
     * The APPRVD-RC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("APPRVD-RC")
    public void setAPPRVDRC(String aPPRVDRC) {
        this.aPPRVDRC = aPPRVDRC;
    }

    /**
     * The ATC-VRFY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ATC-VRFY")
    public String getATCVRFY() {
        return aTCVRFY;
    }

    /**
     * The ATC-VRFY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ATC-VRFY")
    public void setATCVRFY(String aTCVRFY) {
        this.aTCVRFY = aTCVRFY;
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

    /**
     * The RSN-ONL-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RSN-ONL-CDE")
    public String getRSNONLCDE() {
        return rSNONLCDE;
    }

    /**
     * The RSN-ONL-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RSN-ONL-CDE")
    public void setRSNONLCDE(String rSNONLCDE) {
        this.rSNONLCDE = rSNONLCDE;
    }

    /**
     * The ARQC-VRFY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ARQC-VRFY")
    public String getARQCVRFY() {
        return aRQCVRFY;
    }

    /**
     * The ARQC-VRFY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ARQC-VRFY")
    public void setARQCVRFY(String aRQCVRFY) {
        this.aRQCVRFY = aRQCVRFY;
    }

    /**
     * The ISO-RC-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISO-RC-IND")
    public String getISORCIND() {
        return iSORCIND;
    }

    /**
     * The ISO-RC-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISO-RC-IND")
    public void setISORCIND(String iSORCIND) {
        this.iSORCIND = iSORCIND;
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
        return new HashCodeBuilder().append(tKNLEN).append(pTSRVENTRYMDE).append(tERMENTRYCAP).append(lASTEMVSTAT).append(dATASUSPECT).append(aPPLPANSEQNUM).append(aPPRVDRC).append(aTCVRFY).append(uSERFLDACI).append(rSNONLCDE).append(aRQCVRFY).append(iSORCIND).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof B4) == false) {
            return false;
        }
        B4 rhs = ((B4) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(pTSRVENTRYMDE, rhs.pTSRVENTRYMDE).append(tERMENTRYCAP, rhs.tERMENTRYCAP).append(lASTEMVSTAT, rhs.lASTEMVSTAT).append(dATASUSPECT, rhs.dATASUSPECT).append(aPPLPANSEQNUM, rhs.aPPLPANSEQNUM).append(aPPRVDRC, rhs.aPPRVDRC).append(aTCVRFY, rhs.aTCVRFY).append(uSERFLDACI, rhs.uSERFLDACI).append(rSNONLCDE, rhs.rSNONLCDE).append(aRQCVRFY, rhs.aRQCVRFY).append(iSORCIND, rhs.iSORCIND).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
