package com.datastructures.DataStructure.sort;

public class InsertionSort {
	public void sort(int A[],int n) {
		for(int i=0;i<n;i++) {
			int temp=A[i];
			int position =i;
			while(position>0 && A[position-1]>temp) {
				A[position]=A[position-1];
				position--;
			}
			A[position]=temp;
		}
	}
	
	public void display(int A[]) {
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		InsertionSort ss = new InsertionSort();
		int A[] = {3,5,8,9,6,2};
		ss.display(A);
		ss.sort(A, A.length);
		ss.display(A);

	}

}
