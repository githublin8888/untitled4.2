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
        String finalText = "";
        String value = "";
        String textUp = text.toUpperCase();

        if (text.length() > 1 && !text.contains(" ")) {
            if (codes.get(text) != null) {
                finalText = codes.get(text);
            } else {
                String[] stringArray1 = textUp.split("");
                for (int i = 0; i < stringArray1.length; i++) {

                    if (codes.get(stringArray1[i]) != null) {
                        finalText = "Please separate with space.";
                    } else if (codes.get(stringArray1[i]) == null) {
                        finalText = "It contains illegal character.";
                        break;
                    } else finalText = "invalid code";
                }
            }

        } else {
            if (textUp.length() == 1 && codes.get(textUp) != null) {
                finalText = codes.get(text);
            } else {
                String[] stringArray = textUp.split(" ");
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
            }

        }

        return finalText;

    }
}

