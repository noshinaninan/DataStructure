package com.datastructures.DataStructure.stacks;

public class StacksArray {
	private int data[];
	private int top;
	
	public StacksArray(int n) {
		data=new int[n];
		top=0;
	}
	public int length() {
		return top;
	}
	public boolean isEmpty() {
		return top==0;
	}
	public boolean isFull() {
		return top==data.length;
	}
	public void push(int e) {
		if(isFull()) {
			System.out.println("Stack is full");
			return;
		}
		data[top]=e;
		top++;
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		int e=data[top-1];
		top--;
		return e;
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return data[top-1];
	}
	public void display() {
		for(int i=0;i<top;i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		StacksArray stack=new StacksArray(4);
		stack.push(5);
		stack.push(2);
		stack.push(6);
		stack.display();
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		stack.display();

	}

}
