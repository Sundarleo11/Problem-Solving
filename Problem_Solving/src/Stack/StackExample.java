package Stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack=new Stack<>();
		stack.push(5);
		stack.push(10);
		stack.push(15);
		System.out.println(stack.pop());
		System.out.println(stack.size());

	}

}
