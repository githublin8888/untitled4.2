package lesson2;

import java.util.Scanner;

public class SwitchMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        switch (number){
            case 1:
                System.out.println("Homer");
                break;
            case 2:
                System.out.println("Marge");
                break;
            case 3:
                System.out.println("Bart");
                break;
            default:
                System.out.println("please choose a correct carachter");
    }

    }
}
