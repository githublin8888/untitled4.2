package array;

public class SumMedel {
    public static void main(String[] args) {
        int[] nrs = {-1, -2, 3, 4, 5, 6, 7, 8, 9, 10};
        double sum = 0;
        double med = 0;

        for (int i = 0; i < nrs.length; i++) {
            sum = sum + nrs[i];
        }
        med = sum / nrs.length;
        System.out.println(sum);
        System.out.println(med);
    }
}
