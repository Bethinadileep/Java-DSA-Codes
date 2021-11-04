//code by: Dileep

package Queue_Data_Structure;
import java.util.*;
public class Implement_Queue {
    public static void main(String args[]){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);

        queue.remove();
        System.out.println(queue);
        System.out.println("Size of the Queue: "+queue.size());
        System.out.println("Queues Contains Element '30' are Not? "+queue.contains(300));

        //To Empty the Queue
        queue.clear();
        System.out.println(queue);
        System.out.println(queue.size());
    }
}
