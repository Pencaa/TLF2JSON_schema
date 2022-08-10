
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
 * The 04 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "ERR-FLG",
    "RTE-GRP",
    "CRD-VRFY-FLG",
    "COMPLETE-TRACK2-DATA",
    "UAF-FLG",
    "CITY-EXT"
})
public class _04 {

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
     * The ERR-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ERR-FLG")
    private String eRRFLG = "";
    /**
     * The RTE-GRP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RTE-GRP")
    private String rTEGRP = "";
    /**
     * The CRD-VRFY-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-VRFY-FLG")
    private String cRDVRFYFLG = "";
    /**
     * The COMPLETE-TRACK2-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("COMPLETE-TRACK2-DATA")
    private String cOMPLETETRACK2DATA = "";
    /**
     * The UAF-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UAF-FLG")
    private String uAFFLG = "";
    /**
     * The CITY-EXT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CITY-EXT")
    private String cITYEXT = "";
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
     * The ERR-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ERR-FLG")
    public String getERRFLG() {
        return eRRFLG;
    }

    /**
     * The ERR-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ERR-FLG")
    public void setERRFLG(String eRRFLG) {
        this.eRRFLG = eRRFLG;
    }

    /**
     * The RTE-GRP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RTE-GRP")
    public String getRTEGRP() {
        return rTEGRP;
    }

    /**
     * The RTE-GRP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RTE-GRP")
    public void setRTEGRP(String rTEGRP) {
        this.rTEGRP = rTEGRP;
    }

    /**
     * The CRD-VRFY-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-VRFY-FLG")
    public String getCRDVRFYFLG() {
        return cRDVRFYFLG;
    }

    /**
     * The CRD-VRFY-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-VRFY-FLG")
    public void setCRDVRFYFLG(String cRDVRFYFLG) {
        this.cRDVRFYFLG = cRDVRFYFLG;
    }

    /**
     * The COMPLETE-TRACK2-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("COMPLETE-TRACK2-DATA")
    public String getCOMPLETETRACK2DATA() {
        return cOMPLETETRACK2DATA;
    }

    /**
     * The COMPLETE-TRACK2-DATA Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("COMPLETE-TRACK2-DATA")
    public void setCOMPLETETRACK2DATA(String cOMPLETETRACK2DATA) {
        this.cOMPLETETRACK2DATA = cOMPLETETRACK2DATA;
    }

    /**
     * The UAF-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UAF-FLG")
    public String getUAFFLG() {
        return uAFFLG;
    }

    /**
     * The UAF-FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("UAF-FLG")
    public void setUAFFLG(String uAFFLG) {
        this.uAFFLG = uAFFLG;
    }

    /**
     * The CITY-EXT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CITY-EXT")
    public String getCITYEXT() {
        return cITYEXT;
    }

    /**
     * The CITY-EXT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CITY-EXT")
    public void setCITYEXT(String cITYEXT) {
        this.cITYEXT = cITYEXT;
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
        return new HashCodeBuilder().append(tKNLEN).append(eRRFLG).append(rTEGRP).append(cRDVRFYFLG).append(cOMPLETETRACK2DATA).append(uAFFLG).append(cITYEXT).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _04) == false) {
            return false;
        }
        _04 rhs = ((_04) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(eRRFLG, rhs.eRRFLG).append(rTEGRP, rhs.rTEGRP).append(cRDVRFYFLG, rhs.cRDVRFYFLG).append(cOMPLETETRACK2DATA, rhs.cOMPLETETRACK2DATA).append(uAFFLG, rhs.uAFFLG).append(cITYEXT, rhs.cITYEXT).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
