//codeby : Dileep
package Sorting_Techniques;

public class Selection_Sort {
    public static void printArray(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String args[]){
        //One Iteration one Swap
        int arr[] = {7,8,3,1,2};

        //Time Complexity = O(n^2)
        //Selection sort
        for(int i=0;i<arr.length-1;i++) {
            int smallest = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        printArray(arr);
    }
}

