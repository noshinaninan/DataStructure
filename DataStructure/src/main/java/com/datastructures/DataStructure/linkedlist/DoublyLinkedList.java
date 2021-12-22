package com.datastructures.DataStructure.linkedlist;

public class DoublyLinkedList {
	class Node{
		int data;
		Node next;
		Node prev;
		public Node(int data, Node next, Node prev) {
			super();
			this.data = data;
			this.next = next;
			this.prev = prev;
		}
	}
	private Node head;
	private Node tail;
	private int size;
	
	public DoublyLinkedList() {
		head=null;
		tail=null;
		size=0;
	}
	public int length() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public void addLast(int data) {
		Node newest=new Node(data,null,null);
		if(isEmpty()) {
			head=newest;
			tail=newest;
		}
		else {
			tail.next=newest;
			newest.prev=tail;
			tail=newest;
		}
		size++;
	}
	public void addFirst(int data) {
		Node newest =new Node(data,null,null);
		if(isEmpty()) {
			head=newest;
			tail=newest;
		}
		else {
			newest.next=head;
			head.prev=newest;
			head=newest;
		}
		size++;
	}
	public void addAt(int data,int position) {
		if(position<0||position>size) {
			System.out.println("Inavalid index");
			return;
		}
		else if(position==0 || isEmpty()) {
			addFirst(data);
			return;
		}
		else if(position==size) {
			addLast(data);
			return;
		}
		else {
			Node newest = new Node(data,null,null);
			Node p=head;
			int i=0;
			while(i<position-1) {
				p=p.next;
				i++;
			}
			newest.next=p.next;
			p.next.prev=newest;
			p.next=newest;
			newest.prev=p;
			size++;
		}
	}
	public int removeFirst() {
		if(isEmpty()) {
			System.out.println("list is empty");
			return -1;
		}
		int e=head.data;
		head=head.next;
		size--;
		if(isEmpty()) {
			tail=null;
		}
		else
			head.prev=null;
		return e;
	}
	public int removeLast() {
		if(isEmpty()) {
			System.out.println("list is empty");
			return -1;
		}
		int e=tail.data;
		tail=tail.prev;
		tail.next=null;
		size--;
		return e;
	}
	public int removeAt(int position) {
		int e=0;
		if(position<0||position>length()) {
			System.out.println("invalid index");
			return -1;
		}
		else if(position==0) {
			e=removeFirst();
		}
		else if(position==length()) {
			e=removeLast();
		}
		else {
			Node p=head;
			int i=1;
			while(i<position-1) {
				p=p.next;
				i++;
			}
			e=p.next.data;
			p.next=p.next.next;
			p.next.prev=p;
			size--;
		}
		return e;
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		Node p=head;
		while(p!=null) {
			System.out.print(p.data+" ");
			p=p.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DoublyLinkedList list =new DoublyLinkedList();
		list.addLast(7);
		list.addLast(4);
		list.addFirst(12);
		list.addFirst(24);
		list.addAt(8, 3);
		list.addAt(9, 0);
		list.addAt(10, list.length());
		list.display();
		//System.out.println(list.removeLast());
		//System.out.println(list.removeFirst());
		System.out.println(list.removeAt(list.length()));
		list.display();
		System.out.println(list.removeAt(list.length()));
		list.display();
	}

}
