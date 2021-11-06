//code by: Dileep
package Algorithms_Strings_DSA;
import java.util.*;
public class stringquestions {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        Counting_Characters(s);
        System.out.println(ReverseStr(s));
        System.out.println("Please Enter the Name:");
        String s = obj.next();
        String s2 = obj.next();
        String s3 = obj.nextLine();
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
        String ch = obj.next();
        //Converting from String to character.
        char ch1 = ch.charAt(0);
        char charArray[] = new char[5];
        charArray[0] = ch1;
        System.out.println(charArray[1]);
        int n = obj.nextInt();
        String strArrya[] = new String[n];
        for(int i=0;i<n;i++){
            strArrya[i] = obj.next();
        }
        for(int i=0;i<n;i++){
            System.out.print(strArrya[i] + " ");
        }
        StringBuffer s = new StringBuffer("Dileep");
        s.append("ww");
        s.setCharAt(0,'e');
        System.out.println(s); 
        
        String str = "abcd";
        String s = "abcd";
        String s=new String("abcd").intern();
        String s1 = new String("Dileep");
        String s2 = "Dileep";
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s1.charAt(1));
        System.out.println(s1.length());
        System.out.println(s1.substring(1,6));
        System.out.println(str==s);
        System.out.println(str.equals(s));
        System.out.println(str.charAt(2));
        System.out.println(str.length());
        String x=str.substring(1);
        String x1 = str.substring(0,3);
        System.out.println(str.substring(1,3));
        System.out.println(x);
        System.out.println(x1);
        String v=""+"xyz";
        String v1="".concat("xyz");
        System.out.println(v+" abc");
        System.out.println(v1+"abc");
        int[] arr=new int[1];
        int[] arr2=new int[2];
        System.out.println(arr);
        System.out.println(arr2);
        for(int i=0;i<=26;i++) {
            System.out.print((char)('a'+i)+" ");
        }  
        String str1 = "abcd";
        String str2 = "bdcaw";
        System.out.println(isPermutation(str1,str2));
    }
    public static String ReverseStr(String str){
        String strrev = "";
        for(int i=str.length()-1;i>=0;i--){
            strrev = strrev+str.charAt(i);
        }
        return strrev;
    }

    public static void Counting_Characters(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            int index = x - 'a';
            count[index] += 1;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                char ans = (char) (i + 'a');
                System.out.println(ans + " " + count[i]);
            }
        }
    }

    public static boolean isPermutation(String str1,String str2){
        int[] count = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            char x = str1.charAt(i);
            int index = x - 'a';
            count[index] += 1;
        }
        for (int i = 0; i < str2.length(); i++) {
            char x = str2.charAt(i);
            int index = x - 'a';
            count[index] -= 1;
        }
        for(int i=0;i<count.length;i++) {
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }


}
