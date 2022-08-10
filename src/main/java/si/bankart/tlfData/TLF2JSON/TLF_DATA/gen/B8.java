
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
 * The B8 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "ACQ-TXN-PRFL",
    "ISS-TXN-PRFL",
    "DISCRD-RVSL-FLG",
    "APCF-RTE"
})
public class B8 {

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
     * The ACQ-TXN-PRFL Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ACQ-TXN-PRFL")
    private String aCQTXNPRFL = "";
    /**
     * The ISS-TXN-PRFL Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISS-TXN-PRFL")
    private String iSSTXNPRFL = "";
    /**
     * The DISCRD-RVSL-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DISCRD-RVSL-FLG")
    private String dISCRDRVSLFLG = "";
    /**
     * The APCF-RTE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("APCF-RTE")
    private String aPCFRTE = "";
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
     * The ACQ-TXN-PRFL Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ACQ-TXN-PRFL")
    public String getACQTXNPRFL() {
        return aCQTXNPRFL;
    }

    /**
     * The ACQ-TXN-PRFL Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ACQ-TXN-PRFL")
    public void setACQTXNPRFL(String aCQTXNPRFL) {
        this.aCQTXNPRFL = aCQTXNPRFL;
    }

    /**
     * The ISS-TXN-PRFL Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISS-TXN-PRFL")
    public String getISSTXNPRFL() {
        return iSSTXNPRFL;
    }

    /**
     * The ISS-TXN-PRFL Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISS-TXN-PRFL")
    public void setISSTXNPRFL(String iSSTXNPRFL) {
        this.iSSTXNPRFL = iSSTXNPRFL;
    }

    /**
     * The DISCRD-RVSL-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DISCRD-RVSL-FLG")
    public String getDISCRDRVSLFLG() {
        return dISCRDRVSLFLG;
    }

    /**
     * The DISCRD-RVSL-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DISCRD-RVSL-FLG")
    public void setDISCRDRVSLFLG(String dISCRDRVSLFLG) {
        this.dISCRDRVSLFLG = dISCRDRVSLFLG;
    }

    /**
     * The APCF-RTE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("APCF-RTE")
    public String getAPCFRTE() {
        return aPCFRTE;
    }

    /**
     * The APCF-RTE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("APCF-RTE")
    public void setAPCFRTE(String aPCFRTE) {
        this.aPCFRTE = aPCFRTE;
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
        return new HashCodeBuilder().append(tKNLEN).append(aCQTXNPRFL).append(iSSTXNPRFL).append(dISCRDRVSLFLG).append(aPCFRTE).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof B8) == false) {
            return false;
        }
        B8 rhs = ((B8) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(aCQTXNPRFL, rhs.aCQTXNPRFL).append(iSSTXNPRFL, rhs.iSSTXNPRFL).append(dISCRDRVSLFLG, rhs.dISCRDRVSLFLG).append(aPCFRTE, rhs.aPCFRTE).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
