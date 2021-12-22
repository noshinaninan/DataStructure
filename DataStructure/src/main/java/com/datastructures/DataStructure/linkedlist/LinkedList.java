package com.datastructures.DataStructure.linkedlist;

public class LinkedList {

	// Node class
	class Node {
		int data;
		Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public LinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	// Return size of linkedlist
	public int lenght() {
		return size;
	}

	// Checking if empty
	public boolean isEmpty() {
		return size == 0;
	}

	// Inserting into linkedlist
	public void addLast(int data) {
		Node newest = new Node(data, null);
		if (isEmpty())
			head = newest;
		else
			tail.next = newest;
		tail = newest;
		size++;
	}

	public void addfirst(int data) {
		Node newest = new Node(data, null);
		if (isEmpty()) {
			head = newest;
			tail = newest;
		} else {
			newest.next = head;
			head = newest;
		}
		size++;
	}

	public void addAt(int data, int position) {
		if (position < 0 || position >= size) {
			System.out.println("Invalid Index");
			return;
		}
		if (position == 0)
			addfirst(data);
		else {
			Node newest = new Node(data, null);
			Node p = head;
			int i = 1;
			while (i < position - 1) {
				p = p.next;
				i++;
			}
			newest.next = p.next;
			p.next = newest;
			size++;
		}
	}

	// deleting from LinkedList
	public int removeFirst() {
		if (isEmpty()) {
			System.out.println("List is empty");
			return -1;
		}
		int e = head.data;
		head = head.next;
		size--;
		if (isEmpty())
			tail = null;
		return e;
	}

	public int removeLast() {
		if (isEmpty()) {
			System.out.println("list is empty");
			return -1;
		}
		Node p = head;
		int i = 1;
		while (i < size - 1) {
			p = p.next;
			i++;
		}
		tail = p;
		int e = p.next.data;
		tail.next = null;
		size--;
		return e;

	}

	public int removeAt(int position) {
		int e=0;
		if (position < 0 || position > size - 1) {
			System.out.println("Index out of bound");
			return -1;
		} else if (position == 0 || isEmpty()) {
			e =removeFirst();
		}
		else if (position == size - 1) {
			e= removeLast();
		}
		else {
		Node p = head;
		int i = 0;
		while (i < position - 1) {
			p = p.next;
			i++;
		}
		e = p.next.data;
		p.next = p.next.next;
		size--;
		}
		return e;
	}

	//seraching
	public int search(int key) {
		if(isEmpty()) {
			System.out.println("List is empty");
			return -1;
		}
		Node p=head;
		int index=0;
		while(p!=null) {
			if(p.data==key)
				return index;
			p=p.next;
			index++;
		}
		return -1;
	}
	//inserting in sorted order
	public void inseretSorted(int data) {
		Node newest=new Node(data,null);
		if(isEmpty())
			head=newest;
		else {
			Node p=head;
			Node q=head;
			while(p!=null && p.data<data) {
				q=p;
				p=p.next;
			}
			if(p==head) {
				newest.next=head;
				head=newest;
			}
			else {
				newest.next=q.next;
				q.next=newest;
			}
		}
		size++;
	}
	//delete with key
	public int removeKey(int key) {
		if(isEmpty()) {
			System.out.println("List is empty");
			return -1;
		}
		Node p=head;
		while(p!=null) {
			if(head.data==key) {
				p=p.next;
				head=p;
				size--;
				return key;
			}
			if(p.next.data==key) {
				Node temp =p.next.next;
				p.next=temp;
				size--;
				return key;
			}
			p=p.next;
		}
		return -1;
	}
	public void display() {
		Node p = head;
		while (p != null) {
			System.out.print(p.data + " ");
			p = p.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.inseretSorted(7);
		list.inseretSorted(4);
		list.inseretSorted(12);
		list.inseretSorted(28);
		list.inseretSorted(12);
		//list.addAt(24, 4);
		//list.addAt(67, 0);
		list.display();
		System.out.println(list.removeKey(12));
		//System.out.println(list.removeFirst());
		list.display();
		//System.out.println(list.removeLast());
		//list.display();
		//System.out.println(list.lenght());
		//System.out.println();
		//list.display();
		//System.out.println(list.removeAt(0));
		//System.out.println();
		//list.display();
		//System.out.println(list.search(7));
		//list.display();
	}

}
