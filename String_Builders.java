#Code By: Dileep
package Algorithms_Strings_DSA;
import java.util.*;
public class String_buiders {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tom");
        System.out.println(sb);

        //to print at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0,'B');
        System.out.println(sb);

        //insert in string builder
        sb.insert(0,'D');
        sb.insert(3,'m');
        System.out.println(sb);

        //delete the extra m
        sb.delete(3,4);
        System.out.println(sb);

        //Append function it will insert in last */
        sb.append('m');
        sb.append('m');
        sb.append('a');
        System.out.println(sb);
        System.out.println(sb.length()); 

        //reverse the string in java -> T(O)-> O(N)
        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i; //4-1-0=3

            char charFront = sb.charAt(front);
            char charBack = sb.charAt(back);

            sb.setCharAt(back,charFront);
            sb.setCharAt(front,charBack);
        }
        System.out.println(sb);
    }
}
