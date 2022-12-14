package si.bankart.tlfData.TLF2JSON.Utilities;

public class Utils {
    public static String substring(String input, int from, int numOfChars){
        return input.substring(from, from+numOfChars);
    }
    public static String convertStringToHex(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            String charToHex = Integer.toHexString(c);
            stringBuilder.append(charToHex);
        }
        // System.out.println("Converted Hex from String: "+stringBuilder.toString());
        return stringBuilder.toString();
    }
    public static String hexToBin(String hex){
        hex = hex.toUpperCase();
        hex = hex.replaceAll("0", "0000");
        hex = hex.replaceAll("1", "0001");
        hex = hex.replaceAll("2", "0010");
        hex = hex.replaceAll("3", "0011");
        hex = hex.replaceAll("4", "0100");
        hex = hex.replaceAll("5", "0101");
        hex = hex.replaceAll("6", "0110");
        hex = hex.replaceAll("7", "0111");
        hex = hex.replaceAll("8", "1000");
        hex = hex.replaceAll("9", "1001");
        hex = hex.replaceAll("A", "1010");
        hex = hex.replaceAll("B", "1011");
        hex = hex.replaceAll("C", "1100");
        hex = hex.replaceAll("D", "1101");
        hex = hex.replaceAll("E", "1110");
        hex = hex.replaceAll("F", "1111");
        return hex;
    }
}

