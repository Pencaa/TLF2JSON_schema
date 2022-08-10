
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
 * Root Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "HEAD_DAT_TIM",
    "HEAD_REC_TYP",
    "HEAD_AUTH_PPD",
    "HEAD_TERM_LN",
    "HEAD_TERM_FIID",
    "HEAD_TERM_TERM_ID",
    "HEAD_CRD_LN",
    "HEAD_CRD_FIID",
    "HEAD_CRD_PAN_NUM",
    "HEAD_CRD_MBR_NUM",
    "HEAD_BRCH_ID",
    "HEAD_REGN_ID",
    "AUTH_TYP_CDE",
    "AUTH_TYP",
    "AUTH_RTE_STAT",
    "AUTH_ORIGINATOR",
    "AUTH_RESPONDER",
    "AUTH_ENTRY_TIM",
    "AUTH_EXIT_TIM",
    "AUTH_RE_ENTRY_TIM",
    "AUTH_TRAN_DAT_YY",
    "AUTH_TRAN_DAT_MM",
    "AUTH_TRAN_DAT_DD",
    "AUTH_TRAN_TIM_HH",
    "AUTH_TRAN_TIM_MM",
    "AUTH_TRAN_TIM_SS",
    "AUTH_TRAN_TIM_TT",
    "AUTH_POST_DAT_YY",
    "AUTH_POST_DAT_MM",
    "AUTH_POST_DAT_DD",
    "AUTH_ACQ_ICHG_SETL_DAT_YY",
    "AUTH_ACQ_ICHG_SETL_DAT_MM",
    "AUTH_ACQ_ICHG_SETL_DAT_DD",
    "AUTH_ISS_ICHG_SETL_DAT_YY",
    "AUTH_ISS_ICHG_SETL_DAT_MM",
    "AUTH_ISS_ICHG_SETL_DAT_DD",
    "AUTH_SEQ_NUM",
    "AUTH_TERM_TYP",
    "AUTH_TIM_OFST",
    "AUTH_ACQ_INST_ID_NUM",
    "AUTH_RCV_INST_ID_NUM",
    "AUTH_TRAN_CDE_R_T_CDE",
    "AUTH_TRAN_CDE_R_T_FROM",
    "AUTH_TRAN_CDE_R_T_TO",
    "AUTH_FROM_ACCT_ACCT_NUM",
    "AUTH_USER_FLD1",
    "AUTH_TO_ACCT_ACCT_NUM",
    "AUTH_MULT_ACCT",
    "AUTH_AMT_1",
    "AUTH_AMT_2",
    "AUTH_AMT_3",
    "AUTH_DEP_BAL_CR",
    "AUTH_DEP_TYP",
    "AUTH_RESP_CDE_R_RESP_BYTE_1",
    "AUTH_RESP_CDE_R_RESP_BYTE_2",
    "AUTH_TERM_NAME_LOC",
    "AUTH_TERM_OWNER_NAME",
    "AUTH_TERM_CITY",
    "AUTH_TERM_ST_X",
    "AUTH_TERM_CNTRY_X",
    "AUTH_ORIG_OSEQ_NUM",
    "AUTH_ORIG_OTRAN_DAT",
    "AUTH_ORIG_OTRAN_TIM",
    "AUTH_ORIG_B24_POST_DAT",
    "AUTH_ORIG_CRNCY_CDE",
    "AUTH_MULT_CRNCY_AUTH_CRNCY_CDE",
    "AUTH_MULT_CRNCY_AUTH_CONV_RATE",
    "AUTH_MULT_CRNCY_SETL_CRNCY_CDE",
    "AUTH_MULT_CRNCY_SETL_CONV_RATE",
    "AUTH_MULT_CRNCY_CONV_DAT_TIM",
    "AUTH_RVSL_RSN",
    "AUTH_PIN_OFST",
    "AUTH_SHRG_GRP",
    "AUTH_DEST_ORDER",
    "AUTH_AUTH_ID_RESP",
    "AUTH_REFR_IMP_IND",
    "AUTH_REFR_AVAIL_IMP_FROM_ACCOUNT",
    "AUTH_REFR_AVAIL_IMP_TO_ACCOUNT",
    "AUTH_REFR_LEDG_IMP_FROM_ACCOUNT",
    "AUTH_REFR_LEDG_IMP_TO_ACCOUNT",
    "AUTH_REFR_HLD_AMT_IMP_FROM_ACCOUNT",
    "AUTH_REFR_HLD_AMT_IMP_TO_ACCOUNT",
    "AUTH_REFR_CAF_REFR_IND",
    "AUTH_REFR_USER_FLD3",
    "AUTH_DEP_SETL_IMP_FLG",
    "AUTH_ADJ_SETL_IMP_FLG",
    "AUTH_REFR_IND_PBF1",
    "AUTH_REFR_IND_PBF2",
    "AUTH_REFR_IND_PBF3",
    "AUTH_REFR_IND_PBF4",
    "AUTH_USER_FLD4",
    "AUTH_FRWD_INST_ID_NUM",
    "AUTH_CRD_ACCEPT_ID_NUM",
    "AUTH_CRD_ISS_ID_NUM",
    "NUMBER_OF_TOKENS",
    "tokens"
})
public class TLF_DATA {

    /**
     * The HEAD_DAT_TIM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_DAT_TIM")
    private String hEADDATTIM = "";
    /**
     * The HEAD_REC_TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_REC_TYP")
    private String hEADRECTYP = "";
    /**
     * The HEAD_AUTH_PPD Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_AUTH_PPD")
    private String hEADAUTHPPD = "";
    /**
     * The HEAD_TERM_LN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_TERM_LN")
    private String hEADTERMLN = "";
    /**
     * The HEAD_TERM_FIID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_TERM_FIID")
    private String hEADTERMFIID = "";
    /**
     * The HEAD_TERM_TERM_ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_TERM_TERM_ID")
    private String hEADTERMTERMID = "";
    /**
     * The HEAD_CRD_LN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_CRD_LN")
    private String hEADCRDLN = "";
    /**
     * The HEAD_CRD_FIID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_CRD_FIID")
    private String hEADCRDFIID = "";
    /**
     * The HEAD_CRD_PAN_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_CRD_PAN_NUM")
    private String hEADCRDPANNUM = "";
    /**
     * The HEAD_CRD_MBR_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_CRD_MBR_NUM")
    private String hEADCRDMBRNUM = "";
    /**
     * The HEAD_BRCH_ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_BRCH_ID")
    private String hEADBRCHID = "";
    /**
     * The HEAD_REGN_ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_REGN_ID")
    private String hEADREGNID = "";
    /**
     * The AUTH_TYP_CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TYP_CDE")
    private String aUTHTYPCDE = "";
    /**
     * The AUTH_TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TYP")
    private String aUTHTYP = "";
    /**
     * The AUTH_RTE_STAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_RTE_STAT")
    private String aUTHRTESTAT = "";
    /**
     * The AUTH_ORIGINATOR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ORIGINATOR")
    private String aUTHORIGINATOR = "";
    /**
     * The AUTH_RESPONDER Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_RESPONDER")
    private String aUTHRESPONDER = "";
    /**
     * The AUTH_ENTRY_TIM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ENTRY_TIM")
    private String aUTHENTRYTIM = "";
    /**
     * The AUTH_EXIT_TIM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_EXIT_TIM")
    private String aUTHEXITTIM = "";
    /**
     * The AUTH_RE_ENTRY_TIM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_RE_ENTRY_TIM")
    private String aUTHREENTRYTIM = "";
    /**
     * The AUTH_TRAN_DAT_YY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_DAT_YY")
    private String aUTHTRANDATYY = "";
    /**
     * The AUTH_TRAN_DAT_MM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_DAT_MM")
    private String aUTHTRANDATMM = "";
    /**
     * The AUTH_TRAN_DAT_DD Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_DAT_DD")
    private String aUTHTRANDATDD = "";
    /**
     * The AUTH_TRAN_TIM_HH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_TIM_HH")
    private String aUTHTRANTIMHH = "";
    /**
     * The AUTH_TRAN_TIM_MM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_TIM_MM")
    private String aUTHTRANTIMMM = "";
    /**
     * The AUTH_TRAN_TIM_SS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_TIM_SS")
    private String aUTHTRANTIMSS = "";
    /**
     * The AUTH_TRAN_TIM_TT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_TIM_TT")
    private String aUTHTRANTIMTT = "";
    /**
     * The AUTH_POST_DAT_YY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_POST_DAT_YY")
    private String aUTHPOSTDATYY = "";
    /**
     * The AUTH_POST_DAT_MM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_POST_DAT_MM")
    private String aUTHPOSTDATMM = "";
    /**
     * The AUTH_POST_DAT_DD Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_POST_DAT_DD")
    private String aUTHPOSTDATDD = "";
    /**
     * The AUTH_ACQ_ICHG_SETL_DAT_YY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ACQ_ICHG_SETL_DAT_YY")
    private String aUTHACQICHGSETLDATYY = "";
    /**
     * The AUTH_ACQ_ICHG_SETL_DAT_MM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ACQ_ICHG_SETL_DAT_MM")
    private String aUTHACQICHGSETLDATMM = "";
    /**
     * The AUTH_ACQ_ICHG_SETL_DAT_DD Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ACQ_ICHG_SETL_DAT_DD")
    private String aUTHACQICHGSETLDATDD = "";
    /**
     * The AUTH_ISS_ICHG_SETL_DAT_YY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ISS_ICHG_SETL_DAT_YY")
    private String aUTHISSICHGSETLDATYY = "";
    /**
     * The AUTH_ISS_ICHG_SETL_DAT_MM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ISS_ICHG_SETL_DAT_MM")
    private String aUTHISSICHGSETLDATMM = "";
    /**
     * The AUTH_ISS_ICHG_SETL_DAT_DD Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ISS_ICHG_SETL_DAT_DD")
    private String aUTHISSICHGSETLDATDD = "";
    /**
     * The AUTH_SEQ_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_SEQ_NUM")
    private String aUTHSEQNUM = "";
    /**
     * The AUTH_TERM_TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TERM_TYP")
    private String aUTHTERMTYP = "";
    /**
     * The AUTH_TIM_OFST Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TIM_OFST")
    private Integer aUTHTIMOFST = 0;
    /**
     * The AUTH_ACQ_INST_ID_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ACQ_INST_ID_NUM")
    private String aUTHACQINSTIDNUM = "";
    /**
     * The AUTH_RCV_INST_ID_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_RCV_INST_ID_NUM")
    private String aUTHRCVINSTIDNUM = "";
    /**
     * The AUTH_TRAN_CDE_R_T_CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_CDE_R_T_CDE")
    private String aUTHTRANCDERTCDE = "";
    /**
     * The AUTH_TRAN_CDE_R_T_FROM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_CDE_R_T_FROM")
    private String aUTHTRANCDERTFROM = "";
    /**
     * The AUTH_TRAN_CDE_R_T_TO Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_CDE_R_T_TO")
    private String aUTHTRANCDERTTO = "";
    /**
     * The AUTH_FROM_ACCT_ACCT_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_FROM_ACCT_ACCT_NUM")
    private String aUTHFROMACCTACCTNUM = "";
    /**
     * The AUTH_USER_FLD1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_USER_FLD1")
    private String aUTHUSERFLD1 = "";
    /**
     * The AUTH_TO_ACCT_ACCT_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TO_ACCT_ACCT_NUM")
    private String aUTHTOACCTACCTNUM = "";
    /**
     * The AUTH_MULT_ACCT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_MULT_ACCT")
    private String aUTHMULTACCT = "";
    /**
     * The AUTH_AMT_1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_AMT_1")
    private String aUTHAMT1 = "";
    /**
     * The AUTH_AMT_2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_AMT_2")
    private String aUTHAMT2 = "";
    /**
     * The AUTH_AMT_3 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_AMT_3")
    private String aUTHAMT3 = "";
    /**
     * The AUTH_DEP_BAL_CR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_DEP_BAL_CR")
    private Integer aUTHDEPBALCR = 0;
    /**
     * The AUTH_DEP_TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_DEP_TYP")
    private String aUTHDEPTYP = "";
    /**
     * The AUTH_RESP_CDE_R_RESP_BYTE_1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_RESP_CDE_R_RESP_BYTE_1")
    private String aUTHRESPCDERRESPBYTE1 = "";
    /**
     * The AUTH_RESP_CDE_R_RESP_BYTE_2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_RESP_CDE_R_RESP_BYTE_2")
    private String aUTHRESPCDERRESPBYTE2 = "";
    /**
     * The AUTH_TERM_NAME_LOC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TERM_NAME_LOC")
    private String aUTHTERMNAMELOC = "";
    /**
     * The AUTH_TERM_OWNER_NAME Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TERM_OWNER_NAME")
    private String aUTHTERMOWNERNAME = "";
    /**
     * The AUTH_TERM_CITY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TERM_CITY")
    private String aUTHTERMCITY = "";
    /**
     * The AUTH_TERM_ST_X Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TERM_ST_X")
    private String aUTHTERMSTX = "";
    /**
     * The AUTH_TERM_CNTRY_X Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TERM_CNTRY_X")
    private String aUTHTERMCNTRYX = "";
    /**
     * The AUTH_ORIG_OSEQ_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ORIG_OSEQ_NUM")
    private String aUTHORIGOSEQNUM = "";
    /**
     * The AUTH_ORIG_OTRAN_DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ORIG_OTRAN_DAT")
    private String aUTHORIGOTRANDAT = "";
    /**
     * The AUTH_ORIG_OTRAN_TIM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ORIG_OTRAN_TIM")
    private String aUTHORIGOTRANTIM = "";
    /**
     * The AUTH_ORIG_B24_POST_DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ORIG_B24_POST_DAT")
    private String aUTHORIGB24POSTDAT = "";
    /**
     * The AUTH_ORIG_CRNCY_CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ORIG_CRNCY_CDE")
    private String aUTHORIGCRNCYCDE = "";
    /**
     * The AUTH_MULT_CRNCY_AUTH_CRNCY_CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_MULT_CRNCY_AUTH_CRNCY_CDE")
    private String aUTHMULTCRNCYAUTHCRNCYCDE = "";
    /**
     * The AUTH_MULT_CRNCY_AUTH_CONV_RATE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_MULT_CRNCY_AUTH_CONV_RATE")
    private String aUTHMULTCRNCYAUTHCONVRATE = "";
    /**
     * The AUTH_MULT_CRNCY_SETL_CRNCY_CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_MULT_CRNCY_SETL_CRNCY_CDE")
    private String aUTHMULTCRNCYSETLCRNCYCDE = "";
    /**
     * The AUTH_MULT_CRNCY_SETL_CONV_RATE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_MULT_CRNCY_SETL_CONV_RATE")
    private String aUTHMULTCRNCYSETLCONVRATE = "";
    /**
     * The AUTH_MULT_CRNCY_CONV_DAT_TIM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_MULT_CRNCY_CONV_DAT_TIM")
    private String aUTHMULTCRNCYCONVDATTIM = "";
    /**
     * The AUTH_RVSL_RSN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_RVSL_RSN")
    private String aUTHRVSLRSN = "";
    /**
     * The AUTH_PIN_OFST Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_PIN_OFST")
    private String aUTHPINOFST = "";
    /**
     * The AUTH_SHRG_GRP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_SHRG_GRP")
    private String aUTHSHRGGRP = "";
    /**
     * The AUTH_DEST_ORDER Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_DEST_ORDER")
    private String aUTHDESTORDER = "";
    /**
     * The AUTH_AUTH_ID_RESP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_AUTH_ID_RESP")
    private String aUTHAUTHIDRESP = "";
    /**
     * The AUTH_REFR_IMP_IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_IMP_IND")
    private String aUTHREFRIMPIND = "";
    /**
     * The AUTH_REFR_AVAIL_IMP_FROM_ACCOUNT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_AVAIL_IMP_FROM_ACCOUNT")
    private String aUTHREFRAVAILIMPFROMACCOUNT = "";
    /**
     * The AUTH_REFR_AVAIL_IMP_TO_ACCOUNT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_AVAIL_IMP_TO_ACCOUNT")
    private String aUTHREFRAVAILIMPTOACCOUNT = "";
    /**
     * The AUTH_REFR_LEDG_IMP_FROM_ACCOUNT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_LEDG_IMP_FROM_ACCOUNT")
    private String aUTHREFRLEDGIMPFROMACCOUNT = "";
    /**
     * The AUTH_REFR_LEDG_IMP_TO_ACCOUNT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_LEDG_IMP_TO_ACCOUNT")
    private String aUTHREFRLEDGIMPTOACCOUNT = "";
    /**
     * The AUTH_REFR_HLD_AMT_IMP_FROM_ACCOUNT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_HLD_AMT_IMP_FROM_ACCOUNT")
    private String aUTHREFRHLDAMTIMPFROMACCOUNT = "";
    /**
     * The AUTH_REFR_HLD_AMT_IMP_TO_ACCOUNT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_HLD_AMT_IMP_TO_ACCOUNT")
    private String aUTHREFRHLDAMTIMPTOACCOUNT = "";
    /**
     * The AUTH_REFR_CAF_REFR_IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_CAF_REFR_IND")
    private String aUTHREFRCAFREFRIND = "";
    /**
     * The AUTH_REFR_USER_FLD3 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_USER_FLD3")
    private String aUTHREFRUSERFLD3 = "";
    /**
     * The AUTH_DEP_SETL_IMP_FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_DEP_SETL_IMP_FLG")
    private String aUTHDEPSETLIMPFLG = "";
    /**
     * The AUTH_ADJ_SETL_IMP_FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ADJ_SETL_IMP_FLG")
    private String aUTHADJSETLIMPFLG = "";
    /**
     * The AUTH_REFR_IND_PBF1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_IND_PBF1")
    private String aUTHREFRINDPBF1 = "";
    /**
     * The AUTH_REFR_IND_PBF2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_IND_PBF2")
    private String aUTHREFRINDPBF2 = "";
    /**
     * The AUTH_REFR_IND_PBF3 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_IND_PBF3")
    private String aUTHREFRINDPBF3 = "";
    /**
     * The AUTH_REFR_IND_PBF4 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_IND_PBF4")
    private String aUTHREFRINDPBF4 = "";
    /**
     * The AUTH_USER_FLD4 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_USER_FLD4")
    private String aUTHUSERFLD4 = "";
    /**
     * The AUTH_FRWD_INST_ID_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_FRWD_INST_ID_NUM")
    private String aUTHFRWDINSTIDNUM = "";
    /**
     * The AUTH_CRD_ACCEPT_ID_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_CRD_ACCEPT_ID_NUM")
    private String aUTHCRDACCEPTIDNUM = "";
    /**
     * The AUTH_CRD_ISS_ID_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_CRD_ISS_ID_NUM")
    private String aUTHCRDISSIDNUM = "";
    /**
     * The NUMBER_OF_TOKENS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NUMBER_OF_TOKENS")
    private Integer nUMBEROFTOKENS = 0;
    /**
     * The tokens Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("tokens")
    private Tokens tokens;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The HEAD_DAT_TIM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_DAT_TIM")
    public String getHEADDATTIM() {
        return hEADDATTIM;
    }

    /**
     * The HEAD_DAT_TIM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_DAT_TIM")
    public void setHEADDATTIM(String hEADDATTIM) {
        this.hEADDATTIM = hEADDATTIM;
    }

    /**
     * The HEAD_REC_TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_REC_TYP")
    public String getHEADRECTYP() {
        return hEADRECTYP;
    }

    /**
     * The HEAD_REC_TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_REC_TYP")
    public void setHEADRECTYP(String hEADRECTYP) {
        this.hEADRECTYP = hEADRECTYP;
    }

    /**
     * The HEAD_AUTH_PPD Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_AUTH_PPD")
    public String getHEADAUTHPPD() {
        return hEADAUTHPPD;
    }

    /**
     * The HEAD_AUTH_PPD Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_AUTH_PPD")
    public void setHEADAUTHPPD(String hEADAUTHPPD) {
        this.hEADAUTHPPD = hEADAUTHPPD;
    }

    /**
     * The HEAD_TERM_LN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_TERM_LN")
    public String getHEADTERMLN() {
        return hEADTERMLN;
    }

    /**
     * The HEAD_TERM_LN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_TERM_LN")
    public void setHEADTERMLN(String hEADTERMLN) {
        this.hEADTERMLN = hEADTERMLN;
    }

    /**
     * The HEAD_TERM_FIID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_TERM_FIID")
    public String getHEADTERMFIID() {
        return hEADTERMFIID;
    }

    /**
     * The HEAD_TERM_FIID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_TERM_FIID")
    public void setHEADTERMFIID(String hEADTERMFIID) {
        this.hEADTERMFIID = hEADTERMFIID;
    }

    /**
     * The HEAD_TERM_TERM_ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_TERM_TERM_ID")
    public String getHEADTERMTERMID() {
        return hEADTERMTERMID;
    }

    /**
     * The HEAD_TERM_TERM_ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_TERM_TERM_ID")
    public void setHEADTERMTERMID(String hEADTERMTERMID) {
        this.hEADTERMTERMID = hEADTERMTERMID;
    }

    /**
     * The HEAD_CRD_LN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_CRD_LN")
    public String getHEADCRDLN() {
        return hEADCRDLN;
    }

    /**
     * The HEAD_CRD_LN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_CRD_LN")
    public void setHEADCRDLN(String hEADCRDLN) {
        this.hEADCRDLN = hEADCRDLN;
    }

    /**
     * The HEAD_CRD_FIID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_CRD_FIID")
    public String getHEADCRDFIID() {
        return hEADCRDFIID;
    }

    /**
     * The HEAD_CRD_FIID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_CRD_FIID")
    public void setHEADCRDFIID(String hEADCRDFIID) {
        this.hEADCRDFIID = hEADCRDFIID;
    }

    /**
     * The HEAD_CRD_PAN_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_CRD_PAN_NUM")
    public String getHEADCRDPANNUM() {
        return hEADCRDPANNUM;
    }

    /**
     * The HEAD_CRD_PAN_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_CRD_PAN_NUM")
    public void setHEADCRDPANNUM(String hEADCRDPANNUM) {
        this.hEADCRDPANNUM = hEADCRDPANNUM;
    }

    /**
     * The HEAD_CRD_MBR_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_CRD_MBR_NUM")
    public String getHEADCRDMBRNUM() {
        return hEADCRDMBRNUM;
    }

    /**
     * The HEAD_CRD_MBR_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_CRD_MBR_NUM")
    public void setHEADCRDMBRNUM(String hEADCRDMBRNUM) {
        this.hEADCRDMBRNUM = hEADCRDMBRNUM;
    }

    /**
     * The HEAD_BRCH_ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_BRCH_ID")
    public String getHEADBRCHID() {
        return hEADBRCHID;
    }

    /**
     * The HEAD_BRCH_ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_BRCH_ID")
    public void setHEADBRCHID(String hEADBRCHID) {
        this.hEADBRCHID = hEADBRCHID;
    }

    /**
     * The HEAD_REGN_ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_REGN_ID")
    public String getHEADREGNID() {
        return hEADREGNID;
    }

    /**
     * The HEAD_REGN_ID Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("HEAD_REGN_ID")
    public void setHEADREGNID(String hEADREGNID) {
        this.hEADREGNID = hEADREGNID;
    }

    /**
     * The AUTH_TYP_CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TYP_CDE")
    public String getAUTHTYPCDE() {
        return aUTHTYPCDE;
    }

    /**
     * The AUTH_TYP_CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TYP_CDE")
    public void setAUTHTYPCDE(String aUTHTYPCDE) {
        this.aUTHTYPCDE = aUTHTYPCDE;
    }

    /**
     * The AUTH_TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TYP")
    public String getAUTHTYP() {
        return aUTHTYP;
    }

    /**
     * The AUTH_TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TYP")
    public void setAUTHTYP(String aUTHTYP) {
        this.aUTHTYP = aUTHTYP;
    }

    /**
     * The AUTH_RTE_STAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_RTE_STAT")
    public String getAUTHRTESTAT() {
        return aUTHRTESTAT;
    }

    /**
     * The AUTH_RTE_STAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_RTE_STAT")
    public void setAUTHRTESTAT(String aUTHRTESTAT) {
        this.aUTHRTESTAT = aUTHRTESTAT;
    }

    /**
     * The AUTH_ORIGINATOR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ORIGINATOR")
    public String getAUTHORIGINATOR() {
        return aUTHORIGINATOR;
    }

    /**
     * The AUTH_ORIGINATOR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ORIGINATOR")
    public void setAUTHORIGINATOR(String aUTHORIGINATOR) {
        this.aUTHORIGINATOR = aUTHORIGINATOR;
    }

    /**
     * The AUTH_RESPONDER Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_RESPONDER")
    public String getAUTHRESPONDER() {
        return aUTHRESPONDER;
    }

    /**
     * The AUTH_RESPONDER Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_RESPONDER")
    public void setAUTHRESPONDER(String aUTHRESPONDER) {
        this.aUTHRESPONDER = aUTHRESPONDER;
    }

    /**
     * The AUTH_ENTRY_TIM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ENTRY_TIM")
    public String getAUTHENTRYTIM() {
        return aUTHENTRYTIM;
    }

    /**
     * The AUTH_ENTRY_TIM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ENTRY_TIM")
    public void setAUTHENTRYTIM(String aUTHENTRYTIM) {
        this.aUTHENTRYTIM = aUTHENTRYTIM;
    }

    /**
     * The AUTH_EXIT_TIM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_EXIT_TIM")
    public String getAUTHEXITTIM() {
        return aUTHEXITTIM;
    }

    /**
     * The AUTH_EXIT_TIM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_EXIT_TIM")
    public void setAUTHEXITTIM(String aUTHEXITTIM) {
        this.aUTHEXITTIM = aUTHEXITTIM;
    }

    /**
     * The AUTH_RE_ENTRY_TIM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_RE_ENTRY_TIM")
    public String getAUTHREENTRYTIM() {
        return aUTHREENTRYTIM;
    }

    /**
     * The AUTH_RE_ENTRY_TIM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_RE_ENTRY_TIM")
    public void setAUTHREENTRYTIM(String aUTHREENTRYTIM) {
        this.aUTHREENTRYTIM = aUTHREENTRYTIM;
    }

    /**
     * The AUTH_TRAN_DAT_YY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_DAT_YY")
    public String getAUTHTRANDATYY() {
        return aUTHTRANDATYY;
    }

    /**
     * The AUTH_TRAN_DAT_YY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_DAT_YY")
    public void setAUTHTRANDATYY(String aUTHTRANDATYY) {
        this.aUTHTRANDATYY = aUTHTRANDATYY;
    }

    /**
     * The AUTH_TRAN_DAT_MM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_DAT_MM")
    public String getAUTHTRANDATMM() {
        return aUTHTRANDATMM;
    }

    /**
     * The AUTH_TRAN_DAT_MM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_DAT_MM")
    public void setAUTHTRANDATMM(String aUTHTRANDATMM) {
        this.aUTHTRANDATMM = aUTHTRANDATMM;
    }

    /**
     * The AUTH_TRAN_DAT_DD Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_DAT_DD")
    public String getAUTHTRANDATDD() {
        return aUTHTRANDATDD;
    }

    /**
     * The AUTH_TRAN_DAT_DD Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_DAT_DD")
    public void setAUTHTRANDATDD(String aUTHTRANDATDD) {
        this.aUTHTRANDATDD = aUTHTRANDATDD;
    }

    /**
     * The AUTH_TRAN_TIM_HH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_TIM_HH")
    public String getAUTHTRANTIMHH() {
        return aUTHTRANTIMHH;
    }

    /**
     * The AUTH_TRAN_TIM_HH Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_TIM_HH")
    public void setAUTHTRANTIMHH(String aUTHTRANTIMHH) {
        this.aUTHTRANTIMHH = aUTHTRANTIMHH;
    }

    /**
     * The AUTH_TRAN_TIM_MM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_TIM_MM")
    public String getAUTHTRANTIMMM() {
        return aUTHTRANTIMMM;
    }

    /**
     * The AUTH_TRAN_TIM_MM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_TIM_MM")
    public void setAUTHTRANTIMMM(String aUTHTRANTIMMM) {
        this.aUTHTRANTIMMM = aUTHTRANTIMMM;
    }

    /**
     * The AUTH_TRAN_TIM_SS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_TIM_SS")
    public String getAUTHTRANTIMSS() {
        return aUTHTRANTIMSS;
    }

    /**
     * The AUTH_TRAN_TIM_SS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_TIM_SS")
    public void setAUTHTRANTIMSS(String aUTHTRANTIMSS) {
        this.aUTHTRANTIMSS = aUTHTRANTIMSS;
    }

    /**
     * The AUTH_TRAN_TIM_TT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_TIM_TT")
    public String getAUTHTRANTIMTT() {
        return aUTHTRANTIMTT;
    }

    /**
     * The AUTH_TRAN_TIM_TT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_TIM_TT")
    public void setAUTHTRANTIMTT(String aUTHTRANTIMTT) {
        this.aUTHTRANTIMTT = aUTHTRANTIMTT;
    }

    /**
     * The AUTH_POST_DAT_YY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_POST_DAT_YY")
    public String getAUTHPOSTDATYY() {
        return aUTHPOSTDATYY;
    }

    /**
     * The AUTH_POST_DAT_YY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_POST_DAT_YY")
    public void setAUTHPOSTDATYY(String aUTHPOSTDATYY) {
        this.aUTHPOSTDATYY = aUTHPOSTDATYY;
    }

    /**
     * The AUTH_POST_DAT_MM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_POST_DAT_MM")
    public String getAUTHPOSTDATMM() {
        return aUTHPOSTDATMM;
    }

    /**
     * The AUTH_POST_DAT_MM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_POST_DAT_MM")
    public void setAUTHPOSTDATMM(String aUTHPOSTDATMM) {
        this.aUTHPOSTDATMM = aUTHPOSTDATMM;
    }

    /**
     * The AUTH_POST_DAT_DD Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_POST_DAT_DD")
    public String getAUTHPOSTDATDD() {
        return aUTHPOSTDATDD;
    }

    /**
     * The AUTH_POST_DAT_DD Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_POST_DAT_DD")
    public void setAUTHPOSTDATDD(String aUTHPOSTDATDD) {
        this.aUTHPOSTDATDD = aUTHPOSTDATDD;
    }

    /**
     * The AUTH_ACQ_ICHG_SETL_DAT_YY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ACQ_ICHG_SETL_DAT_YY")
    public String getAUTHACQICHGSETLDATYY() {
        return aUTHACQICHGSETLDATYY;
    }

    /**
     * The AUTH_ACQ_ICHG_SETL_DAT_YY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ACQ_ICHG_SETL_DAT_YY")
    public void setAUTHACQICHGSETLDATYY(String aUTHACQICHGSETLDATYY) {
        this.aUTHACQICHGSETLDATYY = aUTHACQICHGSETLDATYY;
    }

    /**
     * The AUTH_ACQ_ICHG_SETL_DAT_MM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ACQ_ICHG_SETL_DAT_MM")
    public String getAUTHACQICHGSETLDATMM() {
        return aUTHACQICHGSETLDATMM;
    }

    /**
     * The AUTH_ACQ_ICHG_SETL_DAT_MM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ACQ_ICHG_SETL_DAT_MM")
    public void setAUTHACQICHGSETLDATMM(String aUTHACQICHGSETLDATMM) {
        this.aUTHACQICHGSETLDATMM = aUTHACQICHGSETLDATMM;
    }

    /**
     * The AUTH_ACQ_ICHG_SETL_DAT_DD Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ACQ_ICHG_SETL_DAT_DD")
    public String getAUTHACQICHGSETLDATDD() {
        return aUTHACQICHGSETLDATDD;
    }

    /**
     * The AUTH_ACQ_ICHG_SETL_DAT_DD Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ACQ_ICHG_SETL_DAT_DD")
    public void setAUTHACQICHGSETLDATDD(String aUTHACQICHGSETLDATDD) {
        this.aUTHACQICHGSETLDATDD = aUTHACQICHGSETLDATDD;
    }

    /**
     * The AUTH_ISS_ICHG_SETL_DAT_YY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ISS_ICHG_SETL_DAT_YY")
    public String getAUTHISSICHGSETLDATYY() {
        return aUTHISSICHGSETLDATYY;
    }

    /**
     * The AUTH_ISS_ICHG_SETL_DAT_YY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ISS_ICHG_SETL_DAT_YY")
    public void setAUTHISSICHGSETLDATYY(String aUTHISSICHGSETLDATYY) {
        this.aUTHISSICHGSETLDATYY = aUTHISSICHGSETLDATYY;
    }

    /**
     * The AUTH_ISS_ICHG_SETL_DAT_MM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ISS_ICHG_SETL_DAT_MM")
    public String getAUTHISSICHGSETLDATMM() {
        return aUTHISSICHGSETLDATMM;
    }

    /**
     * The AUTH_ISS_ICHG_SETL_DAT_MM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ISS_ICHG_SETL_DAT_MM")
    public void setAUTHISSICHGSETLDATMM(String aUTHISSICHGSETLDATMM) {
        this.aUTHISSICHGSETLDATMM = aUTHISSICHGSETLDATMM;
    }

    /**
     * The AUTH_ISS_ICHG_SETL_DAT_DD Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ISS_ICHG_SETL_DAT_DD")
    public String getAUTHISSICHGSETLDATDD() {
        return aUTHISSICHGSETLDATDD;
    }

    /**
     * The AUTH_ISS_ICHG_SETL_DAT_DD Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ISS_ICHG_SETL_DAT_DD")
    public void setAUTHISSICHGSETLDATDD(String aUTHISSICHGSETLDATDD) {
        this.aUTHISSICHGSETLDATDD = aUTHISSICHGSETLDATDD;
    }

    /**
     * The AUTH_SEQ_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_SEQ_NUM")
    public String getAUTHSEQNUM() {
        return aUTHSEQNUM;
    }

    /**
     * The AUTH_SEQ_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_SEQ_NUM")
    public void setAUTHSEQNUM(String aUTHSEQNUM) {
        this.aUTHSEQNUM = aUTHSEQNUM;
    }

    /**
     * The AUTH_TERM_TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TERM_TYP")
    public String getAUTHTERMTYP() {
        return aUTHTERMTYP;
    }

    /**
     * The AUTH_TERM_TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TERM_TYP")
    public void setAUTHTERMTYP(String aUTHTERMTYP) {
        this.aUTHTERMTYP = aUTHTERMTYP;
    }

    /**
     * The AUTH_TIM_OFST Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TIM_OFST")
    public Integer getAUTHTIMOFST() {
        return aUTHTIMOFST;
    }

    /**
     * The AUTH_TIM_OFST Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TIM_OFST")
    public void setAUTHTIMOFST(Integer aUTHTIMOFST) {
        this.aUTHTIMOFST = aUTHTIMOFST;
    }

    /**
     * The AUTH_ACQ_INST_ID_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ACQ_INST_ID_NUM")
    public String getAUTHACQINSTIDNUM() {
        return aUTHACQINSTIDNUM;
    }

    /**
     * The AUTH_ACQ_INST_ID_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ACQ_INST_ID_NUM")
    public void setAUTHACQINSTIDNUM(String aUTHACQINSTIDNUM) {
        this.aUTHACQINSTIDNUM = aUTHACQINSTIDNUM;
    }

    /**
     * The AUTH_RCV_INST_ID_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_RCV_INST_ID_NUM")
    public String getAUTHRCVINSTIDNUM() {
        return aUTHRCVINSTIDNUM;
    }

    /**
     * The AUTH_RCV_INST_ID_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_RCV_INST_ID_NUM")
    public void setAUTHRCVINSTIDNUM(String aUTHRCVINSTIDNUM) {
        this.aUTHRCVINSTIDNUM = aUTHRCVINSTIDNUM;
    }

    /**
     * The AUTH_TRAN_CDE_R_T_CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_CDE_R_T_CDE")
    public String getAUTHTRANCDERTCDE() {
        return aUTHTRANCDERTCDE;
    }

    /**
     * The AUTH_TRAN_CDE_R_T_CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_CDE_R_T_CDE")
    public void setAUTHTRANCDERTCDE(String aUTHTRANCDERTCDE) {
        this.aUTHTRANCDERTCDE = aUTHTRANCDERTCDE;
    }

    /**
     * The AUTH_TRAN_CDE_R_T_FROM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_CDE_R_T_FROM")
    public String getAUTHTRANCDERTFROM() {
        return aUTHTRANCDERTFROM;
    }

    /**
     * The AUTH_TRAN_CDE_R_T_FROM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_CDE_R_T_FROM")
    public void setAUTHTRANCDERTFROM(String aUTHTRANCDERTFROM) {
        this.aUTHTRANCDERTFROM = aUTHTRANCDERTFROM;
    }

    /**
     * The AUTH_TRAN_CDE_R_T_TO Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_CDE_R_T_TO")
    public String getAUTHTRANCDERTTO() {
        return aUTHTRANCDERTTO;
    }

    /**
     * The AUTH_TRAN_CDE_R_T_TO Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TRAN_CDE_R_T_TO")
    public void setAUTHTRANCDERTTO(String aUTHTRANCDERTTO) {
        this.aUTHTRANCDERTTO = aUTHTRANCDERTTO;
    }

    /**
     * The AUTH_FROM_ACCT_ACCT_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_FROM_ACCT_ACCT_NUM")
    public String getAUTHFROMACCTACCTNUM() {
        return aUTHFROMACCTACCTNUM;
    }

    /**
     * The AUTH_FROM_ACCT_ACCT_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_FROM_ACCT_ACCT_NUM")
    public void setAUTHFROMACCTACCTNUM(String aUTHFROMACCTACCTNUM) {
        this.aUTHFROMACCTACCTNUM = aUTHFROMACCTACCTNUM;
    }

    /**
     * The AUTH_USER_FLD1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_USER_FLD1")
    public String getAUTHUSERFLD1() {
        return aUTHUSERFLD1;
    }

    /**
     * The AUTH_USER_FLD1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_USER_FLD1")
    public void setAUTHUSERFLD1(String aUTHUSERFLD1) {
        this.aUTHUSERFLD1 = aUTHUSERFLD1;
    }

    /**
     * The AUTH_TO_ACCT_ACCT_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TO_ACCT_ACCT_NUM")
    public String getAUTHTOACCTACCTNUM() {
        return aUTHTOACCTACCTNUM;
    }

    /**
     * The AUTH_TO_ACCT_ACCT_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TO_ACCT_ACCT_NUM")
    public void setAUTHTOACCTACCTNUM(String aUTHTOACCTACCTNUM) {
        this.aUTHTOACCTACCTNUM = aUTHTOACCTACCTNUM;
    }

    /**
     * The AUTH_MULT_ACCT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_MULT_ACCT")
    public String getAUTHMULTACCT() {
        return aUTHMULTACCT;
    }

    /**
     * The AUTH_MULT_ACCT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_MULT_ACCT")
    public void setAUTHMULTACCT(String aUTHMULTACCT) {
        this.aUTHMULTACCT = aUTHMULTACCT;
    }

    /**
     * The AUTH_AMT_1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_AMT_1")
    public String getAUTHAMT1() {
        return aUTHAMT1;
    }

    /**
     * The AUTH_AMT_1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_AMT_1")
    public void setAUTHAMT1(String aUTHAMT1) {
        this.aUTHAMT1 = aUTHAMT1;
    }

    /**
     * The AUTH_AMT_2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_AMT_2")
    public String getAUTHAMT2() {
        return aUTHAMT2;
    }

    /**
     * The AUTH_AMT_2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_AMT_2")
    public void setAUTHAMT2(String aUTHAMT2) {
        this.aUTHAMT2 = aUTHAMT2;
    }

    /**
     * The AUTH_AMT_3 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_AMT_3")
    public String getAUTHAMT3() {
        return aUTHAMT3;
    }

    /**
     * The AUTH_AMT_3 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_AMT_3")
    public void setAUTHAMT3(String aUTHAMT3) {
        this.aUTHAMT3 = aUTHAMT3;
    }

    /**
     * The AUTH_DEP_BAL_CR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_DEP_BAL_CR")
    public Integer getAUTHDEPBALCR() {
        return aUTHDEPBALCR;
    }

    /**
     * The AUTH_DEP_BAL_CR Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_DEP_BAL_CR")
    public void setAUTHDEPBALCR(Integer aUTHDEPBALCR) {
        this.aUTHDEPBALCR = aUTHDEPBALCR;
    }

    /**
     * The AUTH_DEP_TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_DEP_TYP")
    public String getAUTHDEPTYP() {
        return aUTHDEPTYP;
    }

    /**
     * The AUTH_DEP_TYP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_DEP_TYP")
    public void setAUTHDEPTYP(String aUTHDEPTYP) {
        this.aUTHDEPTYP = aUTHDEPTYP;
    }

    /**
     * The AUTH_RESP_CDE_R_RESP_BYTE_1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_RESP_CDE_R_RESP_BYTE_1")
    public String getAUTHRESPCDERRESPBYTE1() {
        return aUTHRESPCDERRESPBYTE1;
    }

    /**
     * The AUTH_RESP_CDE_R_RESP_BYTE_1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_RESP_CDE_R_RESP_BYTE_1")
    public void setAUTHRESPCDERRESPBYTE1(String aUTHRESPCDERRESPBYTE1) {
        this.aUTHRESPCDERRESPBYTE1 = aUTHRESPCDERRESPBYTE1;
    }

    /**
     * The AUTH_RESP_CDE_R_RESP_BYTE_2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_RESP_CDE_R_RESP_BYTE_2")
    public String getAUTHRESPCDERRESPBYTE2() {
        return aUTHRESPCDERRESPBYTE2;
    }

    /**
     * The AUTH_RESP_CDE_R_RESP_BYTE_2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_RESP_CDE_R_RESP_BYTE_2")
    public void setAUTHRESPCDERRESPBYTE2(String aUTHRESPCDERRESPBYTE2) {
        this.aUTHRESPCDERRESPBYTE2 = aUTHRESPCDERRESPBYTE2;
    }

    /**
     * The AUTH_TERM_NAME_LOC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TERM_NAME_LOC")
    public String getAUTHTERMNAMELOC() {
        return aUTHTERMNAMELOC;
    }

    /**
     * The AUTH_TERM_NAME_LOC Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TERM_NAME_LOC")
    public void setAUTHTERMNAMELOC(String aUTHTERMNAMELOC) {
        this.aUTHTERMNAMELOC = aUTHTERMNAMELOC;
    }

    /**
     * The AUTH_TERM_OWNER_NAME Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TERM_OWNER_NAME")
    public String getAUTHTERMOWNERNAME() {
        return aUTHTERMOWNERNAME;
    }

    /**
     * The AUTH_TERM_OWNER_NAME Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TERM_OWNER_NAME")
    public void setAUTHTERMOWNERNAME(String aUTHTERMOWNERNAME) {
        this.aUTHTERMOWNERNAME = aUTHTERMOWNERNAME;
    }

    /**
     * The AUTH_TERM_CITY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TERM_CITY")
    public String getAUTHTERMCITY() {
        return aUTHTERMCITY;
    }

    /**
     * The AUTH_TERM_CITY Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TERM_CITY")
    public void setAUTHTERMCITY(String aUTHTERMCITY) {
        this.aUTHTERMCITY = aUTHTERMCITY;
    }

    /**
     * The AUTH_TERM_ST_X Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TERM_ST_X")
    public String getAUTHTERMSTX() {
        return aUTHTERMSTX;
    }

    /**
     * The AUTH_TERM_ST_X Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TERM_ST_X")
    public void setAUTHTERMSTX(String aUTHTERMSTX) {
        this.aUTHTERMSTX = aUTHTERMSTX;
    }

    /**
     * The AUTH_TERM_CNTRY_X Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TERM_CNTRY_X")
    public String getAUTHTERMCNTRYX() {
        return aUTHTERMCNTRYX;
    }

    /**
     * The AUTH_TERM_CNTRY_X Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_TERM_CNTRY_X")
    public void setAUTHTERMCNTRYX(String aUTHTERMCNTRYX) {
        this.aUTHTERMCNTRYX = aUTHTERMCNTRYX;
    }

    /**
     * The AUTH_ORIG_OSEQ_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ORIG_OSEQ_NUM")
    public String getAUTHORIGOSEQNUM() {
        return aUTHORIGOSEQNUM;
    }

    /**
     * The AUTH_ORIG_OSEQ_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ORIG_OSEQ_NUM")
    public void setAUTHORIGOSEQNUM(String aUTHORIGOSEQNUM) {
        this.aUTHORIGOSEQNUM = aUTHORIGOSEQNUM;
    }

    /**
     * The AUTH_ORIG_OTRAN_DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ORIG_OTRAN_DAT")
    public String getAUTHORIGOTRANDAT() {
        return aUTHORIGOTRANDAT;
    }

    /**
     * The AUTH_ORIG_OTRAN_DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ORIG_OTRAN_DAT")
    public void setAUTHORIGOTRANDAT(String aUTHORIGOTRANDAT) {
        this.aUTHORIGOTRANDAT = aUTHORIGOTRANDAT;
    }

    /**
     * The AUTH_ORIG_OTRAN_TIM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ORIG_OTRAN_TIM")
    public String getAUTHORIGOTRANTIM() {
        return aUTHORIGOTRANTIM;
    }

    /**
     * The AUTH_ORIG_OTRAN_TIM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ORIG_OTRAN_TIM")
    public void setAUTHORIGOTRANTIM(String aUTHORIGOTRANTIM) {
        this.aUTHORIGOTRANTIM = aUTHORIGOTRANTIM;
    }

    /**
     * The AUTH_ORIG_B24_POST_DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ORIG_B24_POST_DAT")
    public String getAUTHORIGB24POSTDAT() {
        return aUTHORIGB24POSTDAT;
    }

    /**
     * The AUTH_ORIG_B24_POST_DAT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ORIG_B24_POST_DAT")
    public void setAUTHORIGB24POSTDAT(String aUTHORIGB24POSTDAT) {
        this.aUTHORIGB24POSTDAT = aUTHORIGB24POSTDAT;
    }

    /**
     * The AUTH_ORIG_CRNCY_CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ORIG_CRNCY_CDE")
    public String getAUTHORIGCRNCYCDE() {
        return aUTHORIGCRNCYCDE;
    }

    /**
     * The AUTH_ORIG_CRNCY_CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ORIG_CRNCY_CDE")
    public void setAUTHORIGCRNCYCDE(String aUTHORIGCRNCYCDE) {
        this.aUTHORIGCRNCYCDE = aUTHORIGCRNCYCDE;
    }

    /**
     * The AUTH_MULT_CRNCY_AUTH_CRNCY_CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_MULT_CRNCY_AUTH_CRNCY_CDE")
    public String getAUTHMULTCRNCYAUTHCRNCYCDE() {
        return aUTHMULTCRNCYAUTHCRNCYCDE;
    }

    /**
     * The AUTH_MULT_CRNCY_AUTH_CRNCY_CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_MULT_CRNCY_AUTH_CRNCY_CDE")
    public void setAUTHMULTCRNCYAUTHCRNCYCDE(String aUTHMULTCRNCYAUTHCRNCYCDE) {
        this.aUTHMULTCRNCYAUTHCRNCYCDE = aUTHMULTCRNCYAUTHCRNCYCDE;
    }

    /**
     * The AUTH_MULT_CRNCY_AUTH_CONV_RATE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_MULT_CRNCY_AUTH_CONV_RATE")
    public String getAUTHMULTCRNCYAUTHCONVRATE() {
        return aUTHMULTCRNCYAUTHCONVRATE;
    }

    /**
     * The AUTH_MULT_CRNCY_AUTH_CONV_RATE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_MULT_CRNCY_AUTH_CONV_RATE")
    public void setAUTHMULTCRNCYAUTHCONVRATE(String aUTHMULTCRNCYAUTHCONVRATE) {
        this.aUTHMULTCRNCYAUTHCONVRATE = aUTHMULTCRNCYAUTHCONVRATE;
    }

    /**
     * The AUTH_MULT_CRNCY_SETL_CRNCY_CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_MULT_CRNCY_SETL_CRNCY_CDE")
    public String getAUTHMULTCRNCYSETLCRNCYCDE() {
        return aUTHMULTCRNCYSETLCRNCYCDE;
    }

    /**
     * The AUTH_MULT_CRNCY_SETL_CRNCY_CDE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_MULT_CRNCY_SETL_CRNCY_CDE")
    public void setAUTHMULTCRNCYSETLCRNCYCDE(String aUTHMULTCRNCYSETLCRNCYCDE) {
        this.aUTHMULTCRNCYSETLCRNCYCDE = aUTHMULTCRNCYSETLCRNCYCDE;
    }

    /**
     * The AUTH_MULT_CRNCY_SETL_CONV_RATE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_MULT_CRNCY_SETL_CONV_RATE")
    public String getAUTHMULTCRNCYSETLCONVRATE() {
        return aUTHMULTCRNCYSETLCONVRATE;
    }

    /**
     * The AUTH_MULT_CRNCY_SETL_CONV_RATE Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_MULT_CRNCY_SETL_CONV_RATE")
    public void setAUTHMULTCRNCYSETLCONVRATE(String aUTHMULTCRNCYSETLCONVRATE) {
        this.aUTHMULTCRNCYSETLCONVRATE = aUTHMULTCRNCYSETLCONVRATE;
    }

    /**
     * The AUTH_MULT_CRNCY_CONV_DAT_TIM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_MULT_CRNCY_CONV_DAT_TIM")
    public String getAUTHMULTCRNCYCONVDATTIM() {
        return aUTHMULTCRNCYCONVDATTIM;
    }

    /**
     * The AUTH_MULT_CRNCY_CONV_DAT_TIM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_MULT_CRNCY_CONV_DAT_TIM")
    public void setAUTHMULTCRNCYCONVDATTIM(String aUTHMULTCRNCYCONVDATTIM) {
        this.aUTHMULTCRNCYCONVDATTIM = aUTHMULTCRNCYCONVDATTIM;
    }

    /**
     * The AUTH_RVSL_RSN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_RVSL_RSN")
    public String getAUTHRVSLRSN() {
        return aUTHRVSLRSN;
    }

    /**
     * The AUTH_RVSL_RSN Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_RVSL_RSN")
    public void setAUTHRVSLRSN(String aUTHRVSLRSN) {
        this.aUTHRVSLRSN = aUTHRVSLRSN;
    }

    /**
     * The AUTH_PIN_OFST Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_PIN_OFST")
    public String getAUTHPINOFST() {
        return aUTHPINOFST;
    }

    /**
     * The AUTH_PIN_OFST Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_PIN_OFST")
    public void setAUTHPINOFST(String aUTHPINOFST) {
        this.aUTHPINOFST = aUTHPINOFST;
    }

    /**
     * The AUTH_SHRG_GRP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_SHRG_GRP")
    public String getAUTHSHRGGRP() {
        return aUTHSHRGGRP;
    }

    /**
     * The AUTH_SHRG_GRP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_SHRG_GRP")
    public void setAUTHSHRGGRP(String aUTHSHRGGRP) {
        this.aUTHSHRGGRP = aUTHSHRGGRP;
    }

    /**
     * The AUTH_DEST_ORDER Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_DEST_ORDER")
    public String getAUTHDESTORDER() {
        return aUTHDESTORDER;
    }

    /**
     * The AUTH_DEST_ORDER Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_DEST_ORDER")
    public void setAUTHDESTORDER(String aUTHDESTORDER) {
        this.aUTHDESTORDER = aUTHDESTORDER;
    }

    /**
     * The AUTH_AUTH_ID_RESP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_AUTH_ID_RESP")
    public String getAUTHAUTHIDRESP() {
        return aUTHAUTHIDRESP;
    }

    /**
     * The AUTH_AUTH_ID_RESP Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_AUTH_ID_RESP")
    public void setAUTHAUTHIDRESP(String aUTHAUTHIDRESP) {
        this.aUTHAUTHIDRESP = aUTHAUTHIDRESP;
    }

    /**
     * The AUTH_REFR_IMP_IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_IMP_IND")
    public String getAUTHREFRIMPIND() {
        return aUTHREFRIMPIND;
    }

    /**
     * The AUTH_REFR_IMP_IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_IMP_IND")
    public void setAUTHREFRIMPIND(String aUTHREFRIMPIND) {
        this.aUTHREFRIMPIND = aUTHREFRIMPIND;
    }

    /**
     * The AUTH_REFR_AVAIL_IMP_FROM_ACCOUNT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_AVAIL_IMP_FROM_ACCOUNT")
    public String getAUTHREFRAVAILIMPFROMACCOUNT() {
        return aUTHREFRAVAILIMPFROMACCOUNT;
    }

    /**
     * The AUTH_REFR_AVAIL_IMP_FROM_ACCOUNT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_AVAIL_IMP_FROM_ACCOUNT")
    public void setAUTHREFRAVAILIMPFROMACCOUNT(String aUTHREFRAVAILIMPFROMACCOUNT) {
        this.aUTHREFRAVAILIMPFROMACCOUNT = aUTHREFRAVAILIMPFROMACCOUNT;
    }

    /**
     * The AUTH_REFR_AVAIL_IMP_TO_ACCOUNT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_AVAIL_IMP_TO_ACCOUNT")
    public String getAUTHREFRAVAILIMPTOACCOUNT() {
        return aUTHREFRAVAILIMPTOACCOUNT;
    }

    /**
     * The AUTH_REFR_AVAIL_IMP_TO_ACCOUNT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_AVAIL_IMP_TO_ACCOUNT")
    public void setAUTHREFRAVAILIMPTOACCOUNT(String aUTHREFRAVAILIMPTOACCOUNT) {
        this.aUTHREFRAVAILIMPTOACCOUNT = aUTHREFRAVAILIMPTOACCOUNT;
    }

    /**
     * The AUTH_REFR_LEDG_IMP_FROM_ACCOUNT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_LEDG_IMP_FROM_ACCOUNT")
    public String getAUTHREFRLEDGIMPFROMACCOUNT() {
        return aUTHREFRLEDGIMPFROMACCOUNT;
    }

    /**
     * The AUTH_REFR_LEDG_IMP_FROM_ACCOUNT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_LEDG_IMP_FROM_ACCOUNT")
    public void setAUTHREFRLEDGIMPFROMACCOUNT(String aUTHREFRLEDGIMPFROMACCOUNT) {
        this.aUTHREFRLEDGIMPFROMACCOUNT = aUTHREFRLEDGIMPFROMACCOUNT;
    }

    /**
     * The AUTH_REFR_LEDG_IMP_TO_ACCOUNT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_LEDG_IMP_TO_ACCOUNT")
    public String getAUTHREFRLEDGIMPTOACCOUNT() {
        return aUTHREFRLEDGIMPTOACCOUNT;
    }

    /**
     * The AUTH_REFR_LEDG_IMP_TO_ACCOUNT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_LEDG_IMP_TO_ACCOUNT")
    public void setAUTHREFRLEDGIMPTOACCOUNT(String aUTHREFRLEDGIMPTOACCOUNT) {
        this.aUTHREFRLEDGIMPTOACCOUNT = aUTHREFRLEDGIMPTOACCOUNT;
    }

    /**
     * The AUTH_REFR_HLD_AMT_IMP_FROM_ACCOUNT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_HLD_AMT_IMP_FROM_ACCOUNT")
    public String getAUTHREFRHLDAMTIMPFROMACCOUNT() {
        return aUTHREFRHLDAMTIMPFROMACCOUNT;
    }

    /**
     * The AUTH_REFR_HLD_AMT_IMP_FROM_ACCOUNT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_HLD_AMT_IMP_FROM_ACCOUNT")
    public void setAUTHREFRHLDAMTIMPFROMACCOUNT(String aUTHREFRHLDAMTIMPFROMACCOUNT) {
        this.aUTHREFRHLDAMTIMPFROMACCOUNT = aUTHREFRHLDAMTIMPFROMACCOUNT;
    }

    /**
     * The AUTH_REFR_HLD_AMT_IMP_TO_ACCOUNT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_HLD_AMT_IMP_TO_ACCOUNT")
    public String getAUTHREFRHLDAMTIMPTOACCOUNT() {
        return aUTHREFRHLDAMTIMPTOACCOUNT;
    }

    /**
     * The AUTH_REFR_HLD_AMT_IMP_TO_ACCOUNT Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_HLD_AMT_IMP_TO_ACCOUNT")
    public void setAUTHREFRHLDAMTIMPTOACCOUNT(String aUTHREFRHLDAMTIMPTOACCOUNT) {
        this.aUTHREFRHLDAMTIMPTOACCOUNT = aUTHREFRHLDAMTIMPTOACCOUNT;
    }

    /**
     * The AUTH_REFR_CAF_REFR_IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_CAF_REFR_IND")
    public String getAUTHREFRCAFREFRIND() {
        return aUTHREFRCAFREFRIND;
    }

    /**
     * The AUTH_REFR_CAF_REFR_IND Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_CAF_REFR_IND")
    public void setAUTHREFRCAFREFRIND(String aUTHREFRCAFREFRIND) {
        this.aUTHREFRCAFREFRIND = aUTHREFRCAFREFRIND;
    }

    /**
     * The AUTH_REFR_USER_FLD3 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_USER_FLD3")
    public String getAUTHREFRUSERFLD3() {
        return aUTHREFRUSERFLD3;
    }

    /**
     * The AUTH_REFR_USER_FLD3 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_USER_FLD3")
    public void setAUTHREFRUSERFLD3(String aUTHREFRUSERFLD3) {
        this.aUTHREFRUSERFLD3 = aUTHREFRUSERFLD3;
    }

    /**
     * The AUTH_DEP_SETL_IMP_FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_DEP_SETL_IMP_FLG")
    public String getAUTHDEPSETLIMPFLG() {
        return aUTHDEPSETLIMPFLG;
    }

    /**
     * The AUTH_DEP_SETL_IMP_FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_DEP_SETL_IMP_FLG")
    public void setAUTHDEPSETLIMPFLG(String aUTHDEPSETLIMPFLG) {
        this.aUTHDEPSETLIMPFLG = aUTHDEPSETLIMPFLG;
    }

    /**
     * The AUTH_ADJ_SETL_IMP_FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ADJ_SETL_IMP_FLG")
    public String getAUTHADJSETLIMPFLG() {
        return aUTHADJSETLIMPFLG;
    }

    /**
     * The AUTH_ADJ_SETL_IMP_FLG Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_ADJ_SETL_IMP_FLG")
    public void setAUTHADJSETLIMPFLG(String aUTHADJSETLIMPFLG) {
        this.aUTHADJSETLIMPFLG = aUTHADJSETLIMPFLG;
    }

    /**
     * The AUTH_REFR_IND_PBF1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_IND_PBF1")
    public String getAUTHREFRINDPBF1() {
        return aUTHREFRINDPBF1;
    }

    /**
     * The AUTH_REFR_IND_PBF1 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_IND_PBF1")
    public void setAUTHREFRINDPBF1(String aUTHREFRINDPBF1) {
        this.aUTHREFRINDPBF1 = aUTHREFRINDPBF1;
    }

    /**
     * The AUTH_REFR_IND_PBF2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_IND_PBF2")
    public String getAUTHREFRINDPBF2() {
        return aUTHREFRINDPBF2;
    }

    /**
     * The AUTH_REFR_IND_PBF2 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_IND_PBF2")
    public void setAUTHREFRINDPBF2(String aUTHREFRINDPBF2) {
        this.aUTHREFRINDPBF2 = aUTHREFRINDPBF2;
    }

    /**
     * The AUTH_REFR_IND_PBF3 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_IND_PBF3")
    public String getAUTHREFRINDPBF3() {
        return aUTHREFRINDPBF3;
    }

    /**
     * The AUTH_REFR_IND_PBF3 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_IND_PBF3")
    public void setAUTHREFRINDPBF3(String aUTHREFRINDPBF3) {
        this.aUTHREFRINDPBF3 = aUTHREFRINDPBF3;
    }

    /**
     * The AUTH_REFR_IND_PBF4 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_IND_PBF4")
    public String getAUTHREFRINDPBF4() {
        return aUTHREFRINDPBF4;
    }

    /**
     * The AUTH_REFR_IND_PBF4 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_REFR_IND_PBF4")
    public void setAUTHREFRINDPBF4(String aUTHREFRINDPBF4) {
        this.aUTHREFRINDPBF4 = aUTHREFRINDPBF4;
    }

    /**
     * The AUTH_USER_FLD4 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_USER_FLD4")
    public String getAUTHUSERFLD4() {
        return aUTHUSERFLD4;
    }

    /**
     * The AUTH_USER_FLD4 Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_USER_FLD4")
    public void setAUTHUSERFLD4(String aUTHUSERFLD4) {
        this.aUTHUSERFLD4 = aUTHUSERFLD4;
    }

    /**
     * The AUTH_FRWD_INST_ID_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_FRWD_INST_ID_NUM")
    public String getAUTHFRWDINSTIDNUM() {
        return aUTHFRWDINSTIDNUM;
    }

    /**
     * The AUTH_FRWD_INST_ID_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_FRWD_INST_ID_NUM")
    public void setAUTHFRWDINSTIDNUM(String aUTHFRWDINSTIDNUM) {
        this.aUTHFRWDINSTIDNUM = aUTHFRWDINSTIDNUM;
    }

    /**
     * The AUTH_CRD_ACCEPT_ID_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_CRD_ACCEPT_ID_NUM")
    public String getAUTHCRDACCEPTIDNUM() {
        return aUTHCRDACCEPTIDNUM;
    }

    /**
     * The AUTH_CRD_ACCEPT_ID_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_CRD_ACCEPT_ID_NUM")
    public void setAUTHCRDACCEPTIDNUM(String aUTHCRDACCEPTIDNUM) {
        this.aUTHCRDACCEPTIDNUM = aUTHCRDACCEPTIDNUM;
    }

    /**
     * The AUTH_CRD_ISS_ID_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_CRD_ISS_ID_NUM")
    public String getAUTHCRDISSIDNUM() {
        return aUTHCRDISSIDNUM;
    }

    /**
     * The AUTH_CRD_ISS_ID_NUM Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("AUTH_CRD_ISS_ID_NUM")
    public void setAUTHCRDISSIDNUM(String aUTHCRDISSIDNUM) {
        this.aUTHCRDISSIDNUM = aUTHCRDISSIDNUM;
    }

    /**
     * The NUMBER_OF_TOKENS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NUMBER_OF_TOKENS")
    public Integer getNUMBEROFTOKENS() {
        return nUMBEROFTOKENS;
    }

    /**
     * The NUMBER_OF_TOKENS Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("NUMBER_OF_TOKENS")
    public void setNUMBEROFTOKENS(Integer nUMBEROFTOKENS) {
        this.nUMBEROFTOKENS = nUMBEROFTOKENS;
    }

    /**
     * The tokens Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("tokens")
    public Tokens getTokens() {
        return tokens;
    }

    /**
     * The tokens Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("tokens")
    public void setTokens(Tokens tokens) {
        this.tokens = tokens;
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
        return new HashCodeBuilder().append(hEADDATTIM).append(hEADRECTYP).append(hEADAUTHPPD).append(hEADTERMLN).append(hEADTERMFIID).append(hEADTERMTERMID).append(hEADCRDLN).append(hEADCRDFIID).append(hEADCRDPANNUM).append(hEADCRDMBRNUM).append(hEADBRCHID).append(hEADREGNID).append(aUTHTYPCDE).append(aUTHTYP).append(aUTHRTESTAT).append(aUTHORIGINATOR).append(aUTHRESPONDER).append(aUTHENTRYTIM).append(aUTHEXITTIM).append(aUTHREENTRYTIM).append(aUTHTRANDATYY).append(aUTHTRANDATMM).append(aUTHTRANDATDD).append(aUTHTRANTIMHH).append(aUTHTRANTIMMM).append(aUTHTRANTIMSS).append(aUTHTRANTIMTT).append(aUTHPOSTDATYY).append(aUTHPOSTDATMM).append(aUTHPOSTDATDD).append(aUTHACQICHGSETLDATYY).append(aUTHACQICHGSETLDATMM).append(aUTHACQICHGSETLDATDD).append(aUTHISSICHGSETLDATYY).append(aUTHISSICHGSETLDATMM).append(aUTHISSICHGSETLDATDD).append(aUTHSEQNUM).append(aUTHTERMTYP).append(aUTHTIMOFST).append(aUTHACQINSTIDNUM).append(aUTHRCVINSTIDNUM).append(aUTHTRANCDERTCDE).append(aUTHTRANCDERTFROM).append(aUTHTRANCDERTTO).append(aUTHFROMACCTACCTNUM).append(aUTHUSERFLD1).append(aUTHTOACCTACCTNUM).append(aUTHMULTACCT).append(aUTHAMT1).append(aUTHAMT2).append(aUTHAMT3).append(aUTHDEPBALCR).append(aUTHDEPTYP).append(aUTHRESPCDERRESPBYTE1).append(aUTHRESPCDERRESPBYTE2).append(aUTHTERMNAMELOC).append(aUTHTERMOWNERNAME).append(aUTHTERMCITY).append(aUTHTERMSTX).append(aUTHTERMCNTRYX).append(aUTHORIGOSEQNUM).append(aUTHORIGOTRANDAT).append(aUTHORIGOTRANTIM).append(aUTHORIGB24POSTDAT).append(aUTHORIGCRNCYCDE).append(aUTHMULTCRNCYAUTHCRNCYCDE).append(aUTHMULTCRNCYAUTHCONVRATE).append(aUTHMULTCRNCYSETLCRNCYCDE).append(aUTHMULTCRNCYSETLCONVRATE).append(aUTHMULTCRNCYCONVDATTIM).append(aUTHRVSLRSN).append(aUTHPINOFST).append(aUTHSHRGGRP).append(aUTHDESTORDER).append(aUTHAUTHIDRESP).append(aUTHREFRIMPIND).append(aUTHREFRAVAILIMPFROMACCOUNT).append(aUTHREFRAVAILIMPTOACCOUNT).append(aUTHREFRLEDGIMPFROMACCOUNT).append(aUTHREFRLEDGIMPTOACCOUNT).append(aUTHREFRHLDAMTIMPFROMACCOUNT).append(aUTHREFRHLDAMTIMPTOACCOUNT).append(aUTHREFRCAFREFRIND).append(aUTHREFRUSERFLD3).append(aUTHDEPSETLIMPFLG).append(aUTHADJSETLIMPFLG).append(aUTHREFRINDPBF1).append(aUTHREFRINDPBF2).append(aUTHREFRINDPBF3).append(aUTHREFRINDPBF4).append(aUTHUSERFLD4).append(aUTHFRWDINSTIDNUM).append(aUTHCRDACCEPTIDNUM).append(aUTHCRDISSIDNUM).append(nUMBEROFTOKENS).append(tokens).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TLF_DATA) == false) {
            return false;
        }
        TLF_DATA rhs = ((TLF_DATA) other);
        return new EqualsBuilder().append(hEADDATTIM, rhs.hEADDATTIM).append(hEADRECTYP, rhs.hEADRECTYP).append(hEADAUTHPPD, rhs.hEADAUTHPPD).append(hEADTERMLN, rhs.hEADTERMLN).append(hEADTERMFIID, rhs.hEADTERMFIID).append(hEADTERMTERMID, rhs.hEADTERMTERMID).append(hEADCRDLN, rhs.hEADCRDLN).append(hEADCRDFIID, rhs.hEADCRDFIID).append(hEADCRDPANNUM, rhs.hEADCRDPANNUM).append(hEADCRDMBRNUM, rhs.hEADCRDMBRNUM).append(hEADBRCHID, rhs.hEADBRCHID).append(hEADREGNID, rhs.hEADREGNID).append(aUTHTYPCDE, rhs.aUTHTYPCDE).append(aUTHTYP, rhs.aUTHTYP).append(aUTHRTESTAT, rhs.aUTHRTESTAT).append(aUTHORIGINATOR, rhs.aUTHORIGINATOR).append(aUTHRESPONDER, rhs.aUTHRESPONDER).append(aUTHENTRYTIM, rhs.aUTHENTRYTIM).append(aUTHEXITTIM, rhs.aUTHEXITTIM).append(aUTHREENTRYTIM, rhs.aUTHREENTRYTIM).append(aUTHTRANDATYY, rhs.aUTHTRANDATYY).append(aUTHTRANDATMM, rhs.aUTHTRANDATMM).append(aUTHTRANDATDD, rhs.aUTHTRANDATDD).append(aUTHTRANTIMHH, rhs.aUTHTRANTIMHH).append(aUTHTRANTIMMM, rhs.aUTHTRANTIMMM).append(aUTHTRANTIMSS, rhs.aUTHTRANTIMSS).append(aUTHTRANTIMTT, rhs.aUTHTRANTIMTT).append(aUTHPOSTDATYY, rhs.aUTHPOSTDATYY).append(aUTHPOSTDATMM, rhs.aUTHPOSTDATMM).append(aUTHPOSTDATDD, rhs.aUTHPOSTDATDD).append(aUTHACQICHGSETLDATYY, rhs.aUTHACQICHGSETLDATYY).append(aUTHACQICHGSETLDATMM, rhs.aUTHACQICHGSETLDATMM).append(aUTHACQICHGSETLDATDD, rhs.aUTHACQICHGSETLDATDD).append(aUTHISSICHGSETLDATYY, rhs.aUTHISSICHGSETLDATYY).append(aUTHISSICHGSETLDATMM, rhs.aUTHISSICHGSETLDATMM).append(aUTHISSICHGSETLDATDD, rhs.aUTHISSICHGSETLDATDD).append(aUTHSEQNUM, rhs.aUTHSEQNUM).append(aUTHTERMTYP, rhs.aUTHTERMTYP).append(aUTHTIMOFST, rhs.aUTHTIMOFST).append(aUTHACQINSTIDNUM, rhs.aUTHACQINSTIDNUM).append(aUTHRCVINSTIDNUM, rhs.aUTHRCVINSTIDNUM).append(aUTHTRANCDERTCDE, rhs.aUTHTRANCDERTCDE).append(aUTHTRANCDERTFROM, rhs.aUTHTRANCDERTFROM).append(aUTHTRANCDERTTO, rhs.aUTHTRANCDERTTO).append(aUTHFROMACCTACCTNUM, rhs.aUTHFROMACCTACCTNUM).append(aUTHUSERFLD1, rhs.aUTHUSERFLD1).append(aUTHTOACCTACCTNUM, rhs.aUTHTOACCTACCTNUM).append(aUTHMULTACCT, rhs.aUTHMULTACCT).append(aUTHAMT1, rhs.aUTHAMT1).append(aUTHAMT2, rhs.aUTHAMT2).append(aUTHAMT3, rhs.aUTHAMT3).append(aUTHDEPBALCR, rhs.aUTHDEPBALCR).append(aUTHDEPTYP, rhs.aUTHDEPTYP).append(aUTHRESPCDERRESPBYTE1, rhs.aUTHRESPCDERRESPBYTE1).append(aUTHRESPCDERRESPBYTE2, rhs.aUTHRESPCDERRESPBYTE2).append(aUTHTERMNAMELOC, rhs.aUTHTERMNAMELOC).append(aUTHTERMOWNERNAME, rhs.aUTHTERMOWNERNAME).append(aUTHTERMCITY, rhs.aUTHTERMCITY).append(aUTHTERMSTX, rhs.aUTHTERMSTX).append(aUTHTERMCNTRYX, rhs.aUTHTERMCNTRYX).append(aUTHORIGOSEQNUM, rhs.aUTHORIGOSEQNUM).append(aUTHORIGOTRANDAT, rhs.aUTHORIGOTRANDAT).append(aUTHORIGOTRANTIM, rhs.aUTHORIGOTRANTIM).append(aUTHORIGB24POSTDAT, rhs.aUTHORIGB24POSTDAT).append(aUTHORIGCRNCYCDE, rhs.aUTHORIGCRNCYCDE).append(aUTHMULTCRNCYAUTHCRNCYCDE, rhs.aUTHMULTCRNCYAUTHCRNCYCDE).append(aUTHMULTCRNCYAUTHCONVRATE, rhs.aUTHMULTCRNCYAUTHCONVRATE).append(aUTHMULTCRNCYSETLCRNCYCDE, rhs.aUTHMULTCRNCYSETLCRNCYCDE).append(aUTHMULTCRNCYSETLCONVRATE, rhs.aUTHMULTCRNCYSETLCONVRATE).append(aUTHMULTCRNCYCONVDATTIM, rhs.aUTHMULTCRNCYCONVDATTIM).append(aUTHRVSLRSN, rhs.aUTHRVSLRSN).append(aUTHPINOFST, rhs.aUTHPINOFST).append(aUTHSHRGGRP, rhs.aUTHSHRGGRP).append(aUTHDESTORDER, rhs.aUTHDESTORDER).append(aUTHAUTHIDRESP, rhs.aUTHAUTHIDRESP).append(aUTHREFRIMPIND, rhs.aUTHREFRIMPIND).append(aUTHREFRAVAILIMPFROMACCOUNT, rhs.aUTHREFRAVAILIMPFROMACCOUNT).append(aUTHREFRAVAILIMPTOACCOUNT, rhs.aUTHREFRAVAILIMPTOACCOUNT).append(aUTHREFRLEDGIMPFROMACCOUNT, rhs.aUTHREFRLEDGIMPFROMACCOUNT).append(aUTHREFRLEDGIMPTOACCOUNT, rhs.aUTHREFRLEDGIMPTOACCOUNT).append(aUTHREFRHLDAMTIMPFROMACCOUNT, rhs.aUTHREFRHLDAMTIMPFROMACCOUNT).append(aUTHREFRHLDAMTIMPTOACCOUNT, rhs.aUTHREFRHLDAMTIMPTOACCOUNT).append(aUTHREFRCAFREFRIND, rhs.aUTHREFRCAFREFRIND).append(aUTHREFRUSERFLD3, rhs.aUTHREFRUSERFLD3).append(aUTHDEPSETLIMPFLG, rhs.aUTHDEPSETLIMPFLG).append(aUTHADJSETLIMPFLG, rhs.aUTHADJSETLIMPFLG).append(aUTHREFRINDPBF1, rhs.aUTHREFRINDPBF1).append(aUTHREFRINDPBF2, rhs.aUTHREFRINDPBF2).append(aUTHREFRINDPBF3, rhs.aUTHREFRINDPBF3).append(aUTHREFRINDPBF4, rhs.aUTHREFRINDPBF4).append(aUTHUSERFLD4, rhs.aUTHUSERFLD4).append(aUTHFRWDINSTIDNUM, rhs.aUTHFRWDINSTIDNUM).append(aUTHCRDACCEPTIDNUM, rhs.aUTHCRDACCEPTIDNUM).append(aUTHCRDISSIDNUM, rhs.aUTHCRDISSIDNUM).append(nUMBEROFTOKENS, rhs.nUMBEROFTOKENS).append(tokens, rhs.tokens).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
