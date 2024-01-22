package linkList;

import java.util.LinkedList;
import java.util.Scanner;

public class linkListUsed {

	public static Node<Integer> createLinkList() {

		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		Node<Integer> n5 = new Node<>(50);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;

		return n1;
	}

	public static void print(Node<Integer> Head) {

		Node<Integer> temp = Head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static int length(Node<Integer> Head) {

		Node<Integer> temp = Head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;

	}

	public static Node<Integer> takeInput() {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		Node<Integer> head = null;
		Node<Integer> tail = null;
		while (data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
			if (head == null) {
				// currentNode.make current node as starting node
				head = currentNode;
				tail = currentNode;
			} else {
				// 0(n^2)
				/*
				 * Node<Integer> tail = head; while (tail.next != null) { tail = tail.next; }
				 * tail.next = currentNode;
				 */
				tail.next = currentNode;
				tail = currentNode;

			}
			data = sc.nextInt();
		}
		return head;
	}

	//insert node
	public static Node<Integer> insert(Node<Integer> head, int elem, int pos) {

		Node<Integer> newNode = new Node<Integer>(elem);

		if (pos == 0) {
			newNode.next = head;
			return newNode;
		} else {
			int count = 0;
			Node<Integer> prev = head;
			while (count < pos - 1 && prev != null) {
				count++;
				prev = prev.next;
			}
			if (prev != null) {
				newNode.next = prev.next;
				prev.next = newNode;

			}
			return head;
		}

	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Node<Integer> Head = createLinkList();
		Node<Integer> Head = takeInput();

		Head=insert(Head, 80, 0);

		print(Head);

		// findlength
		System.out.println(length(Head));
		
		//delete the node from the link list
		LinkedList list=new LinkedList();
		list.push(10);
		list.push(20);
		list.push(30);
		list.push(40);
		list.push(50);
		list.push(60);
	    
		//list.deleteNode(list,1);
	}

}
