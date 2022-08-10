
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
 * The BM Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "TXN-SUBTYP",
    "ACQ-PROC-CDE",
    "ISS-PROC-CDE",
    "USER-FLD1"
})
public class BM {

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
     * The TXN-SUBTYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TXN-SUBTYP")
    private String tXNSUBTYP = "";
    /**
     * The ACQ-PROC-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ACQ-PROC-CDE")
    private String aCQPROCCDE = "";
    /**
     * The ISS-PROC-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISS-PROC-CDE")
    private String iSSPROCCDE = "";
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
     * The TXN-SUBTYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TXN-SUBTYP")
    public String getTXNSUBTYP() {
        return tXNSUBTYP;
    }

    /**
     * The TXN-SUBTYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TXN-SUBTYP")
    public void setTXNSUBTYP(String tXNSUBTYP) {
        this.tXNSUBTYP = tXNSUBTYP;
    }

    /**
     * The ACQ-PROC-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ACQ-PROC-CDE")
    public String getACQPROCCDE() {
        return aCQPROCCDE;
    }

    /**
     * The ACQ-PROC-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ACQ-PROC-CDE")
    public void setACQPROCCDE(String aCQPROCCDE) {
        this.aCQPROCCDE = aCQPROCCDE;
    }

    /**
     * The ISS-PROC-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISS-PROC-CDE")
    public String getISSPROCCDE() {
        return iSSPROCCDE;
    }

    /**
     * The ISS-PROC-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISS-PROC-CDE")
    public void setISSPROCCDE(String iSSPROCCDE) {
        this.iSSPROCCDE = iSSPROCCDE;
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
        return new HashCodeBuilder().append(tKNLEN).append(tXNSUBTYP).append(aCQPROCCDE).append(iSSPROCCDE).append(uSERFLD1).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BM) == false) {
            return false;
        }
        BM rhs = ((BM) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(tXNSUBTYP, rhs.tXNSUBTYP).append(aCQPROCCDE, rhs.aCQPROCCDE).append(iSSPROCCDE, rhs.iSSPROCCDE).append(uSERFLD1, rhs.uSERFLD1).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
