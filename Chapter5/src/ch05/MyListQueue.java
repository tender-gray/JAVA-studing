package ch05;

import ch03.MyLinkedList;
import ch03.MyListNode;

interface Queue{
	public void enQueue(String data);
	public String deQueue();
	public void printQueue();
	
}

public class MyListQueue extends MyLinkedList implements Queue{

	MyListNode front;
	MyListNode rear;
	
	
	@Override
	public void enQueue(String data) {
		MyListNode newNode;
		if(isEmpty()) {
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		}
		else {
			newNode = addElement(data);
			rear = newNode;
		}
		
		System.out.println(newNode.getData()+"added");
	}

	@Override
	public String deQueue() {
		
		if(isEmpty()) {
			return null;
		}
		
		front = front.next;
		
		if(front == null) {
			rear = null;
		}
		return null;
	}

	@Override
	public void printQueue() {
	
		printAll();
	
	}

}
