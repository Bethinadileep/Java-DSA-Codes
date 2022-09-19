import java.util.*;

public class Demo {
	public static void main(String args[]) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Java");
		queue.add("C#");
		queue.add("SQL");
		
		Iterator it = queue.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
