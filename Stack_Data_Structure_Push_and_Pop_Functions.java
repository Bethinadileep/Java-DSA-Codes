//Code by: Bethina Dileep
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    //implementing push and pop functions in Array
	    Scanner s = new Scanner(System.in);
	    System.out.println("Please Enter the Length of stack");
	    int len = s.nextInt();
	    System.out.println("Please Enter the Elements into the stack");
		int arr[] = new int[len];
		int n = arr.length;
		int top = -1;
		for(int i = 0; i < n; i++) {
		    if(i < n){
		        //Push Functions;
		        arr[i] = s.nextInt();
		        top = i;
		    }
		    else{
		        System.out.println("Array is Full");
		    }
		}
		System.out.println("You want to delete Element from the array");
		
		while(true){
		    int e = s.nextInt();
		    if(e==1){
    		    if(top != -1){
        		    System.out.print("Top Element is Poped from the stack: "+arr[top]);
        		    arr[top] = -1;
        		    top--;
    		    }
    		    else{
    		        System.out.println("Program Ended");
    		        break;
    		    }
		    }
		}
	}
}
