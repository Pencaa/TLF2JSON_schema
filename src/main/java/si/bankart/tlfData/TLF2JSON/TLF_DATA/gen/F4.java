
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
 * The F4 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "WALLET-IND-FLG",
    "DGTL-WALLET-DATA"
})
public class F4 {

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
     * The WALLET-IND-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("WALLET-IND-FLG")
    private String wALLETINDFLG = "";
    /**
     * The DGTL-WALLET-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DGTL-WALLET-DATA")
    private String dGTLWALLETDATA = "";
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
     * The WALLET-IND-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("WALLET-IND-FLG")
    public String getWALLETINDFLG() {
        return wALLETINDFLG;
    }

    /**
     * The WALLET-IND-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("WALLET-IND-FLG")
    public void setWALLETINDFLG(String wALLETINDFLG) {
        this.wALLETINDFLG = wALLETINDFLG;
    }

    /**
     * The DGTL-WALLET-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DGTL-WALLET-DATA")
    public String getDGTLWALLETDATA() {
        return dGTLWALLETDATA;
    }

    /**
     * The DGTL-WALLET-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DGTL-WALLET-DATA")
    public void setDGTLWALLETDATA(String dGTLWALLETDATA) {
        this.dGTLWALLETDATA = dGTLWALLETDATA;
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
        return new HashCodeBuilder().append(tKNLEN).append(wALLETINDFLG).append(dGTLWALLETDATA).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof F4) == false) {
            return false;
        }
        F4 rhs = ((F4) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(wALLETINDFLG, rhs.wALLETINDFLG).append(dGTLWALLETDATA, rhs.dGTLWALLETDATA).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
