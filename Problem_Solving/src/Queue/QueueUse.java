package Queue;

public class QueueUse {

	public static void main(String[] args) throws QueueFullException, QueueEmpteyException {
		// TODO Auto-generated method stub
		QueueUseArray queue =new QueueUseArray();
		 int arr[]= {10,20,30,40,50,60,70,80,90,100};
		 
		 for(int elem:arr) {
			 queue.enqueue(elem);
		 }
		 
		 
		 while(!queue.isEmptey()) {
			 System.out.println( queue.dequeue());
			
		 }

	}

}
