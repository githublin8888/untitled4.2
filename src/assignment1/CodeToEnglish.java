package assignment1;

import java.util.HashMap;

public class CodeToEnglish {
    public char getEnglish(String code) {

        HashMap<String,Character> toEnglish=new HashMap<String, Character>();
        toEnglish.put("*-",'A');
        toEnglish.put("-***",'B');
        toEnglish.put("-*-*",'C');
        toEnglish.put("-**",'D');
        toEnglish.put("*",'E');
        toEnglish.put("**-*",'F');
        toEnglish.put("--*",'G');
        toEnglish.put("****",'H');
        toEnglish.put("**",'I');
        toEnglish.put("*---",'J');
        toEnglish.put("-*-",'K');
        toEnglish.put("*-**",'L');
        toEnglish.put("--",'M');
        toEnglish.put("-*",'N');
        toEnglish.put("---",'0');
        toEnglish.put("*--*",'P');
        toEnglish.put("--*-",'Q');
        toEnglish.put("*-*",'R');
        toEnglish.put("***",'S');
        toEnglish.put("-",'T');
        toEnglish.put("**-",'U');
        toEnglish.put("***-",'V');
        toEnglish.put("*--",'W');
        toEnglish.put("-**-",'X');
        toEnglish.put("-*--",'Y');
        toEnglish.put("--**",'Z');
        toEnglish.put("*----",'1');
        toEnglish.put("**---",'2');
        toEnglish.put("***--",'3');
        toEnglish.put("****-",'4');
        toEnglish.put("*****",'5');
        toEnglish.put("-****",'6');
        toEnglish.put("--***",'7');
        toEnglish.put("---**",'8');
        toEnglish.put("----*",'9');
        toEnglish.put("-----",'0');
        toEnglish.put("*-*-*-",'.');
        toEnglish.put("--**--",',');
        toEnglish.put("**--**",'?');

        char english=toEnglish.get(code);
        return english;
    }

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
