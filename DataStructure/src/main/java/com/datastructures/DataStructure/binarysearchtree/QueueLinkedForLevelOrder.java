package com.datastructures.DataStructure.binarysearchtree;

//changed int to object
public class QueueLinkedForLevelOrder {
	class Node{
		Object data;
		Node next;
		public Node(Object data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
	}
	private Node front;
	private Node rear;
	private int size;
	
	public QueueLinkedForLevelOrder() {
		front=null;
		rear=null;
		size=0;
	}
	public Object length() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public void enqueue(Object data) {
		Node newest=new Node(data,null);
		if(isEmpty()) {
			front=newest;
		}
		else {
			rear.next=newest;
		}
		rear=newest;
		size++;
	}
	public Object dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		Object e=front.data;
		front=front.next;
		size--;
		if(isEmpty())
			rear=null;
		return e;
	}
	public Object first() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		return front.data;
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		Node p=front;
		while(p!=null) {
			System.out.print(p.data+" ");
			p=p.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		QueueLinkedForLevelOrder queue = new QueueLinkedForLevelOrder();
		queue.enqueue(7);
		queue.enqueue(4);
		queue.enqueue(12);
		queue.display();
		System.out.println(queue.first());
		System.out.println(queue.dequeue());
		queue.display();
	}

}
