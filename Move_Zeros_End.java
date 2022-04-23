import java.util.*;

public class Move_Zeros_toEnd {

	public static void main(String[] args) {
		int arr[] = {0,-1,2,34,5,6,4,-1,6,0,45,0};
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				list.add(arr[i]);
			}
			if(arr[i] == 0) {
				count++;
			}
		}
		while(count!=0) {
			list.add(0);
			count--;
		}
		System.out.println(list);
		

	}

}
import java.util.*;

public class Move_Zeros_toEnd {

	public static void main(String[] args) {
		int arr[] = {0,-1,2,34,5,6,4,-1,6,0,45,0};
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				list.add(arr[i]);
			}
			if(arr[i] == 0) {
				count++;
			}
		}
		while(count!=0) {
			list.add(0);
			count--;
		}
		System.out.println(list);
		

	}

}

//Optimized Approach
