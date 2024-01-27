package Stack;

import java.util.Stack;

public class BracketsBalanced {

	public static boolean BracketsBalanced(String str) {

		Stack<Character> ch = new Stack<>();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '(') {
				ch.push(str.charAt(i));
			} else if (str.charAt(i) == ')') {
				if (ch.isEmpty()) {
					return false;
				}
				char topchar = ch.pop();
				if (str.charAt(i) == ')' && topchar == '(') {
					continue;
				} else {
					return false;
				}
			}

		}
		return ch.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<>();

		String str = "()()(()";
		// String str = "(()()())";
		boolean check = BracketsBalanced(str);
		System.out.println("BracketsBalanced :" + check);

	}

}
