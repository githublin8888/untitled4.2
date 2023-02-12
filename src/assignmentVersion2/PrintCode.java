package assignmentVersion2;

import java.util.Scanner;


public class PrintCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MorseCode code = new MorseCode();


        System.out.println("Enter your message with letters or '*', '-', separating by space: ");
        String text =scan.nextLine();
        System.out.print(code.getCode(text));
    }
}

/*
try{
            text = scan.nextLine();
            System.out.println(code.getCode(text));
        } catch (NullPointerException e) {
            System.out.println("Error: The input text cannot be null.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Invalid character entered. Please only use letters, '*', and '-'.");
        } catch (Exception e) {
            if(!text.contains(" ")){
                System.out.println("Error: Please separate the code with spaces.");
            }

        }
 */