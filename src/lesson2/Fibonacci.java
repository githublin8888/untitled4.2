package lesson2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Write the order of fibonacci you want:");
        Scanner scan = new Scanner(System.in);

        int number = 0;

        try {
            number = Integer.parseInt(scan.nextLine());

        } catch (Exception e) {
            System.out.println("Fångade fel vid konvertering av text till tal");
        }

       int[] fibonacci = new int[40];
        fibonacci[0]=1;
        fibonacci[1]=1;

        for(int i=2;i<40;i++){
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];

        }
        
        try {
            System.out.println("This corresponds to: ");
            System.out.println(fibonacci[number-1]);

        } catch (Exception e) {
            System.out.println("problem med array index");
        }




    }
}
