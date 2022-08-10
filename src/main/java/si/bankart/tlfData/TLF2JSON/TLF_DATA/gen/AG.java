
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
 * The AG Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "TRK-USED",
    "TERM-LOC-IND",
    "LANG-CDE",
    "TERM-ENVMT-IND",
    "MOB-ACSS-IND",
    "USER-FLD1"
})
public class AG {

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
     * The TRK-USED Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRK-USED")
    private String tRKUSED = "";
    /**
     * The TERM-LOC-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-LOC-IND")
    private String tERMLOCIND = "";
    /**
     * The LANG-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LANG-CDE")
    private String lANGCDE = "";
    /**
     * The TERM-ENVMT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-ENVMT-IND")
    private String tERMENVMTIND = "";
    /**
     * The MOB-ACSS-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MOB-ACSS-IND")
    private String mOBACSSIND = "";
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
     * The TRK-USED Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRK-USED")
    public String getTRKUSED() {
        return tRKUSED;
    }

    /**
     * The TRK-USED Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRK-USED")
    public void setTRKUSED(String tRKUSED) {
        this.tRKUSED = tRKUSED;
    }

    /**
     * The TERM-LOC-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-LOC-IND")
    public String getTERMLOCIND() {
        return tERMLOCIND;
    }

    /**
     * The TERM-LOC-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-LOC-IND")
    public void setTERMLOCIND(String tERMLOCIND) {
        this.tERMLOCIND = tERMLOCIND;
    }

    /**
     * The LANG-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LANG-CDE")
    public String getLANGCDE() {
        return lANGCDE;
    }

    /**
     * The LANG-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LANG-CDE")
    public void setLANGCDE(String lANGCDE) {
        this.lANGCDE = lANGCDE;
    }

    /**
     * The TERM-ENVMT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-ENVMT-IND")
    public String getTERMENVMTIND() {
        return tERMENVMTIND;
    }

    /**
     * The TERM-ENVMT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-ENVMT-IND")
    public void setTERMENVMTIND(String tERMENVMTIND) {
        this.tERMENVMTIND = tERMENVMTIND;
    }

    /**
     * The MOB-ACSS-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MOB-ACSS-IND")
    public String getMOBACSSIND() {
        return mOBACSSIND;
    }

    /**
     * The MOB-ACSS-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MOB-ACSS-IND")
    public void setMOBACSSIND(String mOBACSSIND) {
        this.mOBACSSIND = mOBACSSIND;
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
        return new HashCodeBuilder().append(tKNLEN).append(tRKUSED).append(tERMLOCIND).append(lANGCDE).append(tERMENVMTIND).append(mOBACSSIND).append(uSERFLD1).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AG) == false) {
            return false;
        }
        AG rhs = ((AG) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(tRKUSED, rhs.tRKUSED).append(tERMLOCIND, rhs.tERMLOCIND).append(lANGCDE, rhs.lANGCDE).append(tERMENVMTIND, rhs.tERMENVMTIND).append(mOBACSSIND, rhs.mOBACSSIND).append(uSERFLD1, rhs.uSERFLD1).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
