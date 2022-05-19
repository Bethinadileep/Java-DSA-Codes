package Binary_Search;

public class Maximum_Element {
	public static int findMaximum(int arr[],int l,int h) {
		//Base Case
		if(l == h) {
			return arr[l];
		}
		//if only two elements are present first is greater than the second element
		if((h == l + 1) && arr[l] >= arr[h]) {
			return arr[l];
		}
		//if only two elements are present second elements is greater than the first element
		if((h == l + 1) && arr[h] >= arr[l]) {
			return arr[h];
		}
		int mid = (l + h) / 2;
		//if arr[mid] is greater than previous and next elements
		if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
			return arr[mid];
		}
		
		
		if(arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1]) {
			return findMaximum(arr, l,mid-1);
		}
		else {
			return findMaximum(arr, mid + 1, l);
		}
			
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 3, 50, 10, 9, 7, 6};
        int n = arr.length;
        System.out.println("The maximum element is "+ 
        findMaximum(arr, 0, n-1));
	}

}
