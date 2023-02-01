package array;

public class PositiveNr {

    //70.En array med 50 inlästa tal finns. Ta reda på och skriv ut hur många tal som är positiva.
    // if (nrs[i]>0){
    //                System.out.println(nrs[i] +" is positive.");
    //                count++;
    //            }

    //71.En array med 50 inlästa tal finns. Ta reda på och skriv ut hur många tal som är större än
    //det första talet.
    public static void main(String[] args) {
        int[] nrs={-1,-2,3,4,5,6,7,8,9,10};
        int count=0;
        for(int i=0;i<nrs.length;i++){
           if(nrs[i]>nrs[0]){
               count++;
           }
        }
        System.out.println(count+" numbers are bigger than the first number.");
    }




}
