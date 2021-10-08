//DILEEP BETHINA
import java.util.ArrayList;

interface Iterator
{
   void add(Integer data);
   boolean search(Integer data);
   void remove(Integer data);
   void display();
}
interface Container
{
   Iterator getIterator();
}
class Items implements Container 
{
   private ArrayList<Integer> list=new ArrayList<Integer>();
   public Iterator getIterator() 
   {
      return new ItemsIterate();
   }
   private class ItemsIterate implements Iterator{
       public void add(Integer data){
	  list.add(data);
       }
       public boolean search(Integer data){
	   return list.contains(data);
       }
       public void remove(Integer data){
	   list.remove(data);
       }
       public void display(){
	   System.out.println(list);
       }
   }
}
public class IteratorDemo {
   public static void main(String[] args)
   {
	Items ob=new Items();
	Iterator iter=ob.getIterator();
	iter.add(10);
	iter.add(20);
	iter.add(30);
	iter.add(40);
	iter.display();
	System.out.println("-----------------------------");
	iter.remove(30);
	iter.display();
	System.out.println("-----------------------------");

	boolean result=iter.search(40);
	if(result==true)
	    System.out.println("Yes");
	else
	    System.out.println("No");	   	
   }
}
