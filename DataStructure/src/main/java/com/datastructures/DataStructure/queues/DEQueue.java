package com.datastructures.DataStructure.queues;

public class DEQueue {

	// Node class
	class Node {
		int data;
		Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node front;
	private Node rear;
	private int size;

	public DEQueue() {
		front = null;
		rear = null;
		size = 0;
	}

	public int lenght() {
		return size;
	}

	// Checking if empty
	public boolean isEmpty() {
		return size == 0;
	}

	public void addLast(int data) {
		Node newest = new Node(data, null);
		if (isEmpty())
			front = newest;
		else
			rear.next = newest;
		rear = newest;
		size++;
	}

	public void addfirst(int data) {
		Node newest = new Node(data, null);
		if (isEmpty()) {
			front = newest;
			rear = newest;
		} else {
			newest.next = front;
			front = newest;
		}
		size++;
	}


	public int removeFirst() {
		if (isEmpty()) {
			System.out.println("List is empty");
			return -1;
		}
		int e = front.data;
		front = front.next;
		size--;
		if (isEmpty())
			rear = null;
		return e;
	}

	public int removeLast() {
		if (isEmpty()) {
			System.out.println("DEQueue is empty");
			return -1;
		}
		Node p = front;
		int i = 1;
		while (i < size - 1) {
			p = p.next;
			i++;
		}
		rear = p;
		int e = p.next.data;
		rear.next = null;
		size--;
		return e;

	}
	public int first() {
		if(isEmpty()) {
			System.out.println("DEQueue is empty");
			return -1;
		}
		return front.data;
	}
	public int rear() {
		if(isEmpty()) {
			System.out.println("DEQueue is empty");
			return -1;
		}
		return rear.data;
	}

	public void display() {
		Node p = front;
		while (p != null) {
			System.out.print(p.data + " ");
			p = p.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DEQueue queue = new DEQueue();
		queue.addLast(7);
		queue.addLast(4);
		queue.addfirst(12);
		queue.addfirst(24);
		queue.display();
		System.out.println(queue.first());
		queue.display();
		System.out.println(queue.rear());
		queue.display();
		System.out.println(queue.removeFirst());
		queue.display();
		System.out.println(queue.removeLast());
		queue.display();
	}

}
