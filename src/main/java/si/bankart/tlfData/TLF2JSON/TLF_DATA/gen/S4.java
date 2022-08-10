
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
 * The S4 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "DATASET-ID",
    "LGTH",
    "SUPPL-DATA"
})
public class S4 {

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
     * The DATASET-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DATASET-ID")
    private String dATASETID = "";
    /**
     * The LGTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LGTH")
    private String lGTH = "";
    /**
     * The SUPPL-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SUPPL-DATA")
    private String sUPPLDATA = "";
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
     * The DATASET-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DATASET-ID")
    public String getDATASETID() {
        return dATASETID;
    }

    /**
     * The DATASET-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DATASET-ID")
    public void setDATASETID(String dATASETID) {
        this.dATASETID = dATASETID;
    }

    /**
     * The LGTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LGTH")
    public String getLGTH() {
        return lGTH;
    }

    /**
     * The LGTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LGTH")
    public void setLGTH(String lGTH) {
        this.lGTH = lGTH;
    }

    /**
     * The SUPPL-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SUPPL-DATA")
    public String getSUPPLDATA() {
        return sUPPLDATA;
    }

    /**
     * The SUPPL-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SUPPL-DATA")
    public void setSUPPLDATA(String sUPPLDATA) {
        this.sUPPLDATA = sUPPLDATA;
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
        return new HashCodeBuilder().append(tKNLEN).append(dATASETID).append(lGTH).append(sUPPLDATA).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof S4) == false) {
            return false;
        }
        S4 rhs = ((S4) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(dATASETID, rhs.dATASETID).append(lGTH, rhs.lGTH).append(sUPPLDATA, rhs.sUPPLDATA).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
