package com.datastructures.DataStructure.queues;

public class QueueArrays {
	private int data[];
	private int front;
	private int rear;
	private int size;
	
	public QueueArrays(int n) {
		data=new int[n];
		front=0;
		rear=0;
		size=0;
	}
	public int length() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public boolean isFull() {
		return size==data.length;
	}
	public void enqueue(int e) {
		if(isFull()) {
			System.out.println("Queue is Full");
			return;
		}
		else {
			data[rear]=e;
			rear++;
			size++;
		}
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		else {
			int e=data[front];
			front++;
			size--;
			return e;
		}
	}
	public int first() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		return data[front];
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		for(int i=front;i<rear;i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		QueueArrays queue = new QueueArrays(5);
		queue.enqueue(7);
		queue.enqueue(4);
		queue.enqueue(12);
		queue.display();
		System.out.println(queue.first());
		System.out.println(queue.dequeue());
		queue.display();
		

	}

}
