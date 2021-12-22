package com.datastructures.DataStructure.stacks;

public class StacksLinked {
	class Node{
		int data;
		Node next;
		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
	}
	private Node top;
	private int size;
	public StacksLinked(){
		top=null;
		size=0;
	}
	public int length() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public void push(int data) {
		Node newest=new Node(data,null);
		if(isEmpty()) {
			top=newest;
		}
		else {
			newest.next=top;
			top=newest;
		}
		size++;
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		int e=top.data;
		top=top.next;
		size--;
		return e;
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return top.data;
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		Node p=top;
		while(p!=null) {
			System.out.print(p.data+" ");
			p=p.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		StacksLinked stack=new StacksLinked();
		stack.push(5);
		stack.push(2);
		stack.push(6);
		stack.display();
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		stack.display();

	}

}
