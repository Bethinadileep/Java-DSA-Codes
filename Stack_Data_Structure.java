//Code By: Dileep

package Stack_Data_Structure;

public class Implement_Stack {
    static final int Max = 1000;
    int top;
    int a[] = new int[Max];
    boolean isEmpty(){
        return (top<0);
    }
    Implement_Stack(){
        top=-1;
    }
    boolean push(int x){
        if(top > Max-1){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            a[++top] += x;
            System.out.println(x + " Pushed into the stack");
            return true;
        }
    }
    int pop(){
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int x = a[top--];
            return x;
        }
    }
    int peek(){
        if(top<0){
            System.out.println("Stack is Underflow");
            return 0;
        }
        else{
            int x = a[top];
            return x;
        }
    }

    public static void main(String args[]){
        Implement_Stack obj = new Implement_Stack();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        System.out.println("The Top Most Element of the stack is: "+obj.peek());
        System.out.println("The Pop ELement from the stack is:"+obj.pop());
        System.out.println("The Pop ELement from the stack is:"+obj.pop());


    }
}
