package Collections;
import java.util.*;
public class AL {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1, 3, 5, 7, 9};
        ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(arr));
        al1.add(6);
        al1.add(8);
        System.out.println(al1);
        System.out.println(al1.size());  //add//

        System.out.println(al1.get(2));  //retrive//

        System.out.println(al1.remove(3));  //delete//
        System.out.println(al1);

        al1.set(3,4);
        System.out.println(al1);  //update//

        System.out.println(al1.contains(5));  //Verification//

        for (Integer Integer:al1) {
            System.out.print(Integer + " ");  //for each loop//
        }
        Collections.synchronizedList(al1); 

        }

    }

