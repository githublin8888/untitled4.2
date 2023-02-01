package exercise1;

import java.util.Scanner;

public class Methods {
    public static boolean getTrue() {
        return true;
    }

    public static boolean compareZero(int number) {
        if (number > 0) {
            return true;
        } else
            return false;
    }

    public static boolean evenOrNot(int number) {
        if (number % 2 == 0) {
            return true;
        } else
            return false;
    }

    public static boolean tenCharacters(String text) {

        if (text.replace(" ", "").length() > 10) {
            return true;
        } else return false;
    }

    public static char getaChar() {
        return 'a';
    }

    public static char getChar(int nr) {
        char c = 0;
        if (nr == 1) {
            c = 'a';
        } else if (nr == 2) {
            c = 'b';
        } else if (nr == 3) {
            c = 'c';

        }
        return c;

    }

    public static char firstChar(String text) {
        return text.charAt(0);
    }

    public static char whichChar(String text, int number) {
        text = text.replace(" ", "");
        return text.charAt(number - 1);
    }

    public void allChar(String text) {
        text = text.replaceAll("\\s+", "");

        char letter = 0;
        for (int i = 0; i < text.length(); i++) {

            letter = text.charAt(i);
            System.out.println(letter);
        }

    }

}
