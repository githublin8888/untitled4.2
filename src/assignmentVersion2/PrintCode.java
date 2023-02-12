package assignmentVersion2;

import java.util.Scanner;


public class PrintCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MorseCode code = new MorseCode();

        System.out.println("Enter your message with letters or '*', '-', separating by space: ");
        String text ="";
        try{
            text =scan.nextLine();
            if(text.matches("[a-zA-Z]+") && text.length()>1 && !text.contains(" ")){
                System.out.println("Error: Please separate the code with spaces.");
            }else System.out.print(code.getCode(text));
        }catch (Exception e){
        }
    }
}

