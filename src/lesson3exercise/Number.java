package lesson3exercise;

import java.util.ArrayList;

public class Number {
    private int startNumber;
    ArrayList<Integer> numbers;
    public Number(int nr){
        startNumber=nr;
        numbers = new ArrayList<>();
    }

    public int getNr(int number){
        return numbers.get(number);
    }
}
