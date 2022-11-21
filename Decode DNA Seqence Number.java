import java.util.*;

public class Main
{
	public static void main(String[] args) {
		String str = "001001011101110101";
		String C = "001";
		String G = "101";
		String A = "011";
		String T = "101";
		String U = "110";
		String res ="";
		String str1 = str;
		for(int i = 0; i < str.length(); i=i+3) {
		   String temp = "";
		   temp += str1.charAt(i);
		   temp += str1.charAt(i+1);
		   temp += str1.charAt(i+2);
		   //System.out.println(temp);
		  // String res = "";
		    if(C.equals(temp)){
		        res += "C";
		    }
		    if(G.equals(temp)){
		        res += "G";
		    }
		    if(A.equals(temp)){
		        res += "A";
		    }
		    if(T.equals(temp)){
		        res += "T";
		    }
		    if(U.equals(temp)){
		        res += "U";
		    }
		}
		System.out.println(res);
	}
}
