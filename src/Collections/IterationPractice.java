package Collections;
import java.util.*;

public class IterationPractice {
    public static void main(String args[]) {
        //iterator - interface//
        //Introduced for iterating the all collection objects//
        //legacy classes - v1.0 + New classes - v1.2//
        //one direction,read only with special permissions for removing the element//

        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(5);
        al.add(8);
        Iterator<Integer> i = al.iterator();
        //i.hasNext()//
        //i.next//

        while (i.hasNext())
            i.next();
            i.remove();
            System.out.print(al);

    }
}
