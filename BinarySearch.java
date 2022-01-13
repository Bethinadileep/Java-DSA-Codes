//codeby : Dileep

import java.util.*;
public class Binary_Search {
  //Iterative Method
	int binarySearch(int[] arr,int element,int low,int high) {
		while(low<=high) {
			int mid = low + (high - low)/2;
			if(arr[mid]==element) {
				return mid;
			}
			else if(arr[mid]<element) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
			
		}
		return -1;
	}
  
  //Recursive Method
  int BinarySearch_Recursive(int[] arr,int element,int low,int high) {
		while(low<=high) {
			int mid = low + (high - low)/2;
			if(arr[mid]==element) {
				return mid;
			}
			else if(arr[mid]<element) {
				return BinarySearch_Recursive(arr,element,mid+1,high);
			}
			else {
				return BinarySearch_Recursive(arr,element,low,mid-1);
				
			}
			
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_Search obj = new Binary_Search();
		int arr[] = {1955,3444,5666,7554,8997,9999};
		int n = arr.length;
		int element = 9999;
		int low = 0;
		int high = n-1;
		int result = obj.binarySearch(arr,element,low,high);
		int RecursiveResult = obj.BinarySearch_Recursive(arr, element, low, high);
		
		if(RecursiveResult == -1) {
			System.out.println("Element is Not Found");
		}
		else {
			System.out.println("Element is Found at index: " + RecursiveResult);
		}
    
		if(result == -1) {
			System.out.println("Element is Not Found");
		}
		else {
			System.out.println("Element is Found at index: " + result);
		}
	}

}
