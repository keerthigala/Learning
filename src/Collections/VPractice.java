package Collections;
import java.util.*;
public class VPractice {
    public static void main(String args[]) {
        Vector v1 = new Vector();
        v1.add("Keerthi");
        v1.add("Honey");
        v1.add(0, "Chinna");

        Vector v2 = new Vector();
        v2.add("charan");
        v2.add("Surya");

        System.out.println(v1);
        v1.addAll(v2);  //add//
        System.out.println(v1);

        System.out.println(v1.get(2));  //retrive//

        v1.set(1, "Keerthii");
        System.out.println(v1.get(1));  //update//
        System.out.println(v1);

        System.out.println(v1.containsAll(v2));  //Verification//

        v1.removeAll(v2);
        System.out.println(v1);  //deletion//
        System.out.println(v2.lastElement());



    }
}


