package Stack;

import java.util.Stack;

public class StackCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack=new Stack<>();
		
		int arr[]= {1,34,67,8,5};
		
		for(int elem:arr) {
			stack.push(elem);
		}
		
		while(! stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	}

}
