package exercise2TryC;

import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        boolean running = true;
        while (running) {

            Scanner scan = new Scanner(System.in);
            double nr1 = 0;
            double nr2 = 0;
            double quotient = 0;

            boolean incorrect = true;
            while (incorrect) {

                boolean incorrect1=true;
                while (incorrect1){
                    try {
                        System.out.println("Enter number 1: ");
                        nr1 = Double.parseDouble(scan.nextLine());
                        incorrect1=false;
                    } catch (NumberFormatException e) {
                        System.out.println("It must be a number.");
                    }
                }

                boolean incorrect2=true;
                while (incorrect2){
                    try {
                        System.out.println("Enter number 2: ");
                        nr2 = Double.parseDouble(scan.nextLine());
                        incorrect2=false;
                    } catch (NumberFormatException e) {
                        System.out.println("It must be a number.");
                    }
                }

                quotient = nr1 / nr2;
                System.out.println(quotient);
                running = false;
                incorrect = false;


            }
        }
    }
}
/*catch (ArithmeticException e) {
                    System.out.println("The denominator can not be 0.");
                } catch (Exception e) {
                    System.out.println("Something went wrong.");
                }*/