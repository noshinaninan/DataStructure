package com.datastructures.DataStructure.sort;

public class QuickSort {
	public void quickSort(int[] A,int low,int high) {
		if(low<high) {
			int pi =partition(A,low,high);
			quickSort(A, low, pi-1);
			quickSort(A, pi+1, high);
		}
	}

	private int partition(int[] A, int low, int high) {
		int pivot=A[low];
		int i=low+1;
		int j=high;
		do {
			while(i<=j && A[i]<=pivot)
				i++;
			while(i<=j && A[j]>pivot)
				j--;
			if(i<=j)
				swap(A,i,j);
		}while(i<j);
		swap(A,low,j);
		return j;
	}

	private void swap(int[] A, int i, int j) {
		int temp=A[i];
		A[i]=A[j];
		A[j]=temp;
		
	}
	
	public void display(int A[]) {
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		QuickSort ss = new QuickSort();
		int A[] = {3,5,8,9,6,2};
		ss.display(A);
		ss.quickSort(A,0, A.length-1);
		ss.display(A);

	}

}
