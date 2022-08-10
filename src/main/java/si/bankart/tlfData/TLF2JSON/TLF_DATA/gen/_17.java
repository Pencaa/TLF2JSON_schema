
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
 * The S6 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "SRV-IND",
    "TRAN-ID",
    "VALID-CDE",
    "MKT-SPFC-DATA-ID",
    "DUR",
    "PRSTGS-PROP-IND"
})
public class _17 {

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
     * The SRV-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SRV-IND")
    private String sRVIND = "";
    /**
     * The TRAN-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRAN-ID")
    private String tRANID = "";
    /**
     * The VALID-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VALID-CDE")
    private String vALIDCDE = "";
    /**
     * The MKT-SPFC-DATA-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MKT-SPFC-DATA-ID")
    private String mKTSPFCDATAID = "";
    /**
     * The DUR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DUR")
    private String dUR = "";
    /**
     * The PRSTGS-PROP-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PRSTGS-PROP-IND")
    private String pRSTGSPROPIND = "";
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
     * The SRV-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SRV-IND")
    public String getSRVIND() {
        return sRVIND;
    }

    /**
     * The SRV-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SRV-IND")
    public void setSRVIND(String sRVIND) {
        this.sRVIND = sRVIND;
    }

    /**
     * The TRAN-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRAN-ID")
    public String getTRANID() {
        return tRANID;
    }

    /**
     * The TRAN-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRAN-ID")
    public void setTRANID(String tRANID) {
        this.tRANID = tRANID;
    }

    /**
     * The VALID-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VALID-CDE")
    public String getVALIDCDE() {
        return vALIDCDE;
    }

    /**
     * The VALID-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("VALID-CDE")
    public void setVALIDCDE(String vALIDCDE) {
        this.vALIDCDE = vALIDCDE;
    }

    /**
     * The MKT-SPFC-DATA-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MKT-SPFC-DATA-ID")
    public String getMKTSPFCDATAID() {
        return mKTSPFCDATAID;
    }

    /**
     * The MKT-SPFC-DATA-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("MKT-SPFC-DATA-ID")
    public void setMKTSPFCDATAID(String mKTSPFCDATAID) {
        this.mKTSPFCDATAID = mKTSPFCDATAID;
    }

    /**
     * The DUR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DUR")
    public String getDUR() {
        return dUR;
    }

    /**
     * The DUR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("DUR")
    public void setDUR(String dUR) {
        this.dUR = dUR;
    }

    /**
     * The PRSTGS-PROP-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PRSTGS-PROP-IND")
    public String getPRSTGSPROPIND() {
        return pRSTGSPROPIND;
    }

    /**
     * The PRSTGS-PROP-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PRSTGS-PROP-IND")
    public void setPRSTGSPROPIND(String pRSTGSPROPIND) {
        this.pRSTGSPROPIND = pRSTGSPROPIND;
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
        return new HashCodeBuilder().append(tKNLEN).append(sRVIND).append(tRANID).append(vALIDCDE).append(mKTSPFCDATAID).append(dUR).append(pRSTGSPROPIND).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _17) == false) {
            return false;
        }
        _17 rhs = ((_17) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(sRVIND, rhs.sRVIND).append(tRANID, rhs.tRANID).append(vALIDCDE, rhs.vALIDCDE).append(mKTSPFCDATAID, rhs.mKTSPFCDATAID).append(dUR, rhs.dUR).append(pRSTGSPROPIND, rhs.pRSTGSPROPIND).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
