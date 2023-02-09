package lesson3;

import java.util.HashMap;

public class AnimalCollection {

    private HashMap<String, String> animals;

    public AnimalCollection() {
        animals = new HashMap<>();
        String[] animal={"häst","hund","gris"};
        String[] paw={"hästPaw","hundPaw","grisPaw"};
        for(int i=0;i< animal.length;i++){
            animals.put(animal[i],paw[i]);
            animals.put(paw[i],animal[i]);
        }
    }

    public String getAnimal(String key) {

        return animals.get(key);
    }
}
