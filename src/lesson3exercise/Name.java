package lesson3exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        String name = "";

        while (!name.equals("stop")) {
            name = scan.nextLine();
            if (!name.equals("stop")) {
                names.add(name);
            }
        }
        System.out.println(names);

        String newname = "";
        newname = scan.nextLine();

        names.set(0, newname);
        System.out.println(names);

        String first = names.get(0);
        String last = names.get(names.size() - 1);
        names.set(0, last);
        names.set(names.size() - 1, first);
        System.out.println(names);

        /*String name = "";

        while (!name.equals("stop")) {
            names.add(name);
            name = scan.nextLine();

        }
        names.remove(0);
        System.out.println(names);

        */


    }

}
