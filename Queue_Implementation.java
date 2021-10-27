//Code By:Dileep
import java.util.*;
class Queue_Implementation
{
	public static void main(String args[])
	{
		Queue<Integer> q = new ArrayDeque<>();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		while(!q.isEmpty())
		{
		   System.out.print(q.peek());
		   q.poll();
		}
		System.out.println();
		System.out.println(q.isEmpty());
	}
}

