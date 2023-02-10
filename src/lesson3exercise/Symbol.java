package lesson3exercise;

import java.util.HashMap;

public class Symbol {
    private HashMap<Character, Character> symbol;

    public Symbol(){
        symbol=new HashMap<>();
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String symbols = "!?+#¤%&/()=@£${[]}^¨~<>|;:";
        for(int i=0;i<alfabet.length();i++){
            symbol.put(alfabet.charAt(i),symbols.charAt(i));
            symbol.put(symbols.charAt(i),alfabet.charAt(i));
        }

    }

    public char getSymbol(char key) {
        return symbol.get(key);
    }
}
