/*
You are given a 0-indexed array nums of size n consisting of positive integers.

You are also given a 2D array queries of size m where queries[i] = [indexi, ki].

Initially all elements of the array are unmarked.

You need to apply m queries on the array in order, where on the ith query you do the following:

Mark the element at index indexi if it is not already marked.
Then mark ki unmarked elements in the array with the smallest values. If multiple such elements exist, mark the ones with the smallest indices. And if less than ki unmarked elements exist, then mark all of them.
Return an array answer of size m where answer[i] is the sum of unmarked elements in the array after the ith query.

 

Example 1:

Input: nums = [1,2,2,1,2,3,1], queries = [[1,2],[3,3],[4,2]]

Output: [8,3,0]

Explanation:

We do the following queries on the array:

Mark the element at index 1, and 2 of the smallest unmarked elements with the smallest indices if they exist, the marked elements now are nums = [1,2,2,1,2,3,1]. The sum of unmarked elements is 2 + 2 + 3 + 1 = 8.
Mark the element at index 3, since it is already marked we skip it. Then we mark 3 of the smallest unmarked elements with the smallest indices, the marked elements now are nums = [1,2,2,1,2,3,1]. The sum of unmarked elements is 3.
Mark the element at index 4, since it is already marked we skip it. Then we mark 2 of the smallest unmarked elements with the smallest indices if they exist, the marked elements now are nums = [1,2,2,1,2,3,1]. The sum of unmarked elements is 0.
Example 2:

Input: nums = [1,4,2,3], queries = [[0,1]]

Output: [7]

Explanation: We do one query which is mark the element at index 0 and mark the smallest element among unmarked elements. The marked elements will be nums = [1,4,2,3], and the sum of unmarked elements is 4 + 3 = 7.

 
*/
class Solution {
    public long[] unmarkedSumArray(int[] nums, int[][] queries) {
        long totalSum = 0;
        for (int num : nums) {
            totalSum += (long) num;
        }

        int n = nums.length, m = queries.length;
        long[] res = new long[m];

        List<int[]> orderList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            orderList.add(new int[] { nums[i], i });
        }
        Collections.sort(orderList, (a, b) -> Integer.compare(a[0], b[0]));

        boolean[] marked = new boolean[n];
        int resIdx = 0;
        int orderListIdx = 0;

        for (int query[] : queries) {
            int idx = query[0], cntElements = query[1];
            if (!marked[idx]) {
                marked[idx] = true;
                totalSum -= nums[idx];
            }
            for (; orderListIdx < n && cntElements > 0; orderListIdx++) {
                int element = orderList.get(orderListIdx)[0], elementIdx = orderList.get(orderListIdx)[1];
                if (!marked[elementIdx]) {
                    cntElements -= 1;
                    marked[elementIdx] = true;
                    totalSum -= element;
                }
            }
            res[resIdx++] = totalSum;
        }
        return res;
    }

}
