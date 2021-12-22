package com.datastructures.DataStructure.heap;

public class HeapSortDemo {
	public void heapSort(int A[],int n) {
		Heap h=new Heap();
		for(int i=0;i<n;i++)
			h.insert(A[i]);
		int k=n-1;
		for(int i=0;i<n;i++) {
			A[k]=h.deleteMax();
			k--;
		}
	}
	public void display(int A[],int n) {
		for(int i=0;i<n;i++)
			System.out.print(A[i]+" ");
		System.out.println();
	}

	public static void main(String[] args) {
		HeapSortDemo heapSortDemo = new HeapSortDemo();
		int A[]= {63,250,835,947,651,28};
		heapSortDemo.display(A, A.length);
		heapSortDemo.heapSort(A, A.length);
		heapSortDemo.display(A, A.length);

	}

}
