package array;

import java.util.Arrays;
import java.util.Scanner;

public class ToPosFraction {
    public static void main(String[] args) {
        int[] fraction = new int[2];
        System.out.println("enter a fraction: ");
        Scanner scan = new Scanner(System.in);
        int nr1 = Integer.parseInt(scan.nextLine());
        int nr2 = Integer.parseInt(scan.nextLine());
        if(nr2<0){
           nr2=-nr2;
        }
        System.out.println(nr1+"/"+nr2);


    }
}
