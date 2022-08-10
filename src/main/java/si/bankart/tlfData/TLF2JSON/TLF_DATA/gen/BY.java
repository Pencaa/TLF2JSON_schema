
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
 * The BY Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "STAN",
    "RETRVL-REF-NUM",
    "NETWK-ID",
    "RESP-CDE",
    "ISA-IND",
    "ISA-AMT",
    "FEE-PGM-IND",
    "ON-OFF-PREM-IND",
    "CROSS-BORDER-TXN-IND",
    "CROSS-BORDER-CRNCY-IND",
    "CRNCY-CONV-ASSESS-AMT",
    "CRD-LVL-PROD-ID-VAL",
    "USER-FLD-ACI"
})
public class BY {

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
     * The STAN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("STAN")
    private String sTAN = "";
    /**
     * The RETRVL-REF-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RETRVL-REF-NUM")
    private String rETRVLREFNUM = "";
    /**
     * The NETWK-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NETWK-ID")
    private String nETWKID = "";
    /**
     * The RESP-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RESP-CDE")
    private String rESPCDE = "";
    /**
     * The ISA-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISA-IND")
    private String iSAIND = "";
    /**
     * The ISA-AMT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISA-AMT")
    private String iSAAMT = "";
    /**
     * The FEE-PGM-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FEE-PGM-IND")
    private String fEEPGMIND = "";
    /**
     * The ON-OFF-PREM-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ON-OFF-PREM-IND")
    private String oNOFFPREMIND = "";
    /**
     * The CROSS-BORDER-TXN-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CROSS-BORDER-TXN-IND")
    private String cROSSBORDERTXNIND = "";
    /**
     * The CROSS-BORDER-CRNCY-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CROSS-BORDER-CRNCY-IND")
    private String cROSSBORDERCRNCYIND = "";
    /**
     * The CRNCY-CONV-ASSESS-AMT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRNCY-CONV-ASSESS-AMT")
    private String cRNCYCONVASSESSAMT = "";
    /**
     * The CRD-LVL-PROD-ID-VAL Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-LVL-PROD-ID-VAL")
    private String cRDLVLPRODIDVAL = "";
    /**
     * The USER-FLD-ACI Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD-ACI")
    private String uSERFLDACI = "";
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
     * The STAN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("STAN")
    public String getSTAN() {
        return sTAN;
    }

    /**
     * The STAN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("STAN")
    public void setSTAN(String sTAN) {
        this.sTAN = sTAN;
    }

    /**
     * The RETRVL-REF-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RETRVL-REF-NUM")
    public String getRETRVLREFNUM() {
        return rETRVLREFNUM;
    }

    /**
     * The RETRVL-REF-NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RETRVL-REF-NUM")
    public void setRETRVLREFNUM(String rETRVLREFNUM) {
        this.rETRVLREFNUM = rETRVLREFNUM;
    }

    /**
     * The NETWK-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NETWK-ID")
    public String getNETWKID() {
        return nETWKID;
    }

    /**
     * The NETWK-ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NETWK-ID")
    public void setNETWKID(String nETWKID) {
        this.nETWKID = nETWKID;
    }

    /**
     * The RESP-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RESP-CDE")
    public String getRESPCDE() {
        return rESPCDE;
    }

    /**
     * The RESP-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("RESP-CDE")
    public void setRESPCDE(String rESPCDE) {
        this.rESPCDE = rESPCDE;
    }

    /**
     * The ISA-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISA-IND")
    public String getISAIND() {
        return iSAIND;
    }

    /**
     * The ISA-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISA-IND")
    public void setISAIND(String iSAIND) {
        this.iSAIND = iSAIND;
    }

    /**
     * The ISA-AMT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISA-AMT")
    public String getISAAMT() {
        return iSAAMT;
    }

    /**
     * The ISA-AMT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISA-AMT")
    public void setISAAMT(String iSAAMT) {
        this.iSAAMT = iSAAMT;
    }

    /**
     * The FEE-PGM-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FEE-PGM-IND")
    public String getFEEPGMIND() {
        return fEEPGMIND;
    }

    /**
     * The FEE-PGM-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("FEE-PGM-IND")
    public void setFEEPGMIND(String fEEPGMIND) {
        this.fEEPGMIND = fEEPGMIND;
    }

    /**
     * The ON-OFF-PREM-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ON-OFF-PREM-IND")
    public String getONOFFPREMIND() {
        return oNOFFPREMIND;
    }

    /**
     * The ON-OFF-PREM-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ON-OFF-PREM-IND")
    public void setONOFFPREMIND(String oNOFFPREMIND) {
        this.oNOFFPREMIND = oNOFFPREMIND;
    }

    /**
     * The CROSS-BORDER-TXN-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CROSS-BORDER-TXN-IND")
    public String getCROSSBORDERTXNIND() {
        return cROSSBORDERTXNIND;
    }

    /**
     * The CROSS-BORDER-TXN-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CROSS-BORDER-TXN-IND")
    public void setCROSSBORDERTXNIND(String cROSSBORDERTXNIND) {
        this.cROSSBORDERTXNIND = cROSSBORDERTXNIND;
    }

    /**
     * The CROSS-BORDER-CRNCY-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CROSS-BORDER-CRNCY-IND")
    public String getCROSSBORDERCRNCYIND() {
        return cROSSBORDERCRNCYIND;
    }

    /**
     * The CROSS-BORDER-CRNCY-IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CROSS-BORDER-CRNCY-IND")
    public void setCROSSBORDERCRNCYIND(String cROSSBORDERCRNCYIND) {
        this.cROSSBORDERCRNCYIND = cROSSBORDERCRNCYIND;
    }

    /**
     * The CRNCY-CONV-ASSESS-AMT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRNCY-CONV-ASSESS-AMT")
    public String getCRNCYCONVASSESSAMT() {
        return cRNCYCONVASSESSAMT;
    }

    /**
     * The CRNCY-CONV-ASSESS-AMT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRNCY-CONV-ASSESS-AMT")
    public void setCRNCYCONVASSESSAMT(String cRNCYCONVASSESSAMT) {
        this.cRNCYCONVASSESSAMT = cRNCYCONVASSESSAMT;
    }

    /**
     * The CRD-LVL-PROD-ID-VAL Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-LVL-PROD-ID-VAL")
    public String getCRDLVLPRODIDVAL() {
        return cRDLVLPRODIDVAL;
    }

    /**
     * The CRD-LVL-PROD-ID-VAL Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CRD-LVL-PROD-ID-VAL")
    public void setCRDLVLPRODIDVAL(String cRDLVLPRODIDVAL) {
        this.cRDLVLPRODIDVAL = cRDLVLPRODIDVAL;
    }

    /**
     * The USER-FLD-ACI Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD-ACI")
    public String getUSERFLDACI() {
        return uSERFLDACI;
    }

    /**
     * The USER-FLD-ACI Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("USER-FLD-ACI")
    public void setUSERFLDACI(String uSERFLDACI) {
        this.uSERFLDACI = uSERFLDACI;
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
        return new HashCodeBuilder().append(tKNLEN).append(sTAN).append(rETRVLREFNUM).append(nETWKID).append(rESPCDE).append(iSAIND).append(iSAAMT).append(fEEPGMIND).append(oNOFFPREMIND).append(cROSSBORDERTXNIND).append(cROSSBORDERCRNCYIND).append(cRNCYCONVASSESSAMT).append(cRDLVLPRODIDVAL).append(uSERFLDACI).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BY) == false) {
            return false;
        }
        BY rhs = ((BY) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(sTAN, rhs.sTAN).append(rETRVLREFNUM, rhs.rETRVLREFNUM).append(nETWKID, rhs.nETWKID).append(rESPCDE, rhs.rESPCDE).append(iSAIND, rhs.iSAIND).append(iSAAMT, rhs.iSAAMT).append(fEEPGMIND, rhs.fEEPGMIND).append(oNOFFPREMIND, rhs.oNOFFPREMIND).append(cROSSBORDERTXNIND, rhs.cROSSBORDERTXNIND).append(cROSSBORDERCRNCYIND, rhs.cROSSBORDERCRNCYIND).append(cRNCYCONVASSESSAMT, rhs.cRNCYCONVASSESSAMT).append(cRDLVLPRODIDVAL, rhs.cRDLVLPRODIDVAL).append(uSERFLDACI, rhs.uSERFLDACI).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
