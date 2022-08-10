
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
 * The M2 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "TERM-TYP",
    "ADJ-PROC",
    "USER-FLD-ACI"
})
public class M2 {

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
     * The TERM-TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-TYP")
    private String tERMTYP = "";
    /**
     * The ADJ-PROC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ADJ-PROC")
    private String aDJPROC = "";
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
     * The TERM-TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-TYP")
    public String getTERMTYP() {
        return tERMTYP;
    }

    /**
     * The TERM-TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-TYP")
    public void setTERMTYP(String tERMTYP) {
        this.tERMTYP = tERMTYP;
    }

    /**
     * The ADJ-PROC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ADJ-PROC")
    public String getADJPROC() {
        return aDJPROC;
    }

    /**
     * The ADJ-PROC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ADJ-PROC")
    public void setADJPROC(String aDJPROC) {
        this.aDJPROC = aDJPROC;
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
        return new HashCodeBuilder().append(tKNLEN).append(tERMTYP).append(aDJPROC).append(uSERFLDACI).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof M2) == false) {
            return false;
        }
        M2 rhs = ((M2) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(tERMTYP, rhs.tERMTYP).append(aDJPROC, rhs.aDJPROC).append(uSERFLDACI, rhs.uSERFLDACI).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
