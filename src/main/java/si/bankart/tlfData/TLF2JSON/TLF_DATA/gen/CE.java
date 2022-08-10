
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
 * The CE Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "AUTHN-IND-FLG",
    "AUTHN-IND-DATA"
})
public class CE {

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
     * The AUTHN-IND-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTHN-IND-FLG")
    private String aUTHNINDFLG = "";
    /**
     * The AUTHN-IND-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTHN-IND-DATA")
    private String aUTHNINDDATA = "";
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
     * The AUTHN-IND-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTHN-IND-FLG")
    public String getAUTHNINDFLG() {
        return aUTHNINDFLG;
    }

    /**
     * The AUTHN-IND-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTHN-IND-FLG")
    public void setAUTHNINDFLG(String aUTHNINDFLG) {
        this.aUTHNINDFLG = aUTHNINDFLG;
    }

    /**
     * The AUTHN-IND-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTHN-IND-DATA")
    public String getAUTHNINDDATA() {
        return aUTHNINDDATA;
    }

    /**
     * The AUTHN-IND-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTHN-IND-DATA")
    public void setAUTHNINDDATA(String aUTHNINDDATA) {
        this.aUTHNINDDATA = aUTHNINDDATA;
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
        return new HashCodeBuilder().append(tKNLEN).append(aUTHNINDFLG).append(aUTHNINDDATA).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CE) == false) {
            return false;
        }
        CE rhs = ((CE) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(aUTHNINDFLG, rhs.aUTHNINDFLG).append(aUTHNINDDATA, rhs.aUTHNINDDATA).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
