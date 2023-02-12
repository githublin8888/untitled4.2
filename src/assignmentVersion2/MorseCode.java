package assignmentVersion2;

import java.util.HashMap;

public class MorseCode {

    private HashMap<String, String> codes;

    public MorseCode() {

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
        String value = "";
        for (int i = 0; i < stringArray.length; i++) {
            try {
                if (codes.get(stringArray[i]) != null) {
                    value = codes.get(stringArray[i]);
                } else {
                    value = "invalid code";
                }
                finalText += value + " ";
            } catch (IllegalArgumentException e) {
            }

        }
        return finalText;


    }

}
