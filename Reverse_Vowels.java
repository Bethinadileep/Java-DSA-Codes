class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length-1;
        String vowels = "aeiouAEIOU";
        
        while(left < right){
            if(vowels.indexOf(arr[left]) == -1){
                left++;
                continue;
            }else if (vowels.indexOf(arr[right]) == -1){
                right--;
                continue;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(arr);       
    }
    
}
