package Collections;
import java.util.*;
public class LL {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<>();
        al.add("s1");
        al.add("s2");

        LinkedList<String> l1 = new LinkedList();
        l1.add("y1");
        l1.add("y2");
        l1.add("y3");
        l1.add(0,"y4");
        l1.add(null);
        l1.addAll(al);
        l1.remove(1);
        System.out.println(l1);

        System.out.println(l1.get(1));

        System.out.println(l1.contains("y2"));

        System.out.println(l1.set(2,"Keer"));
        System.out.println(l1);


    }
}
