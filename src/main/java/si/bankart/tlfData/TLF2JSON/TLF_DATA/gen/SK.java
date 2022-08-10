
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
 * The 16 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "FRMT-CDE",
    "LGTH",
    "UNIQUE-REF-NUM",
    "FUND-SRC",
    "PARTICIPANT-ID",
    "ADDL-MSG",
    "TXN-RSN",
    "USER-FLD-MC"
})
public class SK {

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
     * The LGTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("LGTH")
    private String lGTH = "";
    /**
     * The UNIQUE-REF-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UNIQUE-REF-NUM")
    private String uNIQUEREFNUM = "";
    /**
     * The FUND-SRC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FUND-SRC")
    private String fUNDSRC = "";
    /**
     * The PARTICIPANT-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PARTICIPANT-ID")
    private String pARTICIPANTID = "";
    /**
     * The ADDL-MSG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ADDL-MSG")
    private String aDDLMSG = "";
    /**
     * The TXN-RSN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TXN-RSN")
    private String tXNRSN = "";
    /**
     * The USER-FLD-MC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD-MC")
    private String uSERFLDMC = "";
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
     * The UNIQUE-REF-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UNIQUE-REF-NUM")
    public String getUNIQUEREFNUM() {
        return uNIQUEREFNUM;
    }

    /**
     * The UNIQUE-REF-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UNIQUE-REF-NUM")
    public void setUNIQUEREFNUM(String uNIQUEREFNUM) {
        this.uNIQUEREFNUM = uNIQUEREFNUM;
    }

    /**
     * The FUND-SRC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FUND-SRC")
    public String getFUNDSRC() {
        return fUNDSRC;
    }

    /**
     * The FUND-SRC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FUND-SRC")
    public void setFUNDSRC(String fUNDSRC) {
        this.fUNDSRC = fUNDSRC;
    }

    /**
     * The PARTICIPANT-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PARTICIPANT-ID")
    public String getPARTICIPANTID() {
        return pARTICIPANTID;
    }

    /**
     * The PARTICIPANT-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PARTICIPANT-ID")
    public void setPARTICIPANTID(String pARTICIPANTID) {
        this.pARTICIPANTID = pARTICIPANTID;
    }

    /**
     * The ADDL-MSG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ADDL-MSG")
    public String getADDLMSG() {
        return aDDLMSG;
    }

    /**
     * The ADDL-MSG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ADDL-MSG")
    public void setADDLMSG(String aDDLMSG) {
        this.aDDLMSG = aDDLMSG;
    }

    /**
     * The TXN-RSN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TXN-RSN")
    public String getTXNRSN() {
        return tXNRSN;
    }

    /**
     * The TXN-RSN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TXN-RSN")
    public void setTXNRSN(String tXNRSN) {
        this.tXNRSN = tXNRSN;
    }

    /**
     * The USER-FLD-MC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD-MC")
    public String getUSERFLDMC() {
        return uSERFLDMC;
    }

    /**
     * The USER-FLD-MC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD-MC")
    public void setUSERFLDMC(String uSERFLDMC) {
        this.uSERFLDMC = uSERFLDMC;
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
        return new HashCodeBuilder().append(tKNLEN).append(fRMTCDE).append(lGTH).append(uNIQUEREFNUM).append(fUNDSRC).append(pARTICIPANTID).append(aDDLMSG).append(tXNRSN).append(uSERFLDMC).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SK) == false) {
            return false;
        }
        SK rhs = ((SK) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(fRMTCDE, rhs.fRMTCDE).append(lGTH, rhs.lGTH).append(uNIQUEREFNUM, rhs.uNIQUEREFNUM).append(fUNDSRC, rhs.fUNDSRC).append(pARTICIPANTID, rhs.pARTICIPANTID).append(aDDLMSG, rhs.aDDLMSG).append(tXNRSN, rhs.tXNRSN).append(uSERFLDMC, rhs.uSERFLDMC).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
