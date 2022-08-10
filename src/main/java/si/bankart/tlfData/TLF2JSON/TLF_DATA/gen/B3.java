
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
 * The B3 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "BIT-MAP",
    "TERM-SERL-NUM",
    "EMV-TERM-CAP",
    "USER-FLD1",
    "USER-FLD2",
    "EMV-TERM-TYPE",
    "APPL-VER-NUM",
    "CVM-RSLTS",
    "DF-NAME-LGTH",
    "DF-NAME"
})
public class B3 {

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
     * The BIT-MAP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BIT-MAP")
    private String bITMAP = "";
    /**
     * The TERM-SERL-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-SERL-NUM")
    private String tERMSERLNUM = "";
    /**
     * The EMV-TERM-CAP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("EMV-TERM-CAP")
    private String eMVTERMCAP = "";
    /**
     * The USER-FLD1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD1")
    private String uSERFLD1 = "";
    /**
     * The USER-FLD2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD2")
    private String uSERFLD2 = "";
    /**
     * The EMV-TERM-TYPE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("EMV-TERM-TYPE")
    private String eMVTERMTYPE = "";
    /**
     * The APPL-VER-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("APPL-VER-NUM")
    private String aPPLVERNUM = "";
    /**
     * The CVM-RSLTS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CVM-RSLTS")
    private String cVMRSLTS = "";
    /**
     * The DF-NAME-LGTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DF-NAME-LGTH")
    private String dFNAMELGTH = "";
    /**
     * The DF-NAME Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DF-NAME")
    private String dFNAME = "";
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
     * The BIT-MAP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BIT-MAP")
    public String getBITMAP() {
        return bITMAP;
    }

    /**
     * The BIT-MAP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BIT-MAP")
    public void setBITMAP(String bITMAP) {
        this.bITMAP = bITMAP;
    }

    /**
     * The TERM-SERL-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-SERL-NUM")
    public String getTERMSERLNUM() {
        return tERMSERLNUM;
    }

    /**
     * The TERM-SERL-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-SERL-NUM")
    public void setTERMSERLNUM(String tERMSERLNUM) {
        this.tERMSERLNUM = tERMSERLNUM;
    }

    /**
     * The EMV-TERM-CAP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("EMV-TERM-CAP")
    public String getEMVTERMCAP() {
        return eMVTERMCAP;
    }

    /**
     * The EMV-TERM-CAP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("EMV-TERM-CAP")
    public void setEMVTERMCAP(String eMVTERMCAP) {
        this.eMVTERMCAP = eMVTERMCAP;
    }

    /**
     * The USER-FLD1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD1")
    public String getUSERFLD1() {
        return uSERFLD1;
    }

    /**
     * The USER-FLD1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD1")
    public void setUSERFLD1(String uSERFLD1) {
        this.uSERFLD1 = uSERFLD1;
    }

    /**
     * The USER-FLD2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD2")
    public String getUSERFLD2() {
        return uSERFLD2;
    }

    /**
     * The USER-FLD2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD2")
    public void setUSERFLD2(String uSERFLD2) {
        this.uSERFLD2 = uSERFLD2;
    }

    /**
     * The EMV-TERM-TYPE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("EMV-TERM-TYPE")
    public String getEMVTERMTYPE() {
        return eMVTERMTYPE;
    }

    /**
     * The EMV-TERM-TYPE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("EMV-TERM-TYPE")
    public void setEMVTERMTYPE(String eMVTERMTYPE) {
        this.eMVTERMTYPE = eMVTERMTYPE;
    }

    /**
     * The APPL-VER-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("APPL-VER-NUM")
    public String getAPPLVERNUM() {
        return aPPLVERNUM;
    }

    /**
     * The APPL-VER-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("APPL-VER-NUM")
    public void setAPPLVERNUM(String aPPLVERNUM) {
        this.aPPLVERNUM = aPPLVERNUM;
    }

    /**
     * The CVM-RSLTS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CVM-RSLTS")
    public String getCVMRSLTS() {
        return cVMRSLTS;
    }

    /**
     * The CVM-RSLTS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CVM-RSLTS")
    public void setCVMRSLTS(String cVMRSLTS) {
        this.cVMRSLTS = cVMRSLTS;
    }

    /**
     * The DF-NAME-LGTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DF-NAME-LGTH")
    public String getDFNAMELGTH() {
        return dFNAMELGTH;
    }

    /**
     * The DF-NAME-LGTH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DF-NAME-LGTH")
    public void setDFNAMELGTH(String dFNAMELGTH) {
        this.dFNAMELGTH = dFNAMELGTH;
    }

    /**
     * The DF-NAME Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DF-NAME")
    public String getDFNAME() {
        return dFNAME;
    }

    /**
     * The DF-NAME Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DF-NAME")
    public void setDFNAME(String dFNAME) {
        this.dFNAME = dFNAME;
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
        return new HashCodeBuilder().append(tKNLEN).append(bITMAP).append(tERMSERLNUM).append(eMVTERMCAP).append(uSERFLD1).append(uSERFLD2).append(eMVTERMTYPE).append(aPPLVERNUM).append(cVMRSLTS).append(dFNAMELGTH).append(dFNAME).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof B3) == false) {
            return false;
        }
        B3 rhs = ((B3) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(bITMAP, rhs.bITMAP).append(tERMSERLNUM, rhs.tERMSERLNUM).append(eMVTERMCAP, rhs.eMVTERMCAP).append(uSERFLD1, rhs.uSERFLD1).append(uSERFLD2, rhs.uSERFLD2).append(eMVTERMTYPE, rhs.eMVTERMTYPE).append(aPPLVERNUM, rhs.aPPLVERNUM).append(cVMRSLTS, rhs.cVMRSLTS).append(dFNAMELGTH, rhs.dFNAMELGTH).append(dFNAME, rhs.dFNAME).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
