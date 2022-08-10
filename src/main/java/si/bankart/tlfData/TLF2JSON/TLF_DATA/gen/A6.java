
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
 * The A6 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "LIFE-CYCLE-IND",
    "TRACE-ID",
    "VALID-CDE",
    "MONITORING-STAT",
    "ERR-IND"
})
public class A6 {

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
     * The LIFE-CYCLE-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LIFE-CYCLE-IND")
    private String lIFECYCLEIND = "";
    /**
     * The TRACE-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRACE-ID")
    private String tRACEID = "";
    /**
     * The VALID-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VALID-CDE")
    private String vALIDCDE = "";
    /**
     * The MONITORING-STAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MONITORING-STAT")
    private String mONITORINGSTAT = "";
    /**
     * The ERR-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ERR-IND")
    private String eRRIND = "";
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
     * The LIFE-CYCLE-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LIFE-CYCLE-IND")
    public String getLIFECYCLEIND() {
        return lIFECYCLEIND;
    }

    /**
     * The LIFE-CYCLE-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LIFE-CYCLE-IND")
    public void setLIFECYCLEIND(String lIFECYCLEIND) {
        this.lIFECYCLEIND = lIFECYCLEIND;
    }

    /**
     * The TRACE-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRACE-ID")
    public String getTRACEID() {
        return tRACEID;
    }

    /**
     * The TRACE-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRACE-ID")
    public void setTRACEID(String tRACEID) {
        this.tRACEID = tRACEID;
    }

    /**
     * The VALID-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VALID-CDE")
    public String getVALIDCDE() {
        return vALIDCDE;
    }

    /**
     * The VALID-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VALID-CDE")
    public void setVALIDCDE(String vALIDCDE) {
        this.vALIDCDE = vALIDCDE;
    }

    /**
     * The MONITORING-STAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MONITORING-STAT")
    public String getMONITORINGSTAT() {
        return mONITORINGSTAT;
    }

    /**
     * The MONITORING-STAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MONITORING-STAT")
    public void setMONITORINGSTAT(String mONITORINGSTAT) {
        this.mONITORINGSTAT = mONITORINGSTAT;
    }

    /**
     * The ERR-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ERR-IND")
    public String getERRIND() {
        return eRRIND;
    }

    /**
     * The ERR-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ERR-IND")
    public void setERRIND(String eRRIND) {
        this.eRRIND = eRRIND;
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
        return new HashCodeBuilder().append(tKNLEN).append(lIFECYCLEIND).append(tRACEID).append(vALIDCDE).append(mONITORINGSTAT).append(eRRIND).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof A6) == false) {
            return false;
        }
        A6 rhs = ((A6) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(lIFECYCLEIND, rhs.lIFECYCLEIND).append(tRACEID, rhs.tRACEID).append(vALIDCDE, rhs.vALIDCDE).append(mONITORINGSTAT, rhs.mONITORINGSTAT).append(eRRIND, rhs.eRRIND).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
