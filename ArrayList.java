import java.util.*;

public class Demo {
	public static void main(String args[]) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("Java");
		l.add("C#");
		l.add("SQl");
		
		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
