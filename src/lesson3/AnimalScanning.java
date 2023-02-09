package lesson3;

import java.util.Scanner;

public class AnimalScanning {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AnimalCollection2 collectio2=new AnimalCollection2();
        System.out.println("enter: ");
        System.out.println(collectio2.getAnimal2((scan.nextLine())));
    }
}
