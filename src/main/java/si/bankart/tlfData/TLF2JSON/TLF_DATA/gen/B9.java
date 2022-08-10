
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
 * The B9 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "ACQ-DESCR-TAG",
    "ISS-DESCR-TAG"
})
public class B9 {

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
     * The ACQ-DESCR-TAG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ACQ-DESCR-TAG")
    private String aCQDESCRTAG = "";
    /**
     * The ISS-DESCR-TAG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISS-DESCR-TAG")
    private String iSSDESCRTAG = "";
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
     * The ACQ-DESCR-TAG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ACQ-DESCR-TAG")
    public String getACQDESCRTAG() {
        return aCQDESCRTAG;
    }

    /**
     * The ACQ-DESCR-TAG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ACQ-DESCR-TAG")
    public void setACQDESCRTAG(String aCQDESCRTAG) {
        this.aCQDESCRTAG = aCQDESCRTAG;
    }

    /**
     * The ISS-DESCR-TAG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISS-DESCR-TAG")
    public String getISSDESCRTAG() {
        return iSSDESCRTAG;
    }

    /**
     * The ISS-DESCR-TAG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISS-DESCR-TAG")
    public void setISSDESCRTAG(String iSSDESCRTAG) {
        this.iSSDESCRTAG = iSSDESCRTAG;
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
        return new HashCodeBuilder().append(tKNLEN).append(aCQDESCRTAG).append(iSSDESCRTAG).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof B9) == false) {
            return false;
        }
        B9 rhs = ((B9) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(aCQDESCRTAG, rhs.aCQDESCRTAG).append(iSSDESCRTAG, rhs.iSSDESCRTAG).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
