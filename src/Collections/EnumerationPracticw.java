package Collections;
import java.util.*;

public class EnumerationPracticw {
    public static void main(String args[]) {
        //Enumeration - Interface//
        //Introduction for iterating the legacy collection objects//
        //Legacy classes - v1.0// - HashTable,Stack,Vector,Dictionary and Properties
        //New classe - v1.2//
        Vector<String> v = new Vector<>();
        v.add("Mango");
        v.add("Grapes");
        v.add("Apple");
        v.add("Banana");
        Enumeration<String> e = v.elements();

        while(e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }


}

