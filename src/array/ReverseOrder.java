package array;

import java.util.Arrays;

public class ReverseOrder {

    //76.En array med 10 inlästa tal finns. Lägg över dessa tal i en annan array så att talen
    //kommer i omvänd ordning.

    public static void main(String[] args) {
        int[] nrs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] newNrs = new int[10];
        for (int i = 0; i < nrs.length; i++) {
            newNrs[i] = nrs[nrs.length -1- i];
        }
        System.out.println(Arrays.toString(newNrs));

    }
}
