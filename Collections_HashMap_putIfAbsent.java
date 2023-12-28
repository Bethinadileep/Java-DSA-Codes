//Code by: Dileep

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    HashMap<String,Integer> hash = new HashMap<>();
	    
	    hash.put("a",1000);
	    hash.put("b",2000);
	    hash.put("c",3000);
	    hash.put("e",5000);
	    
	    System.out.println("Printing Original Hash" + hash);
	    
	    hash.putIfAbsent("d",4000);
	    
	    System.out.println("Printing after adding something to hash: " + hash);
	}
}
