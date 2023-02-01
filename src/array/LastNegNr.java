package array;

public class LastNegNr {
    //72.En array med 50 inlästa tal finns. Bestäm och skriv ut index för det sista negativa talet i
    //arrayn. (Tips: Börja bakifrån i arrayn).

    public static void main(String[] args) {
        int[] nrs = {-1, -2, 3, 4, 5, 6, 7, 8, -9, 10};


        for (int i = nrs.length - 1; i >= 0; i--) {
            if (nrs[i] < 0){
                System.out.println(nrs[i]);
                break;
        }


    }
}}

