class Solution {
    public String breakPalindrome(String p) {
       char c[]=p.toCharArray();
        int n=c.length;
        if(n==1)return "";
        boolean found=false;
        for(int i=0;i<n/2;i++){
            if(c[i]=='a')continue;
            c[i]='a';
            found=true;
            break;
        }
        if(!found)c[n-1]='b';
        return new String(c);
    }
}
