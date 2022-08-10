
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
 * The 25 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "TRAN-FEE",
    "ORIG-FEE",
    "TERM-SUR-PROFILE",
    "RVSL-CDE",
    "USER-FLD1",
    "FLAT-FEE",
    "PCNT-FEE",
    "MIN-MAX"
})
public class _25 {

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
     * The TRAN-FEE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRAN-FEE")
    private String tRANFEE = "";
    /**
     * The ORIG-FEE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ORIG-FEE")
    private String oRIGFEE = "";
    /**
     * The TERM-SUR-PROFILE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-SUR-PROFILE")
    private String tERMSURPROFILE = "";
    /**
     * The RVSL-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RVSL-CDE")
    private String rVSLCDE = "";
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
     * The FLAT-FEE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FLAT-FEE")
    private String fLATFEE = "";
    /**
     * The PCNT-FEE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PCNT-FEE")
    private String pCNTFEE = "";
    /**
     * The MIN-MAX Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MIN-MAX")
    private String mINMAX = "";
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
     * The TRAN-FEE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRAN-FEE")
    public String getTRANFEE() {
        return tRANFEE;
    }

    /**
     * The TRAN-FEE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRAN-FEE")
    public void setTRANFEE(String tRANFEE) {
        this.tRANFEE = tRANFEE;
    }

    /**
     * The ORIG-FEE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ORIG-FEE")
    public String getORIGFEE() {
        return oRIGFEE;
    }

    /**
     * The ORIG-FEE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ORIG-FEE")
    public void setORIGFEE(String oRIGFEE) {
        this.oRIGFEE = oRIGFEE;
    }

    /**
     * The TERM-SUR-PROFILE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-SUR-PROFILE")
    public String getTERMSURPROFILE() {
        return tERMSURPROFILE;
    }

    /**
     * The TERM-SUR-PROFILE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-SUR-PROFILE")
    public void setTERMSURPROFILE(String tERMSURPROFILE) {
        this.tERMSURPROFILE = tERMSURPROFILE;
    }

    /**
     * The RVSL-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RVSL-CDE")
    public String getRVSLCDE() {
        return rVSLCDE;
    }

    /**
     * The RVSL-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RVSL-CDE")
    public void setRVSLCDE(String rVSLCDE) {
        this.rVSLCDE = rVSLCDE;
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
     * The FLAT-FEE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FLAT-FEE")
    public String getFLATFEE() {
        return fLATFEE;
    }

    /**
     * The FLAT-FEE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FLAT-FEE")
    public void setFLATFEE(String fLATFEE) {
        this.fLATFEE = fLATFEE;
    }

    /**
     * The PCNT-FEE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PCNT-FEE")
    public String getPCNTFEE() {
        return pCNTFEE;
    }

    /**
     * The PCNT-FEE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PCNT-FEE")
    public void setPCNTFEE(String pCNTFEE) {
        this.pCNTFEE = pCNTFEE;
    }

    /**
     * The MIN-MAX Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MIN-MAX")
    public String getMINMAX() {
        return mINMAX;
    }

    /**
     * The MIN-MAX Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MIN-MAX")
    public void setMINMAX(String mINMAX) {
        this.mINMAX = mINMAX;
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
        return new HashCodeBuilder().append(tKNLEN).append(tRANFEE).append(oRIGFEE).append(tERMSURPROFILE).append(rVSLCDE).append(uSERFLD1).append(fLATFEE).append(pCNTFEE).append(mINMAX).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _25) == false) {
            return false;
        }
        _25 rhs = ((_25) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(tRANFEE, rhs.tRANFEE).append(oRIGFEE, rhs.oRIGFEE).append(tERMSURPROFILE, rhs.tERMSURPROFILE).append(rVSLCDE, rhs.rVSLCDE).append(uSERFLD1, rhs.uSERFLD1).append(fLATFEE, rhs.fLATFEE).append(pCNTFEE, rhs.pCNTFEE).append(mINMAX, rhs.mINMAX).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
