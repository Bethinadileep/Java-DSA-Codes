import java.util.*;

public class Demo {
	public static void main(String args[]) {
		Vector<String> v = new Vector<String>();
		v.add("Java");
		v.add("C#");
		v.add("SQl");
		
		Iterator it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
