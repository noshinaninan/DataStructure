package com.datastructures.DataStructure.queues;

public class QueueLinked {
	class Node{
		int data;
		Node next;
		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
	}
	private Node front;
	private Node rear;
	private int size;
	
	public QueueLinked() {
		front=null;
		rear=null;
		size=0;
	}
	public int length() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public void enqueue(int data) {
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
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		int e=front.data;
		front=front.next;
		size--;
		if(isEmpty())
			rear=null;
		return e;
	}
	public int first() {
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
		QueueLinked queue = new QueueLinked();
		queue.enqueue(7);
		queue.enqueue(4);
		queue.enqueue(12);
		queue.display();
		System.out.println(queue.first());
		System.out.println(queue.dequeue());
		queue.display();
	}

}
