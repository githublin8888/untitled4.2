package lesson3;

import java.util.Scanner;

public class Animals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AnimalCollection collection = new AnimalCollection();
        System.out.println("type in an animal or paw: ");
        String animal=(scan.nextLine());
        System.out.println(collection.getAnimal(animal));

    }
}
