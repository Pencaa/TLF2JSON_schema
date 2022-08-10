
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
 * The Q1 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "USER-FIELD-1-STR",
    "USER-FIELD-2-STR",
    "USER-FIELD-3-STR",
    "USER-FIELD-4-STR",
    "USER-FIELD-5-STR",
    "MERCHANT-TRAN-ID",
    "UUID",
    "REFERENCE-UUID",
    "IP-VERSION",
    "TRAN-SOURCE-IP-STR"
})
public class Q1 {

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
     * The USER-FIELD-1-STR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FIELD-1-STR")
    private String uSERFIELD1STR = "";
    /**
     * The USER-FIELD-2-STR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FIELD-2-STR")
    private String uSERFIELD2STR = "";
    /**
     * The USER-FIELD-3-STR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FIELD-3-STR")
    private String uSERFIELD3STR = "";
    /**
     * The USER-FIELD-4-STR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FIELD-4-STR")
    private String uSERFIELD4STR = "";
    /**
     * The USER-FIELD-5-STR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FIELD-5-STR")
    private String uSERFIELD5STR = "";
    /**
     * The MERCHANT-TRAN-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MERCHANT-TRAN-ID")
    private String mERCHANTTRANID = "";
    /**
     * The UUID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UUID")
    private String uUID = "";
    /**
     * The REFERENCE-UUID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("REFERENCE-UUID")
    private String rEFERENCEUUID = "";
    /**
     * The IP-VERSION Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("IP-VERSION")
    private String iPVERSION = "";
    /**
     * The TRAN-SOURCE-IP-STR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRAN-SOURCE-IP-STR")
    private String tRANSOURCEIPSTR = "";
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
     * The USER-FIELD-1-STR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FIELD-1-STR")
    public String getUSERFIELD1STR() {
        return uSERFIELD1STR;
    }

    /**
     * The USER-FIELD-1-STR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FIELD-1-STR")
    public void setUSERFIELD1STR(String uSERFIELD1STR) {
        this.uSERFIELD1STR = uSERFIELD1STR;
    }

    /**
     * The USER-FIELD-2-STR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FIELD-2-STR")
    public String getUSERFIELD2STR() {
        return uSERFIELD2STR;
    }

    /**
     * The USER-FIELD-2-STR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FIELD-2-STR")
    public void setUSERFIELD2STR(String uSERFIELD2STR) {
        this.uSERFIELD2STR = uSERFIELD2STR;
    }

    /**
     * The USER-FIELD-3-STR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FIELD-3-STR")
    public String getUSERFIELD3STR() {
        return uSERFIELD3STR;
    }

    /**
     * The USER-FIELD-3-STR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FIELD-3-STR")
    public void setUSERFIELD3STR(String uSERFIELD3STR) {
        this.uSERFIELD3STR = uSERFIELD3STR;
    }

    /**
     * The USER-FIELD-4-STR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FIELD-4-STR")
    public String getUSERFIELD4STR() {
        return uSERFIELD4STR;
    }

    /**
     * The USER-FIELD-4-STR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FIELD-4-STR")
    public void setUSERFIELD4STR(String uSERFIELD4STR) {
        this.uSERFIELD4STR = uSERFIELD4STR;
    }

    /**
     * The USER-FIELD-5-STR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FIELD-5-STR")
    public String getUSERFIELD5STR() {
        return uSERFIELD5STR;
    }

    /**
     * The USER-FIELD-5-STR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FIELD-5-STR")
    public void setUSERFIELD5STR(String uSERFIELD5STR) {
        this.uSERFIELD5STR = uSERFIELD5STR;
    }

    /**
     * The MERCHANT-TRAN-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MERCHANT-TRAN-ID")
    public String getMERCHANTTRANID() {
        return mERCHANTTRANID;
    }

    /**
     * The MERCHANT-TRAN-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MERCHANT-TRAN-ID")
    public void setMERCHANTTRANID(String mERCHANTTRANID) {
        this.mERCHANTTRANID = mERCHANTTRANID;
    }

    /**
     * The UUID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UUID")
    public String getUUID() {
        return uUID;
    }

    /**
     * The UUID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UUID")
    public void setUUID(String uUID) {
        this.uUID = uUID;
    }

    /**
     * The REFERENCE-UUID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("REFERENCE-UUID")
    public String getREFERENCEUUID() {
        return rEFERENCEUUID;
    }

    /**
     * The REFERENCE-UUID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("REFERENCE-UUID")
    public void setREFERENCEUUID(String rEFERENCEUUID) {
        this.rEFERENCEUUID = rEFERENCEUUID;
    }

    /**
     * The IP-VERSION Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("IP-VERSION")
    public String getIPVERSION() {
        return iPVERSION;
    }

    /**
     * The IP-VERSION Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("IP-VERSION")
    public void setIPVERSION(String iPVERSION) {
        this.iPVERSION = iPVERSION;
    }

    /**
     * The TRAN-SOURCE-IP-STR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRAN-SOURCE-IP-STR")
    public String getTRANSOURCEIPSTR() {
        return tRANSOURCEIPSTR;
    }

    /**
     * The TRAN-SOURCE-IP-STR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRAN-SOURCE-IP-STR")
    public void setTRANSOURCEIPSTR(String tRANSOURCEIPSTR) {
        this.tRANSOURCEIPSTR = tRANSOURCEIPSTR;
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
        return new HashCodeBuilder().append(tKNLEN).append(uSERFIELD1STR).append(uSERFIELD2STR).append(uSERFIELD3STR).append(uSERFIELD4STR).append(uSERFIELD5STR).append(mERCHANTTRANID).append(uUID).append(rEFERENCEUUID).append(iPVERSION).append(tRANSOURCEIPSTR).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Q1) == false) {
            return false;
        }
        Q1 rhs = ((Q1) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(uSERFIELD1STR, rhs.uSERFIELD1STR).append(uSERFIELD2STR, rhs.uSERFIELD2STR).append(uSERFIELD3STR, rhs.uSERFIELD3STR).append(uSERFIELD4STR, rhs.uSERFIELD4STR).append(uSERFIELD5STR, rhs.uSERFIELD5STR).append(mERCHANTTRANID, rhs.mERCHANTTRANID).append(uUID, rhs.uUID).append(rEFERENCEUUID, rhs.rEFERENCEUUID).append(iPVERSION, rhs.iPVERSION).append(tRANSOURCEIPSTR, rhs.tRANSOURCEIPSTR).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
