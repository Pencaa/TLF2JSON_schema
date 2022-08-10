
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
 * The 06 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "NEW-PIN-FRMT",
    "NEW-PIN-OFST",
    "PIN-CNT",
    "NEW-PIN-SIZE",
    "NEW-PIN-1",
    "NEW-PIN-2"
})
public class _06 {

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
     * The NEW-PIN-FRMT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NEW-PIN-FRMT")
    private String nEWPINFRMT = "";
    /**
     * The NEW-PIN-OFST Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NEW-PIN-OFST")
    private String nEWPINOFST = "";
    /**
     * The PIN-CNT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PIN-CNT")
    private String pINCNT = "";
    /**
     * The NEW-PIN-SIZE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NEW-PIN-SIZE")
    private String nEWPINSIZE = "";
    /**
     * The NEW-PIN-1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NEW-PIN-1")
    private String nEWPIN1 = "";
    /**
     * The NEW-PIN-2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NEW-PIN-2")
    private String nEWPIN2 = "";
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
     * The NEW-PIN-FRMT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NEW-PIN-FRMT")
    public String getNEWPINFRMT() {
        return nEWPINFRMT;
    }

    /**
     * The NEW-PIN-FRMT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NEW-PIN-FRMT")
    public void setNEWPINFRMT(String nEWPINFRMT) {
        this.nEWPINFRMT = nEWPINFRMT;
    }

    /**
     * The NEW-PIN-OFST Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NEW-PIN-OFST")
    public String getNEWPINOFST() {
        return nEWPINOFST;
    }

    /**
     * The NEW-PIN-OFST Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NEW-PIN-OFST")
    public void setNEWPINOFST(String nEWPINOFST) {
        this.nEWPINOFST = nEWPINOFST;
    }

    /**
     * The PIN-CNT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PIN-CNT")
    public String getPINCNT() {
        return pINCNT;
    }

    /**
     * The PIN-CNT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PIN-CNT")
    public void setPINCNT(String pINCNT) {
        this.pINCNT = pINCNT;
    }

    /**
     * The NEW-PIN-SIZE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NEW-PIN-SIZE")
    public String getNEWPINSIZE() {
        return nEWPINSIZE;
    }

    /**
     * The NEW-PIN-SIZE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NEW-PIN-SIZE")
    public void setNEWPINSIZE(String nEWPINSIZE) {
        this.nEWPINSIZE = nEWPINSIZE;
    }

    /**
     * The NEW-PIN-1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NEW-PIN-1")
    public String getNEWPIN1() {
        return nEWPIN1;
    }

    /**
     * The NEW-PIN-1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NEW-PIN-1")
    public void setNEWPIN1(String nEWPIN1) {
        this.nEWPIN1 = nEWPIN1;
    }

    /**
     * The NEW-PIN-2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NEW-PIN-2")
    public String getNEWPIN2() {
        return nEWPIN2;
    }

    /**
     * The NEW-PIN-2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NEW-PIN-2")
    public void setNEWPIN2(String nEWPIN2) {
        this.nEWPIN2 = nEWPIN2;
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
        return new HashCodeBuilder().append(tKNLEN).append(nEWPINFRMT).append(nEWPINOFST).append(pINCNT).append(nEWPINSIZE).append(nEWPIN1).append(nEWPIN2).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _06) == false) {
            return false;
        }
        _06 rhs = ((_06) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(nEWPINFRMT, rhs.nEWPINFRMT).append(nEWPINOFST, rhs.nEWPINOFST).append(pINCNT, rhs.pINCNT).append(nEWPINSIZE, rhs.nEWPINSIZE).append(nEWPIN1, rhs.nEWPIN1).append(nEWPIN2, rhs.nEWPIN2).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
