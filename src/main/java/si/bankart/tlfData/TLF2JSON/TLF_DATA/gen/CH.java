
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
 * The CH Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "RESP-SRC-RSN-CDE",
    "CRD-VRFY-FLG2",
    "ONLINE-LMT",
    "RETL-CLASS-CDE",
    "EMV-CAPABLE-OUTLET",
    "RECUR-PMNT-IND",
    "NUM-INSTL",
    "NUM-MM-GRATUITY",
    "PMNT-PLAN",
    "TERM-OUTPUT-CAP-IND",
    "CRDHLDR-AUTHN-CAP-IND",
    "PARTIAL-AUTH-OPT",
    "USER-FLD1"
})
public class CH {

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
     * The RESP-SRC-RSN-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RESP-SRC-RSN-CDE")
    private String rESPSRCRSNCDE = "";
    /**
     * The CRD-VRFY-FLG2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-VRFY-FLG2")
    private String cRDVRFYFLG2 = "";
    /**
     * The ONLINE-LMT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ONLINE-LMT")
    private Integer oNLINELMT = 0;
    /**
     * The RETL-CLASS-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RETL-CLASS-CDE")
    private String rETLCLASSCDE = "";
    /**
     * The EMV-CAPABLE-OUTLET Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("EMV-CAPABLE-OUTLET")
    private String eMVCAPABLEOUTLET = "";
    /**
     * The RECUR-PMNT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RECUR-PMNT-IND")
    private String rECURPMNTIND = "";
    /**
     * The NUM-INSTL Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NUM-INSTL")
    private String nUMINSTL = "";
    /**
     * The NUM-MM-GRATUITY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NUM-MM-GRATUITY")
    private String nUMMMGRATUITY = "";
    /**
     * The PMNT-PLAN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PMNT-PLAN")
    private String pMNTPLAN = "";
    /**
     * The TERM-OUTPUT-CAP-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-OUTPUT-CAP-IND")
    private String tERMOUTPUTCAPIND = "";
    /**
     * The CRDHLDR-AUTHN-CAP-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRDHLDR-AUTHN-CAP-IND")
    private String cRDHLDRAUTHNCAPIND = "";
    /**
     * The PARTIAL-AUTH-OPT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PARTIAL-AUTH-OPT")
    private String pARTIALAUTHOPT = "";
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
     * The RESP-SRC-RSN-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RESP-SRC-RSN-CDE")
    public String getRESPSRCRSNCDE() {
        return rESPSRCRSNCDE;
    }

    /**
     * The RESP-SRC-RSN-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RESP-SRC-RSN-CDE")
    public void setRESPSRCRSNCDE(String rESPSRCRSNCDE) {
        this.rESPSRCRSNCDE = rESPSRCRSNCDE;
    }

    /**
     * The CRD-VRFY-FLG2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-VRFY-FLG2")
    public String getCRDVRFYFLG2() {
        return cRDVRFYFLG2;
    }

    /**
     * The CRD-VRFY-FLG2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-VRFY-FLG2")
    public void setCRDVRFYFLG2(String cRDVRFYFLG2) {
        this.cRDVRFYFLG2 = cRDVRFYFLG2;
    }

    /**
     * The ONLINE-LMT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ONLINE-LMT")
    public Integer getONLINELMT() {
        return oNLINELMT;
    }

    /**
     * The ONLINE-LMT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ONLINE-LMT")
    public void setONLINELMT(Integer oNLINELMT) {
        this.oNLINELMT = oNLINELMT;
    }

    /**
     * The RETL-CLASS-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RETL-CLASS-CDE")
    public String getRETLCLASSCDE() {
        return rETLCLASSCDE;
    }

    /**
     * The RETL-CLASS-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RETL-CLASS-CDE")
    public void setRETLCLASSCDE(String rETLCLASSCDE) {
        this.rETLCLASSCDE = rETLCLASSCDE;
    }

    /**
     * The EMV-CAPABLE-OUTLET Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("EMV-CAPABLE-OUTLET")
    public String getEMVCAPABLEOUTLET() {
        return eMVCAPABLEOUTLET;
    }

    /**
     * The EMV-CAPABLE-OUTLET Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("EMV-CAPABLE-OUTLET")
    public void setEMVCAPABLEOUTLET(String eMVCAPABLEOUTLET) {
        this.eMVCAPABLEOUTLET = eMVCAPABLEOUTLET;
    }

    /**
     * The RECUR-PMNT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RECUR-PMNT-IND")
    public String getRECURPMNTIND() {
        return rECURPMNTIND;
    }

    /**
     * The RECUR-PMNT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RECUR-PMNT-IND")
    public void setRECURPMNTIND(String rECURPMNTIND) {
        this.rECURPMNTIND = rECURPMNTIND;
    }

    /**
     * The NUM-INSTL Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NUM-INSTL")
    public String getNUMINSTL() {
        return nUMINSTL;
    }

    /**
     * The NUM-INSTL Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NUM-INSTL")
    public void setNUMINSTL(String nUMINSTL) {
        this.nUMINSTL = nUMINSTL;
    }

    /**
     * The NUM-MM-GRATUITY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NUM-MM-GRATUITY")
    public String getNUMMMGRATUITY() {
        return nUMMMGRATUITY;
    }

    /**
     * The NUM-MM-GRATUITY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NUM-MM-GRATUITY")
    public void setNUMMMGRATUITY(String nUMMMGRATUITY) {
        this.nUMMMGRATUITY = nUMMMGRATUITY;
    }

    /**
     * The PMNT-PLAN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PMNT-PLAN")
    public String getPMNTPLAN() {
        return pMNTPLAN;
    }

    /**
     * The PMNT-PLAN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PMNT-PLAN")
    public void setPMNTPLAN(String pMNTPLAN) {
        this.pMNTPLAN = pMNTPLAN;
    }

    /**
     * The TERM-OUTPUT-CAP-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-OUTPUT-CAP-IND")
    public String getTERMOUTPUTCAPIND() {
        return tERMOUTPUTCAPIND;
    }

    /**
     * The TERM-OUTPUT-CAP-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-OUTPUT-CAP-IND")
    public void setTERMOUTPUTCAPIND(String tERMOUTPUTCAPIND) {
        this.tERMOUTPUTCAPIND = tERMOUTPUTCAPIND;
    }

    /**
     * The CRDHLDR-AUTHN-CAP-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRDHLDR-AUTHN-CAP-IND")
    public String getCRDHLDRAUTHNCAPIND() {
        return cRDHLDRAUTHNCAPIND;
    }

    /**
     * The CRDHLDR-AUTHN-CAP-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRDHLDR-AUTHN-CAP-IND")
    public void setCRDHLDRAUTHNCAPIND(String cRDHLDRAUTHNCAPIND) {
        this.cRDHLDRAUTHNCAPIND = cRDHLDRAUTHNCAPIND;
    }

    /**
     * The PARTIAL-AUTH-OPT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PARTIAL-AUTH-OPT")
    public String getPARTIALAUTHOPT() {
        return pARTIALAUTHOPT;
    }

    /**
     * The PARTIAL-AUTH-OPT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PARTIAL-AUTH-OPT")
    public void setPARTIALAUTHOPT(String pARTIALAUTHOPT) {
        this.pARTIALAUTHOPT = pARTIALAUTHOPT;
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
        return new HashCodeBuilder().append(tKNLEN).append(rESPSRCRSNCDE).append(cRDVRFYFLG2).append(oNLINELMT).append(rETLCLASSCDE).append(eMVCAPABLEOUTLET).append(rECURPMNTIND).append(nUMINSTL).append(nUMMMGRATUITY).append(pMNTPLAN).append(tERMOUTPUTCAPIND).append(cRDHLDRAUTHNCAPIND).append(pARTIALAUTHOPT).append(uSERFLD1).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CH) == false) {
            return false;
        }
        CH rhs = ((CH) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(rESPSRCRSNCDE, rhs.rESPSRCRSNCDE).append(cRDVRFYFLG2, rhs.cRDVRFYFLG2).append(oNLINELMT, rhs.oNLINELMT).append(rETLCLASSCDE, rhs.rETLCLASSCDE).append(eMVCAPABLEOUTLET, rhs.eMVCAPABLEOUTLET).append(rECURPMNTIND, rhs.rECURPMNTIND).append(nUMINSTL, rhs.nUMINSTL).append(nUMMMGRATUITY, rhs.nUMMMGRATUITY).append(pMNTPLAN, rhs.pMNTPLAN).append(tERMOUTPUTCAPIND, rhs.tERMOUTPUTCAPIND).append(cRDHLDRAUTHNCAPIND, rhs.cRDHLDRAUTHNCAPIND).append(pARTIALAUTHOPT, rhs.pARTIALAUTHOPT).append(uSERFLD1, rhs.uSERFLD1).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
