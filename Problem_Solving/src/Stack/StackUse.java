package Stack;

public class StackUse {

	public static void main(String[] args) throws EmptyException {
		// TODO Auto-generated method stub
	
		stackUseArray stack=new stackUseArray();
		
		int arr[]= {1,34,78,4,6};
		
		for(int i=0;i<arr.length;i++) {
		     stack.push(arr[i]);
		}
		
		while(! stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	/*	stack.push(10);
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());*/
		

	}

}
