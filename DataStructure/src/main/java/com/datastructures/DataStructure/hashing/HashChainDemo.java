package com.datastructures.DataStructure.hashing;

import com.datastructures.DataStructure.linkedlist.LinkedList;

public class HashChainDemo {
	private int hashTableSize;
	private LinkedList hashTable[];
	
	public HashChainDemo() {
		hashTableSize=10;
		hashTable = new LinkedList[hashTableSize];
		for(int i=0;i<hashTableSize;i++)
			hashTable[i]=new LinkedList();
	}
	public int hasCode(int key) {
		return key % hashTableSize;
	}
	public void insert(int element) {
		int i= hasCode(element);
		hashTable[i].inseretSorted(element);
	}
	public boolean search(int key) {
		int i=hasCode(key);
		return hashTable[i].search(key)!=-1;
	}
	public void display() {
		for(int i=0;i<hashTableSize;i++) {
			System.out.print("["+i+"]"+" ");
			hashTable[i].display();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		HashChainDemo h= new HashChainDemo();
		h.insert(54);
		h.insert(78);
		h.insert(64);
		h.insert(92);
		h.insert(34);
		h.display();
		System.out.println(h.search(92));

	}

}
