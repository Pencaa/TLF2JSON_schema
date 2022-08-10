
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
 * The M1 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "TERM-CAPTURE-FLAG",
    "USER-FLD-ACI"
})
public class M1 {

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
     * The TERM-CAPTURE-FLAG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-CAPTURE-FLAG")
    private String tERMCAPTUREFLAG = "";
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
     * The TERM-CAPTURE-FLAG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-CAPTURE-FLAG")
    public String getTERMCAPTUREFLAG() {
        return tERMCAPTUREFLAG;
    }

    /**
     * The TERM-CAPTURE-FLAG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-CAPTURE-FLAG")
    public void setTERMCAPTUREFLAG(String tERMCAPTUREFLAG) {
        this.tERMCAPTUREFLAG = tERMCAPTUREFLAG;
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
        return new HashCodeBuilder().append(tKNLEN).append(tERMCAPTUREFLAG).append(uSERFLDACI).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof M1) == false) {
            return false;
        }
        M1 rhs = ((M1) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(tERMCAPTUREFLAG, rhs.tERMCAPTUREFLAG).append(uSERFLDACI, rhs.uSERFLDACI).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
