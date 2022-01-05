//codeby : Dileep
class Stack{
    //last in first Out
    int size=5;
    int[] item = new int[size];
    int top = -1;
    boolean isFull(){
        if(top==size-1){
            return true;
        }
        return false;
    }
    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    public void push(int num){
        if(isFull()){
            System.out.println("Stack is Full");
            //return -1;
        }
        top++;
        item[top]=num;
        System.out.println("Element is Inserted: "+num);
        
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        int element = item[top];
        top--;
        System.out.println("Top of the element is Deleted from the stack: "+element);
        display();
        
    }
    void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            for(int i=top;i>=0;i--){
                System.out.println(item[i]+" ");
            }
        }
    }
    
    public static void main(String args[]) {
        Stack obj = new Stack();
        obj.push(1);
        obj.push(2);
        obj.display();
        obj.pop();
        
    }
}
