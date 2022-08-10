
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
 * The tokens Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "C4",
    "BE",
    "FH",
    "F1",
    "24",
    "28",
    "P8",
    "25",
    "32",
    "S4",
    "B4",
    "F4",
    "B2",
    "B3",
    "03",
    "04",
    "B5",
    "B7",
    "20",
    "B8",
    "B9",
    "Q2",
    "Q3",
    "06",
    "BM",
    "A6",
    "CH",
    "C0",
    "CE",
    "FB",
    "B1",
    "SC",
    "SH",
    "CZ",
    "B0",
    "SG",
    "BY",
    "Q1",
    "S2",
    "CI",
    "C1",
    "21",
    "17",
    "S3",
    "M1",
    "M2",
    "SO",
    "P9",
    "AG",
    "SI",
    "SK",
    "16",
    "S6",
    "model"
})
public class Tokens {

    /**
     * The C4 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("C4")
    private C4 c4;
    /**
     * The BE Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("BE")
    private BE bE;
    /**
     * The FH Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("FH")
    private FH fH;
    /**
     * The F1 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("F1")
    private F1 f1;
    /**
     * The 24 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("24")
    private com.test.gen._24 _24;
    /**
     * The 28 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("28")
    private com.test.gen._28 _28;
    /**
     * The P8 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("P8")
    private P8 p8;
    /**
     * The 25 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("25")
    private com.test.gen._25 _25;
    /**
     * The 32 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("32")
    private com.test.gen._32 _32;
    /**
     * The S4 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("S4")
    private S4 s4;
    /**
     * The B4 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("B4")
    private B4 b4;
    /**
     * The F4 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("F4")
    private F4 f4;
    /**
     * The B2 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("B2")
    private B2 b2;
    /**
     * The B3 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("B3")
    private B3 b3;
    /**
     * The 03 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("03")
    private com.test.gen._03 _03;
    /**
     * The 04 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("04")
    private com.test.gen._04 _04;
    /**
     * The B7 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("B5")
    private B5 b5;
    /**
     * The B7 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("B7")
    private B7 b7;
    /**
     * The 20 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("20")
    private com.test.gen._20 _20;
    /**
     * The B8 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("B8")
    private B8 b8;
    /**
     * The B9 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("B9")
    private B9 b9;
    /**
     * The Q2 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("Q2")
    private Q2 q2;
    /**
     * The Q3 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("Q3")
    private Q3 q3;
    /**
     * The 06 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("06")
    private com.test.gen._06 _06;
    /**
     * The BM Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("BM")
    private BM bM;
    /**
     * The A6 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("A6")
    private A6 a6;
    /**
     * The CH Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("CH")
    private CH cH;
    /**
     * The C0 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("C0")
    private C0 c0;
    /**
     * The CE Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("CE")
    private CE cE;
    /**
     * The FB Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("FB")
    private FB fB;
    /**
     * The B1 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("B1")
    private B1 b1;
    /**
     * The SC Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("SC")
    private SC sC;
    /**
     * The SH Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("SH")
    private SH sH;
    /**
     * The CZ Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("CZ")
    private CZ cZ;
    /**
     * The B0 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("B0")
    private B0 b0;
    /**
     * The SG Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("SG")
    private SG sG;
    /**
     * The BY Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("BY")
    private BY bY;
    /**
     * The Q1 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("Q1")
    private Q1 q1;
    /**
     * The S2 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("S2")
    private S2 s2;
    /**
     * The CI Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("CI")
    private CI cI;
    /**
     * The C1 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("C1")
    private C1 c1;
    /**
     * The 21 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("21")
    private com.test.gen._21 _21;
    /**
     * The S6 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("17")
    private com.test.gen._17 _17;
    /**
     * The S3 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("S3")
    private S3 s3;
    /**
     * The M1 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("M1")
    private M1 m1;
    /**
     * The M2 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("M2")
    private M2 m2;
    /**
     * The SO Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("SO")
    private SO sO;
    /**
     * The P9 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("P9")
    private P9 p9;
    /**
     * The AG Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("AG")
    private AG aG;
    /**
     * The SI Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("SI")
    private SI sI;
    /**
     * The 16 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("SK")
    private SK sK;
    /**
     * The 16 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("16")
    private com.test.gen._16 _16;
    /**
     * The S6 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("S6")
    private S6 s6;
    /**
     * The default Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("model")
    private Model model;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The C4 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("C4")
    public C4 getC4() {
        return c4;
    }

    /**
     * The C4 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("C4")
    public void setC4(C4 c4) {
        this.c4 = c4;
    }

    /**
     * The BE Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("BE")
    public BE getBE() {
        return bE;
    }

    /**
     * The BE Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("BE")
    public void setBE(BE bE) {
        this.bE = bE;
    }

    /**
     * The FH Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("FH")
    public FH getFH() {
        return fH;
    }

    /**
     * The FH Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("FH")
    public void setFH(FH fH) {
        this.fH = fH;
    }

    /**
     * The F1 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("F1")
    public F1 getF1() {
        return f1;
    }

    /**
     * The F1 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("F1")
    public void setF1(F1 f1) {
        this.f1 = f1;
    }

    /**
     * The 24 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("24")
    public com.test.gen._24 get24() {
        return _24;
    }

    /**
     * The 24 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("24")
    public void set24(com.test.gen._24 _24) {
        this._24 = _24;
    }

    /**
     * The 28 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("28")
    public com.test.gen._28 get28() {
        return _28;
    }

    /**
     * The 28 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("28")
    public void set28(com.test.gen._28 _28) {
        this._28 = _28;
    }

    /**
     * The P8 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("P8")
    public P8 getP8() {
        return p8;
    }

    /**
     * The P8 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("P8")
    public void setP8(P8 p8) {
        this.p8 = p8;
    }

    /**
     * The 25 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("25")
    public com.test.gen._25 get25() {
        return _25;
    }

    /**
     * The 25 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("25")
    public void set25(com.test.gen._25 _25) {
        this._25 = _25;
    }

    /**
     * The 32 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("32")
    public com.test.gen._32 get32() {
        return _32;
    }

    /**
     * The 32 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("32")
    public void set32(com.test.gen._32 _32) {
        this._32 = _32;
    }

    /**
     * The S4 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("S4")
    public S4 getS4() {
        return s4;
    }

    /**
     * The S4 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("S4")
    public void setS4(S4 s4) {
        this.s4 = s4;
    }

    /**
     * The B4 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("B4")
    public B4 getB4() {
        return b4;
    }

    /**
     * The B4 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("B4")
    public void setB4(B4 b4) {
        this.b4 = b4;
    }

    /**
     * The F4 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("F4")
    public F4 getF4() {
        return f4;
    }

    /**
     * The F4 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("F4")
    public void setF4(F4 f4) {
        this.f4 = f4;
    }

    /**
     * The B2 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("B2")
    public B2 getB2() {
        return b2;
    }

    /**
     * The B2 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("B2")
    public void setB2(B2 b2) {
        this.b2 = b2;
    }

    /**
     * The B3 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("B3")
    public B3 getB3() {
        return b3;
    }

    /**
     * The B3 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("B3")
    public void setB3(B3 b3) {
        this.b3 = b3;
    }

    /**
     * The 03 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("03")
    public com.test.gen._03 get03() {
        return _03;
    }

    /**
     * The 03 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("03")
    public void set03(com.test.gen._03 _03) {
        this._03 = _03;
    }

    /**
     * The 04 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("04")
    public com.test.gen._04 get04() {
        return _04;
    }

    /**
     * The 04 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("04")
    public void set04(com.test.gen._04 _04) {
        this._04 = _04;
    }

    /**
     * The B7 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("B5")
    public B5 getB5() {
        return b5;
    }

    /**
     * The B7 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("B5")
    public void setB5(B5 b5) {
        this.b5 = b5;
    }

    /**
     * The B7 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("B7")
    public B7 getB7() {
        return b7;
    }

    /**
     * The B7 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("B7")
    public void setB7(B7 b7) {
        this.b7 = b7;
    }

    /**
     * The 20 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("20")
    public com.test.gen._20 get20() {
        return _20;
    }

    /**
     * The 20 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("20")
    public void set20(com.test.gen._20 _20) {
        this._20 = _20;
    }

    /**
     * The B8 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("B8")
    public B8 getB8() {
        return b8;
    }

    /**
     * The B8 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("B8")
    public void setB8(B8 b8) {
        this.b8 = b8;
    }

    /**
     * The B9 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("B9")
    public B9 getB9() {
        return b9;
    }

    /**
     * The B9 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("B9")
    public void setB9(B9 b9) {
        this.b9 = b9;
    }

    /**
     * The Q2 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("Q2")
    public Q2 getQ2() {
        return q2;
    }

    /**
     * The Q2 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("Q2")
    public void setQ2(Q2 q2) {
        this.q2 = q2;
    }

    /**
     * The Q3 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("Q3")
    public Q3 getQ3() {
        return q3;
    }

    /**
     * The Q3 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("Q3")
    public void setQ3(Q3 q3) {
        this.q3 = q3;
    }

    /**
     * The 06 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("06")
    public com.test.gen._06 get06() {
        return _06;
    }

    /**
     * The 06 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("06")
    public void set06(com.test.gen._06 _06) {
        this._06 = _06;
    }

    /**
     * The BM Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("BM")
    public BM getBM() {
        return bM;
    }

    /**
     * The BM Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("BM")
    public void setBM(BM bM) {
        this.bM = bM;
    }

    /**
     * The A6 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("A6")
    public A6 getA6() {
        return a6;
    }

    /**
     * The A6 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("A6")
    public void setA6(A6 a6) {
        this.a6 = a6;
    }

    /**
     * The CH Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("CH")
    public CH getCH() {
        return cH;
    }

    /**
     * The CH Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("CH")
    public void setCH(CH cH) {
        this.cH = cH;
    }

    /**
     * The C0 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("C0")
    public C0 getC0() {
        return c0;
    }

    /**
     * The C0 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("C0")
    public void setC0(C0 c0) {
        this.c0 = c0;
    }

    /**
     * The CE Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("CE")
    public CE getCE() {
        return cE;
    }

    /**
     * The CE Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("CE")
    public void setCE(CE cE) {
        this.cE = cE;
    }

    /**
     * The FB Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("FB")
    public FB getFB() {
        return fB;
    }

    /**
     * The FB Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("FB")
    public void setFB(FB fB) {
        this.fB = fB;
    }

    /**
     * The B1 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("B1")
    public B1 getB1() {
        return b1;
    }

    /**
     * The B1 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("B1")
    public void setB1(B1 b1) {
        this.b1 = b1;
    }

    /**
     * The SC Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("SC")
    public SC getSC() {
        return sC;
    }

    /**
     * The SC Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("SC")
    public void setSC(SC sC) {
        this.sC = sC;
    }

    /**
     * The SH Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("SH")
    public SH getSH() {
        return sH;
    }

    /**
     * The SH Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("SH")
    public void setSH(SH sH) {
        this.sH = sH;
    }

    /**
     * The CZ Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("CZ")
    public CZ getCZ() {
        return cZ;
    }

    /**
     * The CZ Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("CZ")
    public void setCZ(CZ cZ) {
        this.cZ = cZ;
    }

    /**
     * The B0 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("B0")
    public B0 getB0() {
        return b0;
    }

    /**
     * The B0 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("B0")
    public void setB0(B0 b0) {
        this.b0 = b0;
    }

    /**
     * The SG Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("SG")
    public SG getSG() {
        return sG;
    }

    /**
     * The SG Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("SG")
    public void setSG(SG sG) {
        this.sG = sG;
    }

    /**
     * The BY Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("BY")
    public BY getBY() {
        return bY;
    }

    /**
     * The BY Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("BY")
    public void setBY(BY bY) {
        this.bY = bY;
    }

    /**
     * The Q1 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("Q1")
    public Q1 getQ1() {
        return q1;
    }

    /**
     * The Q1 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("Q1")
    public void setQ1(Q1 q1) {
        this.q1 = q1;
    }

    /**
     * The S2 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("S2")
    public S2 getS2() {
        return s2;
    }

    /**
     * The S2 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("S2")
    public void setS2(S2 s2) {
        this.s2 = s2;
    }

    /**
     * The CI Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("CI")
    public CI getCI() {
        return cI;
    }

    /**
     * The CI Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("CI")
    public void setCI(CI cI) {
        this.cI = cI;
    }

    /**
     * The C1 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("C1")
    public C1 getC1() {
        return c1;
    }

    /**
     * The C1 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("C1")
    public void setC1(C1 c1) {
        this.c1 = c1;
    }

    /**
     * The 21 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("21")
    public com.test.gen._21 get21() {
        return _21;
    }

    /**
     * The 21 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("21")
    public void set21(com.test.gen._21 _21) {
        this._21 = _21;
    }

    /**
     * The S6 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("17")
    public com.test.gen._17 get17() {
        return _17;
    }

    /**
     * The S6 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("17")
    public void set17(com.test.gen._17 _17) {
        this._17 = _17;
    }

    /**
     * The S3 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("S3")
    public S3 getS3() {
        return s3;
    }

    /**
     * The S3 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("S3")
    public void setS3(S3 s3) {
        this.s3 = s3;
    }

    /**
     * The M1 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("M1")
    public M1 getM1() {
        return m1;
    }

    /**
     * The M1 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("M1")
    public void setM1(M1 m1) {
        this.m1 = m1;
    }

    /**
     * The M2 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("M2")
    public M2 getM2() {
        return m2;
    }

    /**
     * The M2 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("M2")
    public void setM2(M2 m2) {
        this.m2 = m2;
    }

    /**
     * The SO Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("SO")
    public SO getSO() {
        return sO;
    }

    /**
     * The SO Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("SO")
    public void setSO(SO sO) {
        this.sO = sO;
    }

    /**
     * The P9 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("P9")
    public P9 getP9() {
        return p9;
    }

    /**
     * The P9 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("P9")
    public void setP9(P9 p9) {
        this.p9 = p9;
    }

    /**
     * The AG Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("AG")
    public AG getAG() {
        return aG;
    }

    /**
     * The AG Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("AG")
    public void setAG(AG aG) {
        this.aG = aG;
    }

    /**
     * The SI Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("SI")
    public SI getSI() {
        return sI;
    }

    /**
     * The SI Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("SI")
    public void setSI(SI sI) {
        this.sI = sI;
    }

    /**
     * The 16 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("SK")
    public SK getSK() {
        return sK;
    }

    /**
     * The 16 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("SK")
    public void setSK(SK sK) {
        this.sK = sK;
    }

    /**
     * The 16 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("16")
    public com.test.gen._16 get16() {
        return _16;
    }

    /**
     * The 16 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("16")
    public void set16(com.test.gen._16 _16) {
        this._16 = _16;
    }

    /**
     * The S6 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("S6")
    public S6 getS6() {
        return s6;
    }

    /**
     * The S6 Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("S6")
    public void setS6(S6 s6) {
        this.s6 = s6;
    }

    /**
     * The default Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("model")
    public Model getModel() {
        return model;
    }

    /**
     * The default Schema
     * <p>
     * 
     * 
     */
    @JsonProperty("model")
    public void setModel(Model model) {
        this.model = model;
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
        return new HashCodeBuilder().append(c4).append(bE).append(fH).append(f1).append(_24).append(_28).append(p8).append(_25).append(_32).append(s4).append(b4).append(f4).append(b2).append(b3).append(_03).append(_04).append(b5).append(b7).append(_20).append(b8).append(b9).append(q2).append(q3).append(_06).append(bM).append(a6).append(cH).append(c0).append(cE).append(fB).append(b1).append(sC).append(sH).append(cZ).append(b0).append(sG).append(bY).append(q1).append(s2).append(cI).append(c1).append(_21).append(_17).append(s3).append(m1).append(m2).append(sO).append(p9).append(aG).append(sI).append(sK).append(_16).append(s6).append(model).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tokens) == false) {
            return false;
        }
        Tokens rhs = ((Tokens) other);
        return new EqualsBuilder().append(c4, rhs.c4).append(bE, rhs.bE).append(fH, rhs.fH).append(f1, rhs.f1).append(_24, rhs._24).append(_28, rhs._28).append(p8, rhs.p8).append(_25, rhs._25).append(_32, rhs._32).append(s4, rhs.s4).append(b4, rhs.b4).append(f4, rhs.f4).append(b2, rhs.b2).append(b3, rhs.b3).append(_03, rhs._03).append(_04, rhs._04).append(b5, rhs.b5).append(b7, rhs.b7).append(_20, rhs._20).append(b8, rhs.b8).append(b9, rhs.b9).append(q2, rhs.q2).append(q3, rhs.q3).append(_06, rhs._06).append(bM, rhs.bM).append(a6, rhs.a6).append(cH, rhs.cH).append(c0, rhs.c0).append(cE, rhs.cE).append(fB, rhs.fB).append(b1, rhs.b1).append(sC, rhs.sC).append(sH, rhs.sH).append(cZ, rhs.cZ).append(b0, rhs.b0).append(sG, rhs.sG).append(bY, rhs.bY).append(q1, rhs.q1).append(s2, rhs.s2).append(cI, rhs.cI).append(c1, rhs.c1).append(_21, rhs._21).append(_17, rhs._17).append(s3, rhs.s3).append(m1, rhs.m1).append(m2, rhs.m2).append(sO, rhs.sO).append(p9, rhs.p9).append(aG, rhs.aG).append(sI, rhs.sI).append(sK, rhs.sK).append(_16, rhs._16).append(s6, rhs.s6).append(model, rhs.model).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
