package lesson3exercise;

import java.util.HashMap;

public class Address {
   // private String street;
    //private int postcode;

    private HashMap<String, String> informaiton;
    public Address(){
        informaiton=new HashMap<>();
        informaiton.put("Wille","Snövägen 2, 97633");
        informaiton.put("Saga","Stormvägen 3,97612");
        informaiton.put("Andy","Midsommar 3,97612");

    }

    public String getInformation(String key) {


      return informaiton.get(key);

    }
}
