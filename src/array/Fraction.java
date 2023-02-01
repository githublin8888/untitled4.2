package array;

import java.util.Arrays;
import java.util.Scanner;

public class Fraction {
    //78.Skapa ett program som läser in siffrorna i ett bråk (täljare och nämnare) till en array med
    //två platser.
    //Eftersom det är otillåtet att ha 0 i nämnaren ska ett felmeddelande skrivas ut
    //om så är fallet
    public static void main(String[] args) {
        int[] fraction = new int[2];
        System.out.println("enter a fraction: ");
        Scanner scan = new Scanner(System.in);
        int nr1 = Integer.parseInt(scan.nextLine());
        int nr2 = Integer.parseInt(scan.nextLine());
        if(nr2==0){
            System.out.println("The denominator can not be 0.");
        }
        else {
            fraction[0]=nr1;
            fraction[1]=nr2;
            System.out.println(nr1+"/"+nr2);

        }
    }
}
