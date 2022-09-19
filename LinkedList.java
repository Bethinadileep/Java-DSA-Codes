import java.util.*;

public class Demo {
	public static void main(String args[]) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("Java");
		l.add("C#");
		l.add("SQL");
		
		Iterator<String> it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
