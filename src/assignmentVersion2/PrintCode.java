package assignmentVersion2;

import java.util.Scanner;


public class PrintCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MorseCode code = new MorseCode();
        System.out.println("Enter your message with letters or '*', '-', separating letters by spaces: ");

        String text = scan.nextLine();
        // text = (scan.nextLine());
        //String textUp = text.toUpperCase();

        //String textUp = (scan.nextLine()).toUpperCase();
        System.out.println(code.getCode(text));
      //  String[] stringArray = textUp.split(" ");
       /* String finalText = "";
        for (int i = 0; i < code.getText(textUp).length; i++) {
            finalText += code.getCode(code.getText(textUp)[i]) + " ";
        };
        System.out.println(finalText);*/

    }
}

/*

System.out.print(code.getCode(stringArray[i])+" ");

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


           modify2
            String textUp = (scan.nextLine()).toUpperCase();
        String[] stringArray = textUp.split(" ");
        String finalText="";
        for (int i = 0; i < stringArray.length; i++) {
            finalText+=code.getCode(stringArray[i])+" ";
                };
        System.out.println(finalText);
 */

