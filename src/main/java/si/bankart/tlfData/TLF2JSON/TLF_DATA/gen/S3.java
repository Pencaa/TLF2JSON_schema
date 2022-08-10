
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
 * The S3 Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TKN_LEN",
    "ISS-DESIGNATOR",
    "BIN-CRNCY-CDE",
    "BIN-CRNCY-DESCR",
    "CNV-RATE-NEUTRAL",
    "CNV-RATE-EFFECTIVE",
    "CNV-RATE-SRC",
    "CNV-RATE-DAT",
    "SAVED-CRNCY-CDE",
    "PCNT-MARK-UP",
    "CONVERTED-AMT-1",
    "CONVERTED-AMT-2",
    "SAVED-AMT-1",
    "SAVED-AMT-2",
    "CONVERTED-ACQ-SURCH",
    "CONVERTED-ISS-SURCH",
    "SAVED-ACQ-SURCH",
    "USER-FLD-ACI"
})
public class S3 {

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
     * The ISS-DESIGNATOR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISS-DESIGNATOR")
    private String iSSDESIGNATOR = "";
    /**
     * The BIN-CRNCY-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BIN-CRNCY-CDE")
    private String bINCRNCYCDE = "";
    /**
     * The BIN-CRNCY-DESCR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BIN-CRNCY-DESCR")
    private String bINCRNCYDESCR = "";
    /**
     * The CNV-RATE-NEUTRAL Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CNV-RATE-NEUTRAL")
    private String cNVRATENEUTRAL = "";
    /**
     * The CNV-RATE-EFFECTIVE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CNV-RATE-EFFECTIVE")
    private String cNVRATEEFFECTIVE = "";
    /**
     * The CNV-RATE-SRC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CNV-RATE-SRC")
    private String cNVRATESRC = "";
    /**
     * The CNV-RATE-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CNV-RATE-DAT")
    private String cNVRATEDAT = "";
    /**
     * The SAVED-CRNCY-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SAVED-CRNCY-CDE")
    private String sAVEDCRNCYCDE = "";
    /**
     * The PCNT-MARK-UP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PCNT-MARK-UP")
    private Integer pCNTMARKUP = 0;
    /**
     * The CONVERTED-AMT-1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CONVERTED-AMT-1")
    private Integer cONVERTEDAMT1 = 0;
    /**
     * The CONVERTED-AMT-2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CONVERTED-AMT-2")
    private Integer cONVERTEDAMT2 = 0;
    /**
     * The SAVED-AMT-1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SAVED-AMT-1")
    private Integer sAVEDAMT1 = 0;
    /**
     * The SAVED-AMT-2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SAVED-AMT-2")
    private Integer sAVEDAMT2 = 0;
    /**
     * The CONVERTED-ACQ-SURCH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CONVERTED-ACQ-SURCH")
    private Integer cONVERTEDACQSURCH = 0;
    /**
     * The CONVERTED-ISS-SURCH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CONVERTED-ISS-SURCH")
    private Integer cONVERTEDISSSURCH = 0;
    /**
     * The TKN_LEN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SAVED-ACQ-SURCH")
    private Integer sAVEDACQSURCH = 0;
    /**
     * The TKN_LEN Schema
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
     * The ISS-DESIGNATOR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISS-DESIGNATOR")
    public String getISSDESIGNATOR() {
        return iSSDESIGNATOR;
    }

    /**
     * The ISS-DESIGNATOR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISS-DESIGNATOR")
    public void setISSDESIGNATOR(String iSSDESIGNATOR) {
        this.iSSDESIGNATOR = iSSDESIGNATOR;
    }

    /**
     * The BIN-CRNCY-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BIN-CRNCY-CDE")
    public String getBINCRNCYCDE() {
        return bINCRNCYCDE;
    }

    /**
     * The BIN-CRNCY-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BIN-CRNCY-CDE")
    public void setBINCRNCYCDE(String bINCRNCYCDE) {
        this.bINCRNCYCDE = bINCRNCYCDE;
    }

    /**
     * The BIN-CRNCY-DESCR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BIN-CRNCY-DESCR")
    public String getBINCRNCYDESCR() {
        return bINCRNCYDESCR;
    }

    /**
     * The BIN-CRNCY-DESCR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BIN-CRNCY-DESCR")
    public void setBINCRNCYDESCR(String bINCRNCYDESCR) {
        this.bINCRNCYDESCR = bINCRNCYDESCR;
    }

    /**
     * The CNV-RATE-NEUTRAL Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CNV-RATE-NEUTRAL")
    public String getCNVRATENEUTRAL() {
        return cNVRATENEUTRAL;
    }

    /**
     * The CNV-RATE-NEUTRAL Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CNV-RATE-NEUTRAL")
    public void setCNVRATENEUTRAL(String cNVRATENEUTRAL) {
        this.cNVRATENEUTRAL = cNVRATENEUTRAL;
    }

    /**
     * The CNV-RATE-EFFECTIVE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CNV-RATE-EFFECTIVE")
    public String getCNVRATEEFFECTIVE() {
        return cNVRATEEFFECTIVE;
    }

    /**
     * The CNV-RATE-EFFECTIVE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CNV-RATE-EFFECTIVE")
    public void setCNVRATEEFFECTIVE(String cNVRATEEFFECTIVE) {
        this.cNVRATEEFFECTIVE = cNVRATEEFFECTIVE;
    }

    /**
     * The CNV-RATE-SRC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CNV-RATE-SRC")
    public String getCNVRATESRC() {
        return cNVRATESRC;
    }

    /**
     * The CNV-RATE-SRC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CNV-RATE-SRC")
    public void setCNVRATESRC(String cNVRATESRC) {
        this.cNVRATESRC = cNVRATESRC;
    }

    /**
     * The CNV-RATE-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CNV-RATE-DAT")
    public String getCNVRATEDAT() {
        return cNVRATEDAT;
    }

    /**
     * The CNV-RATE-DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CNV-RATE-DAT")
    public void setCNVRATEDAT(String cNVRATEDAT) {
        this.cNVRATEDAT = cNVRATEDAT;
    }

    /**
     * The SAVED-CRNCY-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SAVED-CRNCY-CDE")
    public String getSAVEDCRNCYCDE() {
        return sAVEDCRNCYCDE;
    }

    /**
     * The SAVED-CRNCY-CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SAVED-CRNCY-CDE")
    public void setSAVEDCRNCYCDE(String sAVEDCRNCYCDE) {
        this.sAVEDCRNCYCDE = sAVEDCRNCYCDE;
    }

    /**
     * The PCNT-MARK-UP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PCNT-MARK-UP")
    public Integer getPCNTMARKUP() {
        return pCNTMARKUP;
    }

    /**
     * The PCNT-MARK-UP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("PCNT-MARK-UP")
    public void setPCNTMARKUP(Integer pCNTMARKUP) {
        this.pCNTMARKUP = pCNTMARKUP;
    }

    /**
     * The CONVERTED-AMT-1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CONVERTED-AMT-1")
    public Integer getCONVERTEDAMT1() {
        return cONVERTEDAMT1;
    }

    /**
     * The CONVERTED-AMT-1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CONVERTED-AMT-1")
    public void setCONVERTEDAMT1(Integer cONVERTEDAMT1) {
        this.cONVERTEDAMT1 = cONVERTEDAMT1;
    }

    /**
     * The CONVERTED-AMT-2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CONVERTED-AMT-2")
    public Integer getCONVERTEDAMT2() {
        return cONVERTEDAMT2;
    }

    /**
     * The CONVERTED-AMT-2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CONVERTED-AMT-2")
    public void setCONVERTEDAMT2(Integer cONVERTEDAMT2) {
        this.cONVERTEDAMT2 = cONVERTEDAMT2;
    }

    /**
     * The SAVED-AMT-1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SAVED-AMT-1")
    public Integer getSAVEDAMT1() {
        return sAVEDAMT1;
    }

    /**
     * The SAVED-AMT-1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SAVED-AMT-1")
    public void setSAVEDAMT1(Integer sAVEDAMT1) {
        this.sAVEDAMT1 = sAVEDAMT1;
    }

    /**
     * The SAVED-AMT-2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SAVED-AMT-2")
    public Integer getSAVEDAMT2() {
        return sAVEDAMT2;
    }

    /**
     * The SAVED-AMT-2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SAVED-AMT-2")
    public void setSAVEDAMT2(Integer sAVEDAMT2) {
        this.sAVEDAMT2 = sAVEDAMT2;
    }

    /**
     * The CONVERTED-ACQ-SURCH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CONVERTED-ACQ-SURCH")
    public Integer getCONVERTEDACQSURCH() {
        return cONVERTEDACQSURCH;
    }

    /**
     * The CONVERTED-ACQ-SURCH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CONVERTED-ACQ-SURCH")
    public void setCONVERTEDACQSURCH(Integer cONVERTEDACQSURCH) {
        this.cONVERTEDACQSURCH = cONVERTEDACQSURCH;
    }

    /**
     * The CONVERTED-ISS-SURCH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CONVERTED-ISS-SURCH")
    public Integer getCONVERTEDISSSURCH() {
        return cONVERTEDISSSURCH;
    }

    /**
     * The CONVERTED-ISS-SURCH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("CONVERTED-ISS-SURCH")
    public void setCONVERTEDISSSURCH(Integer cONVERTEDISSSURCH) {
        this.cONVERTEDISSSURCH = cONVERTEDISSSURCH;
    }

    /**
     * The TKN_LEN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SAVED-ACQ-SURCH")
    public Integer getSAVEDACQSURCH() {
        return sAVEDACQSURCH;
    }

    /**
     * The TKN_LEN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("SAVED-ACQ-SURCH")
    public void setSAVEDACQSURCH(Integer sAVEDACQSURCH) {
        this.sAVEDACQSURCH = sAVEDACQSURCH;
    }

    /**
     * The TKN_LEN Schema
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
     * The TKN_LEN Schema
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
        return new HashCodeBuilder().append(tKNLEN).append(iSSDESIGNATOR).append(bINCRNCYCDE).append(bINCRNCYDESCR).append(cNVRATENEUTRAL).append(cNVRATEEFFECTIVE).append(cNVRATESRC).append(cNVRATEDAT).append(sAVEDCRNCYCDE).append(pCNTMARKUP).append(cONVERTEDAMT1).append(cONVERTEDAMT2).append(sAVEDAMT1).append(sAVEDAMT2).append(cONVERTEDACQSURCH).append(cONVERTEDISSSURCH).append(sAVEDACQSURCH).append(uSERFLDACI).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof S3) == false) {
            return false;
        }
        S3 rhs = ((S3) other);
        return new EqualsBuilder().append(tKNLEN, rhs.tKNLEN).append(iSSDESIGNATOR, rhs.iSSDESIGNATOR).append(bINCRNCYCDE, rhs.bINCRNCYCDE).append(bINCRNCYDESCR, rhs.bINCRNCYDESCR).append(cNVRATENEUTRAL, rhs.cNVRATENEUTRAL).append(cNVRATEEFFECTIVE, rhs.cNVRATEEFFECTIVE).append(cNVRATESRC, rhs.cNVRATESRC).append(cNVRATEDAT, rhs.cNVRATEDAT).append(sAVEDCRNCYCDE, rhs.sAVEDCRNCYCDE).append(pCNTMARKUP, rhs.pCNTMARKUP).append(cONVERTEDAMT1, rhs.cONVERTEDAMT1).append(cONVERTEDAMT2, rhs.cONVERTEDAMT2).append(sAVEDAMT1, rhs.sAVEDAMT1).append(sAVEDAMT2, rhs.sAVEDAMT2).append(cONVERTEDACQSURCH, rhs.cONVERTEDACQSURCH).append(cONVERTEDISSSURCH, rhs.cONVERTEDISSSURCH).append(sAVEDACQSURCH, rhs.sAVEDACQSURCH).append(uSERFLDACI, rhs.uSERFLDACI).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
