package Collections;
import java.util.*;

public class QPractice {
    public static void main(String args[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //retrival - peek//
        //removal - poll,remove//
        pq.offer(7);
        pq.offer(4);
        pq.offer(1);
        pq.add(2);
        pq.add(3);
        pq.add(5);

        System.out.println(pq);

        System.out.println(pq.peek());
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq);

        //verification//
        System.out.println(pq.contains(7));
        System.out.println(pq.contains(755));
        System.out.println(pq);
        for (Integer integer : pq) {
            System.out.println(integer);
        }
        while (!pq.isEmpty()) {
            System.out.print(pq.poll());
        }
    }
}








