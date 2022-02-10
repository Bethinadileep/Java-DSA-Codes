import java.util.*;

public class Swap_two_index {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int len = arr.length;
		for(int i=0;i<6;i+=2) {
			if(i+1 < 6) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		for(int i=0;i<6;i++) {
			System.out.print(arr[i] + " ");
		}
 
	}

}
