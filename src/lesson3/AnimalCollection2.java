package lesson3;

import java.util.HashMap;
import java.util.Scanner;

public class AnimalCollection2 {
    private HashMap<String, String> animals;

    public AnimalCollection2() {
        animals = new HashMap<>();
            Scanner scan = new Scanner(System.in);

            String animal = "";
           String paw = "";

           // while (!(scan.nextLine()). equals("exit")) {

               // animal = (scan.nextLine());
               // paw = (scan.nextLine());
                animals.put(animal,paw);
                animals.put(paw, animal);
            //}
    }

        public String getAnimal2 (String key){

            return animals.get(key);
        }
    }

