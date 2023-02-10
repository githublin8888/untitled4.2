package lesson3exercise;

import java.util.Scanner;

public class PrintAddress {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Address people = new Address();
        System.out.println("enter a name: ");
        String text = (scan.nextLine());
        System.out.println(people.getInformation(text));
    }
}
