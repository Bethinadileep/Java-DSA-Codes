//codeby : Dileep

import java.util.*;
public class Linear_Search {
	String LinearSearch(int item,int[] array) {
		//Time Complexity -> O(n)
		for(int i=0;i<array.length;i++) {
			if(array[i]==item) {
				return "Found";
			}
		}
		return "Not Found";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linear_Search obj1 = new Linear_Search();
		Scanner obj = new Scanner(System.in);
		System.out.println("please Enter the Size of Array");
		int size = obj.nextInt();
		int[] arr = new int[size];
		System.out.println("Please Enter the Array ELements");
		for(int i=0;i<size;i++) {
			arr[i] = obj.nextInt();
		}
		System.out.println("Please Enter the Element to be search");
		int key = obj.nextInt();
		
		System.out.println(obj1.LinearSearch(key,arr));

	}

}
