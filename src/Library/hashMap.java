package Library;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hs=new HashMap<>();
          hs.put(101,"English");
          hs.put(102,"Maths");
          hs.put(103,"Science");
          hs.put(100,"Biology");
        System.out.println(hs);

        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(101,"Maths");
        tm.put(102,"English");
        tm.put(103,"Science");
        tm.put(100,"Biology");
        System.out.println(tm);

        LinkedHashMap<Integer,String>lm=new LinkedHashMap<>();
        lm.put(45,"Abc");
        lm.put(43,"Def");
        System.out.println(lm);

    }

}
