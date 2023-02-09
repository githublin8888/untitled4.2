package assignment1;

import java.util.Scanner;

public class MorsecodeTranslator {
    public static void main(String[] args) {
        System.out.println("Enter your message with '*', '-', separating letters by spaces: ");
        Scanner scan = new Scanner(System.in);


        CodeToEnglish co = new CodeToEnglish();
        String text ="";
        try{
             text = (scan.nextLine());
            String[] stringArray = text.split(" ");
            for (int i = 0; i < stringArray.length; i++) {
                System.out.print(co.getEnglish(stringArray[i]));
            }

            System.out.println(" ");

        }catch (NullPointerException e){
            System.out.println("Wrong code, please check.");
        }



       CodeToEnglish en = new CodeToEnglish();
        System.out.println("Enter your message with letters: ");
        String letter = (scan.nextLine());
        // CodeToEnglish en = new CodeToEnglish();
        String[] letterArray = letter.split(" ");
        for (int i = 0; i < letterArray.length; i++) {
            System.out.print(en.getCode(letterArray[i])+" ");
        }



    }
}
