//Codeby : Dileep

public class Queue
{
    int size = 5;
    int item[] = new int[size];
    int front,rear;
    
    Queue(){
        front=-1;
        rear=-1;
    }
    public boolean isFull(){
        if(front == 0 && rear == size - 1){
            return true;
        }
        return false;
        
    }
    public boolean isEmpty(){
        if(front == -1)
            return true;
        return false;
    }
    public void enqueue(int num){
        if(isFull()) {
            System.out.println("Queue is Full");
        }
        else {
            if(front==-1){
                front=0;
            }
            rear++;
            item[rear] = num;
            System.out.println("Element is inserted: "+num);
        }
        
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty, Cannot Delete the Element");
        }
        
        int element = item[front];
        
        if(front>=rear){
            front=-1;
            rear=-1;
        }
        else{
            front++;
        }
        System.out.println("Element is Deleted "+element);
        return(element);
        
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        //To Display the Front of the Queue
        System.out.println("Front of the Queue: "+item[front]);
        
        for(int val=front;val<=rear;val++){
            System.out.print(item[val]+" ");
        }
        
        //To Display the End of the Queue element
        System.out.println("End of the Queue: "+item[rear]);
        
    }
    
	public static void main(String[] args) {
	    Queue obj = new Queue();
	    obj.enqueue(10);
	    obj.enqueue(20);
	    System.out.println(obj.dequeue());
	    obj.display();
	   
	}
}
