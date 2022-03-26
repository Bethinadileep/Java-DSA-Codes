import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[] = {4, 7, 1, 2, 5, 6};
	    int len = arr.length;
	    Arrays.sort(arr);
	    if(len % 2 == 0) {
	        
	        int ind1 = (len / 2);
	        int ind2 = (len / 2) - 1;
	        
	        System.out.print((double)(arr[ind1] + arr[ind2]) / 2);
	    }
	    else{
	        System.out.println(arr[len/2]);
	    }
	}
}
