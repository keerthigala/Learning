package Collections;
import java.util.*;


public class MPractice {
    public static void main(String args[]) {
        Map<Integer, String> m= new Hashtable<>();  //Creation of a map//

        //Addition of elements in to the map//
        m.put(1,"Keerthi");
        m.put(2,"Chinna");
        m.put(3,"Honey");

        //Retrival of keys from the map//
        Set<Integer> keys = m.keySet();
        for (Integer key : keys) {
            System.out.println(key);
        }
        Collection<String> values = m.values();
        for (String value : values) {
            System.out.println(value);
        }

        System.out.println(m.get(1));

        for (Integer key : keys)
            System.out.println(key + "=" +m.get(key));

        //remove//
         m.remove(1);
         System.out.println(m);

         //verification//
         System.out.println(m.containsKey(2));
         System.out.println(m.containsValue("Chinnaa"));

         //updation//
         m.put(1,"Keerthii");
         System.out.println(m);

        System.out.println(m.size());   //size//

        m.clear();    //clear//
        System.out.println(m);

        {

        }

        }

        }



