import java.util.*;

public class Demo {
	public static void main(String args[]) {
		Stack<String> stk = new Stack<String>();
		
		stk.push("Java");
		stk.push("C#");
		stk.push("SQL");
		
		Iterator it = stk.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
