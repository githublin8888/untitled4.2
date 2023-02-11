package assignmentVersion2;

import java.util.Scanner;


public class PrintCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MorseCode code = new MorseCode();
        System.out.println("Enter your message with letters or '*', '-', separating letters by spaces: ");

        String text = "";
        text = (scan.nextLine());
        String textUp = text.toUpperCase();
        String[] stringArray = textUp.split(" ");
        for (int i = 0; i < stringArray.length; i++) {

            System.out.print(code.getCode(stringArray[i])+" ");

                };

    }
}

/*
 System.out.println("Invalid code: " + stringArray[i]);

  try{
                String co = code.getCode(stringArray[i]);
              if(co == null){
                    System.out.println("Invalid code");
                }
                else {
                    System.out.print(co + " ");
                }

            } catch (Exception e) {

                System.out.println("An error occurred: " + e.getMessage());
            }
 */

