package Queue;

public class QueueUseArray {

	private int data[]; // queue memeory
	private int front; // element of the first number -1
	private int rear; // element of the last number -1
	private int size; // size of the queue

	public QueueUseArray() {
		data = new int[5];
		front = -1;
		rear = -1;
	}

	public QueueUseArray(int capacity) {
		data = new int[capacity];
		front = -1;
		rear = -1;
	}

	public int size() {
		return size;

	}

	public boolean isEmptey() {
		return size == 0;
	}

	public void enqueue(int elem) throws QueueFullException {
		if (data.length == size) {
			// throw new QueueFullException();
			doublecapacity();
		}
		if (size == 0) {
			front = 0;
		}
		rear++;
		if (rear == data.length) {
			rear = 0;
		}
		data[rear] = elem;
		size++;
	}

	private void doublecapacity() {
		// TODO Auto-generated method stub
		int temp[] = data;

		data = new int[2 * temp.length];

		int index = 0;

		for (int i = front; i < temp.length; i++) {
			data[index++] = temp[i];
		}

		for (int i = front; i < front - 1; i++) {
			data[index++] = temp[i];
		}

	}

	public int front() throws QueueEmpteyException {
		if (size == 0) {
			throw new QueueEmpteyException();
		}
		return data[front];
	}

	public int dequeue() throws QueueEmpteyException {
		if (size == 0) {
			throw new QueueEmpteyException();
		}

		int temp = data[front];
		front++;
		if (front == data.length) {
			front = 0;
		}
		size--;
		if (size == 0) {
			front = -1;
			rear = -1;
		}
		return temp;
	}

}
