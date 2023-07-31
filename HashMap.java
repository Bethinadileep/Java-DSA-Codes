package Arrays;

import java.util.*;

public class ArrayCopyreference {

	public static void main(String[] args) {
		HashMap<String, Integer> es = new HashMap<String, Integer>();
		es.put("Math",75);
		es.put("Sociology",85);
		es.put("Computer Programming", 100);
		
		es.forEach((Subject,Score) -> {
			es.replace(Subject, Score - 10);
		});
		
		System.out.println(es.toString());
		/*
		 * // es.forEach((Subject,Score) -> { // System.out.println(Subject + "-" +
		 * Score); // });
		 * 
		 * // es.putIfAbsent("Math",70); // es.replace("Math", 70); // //
		 * System.out.println(es.get("Math")); //
		 * System.out.println(es.getOrDefault("Bengali", -1)); //
		 * System.out.println(es.size()); // System.out.println(es.toString()); // //
		 * es.clear();
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * // // TODO Auto-generated method stub // int numbers[] = {1,2,3,4,5}; // //
		 * int startingIndex = 0; // //in Memory it is refering to same memory location
		 * // //int copyOfNumbers[] = numbers; // //instead of doing like this we can
		 * use another way // int copyOfNumber[] =
		 * Arrays.copyOf(numbers,numbers.length); // // Arrays.fill(numbers, 0); // //
		 * System.out.println(Arrays.toString(numbers)); //
		 * System.out.println(Arrays.toString(copyOfNumber));
		 	}
*/
}
