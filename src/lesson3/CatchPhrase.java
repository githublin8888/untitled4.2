package lesson3;

import java.util.Scanner;

public class CatchPhrase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NameCollection name=new NameCollection();
        System.out.println("write a name: ");
        System.out.println(name.getPhrase(scan.nextLine()));
    }
}
