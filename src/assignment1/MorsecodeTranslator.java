package assignment1;

import java.util.HashMap;
import java.util.Scanner;

public class MorsecodeTranslator {
    public static void main(String[] args) {
        System.out.println("Enter your message with '*', '-', separating letters by spaces: ");
        Scanner scan = new Scanner(System.in);
        String text = (scan.nextLine());

        MorseCode co = new MorseCode();
        String[] stringArray = text.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(co.getEnglish(stringArray[i]));
        }


    }
}
