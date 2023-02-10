package assignment1;

import java.util.HashMap;

public class EnglishToCode {
    public String getCode(String c) {
        HashMap<String,String> toCode = new HashMap<String,String>();

        toCode.put("A","*-");
        toCode.put("B","-***");
        toCode.put("C","-*-*");
        toCode.put("D","-**");
        toCode.put("E","*");
        toCode.put("F","**-*");
        toCode.put("G","--*");
        toCode.put("H","****");
        toCode.put("I","**");
        toCode.put("J","*---");
        toCode.put("K","-*-");
        toCode.put("L","*-**");
        toCode.put("M","--");
        toCode.put("N","-*");
        toCode.put("0","---");
        toCode.put("P","*--*");
        toCode.put("Q","--*-");
        toCode.put("R","*-*");
        toCode.put("S","***");
        toCode.put("T","-");
        toCode.put("U","**-");
        toCode.put("V","***-");
        toCode.put("W","*--");
        toCode.put("X","-**-");
        toCode.put("Y","-*--");
        toCode.put("Z","--**");
        toCode.put("1","*----");
        toCode.put("2","**---");
        toCode.put("3","***--");
        toCode.put("4","****-");
        toCode.put("5","*****");
        toCode.put("6","-****");
        toCode.put("7","--***");
        toCode.put("8","---**");
        toCode.put("9","----*");
        toCode.put("0","-----");
        toCode.put(".","*-*-*-");
        toCode.put(",","--**--");
        toCode.put("?","**--**");

        String morse=toCode.get(c);
        return morse;
    }


}
