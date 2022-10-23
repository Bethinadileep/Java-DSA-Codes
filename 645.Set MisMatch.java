//Code by: Bethina Dileep
class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[] = new int[2];
        Arrays.sort(nums);
        int n = 1;
        for(int i = 0; i < nums.length-1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    arr[0] = nums[i];
                }
            }
            
        }
        for(int i = 1; i < nums.length; i++) {
            if(nums[i-1] == n){
                n += 1;
            }
            else{
                arr[1] = n;
            }
        }
        return arr;
    }
}

//Approach 1: Brute Force 
class Solution {
    public int[] findErrorNums(int[] nums) {
       int dup = -1, missing = -1;
        for(int i = 1; i <= nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] == i){
                    count++;
                }
            }
            if(count == 2){
                dup = i;
            }
            else if(count == 0)
            {
                missing = i;
            }
        }
        return new int[] {dup,missing};
    }
}
