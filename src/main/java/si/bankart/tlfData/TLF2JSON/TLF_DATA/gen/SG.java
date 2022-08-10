
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
 * The SG Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "FRMT-CDE",
    "SCORE",
    "RSN-CDE",
    "RULE-ADJ-SCORE",
    "RULE-RSN-CDE-1",
    "RULE-RSN-CDE-2"
})
public class SG {

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
     * The SCORE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SCORE")
    private String sCORE = "";
    /**
     * The RSN-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RSN-CDE")
    private String rSNCDE = "";
    /**
     * The FRMT-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RULE-ADJ-SCORE")
    private String rULEADJSCORE = "";
    /**
     * The RULE-RSN-CDE-1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RULE-RSN-CDE-1")
    private String rULERSNCDE1 = "";
    /**
     * The RULE-RSN-CDE-2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RULE-RSN-CDE-2")
    private String rULERSNCDE2 = "";
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
     * The SCORE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SCORE")
    public String getSCORE() {
        return sCORE;
    }

    /**
     * The SCORE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SCORE")
    public void setSCORE(String sCORE) {
        this.sCORE = sCORE;
    }

    /**
     * The RSN-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RSN-CDE")
    public String getRSNCDE() {
        return rSNCDE;
    }

    /**
     * The RSN-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RSN-CDE")
    public void setRSNCDE(String rSNCDE) {
        this.rSNCDE = rSNCDE;
    }

    /**
     * The FRMT-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RULE-ADJ-SCORE")
    public String getRULEADJSCORE() {
        return rULEADJSCORE;
    }

    /**
     * The FRMT-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RULE-ADJ-SCORE")
    public void setRULEADJSCORE(String rULEADJSCORE) {
        this.rULEADJSCORE = rULEADJSCORE;
    }

    /**
     * The RULE-RSN-CDE-1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RULE-RSN-CDE-1")
    public String getRULERSNCDE1() {
        return rULERSNCDE1;
    }

    /**
     * The RULE-RSN-CDE-1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RULE-RSN-CDE-1")
    public void setRULERSNCDE1(String rULERSNCDE1) {
        this.rULERSNCDE1 = rULERSNCDE1;
    }

    /**
     * The RULE-RSN-CDE-2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RULE-RSN-CDE-2")
    public String getRULERSNCDE2() {
        return rULERSNCDE2;
    }

    /**
     * The RULE-RSN-CDE-2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RULE-RSN-CDE-2")
    public void setRULERSNCDE2(String rULERSNCDE2) {
        this.rULERSNCDE2 = rULERSNCDE2;
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
        return new HashCodeBuilder().append(tKNLEN).append(fRMTCDE).append(sCORE).append(rSNCDE).append(rULEADJSCORE).append(rULERSNCDE1).append(rULERSNCDE2).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SG) == false) {
            return false;
        }
        SG rhs = ((SG) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(fRMTCDE, rhs.fRMTCDE).append(sCORE, rhs.sCORE).append(rSNCDE, rhs.rSNCDE).append(rULEADJSCORE, rhs.rULEADJSCORE).append(rULERSNCDE1, rhs.rULERSNCDE1).append(rULERSNCDE2, rhs.rULERSNCDE2).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
