
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
 * The SH Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "FRMT-CDE",
    "LGHT",
    "INFO"
})
public class SH {

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
     * The FRMT-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FRMT-CDE")
    private String fRMTCDE = "";
    /**
     * The LGHT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LGHT")
    private String lGHT = "";
    /**
     * The INFO Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("INFO")
    private String iNFO = "";
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
     * The FRMT-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FRMT-CDE")
    public String getFRMTCDE() {
        return fRMTCDE;
    }

    /**
     * The FRMT-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FRMT-CDE")
    public void setFRMTCDE(String fRMTCDE) {
        this.fRMTCDE = fRMTCDE;
    }

    /**
     * The LGHT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LGHT")
    public String getLGHT() {
        return lGHT;
    }

    /**
     * The LGHT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LGHT")
    public void setLGHT(String lGHT) {
        this.lGHT = lGHT;
    }

    /**
     * The INFO Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("INFO")
    public String getINFO() {
        return iNFO;
    }

    /**
     * The INFO Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("INFO")
    public void setINFO(String iNFO) {
        this.iNFO = iNFO;
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
        return new HashCodeBuilder().append(tKNLEN).append(fRMTCDE).append(lGHT).append(iNFO).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SH) == false) {
            return false;
        }
        SH rhs = ((SH) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(fRMTCDE, rhs.fRMTCDE).append(lGHT, rhs.lGHT).append(iNFO, rhs.iNFO).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
