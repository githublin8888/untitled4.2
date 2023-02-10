package lesson3;

import java.util.HashMap;

public class NameCollection {
    private HashMap<String, String> names;

    public NameCollection(){
        names=new HashMap<>();
        //String name="";
       // String phrase="";
        String[] manyNames={"Homer","Marge","Bart","Lisa","Maggie","Ned","Burns"};
        String[] manyphrases={"Mmm~mmmmm","¡Ay, caramba!","If anyone wants me, I'll be in my room.","Pacifier Suck","Hi-Diddily-Ho!","Excellent!","Ha!"};

        for(int i=0;i<manyNames.length;i++){
            names.put(manyNames[i],manyphrases[i]);
        }

    }

    public String getPhrase(String key){
        return names.get(key);
    }
}
