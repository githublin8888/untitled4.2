package assignment1;

import java.util.HashMap;

public class Test {
    public String testEnglish(String code) {

        HashMap<String,String> toEnglish=new HashMap<String, String>();
        toEnglish.put("*-","A");
        toEnglish.put("-***","B");
        toEnglish.put("-*-*","C");
        toEnglish.put("-**","D");
        toEnglish.put("*","E");
        toEnglish.put("**-*","F");
        toEnglish.put("--*","G");
        toEnglish.put("****","H");
        toEnglish.put("**","I");
        toEnglish.put("*---","J");
        toEnglish.put("-*-","K");
        toEnglish.put("*-**","L");
        toEnglish.put("--","M");
        toEnglish.put("-*","N");
        toEnglish.put("---","0");
        toEnglish.put("*--*","P");
        toEnglish.put("--*-","Q");
        toEnglish.put("*-*","R");
        toEnglish.put("***","S");
        toEnglish.put("-","T");
        toEnglish.put("**-","U");
        toEnglish.put("***-","V");
        toEnglish.put("*--","W");
        toEnglish.put("-**-","X");
        toEnglish.put("-*--","Y");
        toEnglish.put("--**","Z");
        toEnglish.put("*----","1");
        toEnglish.put("**---","2");
        toEnglish.put("***--","3");
        toEnglish.put("****-","4");
        toEnglish.put("*****","5");
        toEnglish.put("-****","6");
        toEnglish.put("--***","7");
        toEnglish.put("---**","8");
        toEnglish.put("----*","9");
        toEnglish.put("-----","0");
        toEnglish.put("*-*-*-",".");
        toEnglish.put("--**--",",");
        toEnglish.put("**--**","?");

        String english=toEnglish.keySet().iterator().next();
        return english;
    }
}
