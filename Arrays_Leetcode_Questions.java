//codeby : Dileep

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i]+nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        while(s <= e) {
            int m = s + (e - s) / 2;
            if(nums[m] > target) e = m - 1;
            else if(nums[m] < target) s = m + 1;
            else return m;
        }
        return s;
    }
}
