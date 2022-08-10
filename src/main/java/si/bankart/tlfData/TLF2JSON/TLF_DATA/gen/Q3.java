
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
 * The Q3 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "COUNTRY_CODE",
    "USER_FIELD_CNTRY"
})
public class Q3 {

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
     * The COUNTRY_CODE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("COUNTRY_CODE")
    private String cOUNTRYCODE = "";
    /**
     * The USER_FIELD_CNTRY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER_FIELD_CNTRY")
    private String uSERFIELDCNTRY = "";
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
     * The COUNTRY_CODE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("COUNTRY_CODE")
    public String getCOUNTRYCODE() {
        return cOUNTRYCODE;
    }

    /**
     * The COUNTRY_CODE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("COUNTRY_CODE")
    public void setCOUNTRYCODE(String cOUNTRYCODE) {
        this.cOUNTRYCODE = cOUNTRYCODE;
    }

    /**
     * The USER_FIELD_CNTRY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER_FIELD_CNTRY")
    public String getUSERFIELDCNTRY() {
        return uSERFIELDCNTRY;
    }

    /**
     * The USER_FIELD_CNTRY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER_FIELD_CNTRY")
    public void setUSERFIELDCNTRY(String uSERFIELDCNTRY) {
        this.uSERFIELDCNTRY = uSERFIELDCNTRY;
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
        return new HashCodeBuilder().append(tKNLEN).append(cOUNTRYCODE).append(uSERFIELDCNTRY).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Q3) == false) {
            return false;
        }
        Q3 rhs = ((Q3) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(cOUNTRYCODE, rhs.cOUNTRYCODE).append(uSERFIELDCNTRY, rhs.uSERFIELDCNTRY).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
