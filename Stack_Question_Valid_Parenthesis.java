//codeby : Dileep

package Inheritance;
import java.util.*;
public class Stack_DS {
  // Valid Parentheses 
	public boolean isValid(String s) {
		Stack st = new Stack<>();
		if(s.charAt(0)==']'||s.charAt(0)=='}'||s.charAt(0)==')')
	        return false;
	    
	    for(int i=0; i<s.length(); i++){
	        char c = s.charAt(i);
	        if(c == '(' || c == '{' || c=='['){
	            st.push(c);
	        }
	        else{
	            if(st.size()!=0){
	                if(c==')'){
	                    if(st.peek().equals('('))
	                        st.pop();
	                    else
	                        return false;
	                }
	                else if(c==']'){
	                    if(st.peek().equals('['))
	                        st.pop();
	                    else 
	                        return false;
	                }
	                else if(c=='}'){
	                    if(st.peek().equals('{'))
	                        st.pop();
	                    else 
	                        return false;
	                }
	                else {
	                    return false;
	                }
	            } 
	            else{
	                return false;
	            }
	        }
	        
	    }
	    if(st.size()==0)
	        return true;
	    else 
        return false;   
	}		
	public static void main(String args[]) {
		Stack_DS obj = new Stack_DS();
		System.out.println(obj.isValid("()[]{}"));
		
		
	}

}
