package array;

import java.util.Arrays;
import java.util.Scanner;

public class ReversePrint {
    //77.Skapa ett program som läser in 10 heltal till en array och sedan skriver ut talen baklänges.

    public static void main(String[] args) {
        int[] nrs = new int[10];
        int[] newNrs=new int[10];

        System.out.println("enter 10 nrs: ");
        Scanner scan = new Scanner(System.in);

        for(int i=0;i<10;i++){
            int nr = Integer.parseInt(scan.nextLine());
            nrs[i]=nr;
        }
        for (int j = 0; j < nrs.length; j++) {
            newNrs[j] = nrs[nrs.length -1- j];
        }
        System.out.println(Arrays.toString(newNrs));


    }
}
