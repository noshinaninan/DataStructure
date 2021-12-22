package com.datastructures.DataStructure.sort;

import java.sql.Time;

public class BubbleSort {
	public void sort(int A[],int n) {
		for(int pass=n-1;pass>=0;pass--) {
			for(int i=0;i<pass;i++) {
				if(A[i]>A[i+1]) {
					int temp = A[i];
					A[i]=A[i+1];
					A[i+1]=temp;
				}
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
		BubbleSort ss = new BubbleSort();
		int A[] = {3,5,8,9,6,2};
		ss.display(A);
		ss.sort(A, A.length);
		ss.display(A);

	}

}
