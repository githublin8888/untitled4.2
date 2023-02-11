package assignmentVersion2;

import java.util.HashMap;

public class MorseCode {

    private HashMap<String, String> codes;

    public MorseCode() {
        //   this.stringArray=stringArray;

        codes = new HashMap<>();
        String[] morseCode = {"*-", "-***", "-*-*", "-**", "*", "**-*", "--*", "****", "**", "*---", "-*-", "*-**", "--",
                "-*", "---", "*--*", "--*-", "*-*", "***", "-", "**-", "***-", "*--", "-**-", "-*--", "--**", "*----",
                "**---", "***--", "****-", "*****", "-****", "--***", "---**", "----*", "-----", "*-*-*-", "--**--", "**--**",};

        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "0", "P", "Q", "R", "S", "T", "U", "V", "W",
                "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", ",", "?"};

        for (int i = 0; i < morseCode.length; i++) {
            codes.put(morseCode[i], letters[i]);
            codes.put(letters[i], morseCode[i]);
        }
    }


    public String getCode(String text) {

        String textUp = text.toUpperCase();
        String[] stringArray = textUp.split(" ");
        String finalText = "";
        String outcome = "";
        for (int i = 0; i < stringArray.length; i++) {
            if (codes.get(stringArray[i])!=null) {
                outcome =codes.get(stringArray[i]);
            }else {
                outcome="invalid code";
            }
            finalText+=outcome+" ";
        }
        return finalText;


    }

}
