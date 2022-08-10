
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
 * The CZ Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "ATC",
    "FORM-FACTR-IND",
    "ATC-VALID-IND",
    "CRD-AUTHN-IND",
    "PMNT-INITIATION-CHAN",
    "CRDHLDR-VRFY-MTHD-ID-BY-DEV",
    "ADNL-DATA-CDE"
})
public class CZ {

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
     * The ATC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ATC")
    private String aTC = "";
    /**
     * The FORM-FACTR-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FORM-FACTR-IND")
    private String fORMFACTRIND = "";
    /**
     * The ATC-VALID-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ATC-VALID-IND")
    private String aTCVALIDIND = "";
    /**
     * The CRD-AUTHN-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-AUTHN-IND")
    private String cRDAUTHNIND = "";
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
     * The CRDHLDR-VRFY-MTHD-ID-BY-DEV Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRDHLDR-VRFY-MTHD-ID-BY-DEV")
    private String cRDHLDRVRFYMTHDIDBYDEV = "";
    /**
     * The ADNL-DATA-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ADNL-DATA-CDE")
    private String aDNLDATACDE = "";
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
     * The FORM-FACTR-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FORM-FACTR-IND")
    public String getFORMFACTRIND() {
        return fORMFACTRIND;
    }

    /**
     * The FORM-FACTR-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FORM-FACTR-IND")
    public void setFORMFACTRIND(String fORMFACTRIND) {
        this.fORMFACTRIND = fORMFACTRIND;
    }

    /**
     * The ATC-VALID-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ATC-VALID-IND")
    public String getATCVALIDIND() {
        return aTCVALIDIND;
    }

    /**
     * The ATC-VALID-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ATC-VALID-IND")
    public void setATCVALIDIND(String aTCVALIDIND) {
        this.aTCVALIDIND = aTCVALIDIND;
    }

    /**
     * The CRD-AUTHN-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-AUTHN-IND")
    public String getCRDAUTHNIND() {
        return cRDAUTHNIND;
    }

    /**
     * The CRD-AUTHN-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-AUTHN-IND")
    public void setCRDAUTHNIND(String cRDAUTHNIND) {
        this.cRDAUTHNIND = cRDAUTHNIND;
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
     * The CRDHLDR-VRFY-MTHD-ID-BY-DEV Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRDHLDR-VRFY-MTHD-ID-BY-DEV")
    public String getCRDHLDRVRFYMTHDIDBYDEV() {
        return cRDHLDRVRFYMTHDIDBYDEV;
    }

    /**
     * The CRDHLDR-VRFY-MTHD-ID-BY-DEV Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRDHLDR-VRFY-MTHD-ID-BY-DEV")
    public void setCRDHLDRVRFYMTHDIDBYDEV(String cRDHLDRVRFYMTHDIDBYDEV) {
        this.cRDHLDRVRFYMTHDIDBYDEV = cRDHLDRVRFYMTHDIDBYDEV;
    }

    /**
     * The ADNL-DATA-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ADNL-DATA-CDE")
    public String getADNLDATACDE() {
        return aDNLDATACDE;
    }

    /**
     * The ADNL-DATA-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ADNL-DATA-CDE")
    public void setADNLDATACDE(String aDNLDATACDE) {
        this.aDNLDATACDE = aDNLDATACDE;
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
        return new HashCodeBuilder().append(tKNLEN).append(aTC).append(fORMFACTRIND).append(aTCVALIDIND).append(cRDAUTHNIND).append(pMNTINITIATIONCHAN).append(cRDHLDRVRFYMTHDIDBYDEV).append(aDNLDATACDE).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CZ) == false) {
            return false;
        }
        CZ rhs = ((CZ) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(aTC, rhs.aTC).append(fORMFACTRIND, rhs.fORMFACTRIND).append(aTCVALIDIND, rhs.aTCVALIDIND).append(cRDAUTHNIND, rhs.cRDAUTHNIND).append(pMNTINITIATIONCHAN, rhs.pMNTINITIATIONCHAN).append(cRDHLDRVRFYMTHDIDBYDEV, rhs.cRDHLDRVRFYMTHDIDBYDEV).append(aDNLDATACDE, rhs.aDNLDATACDE).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
