package com.datastructures.DataStructure.linkedlist;

import com.datastructures.DataStructure.linkedlist.LinkedList.Node;

public class CircularLinkedList {
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

		public CircularLinkedList() {
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
			if(isEmpty()) {
				newest.next=newest;
				head=newest;
			}
			else {
				newest.next=tail.next;
				tail.next=newest;
			}
			tail=newest;
			size++;
		}
		public void addFirst(int data) {
			Node newest = new Node(data,null);
			if(isEmpty()) {
				newest.next=newest;
				head=newest;
				tail=newest;
			}
			else {
				tail.next=newest;
				newest.next=head;
				head=newest;
			}
			size++;
		}
		public void addAt(int data,int position) {
			if(isEmpty() || position==0) {
				addFirst(data);
			}
			else {
				Node newest = new Node(data,null);
				Node p=head;
				int i=1;
				while(i<position-1) {
					p=p.next;
					i++;
				}
				newest.next=p.next;
				p.next=newest;
				size++;
			}
		}
		public int removeFirst() {
			if(isEmpty()) {
				System.out.println("List is empty");
				return -1;
			}
			int e=head.data;
			head=head.next;
			tail.next=head;
			size--;
			if(isEmpty()) {
				head=null;
				tail=null;
			}
			return e;
		}
		public int removeLast() {
			if(isEmpty()) {
				System.out.println("List is empty");
				return -1;
			}
			Node p=head;
			int i=1;
			while (i< lenght()-1) {
				p=p.next;
				i++;
			}
			tail=p;
			int e=p.next.data;
			tail.next=head;
			size--;
			return e;
		}
		public int removeAt(int position) {
			int e=0;
			if(position<0 ||position>size-1) {
				System.out.println("index out of bound");
				return -1;
			}
			else if(position==0 || isEmpty()) {
				e=removeFirst();
			}
			else if(position==size-1) {
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
				size--;
			}
			return e;
		}
		
		public void display() {
			Node p=head;
			int i=0;
			while(i<lenght()) {
				System.out.print(p.data+" ");
				p=p.next;
				i++;
			}
			System.out.println();
		}

	public static void main(String[] args) {
		CircularLinkedList list =new CircularLinkedList();
		list.addLast(7);
		list.addLast(4);
		list.addLast(12);
		list.addFirst(56);
		list.addAt(24, 0);
		System.out.println(list.removeFirst());
		System.out.println(list.removeLast());
		System.out.println(list.removeAt(list.lenght()-1));
		list.display();

	}

}
