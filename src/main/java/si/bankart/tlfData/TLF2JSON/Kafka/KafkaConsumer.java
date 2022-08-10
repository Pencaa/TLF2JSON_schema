package si.bankart.tlfData.TLF2JSON.Kafka;

import si.bankart.tlfData.TLF2JSON.TLF_DATA.gen.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import si.bankart.tlfData.TLF2JSON.Utilities.Utils;
import java.math.BigInteger;
import java.util.LinkedHashMap;



public class KafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);



    public static TLF_DATA consume(String message) {
        LinkedHashMap jsonObject = new LinkedHashMap();
        TLF_DATA data = new TLF_DATA();
        if(Utils.substring(message, 8, 2).equals("01")){
            data.setHEADDATTIM(new BigInteger(Utils.convertStringToHex(Utils.substring(message, 0, 8)), 16).toString());
            data.setHEADRECTYP(Utils.substring(message, 8, 2));
            data.setHEADAUTHPPD(Utils.substring(message, 10, 4));
            data.setHEADTERMLN(Utils.substring(message, 14, 4));
            data.setHEADTERMFIID(Utils.substring(message, 18, 4));
            data.setHEADTERMTERMID(Utils.substring(message, 22, 16));
            data.setHEADCRDLN(Utils.substring(message, 38, 4));
            data.setHEADCRDFIID(Utils.substring(message, 42, 4));
            data.setHEADCRDPANNUM(Utils.substring(message, 46, 19));
            data.setHEADCRDMBRNUM(Utils.substring(message, 65, 3));
            data.setHEADBRCHID(Utils.substring(message, 68, 4));
            data.setHEADREGNID(Utils.substring(message, 72, 4));
            data.setAUTHTYPCDE(Utils.substring(message, 76, 2));
            data.setAUTHTYP(Utils.substring(message, 78, 4));
            data.setAUTHRTESTAT(Utils.substring(message, 82, 2));
            data.setAUTHORIGINATOR(Utils.substring(message, 84, 1));
            data.setAUTHRESPONDER(Utils.substring(message, 85, 1));
            data.setAUTHENTRYTIM(new BigInteger(Utils.convertStringToHex(Utils.substring(message, 86, 8)), 16).toString());
            data.setAUTHEXITTIM(new BigInteger(Utils.convertStringToHex(Utils.substring(message, 94, 8)), 16).toString());
            data.setAUTHREENTRYTIM(new BigInteger(Utils.convertStringToHex(Utils.substring(message, 102, 8)), 16).toString());
            data.setAUTHTRANDATYY(Utils.substring(message, 110, 2));
            data.setAUTHTRANDATMM(Utils.substring(message, 112, 2));
            data.setAUTHTRANDATDD(Utils.substring(message, 114, 2));
            data.setAUTHTRANTIMHH(Utils.substring(message, 116, 2));
            data.setAUTHTRANTIMMM(Utils.substring(message, 118, 2));
            data.setAUTHTRANTIMSS(Utils.substring(message, 120, 2));
            data.setAUTHTRANTIMTT(Utils.substring(message, 122, 2));
            data.setAUTHPOSTDATYY(Utils.substring(message, 124, 2));
            data.setAUTHPOSTDATMM(Utils.substring(message, 126, 2));
            data.setAUTHPOSTDATDD(Utils.substring(message, 128, 2));
            data.setAUTHACQICHGSETLDATYY(Utils.substring(message, 130, 2));
            data.setAUTHACQICHGSETLDATMM(Utils.substring(message, 132, 2));
            data.setAUTHACQICHGSETLDATDD(Utils.substring(message, 134, 2));
            data.setAUTHISSICHGSETLDATYY(Utils.substring(message, 136, 2));
            data.setAUTHISSICHGSETLDATMM(Utils.substring(message, 138, 2));
            data.setAUTHISSICHGSETLDATDD(Utils.substring(message, 140, 2));
            data.setAUTHSEQNUM(Utils.substring(message, 142, 12));
            data.setAUTHTERMTYP(Utils.substring(message, 154, 2));
            data.setAUTHTIMOFST(Integer.parseInt(Utils.convertStringToHex(Utils.substring(message, 156, 2)), 16));
            data.setAUTHACQINSTIDNUM(Utils.substring(message, 158, 11));
            data.setAUTHRCVINSTIDNUM(Utils.substring(message, 169, 11));
            data.setAUTHTRANCDERTCDE(Utils.substring(message, 180, 2));
            data.setAUTHTRANCDERTFROM(Utils.substring(message, 182, 2));
            data.setAUTHTRANCDERTTO(Utils.substring(message, 184, 2));
            data.setAUTHFROMACCTACCTNUM(Utils.substring(message, 186, 19));
            data.setAUTHUSERFLD1(Utils.substring(message, 205, 1));
            data.setAUTHTOACCTACCTNUM(Utils.substring(message, 206, 19));
            data.setAUTHMULTACCT(Utils.substring(message, 225, 1));
            data.setAUTHAMT1(new BigInteger(Utils.convertStringToHex(Utils.substring(message, 226, 8)), 16).toString());
            data.setAUTHAMT2(new BigInteger(Utils.convertStringToHex(Utils.substring(message, 234, 8)), 16).toString());
            data.setAUTHAMT3(new BigInteger(Utils.convertStringToHex(Utils.substring(message, 242, 8)), 16).toString());
            data.setAUTHDEPBALCR(Integer.parseInt(Utils.convertStringToHex(Utils.substring(message, 250, 4)), 16));
            data.setAUTHDEPTYP(Utils.substring(message, 254, 1));
            data.setAUTHRESPCDERRESPBYTE1(Utils.substring(message, 255, 1));
            data.setAUTHRESPCDERRESPBYTE2(Utils.substring(message, 256, 2));
            data.setAUTHTERMNAMELOC(Utils.substring(message, 258, 25));
            data.setAUTHTERMOWNERNAME(Utils.substring(message, 283, 22));
            data.setAUTHTERMCITY(Utils.substring(message, 305, 13));
            data.setAUTHTERMSTX(Utils.substring(message, 318, 3));
            data.setAUTHTERMCNTRYX(Utils.substring(message, 321, 2));
            data.setAUTHORIGOSEQNUM(Utils.substring(message, 323, 12));
            data.setAUTHORIGOTRANDAT(Utils.substring(message, 335, 4));
            data.setAUTHORIGOTRANTIM(Utils.substring(message, 339, 8));
            data.setAUTHORIGB24POSTDAT(Utils.substring(message, 347, 4));
            data.setAUTHORIGCRNCYCDE(Utils.substring(message, 351, 3));
            data.setAUTHMULTCRNCYAUTHCRNCYCDE(Utils.substring(message, 354, 3));
            data.setAUTHMULTCRNCYAUTHCONVRATE(Utils.substring(message, 357, 8));
            data.setAUTHMULTCRNCYSETLCRNCYCDE(Utils.substring(message, 365, 3));
            data.setAUTHMULTCRNCYSETLCONVRATE(Utils.substring(message, 368, 8));
            data.setAUTHMULTCRNCYCONVDATTIM(new BigInteger(Utils.convertStringToHex(Utils.substring(message, 376, 8)), 16).toString());
            data.setAUTHRVSLRSN(Utils.substring(message, 384, 2));
            data.setAUTHPINOFST(Utils.substring(message, 386, 16));
            data.setAUTHSHRGGRP(Utils.substring(message, 402, 1));
            data.setAUTHDESTORDER(Utils.substring(message, 403, 1));
            data.setAUTHAUTHIDRESP(Utils.substring(message, 404, 6));
            data.setAUTHREFRIMPIND(Utils.substring(message, 410, 1));
            data.setAUTHREFRAVAILIMPFROMACCOUNT(Utils.substring(message, 411, 1));
            data.setAUTHREFRAVAILIMPTOACCOUNT(Utils.substring(message, 412, 1));
            data.setAUTHREFRLEDGIMPFROMACCOUNT(Utils.substring(message, 413, 1));
            data.setAUTHREFRLEDGIMPTOACCOUNT(Utils.substring(message, 414, 1));
            data.setAUTHREFRHLDAMTIMPFROMACCOUNT(Utils.substring(message, 415, 1));
            data.setAUTHREFRHLDAMTIMPTOACCOUNT(Utils.substring(message, 416, 1));
            data.setAUTHREFRCAFREFRIND(Utils.substring(message, 417, 1));
            data.setAUTHREFRUSERFLD3(Utils.substring(message, 418, 1));
            data.setAUTHDEPSETLIMPFLG(Utils.substring(message, 419, 1));
            data.setAUTHADJSETLIMPFLG(Utils.substring(message, 420, 1));
            data.setAUTHREFRINDPBF1(Utils.substring(message, 421, 1));
            data.setAUTHREFRINDPBF2(Utils.substring(message, 422, 1));
            data.setAUTHREFRINDPBF3(Utils.substring(message, 423, 1));
            data.setAUTHREFRINDPBF4(Utils.substring(message, 424, 1));
            data.setAUTHUSERFLD4(Utils.substring(message, 425, 16));
            data.setAUTHFRWDINSTIDNUM(Utils.substring(message, 441, 11));
            data.setAUTHCRDACCEPTIDNUM(Utils.substring(message, 452, 11));
            data.setAUTHCRDISSIDNUM(Utils.substring(message, 463, 11));

            //dva presledka na 474 in 475
            int beginningOfTokens = 476;

            //če slučajno ne bi bilo tokenov
            if(beginningOfTokens<message.length()){

                //za izpis števila tokenov
                int numOfTokens = Integer.parseInt(Utils.convertStringToHex(Utils.substring(message,beginningOfTokens, 2)),16);


                //dolžina vseh tokenov skupaj
                int tokensLength = Integer.parseInt(Utils.convertStringToHex(Utils.substring(message, beginningOfTokens+2, 2)),16);
                //data.setNUMBER_OFTOKENS(numOfTokens);

                //za izpis števila tokenov
                //LOGGER.info("Stevilo pricakovanih tokenov: " + numOfTokens);

                int index = beginningOfTokens+4;

                //List<CharSequence> tokens = new ArrayList<CharSequence>();
                //LinkedHashMap<CharSequence, CharSequence> tokens = new LinkedHashMap();
                Tokens tokens = new Tokens();
                //Dodajanje tokenov teče, dokler ni index daljši od dolžine sporočila
                //lahko bi tudi šteli število že zapisanih tokenov in primerjali s pričakovanim številom
                while(index<=(beginningOfTokens+tokensLength)){

                    //nov LinkedHashMap za zapis podatkov tokena
                    //LinkedHashMap token = new LinkedHashMap();

                    //tokenId za prepoznavo tokena
                    String tokenID = Utils.substring(message,index+2,2);

                    //Za preverjanje tokenov
                    //LOGGER.info(tokenID);

                    //dolžina tokena
                    int tkn_length = Integer.parseInt(Utils.convertStringToHex(Utils.substring(message, index+4, 2)),16);

                    //za izpis dolžine tokena
                    //LOGGER.info(tkn_length);

                    //glede na tokenID se zapišejo podatki v token
                    if (tokenID.equals("C4")) {
                        C4 c4 = new C4();
                        c4.setTKNLEN(tkn_length);
                        c4.setTERMATTENDIND(Utils.substring(message,index+6,1));
                        c4.setTERMOPERIND(Utils.substring(message,index+7,1));
                        c4.setTERMLOCIND(Utils.substring(message,index+8,1));
                        c4.setCRDHLDRPRESENTIND(Utils.substring(message,index+9,1));
                        c4.setCRDPRESENTIND(Utils.substring(message,index+10,1));
                        c4.setCRDCAPTRIND(Utils.substring(message,index+11,1));
                        c4.setTXNSTATIND(Utils.substring(message,index+12,1));
                        c4.setTXNSECIND(Utils.substring(message,index+13,1));
                        c4.setTXNRTNIND(Utils.substring(message,index+14,1));
                        c4.setCRDHLDRACTVTTERMIND(Utils.substring(message,index+15,1));
                        c4.setTERMINPUTCAPIND(Utils.substring(message,index+16,1));
                        c4.setCRDHLDRIDMETHOD(Utils.substring(message,index+17,1));
                        tokens.setC4(c4);
                    }
                    else if (tokenID.equals("BY")) {
                        BY by = new BY();
                        by.setTKNLEN(tkn_length);
                        by.setSTAN(Utils.substring(message,index+6,6));
                        by.setRETRVLREFNUM(Utils.substring(message,index+12,12));
                        by.setNETWKID(Utils.substring(message,index+24,4));
                        by.setRESPCDE(Utils.substring(message,index+28,3));
                        by.setISAIND(Utils.substring(message,index+31,1));
                        by.setISAAMT(Utils.substring(message,index+32,8));
                        by.setFEEPGMIND(Utils.substring(message,index+40,3));
                        by.setONOFFPREMIND(Utils.substring(message,index+43,1));
                        by.setCROSSBORDERTXNIND(Utils.substring(message,index+44,1));
                        by.setCROSSBORDERCRNCYIND(Utils.substring(message,index+45,1));
                        by.setCRNCYCONVASSESSAMT(Utils.substring(message,index+46,12));
                        by.setCRDLVLPRODIDVAL(Utils.substring(message,index+58,2));
                        by.setUSERFLDACI(Utils.substring(message,index+60,6));
                        tokens.setBY(by);
                    }
                    else if (tokenID.equals("FH")) {
                        FH fh = new FH();
                        fh.setTKNLEN(tkn_length);
                        fh.setSCAEXEMPTIND(Utils.substring(message,index+6,4));
                        fh.setUSERFLDACI(Utils.substring(message,index+10,16));
                    }
                    else if (tokenID.equals("CH")) {
                        CH ch = new CH();
                        ch.setTKNLEN(tkn_length);
                        ch.setRESPSRCRSNCDE(Utils.substring(message,index+6,1));
                        ch.setCRDVRFYFLG2(Utils.substring(message,index+7,1));
                        ch.setONLINELMT(new BigInteger(Utils.convertStringToHex(Utils.substring(message,index+8,8)), 16).toString());
                        ch.setRETLCLASSCDE(Utils.substring(message,index+16,4));
                        ch.setEMVCAPABLEOUTLET(Utils.substring(message,index+20,1));
                        ch.setRECURPMNTIND(Utils.substring(message,index+21,1));
                        ch.setNUMINSTL(Utils.substring(message,index+22,2));
                        ch.setNUMMMGRATUITY(Utils.substring(message,index+24,2));
                        ch.setPMNTPLAN(Utils.substring(message,index+26,3));
                        ch.setTERMOUTPUTCAPIND(Utils.substring(message,index+29,1));
                        ch.setCRDHLDRAUTHNCAPIND(Utils.substring(message,index+30,1));
                        ch.setPARTIALAUTHOPT(Utils.substring(message,index+31,1));
                        ch.setUSERFLD1(Utils.substring(message,index+32,10));
                    }
                    else if (tokenID.equals("C0")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("CVDFLD(Utils.substring(message,index+6,4));
                        token.put("RESUBSTAT(Utils.substring(message,index+10,1));
                        token.put("RESUBCNTR(Utils.substring(message,index+11,3));
                        token.put("TERMPOSTALCDE(Utils.substring(message,index+14,10));
                        token.put("ECOMFLG(Utils.substring(message,index+24,1));
                        token.put("CMRCLCRDTYP(Utils.substring(message,index+25,1));
                        token.put("ADNLDATAIND(Utils.substring(message,index+26,1));
                        token.put("CVDFLDPRESENT(Utils.substring(message,index+27,1));
                        token.put("SAFORFORCEPOST(Utils.substring(message,index+28,1));
                        token.put("AUTHNCOLLIND(Utils.substring(message,index+29,1));
                        token.put("FRDPRNFLG(Utils.substring(message,index+30,1));
                        token.put("CAVVAAVRSLTCDE(Utils.substring(message,index+31,1));
                    }
                    else if (tokenID.equals("CE")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("AUTHNINDFLG(Utils.substring(message,index+6,2));
                        token.put("AUTHNINDDATA(Utils.substring(message,index+8,200));
                    }
                    else if (tokenID.equals("FB")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("DATAINDFLG(Utils.substring(message,index+6,2));
                        token.put("INFODATALGTH(Utils.substring(message,index+8,4));
                        token.put("INFO(Utils.substring(message,index+12,256));
                    }
                    else if (tokenID.equals("32")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("REALTIMEREQTYPE(Utils.substring(message,index+6,1));
                        token.put("PIPRESPONSEREQUEST(Utils.substring(message,index+7,1));
                        token.put("REALTIMESTATUS(Utils.substring(message,index+8,1));
                        token.put("REALTIMESCORE(Utils.substring(message,index+9,3));
                        token.put("RTRRULEFIRED(Utils.substring(message,index+12,4));
                        token.put("RTRDISPOSITION(Utils.substring(message,index+16,1));
                        token.put("RTRFILLER(Utils.substring(message,index+17,1));
                    }
                    else if (tokenID.equals("B8")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("ACQTXNPRFL(Utils.substring(message,index+6,16));
                        token.put("ISSTXNPRFL(Utils.substring(message,index+22,16));
                        token.put("DISCRDRVSLFLG(Utils.substring(message,index+38,1));
                        token.put("APCFRTE(Utils.substring(message,index+39,1));
                    }
                    else if (tokenID.equals("B9")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("ACQDESCRTAG(Utils.substring(message,index+6,30));
                        token.put("ISSDESCRTAG(Utils.substring(message,index+36,30));
                    }
                    else if (tokenID.equals("20")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("LIFECYCLEIND(Utils.substring(message,index+6,1));
                        token.put("TRACEID(Utils.substring(message,index+7,15));
                        token.put("VALIDCDE(Utils.substring(message,index+22,4));
                        token.put("MONITORINGSTAT(Utils.substring(message,index+26,1));
                        token.put("ERRIND(Utils.substring(message,index+27,1));
                    }
                    else if (tokenID.equals("B0")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("LGHT(Integer.parseInt(Utils.convertStringToHex(Utils.substring(message, index+6, 2)), 16));
                        token.put("FIID(Utils.substring(message,index+8,4));
                        token.put("VERID(Utils.substring(message,index+12,2));
                        token.put("LOCALTIM(Utils.substring(message,index+14,6));
                        token.put("LOCALDAT(Utils.substring(message,index+20,4));
                        token.put("ADVICERSNCDE(Utils.substring(message,index+24,3));
                        token.put("POSENTRYMDE(Utils.substring(message,index+27,3));
                        token.put("RESPCDE(Utils.substring(message,index+30,2));
                        token.put("CRDVRFYRESULT(Utils.substring(message,index+32,1));
                        token.put("VISAACCTSTATIND(Utils.substring(message,index+33,1));
                        token.put("AUTHNIND(Utils.substring(message,index+34,1));
                        token.put("USERFLDACI2(Utils.substring(message,index+35,1));
                        token.put("PROCCDE(Utils.substring(message,index+36,6));
                        token.put("ONBEHALF(Utils.substring(message,index+42,30));
                        token.put("MCHIPPROIND(Utils.substring(message,index+72,2));
                        token.put("MCHIPPROCINFO(Utils.substring(message,index+74,1));
                        token.put("TRANFEE(Utils.substring(message,index+75,9));
                        token.put("ECOMSECLVLIND(Utils.substring(message,index+84,3));
                        token.put("AVSRESULT(Utils.substring(message,index+87,1));
                        token.put("ACCTNUMIND(Utils.substring(message,index+88,1));
                        token.put("ADVCDETLCDE(Utils.substring(message,index+89,4));
                        token.put("AUTHAGENTIDCDE(Utils.substring(message,index+93,6));
                        token.put("PMNTTXNTYPIND(Utils.substring(message,index+99,3));
                        token.put("CHIPBITERRRSLTS(Utils.substring(message,index+102,50));
                        token.put("CRDLVLRSLT(Utils.substring(message,index+152,2));
                        token.put("MCGTWYTXNIND(Utils.substring(message,index+154,8));
                        token.put("MCASGNIDSUBFLD32(Utils.substring(message,index+162,6));
                        token.put("VPAN(Utils.substring(message,index+168,19));
                        token.put("RTEIND(Utils.substring(message,index+187,1));
                        token.put("VISAMKTSPCFCDATA(Utils.substring(message,index+188,1));
                        token.put("NTLPOSDATA(Utils.substring(message,index+189,11));
                        token.put("PINSVCCDE(Utils.substring(message,index+200,2));
                        token.put("PINCAPCDE(Utils.substring(message,index+202,2));
                        token.put("AUTHSYSADVDATTIM(Utils.substring(message,index+204,10));
                        token.put("FRAUDDATA(Utils.substring(message,index+214,12));
                        token.put("PMNTINITIATIONCHAN(Utils.substring(message,index+226,2));
                        token.put("TLECOMPLIANTIND(Utils.substring(message,index+228,1));
                        token.put("UKPTCOMPLIANTIND(Utils.substring(message,index+229,1));
                        token.put("SANCTIONSCRNSCORE(Utils.substring(message,index+230,3));
                        token.put("VISASPENDQUALIFIEDIND(Utils.substring(message,index+233,1));
                        token.put("TXNINTGTYCLAS(Utils.substring(message,index+234,2));
                        token.put("ORIGECOMSECLVLIND(Utils.substring(message,index+236,3));
                        token.put("ECOMSECDOWNGRADERSN(Utils.substring(message,index+239,1));
                        token.put("ADVCDETLTXT(Utils.substring(message,index+240,53));
                        token.put("WALLETID(Utils.substring(message,index+293,3));
                    }
                    else if (tokenID.equals("B1")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("LGHT(Integer.parseInt(Utils.convertStringToHex(Utils.substring(message, index+6, 2)), 16));
                        token.put("FIID(Utils.substring(message,index+8,4));
                        token.put("VERID(Utils.substring(message,index+12,2));
                        token.put("LOCALTIM(Utils.substring(message,index+14,6));
                        token.put("LOCALDAT(Utils.substring(message,index+20,4));
                        token.put("ADVICERSNCDE(Utils.substring(message,index+24,3));
                        token.put("POSENTRYMDE(Utils.substring(message,index+27,3));
                        token.put("RESPCDE(Utils.substring(message,index+30,2));
                        token.put("CRDVRFYRESULT(Utils.substring(message,index+32,1));
                        token.put("VISAACCTSTATIND(Utils.substring(message,index+33,1));
                        token.put("AUTHNIND(Utils.substring(message,index+34,1));
                        token.put("USERFLDACI2(Utils.substring(message,index+35,1));
                        token.put("PROCCDE(Utils.substring(message,index+36,6));
                        token.put("ONBEHALF(Utils.substring(message,index+42,30));
                        token.put("MCHIPPROIND(Utils.substring(message,index+72,2));
                        token.put("MCHIPPROCINFO(Utils.substring(message,index+74,1));
                        token.put("TRANFEE(Utils.substring(message,index+75,9));
                        token.put("ECOMSECLVLIND(Utils.substring(message,index+84,3));
                        token.put("AVSRESULT(Utils.substring(message,index+87,1));
                        token.put("ACCTNUMIND(Utils.substring(message,index+88,1));
                        token.put("ADVCDETLCDE(Utils.substring(message,index+89,4));
                        token.put("AUTHAGENTIDCDE(Utils.substring(message,index+93,6));
                        token.put("PMNTTXNTYPIND(Utils.substring(message,index+99,3));
                        token.put("CHIPBITERRRSLTS(Utils.substring(message,index+102,50));
                        token.put("CRDLVLRSLT(Utils.substring(message,index+152,2));
                        token.put("MCGTWYTXNIND(Utils.substring(message,index+154,8));
                        token.put("MCASGNIDSUBFLD32(Utils.substring(message,index+162,6));
                        token.put("VPAN(Utils.substring(message,index+168,19));
                        token.put("RTEIND(Utils.substring(message,index+187,1));
                        token.put("VISAMKTSPCFCDATA(Utils.substring(message,index+188,1));
                        token.put("NTLPOSDATA(Utils.substring(message,index+189,11));
                        token.put("PINSVCCDE(Utils.substring(message,index+200,2));
                        token.put("PINCAPCDE(Utils.substring(message,index+202,2));
                        token.put("AUTHSYSADVDATTIM(Utils.substring(message,index+204,10));
                        token.put("FRAUDDATA(Utils.substring(message,index+214,12));
                        token.put("PMNTINITIATIONCHAN(Utils.substring(message,index+226,2));
                        token.put("TLECOMPLIANTIND(Utils.substring(message,index+228,1));
                        token.put("UKPTCOMPLIANTIND(Utils.substring(message,index+229,1));
                        token.put("SANCTIONSCRNSCORE(Utils.substring(message,index+230,3));
                        token.put("VISASPENDQUALIFIEDIND(Utils.substring(message,index+233,1));
                        token.put("TXNINTGTYCLAS(Utils.substring(message,index+234,2));
                        token.put("ORIGECOMSECLVLIND(Utils.substring(message,index+236,3));
                        token.put("ECOMSECDOWNGRADERSN(Utils.substring(message,index+239,1));
                        token.put("ADVCDETLTXT(Utils.substring(message,index+240,53));
                        token.put("WALLETID(Utils.substring(message,index+293,3));
                    }
                    else if (tokenID.equals("Q2")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("UNIQUEID(Utils.substring(message,index+6,64));
                    }
                    else if (tokenID.equals("SG")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("FRMTCDE(Utils.substring(message,index+6,2));
                        token.put("SCORE(Utils.substring(message,index+8,3));
                        token.put("RSNCDE(Utils.substring(message,index+11,2));
                        token.put("RULEADJSCORE(Utils.substring(message,index+13,3));
                        token.put("RULERSNCDE1(Utils.substring(message,index+16,2));
                        token.put("RULERSNCDE2(Utils.substring(message,index+18,2));
                    }
                    else if (tokenID.equals("BE")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("AMT1(String.valueOf(Integer.parseInt(Utils.convertStringToHex(Utils.substring(message, index+6, 2)), 16)));
                        token.put("AMT2(new BigInteger(Utils.convertStringToHex(Utils.substring(message, index + 14, 8)),16).toString());
                        token.put("CRNCYCDE(Utils.substring(message, index + 22, 3));
                        token.put("CONVRATE(Utils.substring(message, index + 25, 8));
                        token.put("CONVDAT(Utils.substring(message, index + 33, 4));
                        token.put("CONVIND(Utils.substring(message, index + 37, 1));
                        token.put("USERFLD1(Utils.substring(message, index + 38, 8));
                    }
                    else if (tokenID.equals("B4")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("PTSRVENTRYMDE(Utils.substring(message, index + 6, 3));
                        token.put("TERMENTRYCAP(Utils.substring(message, index + 9, 1));
                        token.put("LASTEMVSTAT(Utils.substring(message, index + 10, 1));
                        token.put("DATASUSPECT(Utils.substring(message, index + 11, 1));
                        token.put("APPLPANSEQNUM(Utils.substring(message, index + 12, 2));
                        token.put("APPRVDRC(Utils.substring(message, index + 14, 2));
                        token.put("ATCVRFY(Utils.substring(message, index + 16, 1));
                        token.put("USERFLDACI(Utils.substring(message, index + 17, 3));
                        token.put("RSNONLCDE(Utils.substring(message, index + 20, 4));
                        token.put("ARQCVRFY(Utils.substring(message, index + 24, 1));
                        token.put("ISORCIND(Utils.substring(message, index + 25, 1));
                    }
                    else if (tokenID.equals("B2")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("BITMAP(Utils.hexToBin(Utils.convertStringToHex(Utils.substring(message, index + 6, 2))));
                        token.put("USERFLD1(Utils.convertStringToHex(Utils.substring(message, index + 8, 2)));
                        token.put("CRYPTOINFODATA(Utils.convertStringToHex(Utils.substring(message, index + 10, 1)));
                        token.put("TVR(Utils.convertStringToHex(Utils.substring(message, index + 11, 5)));
                        token.put("ARQC(new BigInteger(Utils.convertStringToHex(Utils.substring(message, index + 16, 8)),16).toString());
                        token.put("AMTAUTH(Utils.convertStringToHex(Utils.substring(message, index + 24, 6)));
                        token.put("AMTOTHER(Utils.convertStringToHex(Utils.substring(message, index + 30, 6)));
                        token.put("AIP(String.valueOf(Integer.parseInt(Utils.convertStringToHex(Utils.substring(message, index + 36, 2)),16)));
                        token.put("ATC(String.valueOf(Integer.parseInt(Utils.convertStringToHex(Utils.substring(message, index + 38, 2)),16)));
                        token.put("TERMCNTRYCDE(Utils.convertStringToHex(Utils.substring(message, index + 40, 3)));
                        token.put("TRANCRNCYCDE(Utils.convertStringToHex(Utils.substring(message, index + 42, 2)));
                        token.put("TRANDAT(Utils.convertStringToHex(Utils.substring(message, index + 44, 3)));
                        token.put("TRANTYPE(Utils.convertStringToHex(Utils.substring(message, index + 47, 1)));
                        token.put("UNPREDICTNUM(new BigInteger(Utils.convertStringToHex(Utils.substring(message, index + 48, 4)),16).toString());
                        token.put("ISSAPPLDATALGTH(Utils.convertStringToHex(Utils.substring(message, index + 52, 2)));
                        token.put("LGTH(Utils.convertStringToHex(Utils.substring(message, index + 54, 1)));
                        token.put("DERIVKEYINDEX(Utils.convertStringToHex(Utils.substring(message, index + 55, 1)));
                        token.put("CRYPTOVERNUM(String.valueOf(Integer.parseInt(Utils.convertStringToHex(Utils.substring(message, index + 56, 1)),16)));
                        token.put("CRDVRFYRSLTS(Utils.convertStringToHex(Utils.substring(message, index + 57, 4)));
                        token.put("INFO(Utils.convertStringToHex(Utils.substring(message, index + 61, 25)));
                    }
                    else if (tokenID.equals("28")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("EXPDAT(Utils.substring(message, index + 6, 4));
                        token.put("CURAUTHAMT(Utils.substring(message, index + 10, 12));
                        token.put("PENDAUTHS(Utils.substring(message, index + 22, 12));
                        token.put("PREFIXLGTH(Utils.substring(message, index + 34, 2));
                        token.put("OPENTOBUY(Utils.substring(message, index + 36, 12));
                        token.put("AUTHLMT(Utils.substring(message, index + 48, 12));
                        token.put("AUTHBAL(Utils.substring(message, index + 60, 12));
                        token.put("LASTPMNTDAT(Utils.substring(message, index + 72, 6));
                        token.put("LASTPMNTAMT(Utils.substring(message, index + 78, 12));
                        token.put("ACCTSTAT(Utils.substring(message, index + 90, 1));
                        token.put("CRDSTAT(Utils.substring(message, index + 91, 1));
                        token.put("AUTHLMTIND(Utils.substring(message, index + 92, 3));
                        token.put("USERFLD1(Utils.substring(message, index + 93, 1));
                    }
                    else if (tokenID.equals("P8")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("TAXID(Utils.substring(message, index + 6, 12));
                    }
                    else if (tokenID.equals("B3")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("BITMAP(Utils.hexToBin(Utils.convertStringToHex(Utils.substring(message, index + 6, 2))));
                        token.put("TERMSERLNUM(Utils.substring(message, index + 8, 8));
                        token.put("EMVTERMCAP(Utils.hexToBin(Utils.convertStringToHex(Utils.substring(message, index + 16, 4))));
                        token.put("USERFLD1(Utils.convertStringToHex(Utils.substring(message, index + 20, 2)));
                        token.put("USERFLD2(Utils.convertStringToHex(Utils.substring(message, index + 22, 4)));
                        token.put("EMVTERMTYPE(Utils.convertStringToHex(Utils.substring(message, index + 26, 1)));
                        token.put("APPLVERNUM(Utils.convertStringToHex(Utils.substring(message, index + 27, 2)));
                        token.put("CVMRSLTS(Utils.convertStringToHex(Utils.substring(message, index + 29, 3)));
                        token.put("DFNAMELGTH(String.valueOf(Integer.parseInt(Utils.convertStringToHex(Utils.substring(message, index + 32, 2)),16)));
                        token.put("DFNAME(Utils.hexToBin(Utils.convertStringToHex(Utils.substring(message, index + 34, 16))));
                    }
                    else if (tokenID.equals("24")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("CRDTYP(Utils.substring(message, index + 6, 2));
                        token.put("AUTHONLY(Utils.substring(message, index + 8, 1));
                        token.put("SVCIND(Utils.substring(message, index + 9, 1));
                        token.put("EXPDAT(Utils.substring(message, index + 10, 4));
                        token.put("CASHDEPFLG(Utils.substring(message, index + 14, 1));
                        token.put("CRDSTAT(Utils.substring(message, index + 15, 1));
                    }
                    else if (tokenID.equals("A6")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("LIFECYCLEIND(Utils.substring(message, index + 6, 1));
                        token.put("TRACEID(Utils.substring(message, index + 7, 15));
                        token.put("VALIDCDE(Utils.substring(message, index + 22, 4));
                        token.put("MONITORINGSTAT(Utils.substring(message, index + 26, 1));
                        token.put("ERRIND(Utils.substring(message, index + 27, 1));
                    }
                    else if (tokenID.equals("S6")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("TRACK2(Utils.substring(message, index + 6, 40));
                    }
                    else if (tokenID.equals("06")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("NEWPINFRMT(Utils.substring(message, index + 6, 1));
                        token.put("NEWPINOFST(Utils.substring(message, index + 7, 16));
                        token.put("PINCNT(Utils.substring(message, index + 23, 1));
                        token.put("NEWPINSIZE(Utils.substring(message, index + 24, 2));
                        token.put("NEWPIN1(Utils.substring(message, index + 26, 16));
                        token.put("NEWPIN2(Utils.substring(message, index + 42, 16));
                    }
                    else if (tokenID.equals("BM")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("TXNSUBTYP(Utils.substring(message, index + 6, 4));
                        token.put("ACQPROCCDE(Utils.substring(message, index + 10, 6));
                        token.put("ISSPROCCDE(Utils.substring(message, index + 16, 6));
                        token.put("USERFLD1(Utils.substring(message, index + 2, 20));
                    }
                    else if (tokenID.equals("F1")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("SCHEMEMERCHID(Utils.substring(message, index + 6, 15));
                        token.put("CRDHLDRAUTHNIND(Utils.substring(message, index + 21, 1));
                        token.put("DEVTYP(Utils.substring(message, index + 22, 1));
                        token.put("PGMTYPID(Utils.substring(message, index + 23, 1));
                        token.put("PMNTINITIATIONCHAN(Utils.substring(message, index + 24, 2));
                        token.put("MOBILETXNTYP(Utils.substring(message, index + 26, 1));
                        token.put("DATINFO(Utils.substring(message, index + 27, 6));
                        token.put("USERFLDACI(Utils.substring(message, index + 33, 3));
                    }
                    else if (tokenID.equals("F4")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("WALLETINDFLG(Utils.substring(message, index + 6, 2));
                        token.put("DGTLWALLETDATA(Utils.substring(message, index + 8, 12));
                    }
                    else if (tokenID.equals("SC")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("FRMTCDE(Utils.substring(message, index + 6, 2));
                        token.put("PANTKNDATA(Utils.substring(message, index + 8, 19));
                        token.put("TKNASSURANCELVL(Utils.substring(message, index + 27, 2));
                        token.put("TKNRQID(Utils.substring(message, index + 29, 11));
                        token.put("PANTKNIND(Utils.substring(message, index + 40, 1));
                        token.put("PANTKNEXPDAT(Utils.substring(message, index + 41, 4));
                        token.put("TKNTYP(Utils.substring(message, index + 45, 2));
                        token.put("TXNTYP(Utils.substring(message, index + 47, 1));
                        token.put("USERFLD1ACI(Utils.substring(message, index + 48, 1));
                        token.put("PANLASTFOURDGT(Utils.substring(message, index + 49, 4));
                        token.put("ACCTSTAT(Utils.substring(message, index + 53, 1));
                        token.put("ACTIND(Utils.substring(message, index + 54, 1));
                        token.put("RPLMTPANEXPDAT(Utils.substring(message, index + 55, 4));
                        token.put("TKNSTAT(Utils.substring(message, index + 59, 1));
                        token.put("USERFLDACI(Utils.substring(message, index + 60, 14));
                    }
                    else if (tokenID.equals("SH")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("FRMTCDE(Utils.substring(message, index + 6, 2));
                        token.put("LGTH(Utils.substring(message, index + 8, 3));
                        token.put("INFO(Utils.substring(message, index + 11, 255));
                    }
                    else if (tokenID.equals("CZ")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("ATC(Utils.substring(message, index + 6, 2));
                        token.put("FORMFACTRIND(Utils.substring(message, index + 8, 4));
                        token.put("ATCVALIDIND(Utils.substring(message, index + 12, 1));
                        token.put("CRDAUTHNIND(Utils.substring(message, index + 13, 1));
                        token.put("PMNTINITIATIONCHAN(Utils.substring(message, index + 14, 2));
                        token.put("CRDHLDRVRFYMTHDIDBYDEV(Utils.substring(message, index + 16, 2));
                        token.put("ADNLDATACDE(Utils.substring(message, index + 18, 2));
                    }
                    else if (tokenID.equals("04")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("ERRFLG(Utils.substring(message, index + 6, 1));
                        token.put("RTEGRP(Utils.substring(message, index + 7, 11));
                        token.put("CRDVRFYFLG(Utils.substring(message, index + 18, 1));
                        token.put("CITYEXT(Utils.substring(message, index + 19, 5));
                        token.put("COMPLETETRACK2DATA(Utils.substring(message, index + 24, 1));
                        token.put("UAFFLG(Utils.substring(message, index + 25, 1));
                    }
                    else if (tokenID.equals("03")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("ERRFLG(Utils.substring(message, index + 6, 1));
                        token.put("LOCLPINVRFYFLG(Utils.substring(message, index + 7, 1));
                        token.put("CRDVRFYFLG(Utils.substring(message, index + 8, 1));
                        token.put("COMPLETETRACK2DATA(Utils.substring(message, index + 9, 1));
                        token.put("UAFFLG(Utils.substring(message, index + 10, 1));
                        token.put("RCPTRQSTD(Utils.substring(message, index + 11, 1));
                    }
                    else if (tokenID.equals("B5")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("ISSAUTHDATALGTH(String.valueOf(Integer.parseInt(Utils.convertStringToHex(Utils.substring(message, index + 6, 2)),16)));
                        token.put("ARPC(Utils.convertStringToHex(Utils.substring(message, index + 8, 8)));
                        token.put("ADDLDATA(Utils.convertStringToHex(Utils.substring(message, index + 16, 8)));
                        token.put("SENDCRDBLK(Utils.substring(message, index + 24, 1));
                        token.put("SENDPUTDATA(Utils.substring(message, index + 25, 1));
                    }
                    else if (tokenID.equals("B7")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("RBA(Utils.convertStringToHex(Utils.substring(message, index + 6, 8)));
                        token.put("TLFNAM(Utils.substring(message, index + 14, 35));
                        token.put("TKNRETRVOPT(Utils.substring(message, index + 49, 1));
                        token.put("KEYDATA(Utils.substring(message, index + 50, 30));
                        token.put("FILEFRMT(Utils.hexToBin(Utils.convertStringToHex(Utils.substring(message, index + 80, 2))));
                        token.put("USERFLD1(Utils.substring(message, index + 82, 10));
                    }
                    else if (tokenID.equals("25")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("TRANFEE(new BigInteger(Utils.convertStringToHex(Utils.substring(message, index + 6, 8)),16).toString());
                        token.put("ORIGFEE(new BigInteger(Utils.convertStringToHex(Utils.substring(message, index + 14, 8)),16).toString());
                        token.put("TERMSURPROFILE(Utils.substring(message, index + 22, 4));
                        token.put("RVSLCDE(Utils.substring(message, index + 26, 1));
                        token.put("USERFLD1(String.valueOf(Integer.parseInt(Utils.convertStringToHex(Utils.substring(message, index + 27, 1)),16)));
                        token.put("FLATFEE(new BigInteger(Utils.convertStringToHex(Utils.substring(message, index + 28, 8)),16).toString());
                        token.put("PCNTFEE(String.valueOf(Integer.parseInt(Utils.convertStringToHex(Utils.substring(message, index + 36, 2)),16)));
                        token.put("MINMAX(Utils.substring(message, index + 38, 1));
                    }
                    else if (tokenID.equals("CI")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("ECOMMGOODSIND(Utils.substring(message, index + 6, 1));
                        token.put("EXISTINGDEBTIND(Utils.substring(message, index + 7, 1));
                        token.put("DEFERREDBILLINGIND(Utils.substring(message, index + 8, 1));
                        token.put("RELNPARTICIPANTIND(Utils.substring(message, index + 9, 1));
                        token.put("DPCNUM(Utils.substring(message, index + 10, 4));
                        token.put("PINPADID(Utils.substring(message, index + 14, 16));
                        token.put("ACQTERMID(Utils.substring(message, index + 30, 16));
                        token.put("RCNCLENT(Utils.substring(message, index + 46, 1));
                        token.put("ACQTERMPOSTDAT(Utils.substring(message, index + 47, 6));
                        token.put("PREAUTHCHRGBK(Utils.substring(message, index + 53, 1));
                        token.put("ENHANCEDPREAUTH(Utils.substring(message, index + 54, 1));
                        token.put("ADNLRESPCDE(Utils.substring(message, index + 55, 3));
                        token.put("MCELECACCPTIND(Utils.substring(message, index + 58, 1));
                        token.put("MRCHID(Utils.substring(message, index + 59, 8));
                        token.put("PGMIND(Utils.substring(message, index + 67, 1));
                        token.put("USERFLD1(Utils.substring(message, index + 68, 8));
                    }
                    else if (tokenID.equals("C1")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("STAID(Utils.substring(message, index + 6, 16));
                    }
                    else if (tokenID.equals("21")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("SRVIND(Utils.substring(message, index + 6, 1));
                        token.put("TRANID(Utils.substring(message, index + 7, 15));
                        token.put("VALIDCDE(Utils.substring(message, index + 22, 4));
                    }
                    else if (tokenID.equals("17")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("SRVIND(Utils.substring(message, index + 6, 1));
                        token.put("TRANID(Utils.substring(message, index + 7, 15));
                        token.put("VALIDCDE(Utils.substring(message, index + 22, 4));
                        token.put("MKTSPFCDATAID(Utils.substring(message, index + 26, 1));
                        token.put("DUR(Utils.substring(message, index + 27, 2));
                        token.put("PRSTGSPROPIND(Utils.substring(message, index + 29, 1));
                    }
                    else if (tokenID.equals("Q1")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("USERFIELD1STR(Utils.substring(message, index + 6, 2));
                        token.put("USERFIELD2STR(Utils.substring(message, index + 8, 2));
                        token.put("USERFIELD3STR(Utils.substring(message, index + 10, 2));
                        token.put("USERFIELD4STR(Utils.substring(message, index + 12, 15));
                        token.put("USERFIELD5STR(Utils.substring(message, index + 27, 25));
                        token.put("MERCHANTTRANID(Utils.substring(message, index + 52, 50));
                        token.put("UUID(Utils.substring(message, index + 102, 50));
                        token.put("REFERENCEUUID(Utils.substring(message, index + 152, 50));
                        token.put("IPVERSION(Utils.substring(message, index + 202, 1));
                        token.put("TRANSOURCEIPSTR(Utils.substring(message, index + 203, 39));
                    }
                    else if (tokenID.equals("S2")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("DCCPRFL(Utils.substring(message, index + 6, 16));
                        token.put("DCCSTAT(Utils.substring(message, index + 22, 1));
                        token.put("DCCSUBSTAT(Utils.substring(message, index + 23, 7));
                    }
                    else if (tokenID.equals("S3")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("ISSDESIGNATOR(Utils.substring(message, index + 6, 2));
                        token.put("BINCRNCYCDE(Utils.substring(message, index + 8, 3));
                        token.put("BINCRNCYDESCR(Utils.substring(message, index + 11, 20));
                        token.put("CNVRATENEUTRAL(Utils.substring(message, index + 31, 8));
                        token.put("CNVRATEEFFECTIVE(Utils.substring(message, index + 39, 8));
                        token.put("CNVRATESRC(Utils.substring(message, index + 47, 32));
                        token.put("CNVRATEDAT(Utils.substring(message, index + 79, 8));
                        token.put("SAVEDCRNCYCDE(Utils.substring(message, index + 87, 3));
                        token.put("PCNTMARKUP(Utils.hexToBin(Utils.convertStringToHex(Utils.substring(message, index + 90, 2))));
                        token.put("CONVERTEDAMT1(Utils.hexToBin(Utils.convertStringToHex(Utils.substring(message, index + 92, 8))));
                        token.put("CONVERTEDAMT2(Utils.hexToBin(Utils.convertStringToHex(Utils.substring(message, index + 100, 8))));
                        token.put("SAVEDAMT1(Utils.hexToBin(Utils.convertStringToHex(Utils.substring(message, index + 108, 8))));
                        token.put("SAVEDAMT2(Utils.hexToBin(Utils.convertStringToHex(Utils.substring(message, index + 116, 8))));
                        token.put("CONVERTEDACQSURCH(Utils.hexToBin(Utils.convertStringToHex(Utils.substring(message, index + 124, 8))));
                        token.put("CONVERTEDISSSURCH(Utils.hexToBin(Utils.convertStringToHex(Utils.substring(message, index + 132, 8))));
                        token.put("SAVEDACQSURCH(Utils.hexToBin(Utils.convertStringToHex(Utils.substring(message, index + 140, 8))));
                        token.put("USERFLDACI(Utils.substring(message, index + 148, 12));
                    }
                    else if (tokenID.equals("M1")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("TERMCAPTUREFLAG(Utils.substring(message, index + 6, 1));
                        token.put("USERFLDACI(Utils.substring(message, index + 7, 19));
                    }
                    else if (tokenID.equals("M2")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("TERMTYP(Utils.substring(message, index + 6, 2));
                        token.put("ADJPROC(Utils.substring(message, index + 8, 1));
                        token.put("USERFLDACI(Utils.substring(message, index + 9, 17));
                    }
                    else if (tokenID.equals("SO")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("PAR(Utils.substring(message, index + 6, 29));
                        token.put("USERFLDACI(Utils.substring(message, index + 35, 11));
                    }
                    else if (tokenID.equals("P9")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("MESSAGETYPE(Utils.substring(message, index + 6, 2));
                        token.put("CORRELATIONID(Utils.substring(message, index + 8, 14));
                        token.put("NUMACTIVETKNS(Utils.substring(message, index + 22, 2));
                        token.put("ISSUERPRODCONFIGID(Utils.substring(message, index + 24, 10));
                        token.put("CONSUMERLANG(Utils.substring(message, index + 34, 2));
                        token.put("DEVICENAME(Utils.substring(message, index + 36, 20));
                        token.put("FINALTKNDECISION(Utils.substring(message, index + 56, 1));
                        token.put("FINALTKNDECISIONIND(Utils.substring(message, index + 57, 1));
                        token.put("TERMSCONDID(Utils.substring(message, index + 58, 32));
                        token.put("TERMSCONDDATTIM(Utils.substring(message, index + 90, 10));
                        token.put("NUMACTATTEMPTS(Utils.substring(message, index + 100, 1));
                        token.put("TKNUNIQUEREF(Utils.substring(message, index + 101, 48));
                        token.put("PANUNIQUEREF(Utils.substring(message, index + 149, 48));
                        token.put("TOKENTYPE(Utils.substring(message, index + 197, 1));
                    }
                    else if (tokenID.equals("AG")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("TRKUSED(Utils.substring(message, index + 6, 1));
                        token.put("TERMLOCIND(Utils.substring(message, index + 7, 1));
                        token.put("LANGCDE(Utils.substring(message, index + 8, 3));
                        token.put("TERMENVMTIND(Utils.substring(message, index + 11, 1));
                        token.put("MOBACSSIND(Utils.substring(message, index + 12, 1));
                        token.put("USERFLD1(Utils.substring(message, index + 13, 13));
                    }
                    else if (tokenID.equals("16")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("ALTMERCHID(Utils.substring(message, index + 6, 15));
                        token.put("USERFLD1(Utils.substring(message, index + 21, 1));
                    }
                    else if (tokenID.equals("SI")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("FRMTCDE(Utils.substring(message, index + 6, 2));
                        token.put("LGTH(Utils.substring(message, index + 8, 3));
                        token.put("ACCTNUM(Utils.substring(message, index + 11, 20));
                        token.put("FIRSTNAME(Utils.substring(message, index + 31, 35));
                        token.put("MIDDLENAME(Utils.substring(message, index + 66, 1));
                        token.put("LASTNAM(Utils.substring(message, index + 67, 35));
                        token.put("STREETADDR(Utils.substring(message, index + 102, 50));
                        token.put("CITY(Utils.substring(message, index + 152, 25));
                        token.put("ST(Utils.substring(message, index + 177, 3));
                        token.put("CNTRY(Utils.substring(message, index + 180, 3));
                        token.put("POSTALCDE(Utils.substring(message, index + 183, 10));
                        token.put("PHNNUM(Utils.substring(message, index + 193, 20));
                        token.put("DOB(Utils.substring(message, index + 213, 8));
                        token.put("IDTYP(Utils.substring(message, index + 221, 2));
                        token.put("IDNUM(Utils.substring(message, index + 223, 25));
                        token.put("IDCNTRYCDE(Utils.substring(message, index + 248, 3));
                        token.put("IDEXPDAT(Utils.substring(message, index + 251, 8));
                        token.put("NATLCNTRYCDE(Utils.substring(message, index + 259, 3));
                        token.put("BIRTHCNTRYCDE(Utils.substring(message, index + 262, 3));
                        token.put("USERFLDMC(Utils.substring(message, index + 265, 1));
                    }
                    else if (tokenID.equals("SK")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("FRMTCDE(Utils.substring(message, index + 6, 2));
                        token.put("LGTH(Utils.substring(message, index + 8, 3));
                        token.put("UNIQUEREFNUM(Utils.substring(message, index + 11, 19));
                        token.put("FUNDSRC(Utils.substring(message, index + 30, 2));
                        token.put("PARTICIPANTID(Utils.substring(message, index + 32, 30));
                        token.put("ADDLMSG(Utils.substring(message, index + 62, 65));
                        token.put("TXNRSN(Utils.substring(message, index + 127, 2));
                        token.put("USERFLDMC(Utils.substring(message, index + 129, 17));
                    }
                    else if (tokenID.equals("S4")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("DATASETID(Utils.substring(message, index + 6, 2));
                        token.put("LGTH(Utils.hexToBin(Utils.convertStringToHex(Utils.substring(message, index + 8, 2))));
                        token.put("SUPPLDATA(Utils.substring(message, index + 10, 80));
                    }
                    else if (tokenID.equals("Q3")) {
                        token.put("TKN_LEN(tkn_length);
                        token.put("COUNTRY_CODE(Utils.substring(message, index + 6, 3));
                        token.put("USER_FIELD_CNTRY(Utils.substring(message, index + 9, 3));
                    }
                    else{
                        //če je kak token, ki ga še nismo definirali
                        LOGGER.info("Nasel sem token: :" + tokenID + ":, za katerega nimam definicije!!!");

                        //zapišemo njegovo dolžino
                        token.put("TKN_LEN(tkn_length);

                        try{
                            //v token se zapiše njegov data, če le ta ni predolg
                            token.put("DATA(Utils.substring(message, index + 6, tkn_length));
                        }
                        catch (Exception e){
                            LOGGER.info("Data predolg, da bi se zapisal.");
                        }
                    }
                    //index povečamo za dolžino tokena+6(zaradi klicaja in presledkov), da pridemo do naslednjega tokena
                    index+=tkn_length+6;

                    //to je zaradi nekih testnih primerov, kjer naj bi bil še en token na koncu, vendar je bil brez podatkov
                    if(tkn_length>0){
                        //tokens.add(tokenID + ": " + token);
                        tokens.put(tokenID, token.toString());
                    }

                }
                //v originalen LinkedHashMap zapišemo tokene
                data.setTokens(tokens);
                return data;
                //s producerjem pošljemo podakte v topic "DEV1_TLF_JSON" s ključem, ki je enak podatku "HEAD_DAT_TIM"
                //kafkaProducer.sendMessage(jsonObject, "DEV1_TLF_JSON", jsonObject.get("HEAD_DAT_TIM").toString());
            }
        }
        return data;
    }
}

