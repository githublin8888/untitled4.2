package assignmentVersion2;

import java.util.Scanner;


public class PrintCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MorseCode code = new MorseCode();

        System.out.println("Enter your message with letters or '*', '-', separating by space: ");
        String text ="";
        try{
             text = scan.nextLine();
            System.out.println(code.getCode(text));
        }catch (Exception e){
            if(!text.contains(" ")){
                System.out.println("Please separate with space");
            }
        }



    }
}

