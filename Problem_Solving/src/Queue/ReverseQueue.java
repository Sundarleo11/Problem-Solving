package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

	public static Queue<Integer> reverqueue(Queue<Integer> queue) {

		int size = queue.size();

		Queue<Integer> ans = new LinkedList<>();

		for (int i = 0; i < size; i++) {

			for (int j = 0; j < queue.size() - 1; j++) {
				int x = queue.peek();
				queue.remove();
				queue.add(x);
			}
			ans.add(queue.peek());
			/// queue.remove();
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> queue = new LinkedList<>();

		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);	
		Queue<Integer> q = reverqueue(queue);
		System.out.println("After reversOperation:");
		while (!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}

}
