
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
 * The FB Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "DATA-IND-FLG",
    "INFO-DATA-LGTH",
    "INFO"
})
public class FB {

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
     * The DATA-IND-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DATA-IND-FLG")
    private String dATAINDFLG = "";
    /**
     * The INFO-DATA-LGTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("INFO-DATA-LGTH")
    private String iNFODATALGTH = "";
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
     * The DATA-IND-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DATA-IND-FLG")
    public String getDATAINDFLG() {
        return dATAINDFLG;
    }

    /**
     * The DATA-IND-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DATA-IND-FLG")
    public void setDATAINDFLG(String dATAINDFLG) {
        this.dATAINDFLG = dATAINDFLG;
    }

    /**
     * The INFO-DATA-LGTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("INFO-DATA-LGTH")
    public String getINFODATALGTH() {
        return iNFODATALGTH;
    }

    /**
     * The INFO-DATA-LGTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("INFO-DATA-LGTH")
    public void setINFODATALGTH(String iNFODATALGTH) {
        this.iNFODATALGTH = iNFODATALGTH;
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
        return new HashCodeBuilder().append(tKNLEN).append(dATAINDFLG).append(iNFODATALGTH).append(iNFO).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FB) == false) {
            return false;
        }
        FB rhs = ((FB) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(dATAINDFLG, rhs.dATAINDFLG).append(iNFODATALGTH, rhs.iNFODATALGTH).append(iNFO, rhs.iNFO).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
