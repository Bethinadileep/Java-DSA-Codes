import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[] = {1,2,3,4,5,6};
	    int n = arr.length;
	    int newArray[] = new int[n+1];
	    for(int i = 0; i < n; i++) {
	        newArray[i] = arr[i];
	    }
	    newArray[n] = 17;
	    for(int j = 0; j < n+1; j++) {
	        System.out.print(newArray[j] + " ");
	    }
	    
	}
}
