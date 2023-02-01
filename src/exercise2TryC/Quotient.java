package exercise2TryC;

import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        boolean running=true;
        while (running){

        Scanner scan = new Scanner(System.in);
        double nr1 = 0;
        double nr2 = 0;
        double quotient = 0;

        boolean incorrect = true;
        while (incorrect)
        {
            try {
                System.out.println("Enter number 1: ");
                nr1 = Double.parseDouble(scan.nextLine());

                System.out.println("Enter number 2: ");
                nr2 = Double.parseDouble(scan.nextLine());
                quotient = nr1 / nr2;
                System.out.println(quotient);
            }
            catch (NumberFormatException e) {
                System.out.println("It must be a number.");

            } catch (ArithmeticException e) {
                System.out.println("The denominator can not be 0.");
            } catch (Exception e) {
                System.out.println("Something went wrong.");
            }
        }
        }







// boolean incorrect = true;
    }
}