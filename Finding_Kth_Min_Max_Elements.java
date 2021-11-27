//codeby : BETHINA DILEEP
import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        int[] arr = {2,5,3,1,7};
        KLargestNum(arr,2);
        KSmallestNum(arr,2);
        
    }
    //we use min priority queue to find klargest elements in array -> t(O)->O(NLogK)
    public static void KLargestNum(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(arr[i]>pq.peek()){
                pq.remove();
                pq.add(arr[i]);
            }
        }
        while(!pq.isEmpty()){
            System.out.print(pq.remove()+" ");
        }
        
    }
    //we use max priority queue to find klargest elements in array -> t(O)->O(NLogK)
    public static void KSmallestNum(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(arr[i]<pq.peek()){
                pq.remove();
                pq.add(arr[i]);
            }
        }
        while(!pq.isEmpty()){
            System.out.print(pq.remove()+" ");
        }
        
    }
    
    
}
    
