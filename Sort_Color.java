/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]


*/
//Sorting -> sort -> O(nlogn)

//Brute Force 0(N^2)

import java.util.*;
class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i] < nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        
        
    }
}



//Optimized Approach O(N)
//Counting Sort

import java.util.*;
class Solution {
    public void sortColors(int[] nums) {
       int len = nums.length;
       int zero, one , two;
        zero = one = two = 0;
        for(int i=0;i<len;i++){
            if(nums[i] == 0)
                zero++;
            if(nums[i] == 1)
                one++;
            if(nums[i] == 2)
                two++;
        }
        
        for(int j=0;j<len;j++){
            if(j<zero)
                nums[j] = 0;
            if(j>=zero && j<zero+one)
                nums[j] = 1;
            if(j>=zero+one && j<zero+one+two)
                nums[j] = 2;
        }
        
        
    }
}

//Another Optimized Approach - O(N)
//Dutch National Flag Algorithm
import java.util.*;
class Solution {
    public void sortColors(int[] nums) {
       int len = nums.length;
       int first, mid, last;
        first = mid = 0;
        last = nums.length-1;
        int temp,temp1;
        while(mid<=last){
            if(nums[mid] == 0){
                temp = nums[first];
                nums[first] = nums[mid];
                nums[mid] = temp;
                first++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 2){
                temp = nums[mid];
                nums[mid] = nums[last];
                nums[last] = temp;
                last--;
           
            }
            
        }
        
        
    }
}
