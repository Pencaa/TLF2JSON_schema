
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
 * The C4 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "TERM-ATTEND-IND",
    "TERM-OPER-IND",
    "TERM-LOC-IND",
    "CRDHLDR-PRESENT-IND",
    "CRD-PRESENT-IND",
    "CRD-CAPTR-IND",
    "TXN-STAT-IND",
    "TXN-SEC-IND",
    "TXN-RTN-IND",
    "CRDHLDR-ACTVT-TERM-IND",
    "TERM-INPUT-CAP-IND",
    "CRDHLDR-ID-METHOD"
})
public class C4 {

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
     * The TERM-ATTEND-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-ATTEND-IND")
    private String tERMATTENDIND = "";
    /**
     * The TERM-OPER-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-OPER-IND")
    private String tERMOPERIND = "";
    /**
     * The TERM-LOC-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-LOC-IND")
    private String tERMLOCIND = "";
    /**
     * The CRDHLDR-PRESENT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRDHLDR-PRESENT-IND")
    private String cRDHLDRPRESENTIND = "";
    /**
     * The CRD-PRESENT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-PRESENT-IND")
    private String cRDPRESENTIND = "";
    /**
     * The CRD-CAPTR-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-CAPTR-IND")
    private String cRDCAPTRIND = "";
    /**
     * The TXN-STAT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TXN-STAT-IND")
    private String tXNSTATIND = "";
    /**
     * The TXN-SEC-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TXN-SEC-IND")
    private String tXNSECIND = "";
    /**
     * The TXN-RTN-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TXN-RTN-IND")
    private String tXNRTNIND = "";
    /**
     * The CRDHLDR-ACTVT-TERM-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRDHLDR-ACTVT-TERM-IND")
    private String cRDHLDRACTVTTERMIND = "";
    /**
     * The TERM-INPUT-CAP-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-INPUT-CAP-IND")
    private String tERMINPUTCAPIND = "";
    /**
     * The CRDHLDR-ID-METHOD Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRDHLDR-ID-METHOD")
    private String cRDHLDRIDMETHOD = "";
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
     * The TERM-ATTEND-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-ATTEND-IND")
    public String getTERMATTENDIND() {
        return tERMATTENDIND;
    }

    /**
     * The TERM-ATTEND-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-ATTEND-IND")
    public void setTERMATTENDIND(String tERMATTENDIND) {
        this.tERMATTENDIND = tERMATTENDIND;
    }

    /**
     * The TERM-OPER-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-OPER-IND")
    public String getTERMOPERIND() {
        return tERMOPERIND;
    }

    /**
     * The TERM-OPER-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-OPER-IND")
    public void setTERMOPERIND(String tERMOPERIND) {
        this.tERMOPERIND = tERMOPERIND;
    }

    /**
     * The TERM-LOC-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-LOC-IND")
    public String getTERMLOCIND() {
        return tERMLOCIND;
    }

    /**
     * The TERM-LOC-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-LOC-IND")
    public void setTERMLOCIND(String tERMLOCIND) {
        this.tERMLOCIND = tERMLOCIND;
    }

    /**
     * The CRDHLDR-PRESENT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRDHLDR-PRESENT-IND")
    public String getCRDHLDRPRESENTIND() {
        return cRDHLDRPRESENTIND;
    }

    /**
     * The CRDHLDR-PRESENT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRDHLDR-PRESENT-IND")
    public void setCRDHLDRPRESENTIND(String cRDHLDRPRESENTIND) {
        this.cRDHLDRPRESENTIND = cRDHLDRPRESENTIND;
    }

    /**
     * The CRD-PRESENT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-PRESENT-IND")
    public String getCRDPRESENTIND() {
        return cRDPRESENTIND;
    }

    /**
     * The CRD-PRESENT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-PRESENT-IND")
    public void setCRDPRESENTIND(String cRDPRESENTIND) {
        this.cRDPRESENTIND = cRDPRESENTIND;
    }

    /**
     * The CRD-CAPTR-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-CAPTR-IND")
    public String getCRDCAPTRIND() {
        return cRDCAPTRIND;
    }

    /**
     * The CRD-CAPTR-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-CAPTR-IND")
    public void setCRDCAPTRIND(String cRDCAPTRIND) {
        this.cRDCAPTRIND = cRDCAPTRIND;
    }

    /**
     * The TXN-STAT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TXN-STAT-IND")
    public String getTXNSTATIND() {
        return tXNSTATIND;
    }

    /**
     * The TXN-STAT-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TXN-STAT-IND")
    public void setTXNSTATIND(String tXNSTATIND) {
        this.tXNSTATIND = tXNSTATIND;
    }

    /**
     * The TXN-SEC-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TXN-SEC-IND")
    public String getTXNSECIND() {
        return tXNSECIND;
    }

    /**
     * The TXN-SEC-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TXN-SEC-IND")
    public void setTXNSECIND(String tXNSECIND) {
        this.tXNSECIND = tXNSECIND;
    }

    /**
     * The TXN-RTN-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TXN-RTN-IND")
    public String getTXNRTNIND() {
        return tXNRTNIND;
    }

    /**
     * The TXN-RTN-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TXN-RTN-IND")
    public void setTXNRTNIND(String tXNRTNIND) {
        this.tXNRTNIND = tXNRTNIND;
    }

    /**
     * The CRDHLDR-ACTVT-TERM-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRDHLDR-ACTVT-TERM-IND")
    public String getCRDHLDRACTVTTERMIND() {
        return cRDHLDRACTVTTERMIND;
    }

    /**
     * The CRDHLDR-ACTVT-TERM-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRDHLDR-ACTVT-TERM-IND")
    public void setCRDHLDRACTVTTERMIND(String cRDHLDRACTVTTERMIND) {
        this.cRDHLDRACTVTTERMIND = cRDHLDRACTVTTERMIND;
    }

    /**
     * The TERM-INPUT-CAP-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-INPUT-CAP-IND")
    public String getTERMINPUTCAPIND() {
        return tERMINPUTCAPIND;
    }

    /**
     * The TERM-INPUT-CAP-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TERM-INPUT-CAP-IND")
    public void setTERMINPUTCAPIND(String tERMINPUTCAPIND) {
        this.tERMINPUTCAPIND = tERMINPUTCAPIND;
    }

    /**
     * The CRDHLDR-ID-METHOD Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRDHLDR-ID-METHOD")
    public String getCRDHLDRIDMETHOD() {
        return cRDHLDRIDMETHOD;
    }

    /**
     * The CRDHLDR-ID-METHOD Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRDHLDR-ID-METHOD")
    public void setCRDHLDRIDMETHOD(String cRDHLDRIDMETHOD) {
        this.cRDHLDRIDMETHOD = cRDHLDRIDMETHOD;
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
        return new HashCodeBuilder().append(tKNLEN).append(tERMATTENDIND).append(tERMOPERIND).append(tERMLOCIND).append(cRDHLDRPRESENTIND).append(cRDPRESENTIND).append(cRDCAPTRIND).append(tXNSTATIND).append(tXNSECIND).append(tXNRTNIND).append(cRDHLDRACTVTTERMIND).append(tERMINPUTCAPIND).append(cRDHLDRIDMETHOD).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof C4) == false) {
            return false;
        }
        C4 rhs = ((C4) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(tERMATTENDIND, rhs.tERMATTENDIND).append(tERMOPERIND, rhs.tERMOPERIND).append(tERMLOCIND, rhs.tERMLOCIND).append(cRDHLDRPRESENTIND, rhs.cRDHLDRPRESENTIND).append(cRDPRESENTIND, rhs.cRDPRESENTIND).append(cRDCAPTRIND, rhs.cRDCAPTRIND).append(tXNSTATIND, rhs.tXNSTATIND).append(tXNSECIND, rhs.tXNSECIND).append(tXNRTNIND, rhs.tXNRTNIND).append(cRDHLDRACTVTTERMIND, rhs.cRDHLDRACTVTTERMIND).append(tERMINPUTCAPIND, rhs.tERMINPUTCAPIND).append(cRDHLDRIDMETHOD, rhs.cRDHLDRIDMETHOD).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
