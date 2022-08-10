
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
 * The S2 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "DCC-PRFL",
    "DCC-STAT",
    "DCC-SUBSTAT"
})
public class S2 {

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
     * The DCC-PRFL Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DCC-PRFL")
    private String dCCPRFL = "";
    /**
     * The DCC-STAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DCC-STAT")
    private String dCCSTAT = "";
    /**
     * The E-COMM-GOODS-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DCC-SUBSTAT")
    private String dCCSUBSTAT = "";
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
     * The DCC-PRFL Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DCC-PRFL")
    public String getDCCPRFL() {
        return dCCPRFL;
    }

    /**
     * The DCC-PRFL Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DCC-PRFL")
    public void setDCCPRFL(String dCCPRFL) {
        this.dCCPRFL = dCCPRFL;
    }

    /**
     * The DCC-STAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DCC-STAT")
    public String getDCCSTAT() {
        return dCCSTAT;
    }

    /**
     * The DCC-STAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DCC-STAT")
    public void setDCCSTAT(String dCCSTAT) {
        this.dCCSTAT = dCCSTAT;
    }

    /**
     * The E-COMM-GOODS-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DCC-SUBSTAT")
    public String getDCCSUBSTAT() {
        return dCCSUBSTAT;
    }

    /**
     * The E-COMM-GOODS-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DCC-SUBSTAT")
    public void setDCCSUBSTAT(String dCCSUBSTAT) {
        this.dCCSUBSTAT = dCCSUBSTAT;
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
        return new HashCodeBuilder().append(tKNLEN).append(dCCPRFL).append(dCCSTAT).append(dCCSUBSTAT).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof S2) == false) {
            return false;
        }
        S2 rhs = ((S2) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(dCCPRFL, rhs.dCCPRFL).append(dCCSTAT, rhs.dCCSTAT).append(dCCSUBSTAT, rhs.dCCSUBSTAT).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
