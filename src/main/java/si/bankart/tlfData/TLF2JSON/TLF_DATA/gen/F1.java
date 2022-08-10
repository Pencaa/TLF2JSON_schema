
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
 * The F1 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "SCHEME-MERCH-ID",
    "CRDHLDR-AUTHN-IND",
    "DEV-TYP",
    "PGM-TYP-ID",
    "PMNT-INITIATION-CHAN",
    "MOBILE-TXN-TYP",
    "DAT-INFO",
    "USER-FLD-ACI"
})
public class F1 {

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
     * The SCHEME-MERCH-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SCHEME-MERCH-ID")
    private String sCHEMEMERCHID = "";
    /**
     * The CRDHLDR-AUTHN-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRDHLDR-AUTHN-IND")
    private String cRDHLDRAUTHNIND = "";
    /**
     * The DEV-TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DEV-TYP")
    private String dEVTYP = "";
    /**
     * The PGM-TYP-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PGM-TYP-ID")
    private String pGMTYPID = "";
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
     * The MOBILE-TXN-TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MOBILE-TXN-TYP")
    private String mOBILETXNTYP = "";
    /**
     * The DAT-INFO Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DAT-INFO")
    private String dATINFO = "";
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
     * The SCHEME-MERCH-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SCHEME-MERCH-ID")
    public String getSCHEMEMERCHID() {
        return sCHEMEMERCHID;
    }

    /**
     * The SCHEME-MERCH-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SCHEME-MERCH-ID")
    public void setSCHEMEMERCHID(String sCHEMEMERCHID) {
        this.sCHEMEMERCHID = sCHEMEMERCHID;
    }

    /**
     * The CRDHLDR-AUTHN-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRDHLDR-AUTHN-IND")
    public String getCRDHLDRAUTHNIND() {
        return cRDHLDRAUTHNIND;
    }

    /**
     * The CRDHLDR-AUTHN-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRDHLDR-AUTHN-IND")
    public void setCRDHLDRAUTHNIND(String cRDHLDRAUTHNIND) {
        this.cRDHLDRAUTHNIND = cRDHLDRAUTHNIND;
    }

    /**
     * The DEV-TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DEV-TYP")
    public String getDEVTYP() {
        return dEVTYP;
    }

    /**
     * The DEV-TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DEV-TYP")
    public void setDEVTYP(String dEVTYP) {
        this.dEVTYP = dEVTYP;
    }

    /**
     * The PGM-TYP-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PGM-TYP-ID")
    public String getPGMTYPID() {
        return pGMTYPID;
    }

    /**
     * The PGM-TYP-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PGM-TYP-ID")
    public void setPGMTYPID(String pGMTYPID) {
        this.pGMTYPID = pGMTYPID;
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
     * The MOBILE-TXN-TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MOBILE-TXN-TYP")
    public String getMOBILETXNTYP() {
        return mOBILETXNTYP;
    }

    /**
     * The MOBILE-TXN-TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MOBILE-TXN-TYP")
    public void setMOBILETXNTYP(String mOBILETXNTYP) {
        this.mOBILETXNTYP = mOBILETXNTYP;
    }

    /**
     * The DAT-INFO Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DAT-INFO")
    public String getDATINFO() {
        return dATINFO;
    }

    /**
     * The DAT-INFO Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DAT-INFO")
    public void setDATINFO(String dATINFO) {
        this.dATINFO = dATINFO;
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
        return new HashCodeBuilder().append(tKNLEN).append(sCHEMEMERCHID).append(cRDHLDRAUTHNIND).append(dEVTYP).append(pGMTYPID).append(pMNTINITIATIONCHAN).append(mOBILETXNTYP).append(dATINFO).append(uSERFLDACI).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof F1) == false) {
            return false;
        }
        F1 rhs = ((F1) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(sCHEMEMERCHID, rhs.sCHEMEMERCHID).append(cRDHLDRAUTHNIND, rhs.cRDHLDRAUTHNIND).append(dEVTYP, rhs.dEVTYP).append(pGMTYPID, rhs.pGMTYPID).append(pMNTINITIATIONCHAN, rhs.pMNTINITIATIONCHAN).append(mOBILETXNTYP, rhs.mOBILETXNTYP).append(dATINFO, rhs.dATINFO).append(uSERFLDACI, rhs.uSERFLDACI).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
