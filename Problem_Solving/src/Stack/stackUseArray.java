package Stack;

public class stackUseArray {

	int data[];
	private int topindex;
	
	public stackUseArray() {
		data=new int[2];
		topindex=-1;
	}
	
	
	//impliment for stack opertaion empty,top,push,pop,size
	
	
	public stackUseArray(int i) {
		// TODO Auto-generated constructor stub
		data=new int[i];
		topindex=-1;
	}


	public int size() {
		
		return topindex+1;
	}
	
	public boolean isEmpty() {
		
		return topindex==-1;
		
	}
	
	public int top() throws StackFullException {
		if(topindex==-1) {
			//thows exception
			
			throw new StackFullException();
		}
		
		return data[topindex];
		
	}
	
	private void doubleCapacity() {
	   System.out.println("Double check");
		int temp []=data;
		data=new int[2*temp.length];
		
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
	}
	
	public int pop() throws EmptyException{
		if(topindex==-1) {
			//throw empty exception
			throw new EmptyException();
			
		}
		int temp=data[topindex];
		topindex--;
		return temp;
	}
	
	public void push(int elem) {
		if(topindex==data.length) {
			//throws exception
			
		}
		doubleCapacity();
		data[++topindex]=elem;
	}


	
}
