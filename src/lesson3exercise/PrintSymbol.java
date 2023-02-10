package lesson3exercise;

import assignmentVersion2.MorseCode;

import java.util.HashMap;
import java.util.Scanner;

public class PrintSymbol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Symbol text = new Symbol();

        String message = scan.nextLine();
        char c = 0;
        for (int i = 0; i < message.length(); i++) {
            c = message.charAt(i);
            System.out.print(text.getSymbol(c));
        }


    }
}
