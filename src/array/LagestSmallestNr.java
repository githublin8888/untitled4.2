package array;

public class LagestSmallestNr {
    public static void main(String[] args) {
        int[] nrs = {-1, -2, 3, 4, 5, 6, 7, 8, 9, 10};
        int lagest = 0;
        int smallest = 0;
        for (int i = 0; i < nrs.length - 1; i++) {
            if (nrs[i + 1] > nrs[i]) {
                nrs[i] = nrs[i + 1];
                lagest = nrs[i];
            } else if (nrs[i + 1] < nrs[i]) {
                nrs[i] = nrs[i + 1];
                smallest = nrs[i];
            }
        }
        System.out.println(lagest);
        System.out.println(smallest);

    }

}
