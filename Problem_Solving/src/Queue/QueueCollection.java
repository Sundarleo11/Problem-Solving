package Queue;

import java.util.LinkedList;
import java.util.Queue;


public class QueueCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Queue<Integer> queue=new Queue<Integer>(); There is no impliement direct queue function
	
		Queue<Integer> queue=new LinkedList<Integer>();	
		queue.add(10);
		queue.add(20);
		queue.add(30);
		
		System.out.println(queue.size());
		System.out.println(queue.hashCode());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.size());

	}

}
