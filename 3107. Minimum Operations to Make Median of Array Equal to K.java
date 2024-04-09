class Solution {
    public long minOperationsToMakeMedianK(int[] a, int k) {
        Arrays.sort(a);
        int n = a.length;
        long answer = 0;
        for(int i = 0; i < n; i++) {
            if(i < n / 2) {
                answer += (long) Math.max(0, a[i] - k);
            } else if(i == n / 2) {
                answer += (long) Math.abs(k - a[i]);
            } else {
                answer += (long) Math.max(0, k - a[i]);
            }
        }
        return answer;
        /* 
        Arrays.sort(nums);
       int len = nums.length;
       int n = len / 2;
       int maxcount = 0;
       for(int i = 0; i <= n; i++)
       {
            while(nums[i] > k) {
                nums[i] -= 1;
                maxcount++;
            }
       }
       for(int i = n; i < nums.length; i++)
       {
            while(nums[i] < k) {
                nums[i] += 1;
                maxcount++;
            }
       }
       return maxcount;
       */
    }
}
