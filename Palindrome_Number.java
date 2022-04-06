class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int temp = x;
        int sum = 0;
        while(x != 0) {
            int rem = x % 10;
            sum = sum * 10 + rem;
            x/=10;
        }
        if(sum == temp){
            return true;
        }
        else {
            return false;
        }
    }
}
