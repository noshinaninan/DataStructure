package com.datastructures.DataStructure.sort;

public class SelectionSort {
	public void sort(int A[],int n) {
		for(int i=0;i<n-1;i++) {
			int position=i;
			for(int j=i+1;j<n;j++) {
				if(A[j]<A[position]) {
					position=j;
				}
				int temp = A[i];
				A[i]=A[position];
				A[position]=temp;
			}
		}
	}
	
	public void display(int A[]) {
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();
		int A[] = {3,5,8,9,6,2};
		ss.display(A);
		ss.sort(A, A.length);
		ss.display(A);

	}

}
