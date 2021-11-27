//codeby : Bethina Dileep
import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //Maximum Priority queue
    	pq.add(3); //priority queue O(logn)
    	pq.add(2);
    	while(!pq.isEmpty()){
    		System.out.println(pq.remove());
    	}
    	
    	PriorityQueue<Integer> pq = new PriorityQueue<>(); //Minimum Priority queue
    	pq.add(3); //priority queue O(logn)
    	pq.add(2);
    	while(!pq.isEmpty()){
    		System.out.println(pq.remove());
    	}
    }
}
