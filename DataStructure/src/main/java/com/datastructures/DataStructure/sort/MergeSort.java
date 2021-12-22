package com.datastructures.DataStructure.sort;

public class MergeSort {
	public void mergeSort(int A[],int left,int right) {
		if(left<right) {
			int mid=(left+right)/2;
			mergeSort(A, left, mid);
			mergeSort(A, mid+1, right);
			merge(A,left,mid,right);
		}
	}

	private void merge(int[] A, int left, int mid, int right) {
		int i=left;
		int j=mid+1;
		int k=left;
		int B[] = new int[right+1];
		
		while(i<=mid && j<=right) {
			if(A[i]<A[j]) {
				B[k]=A[i];
				i++;
			}
			else {
				B[k]=A[j];
				j++;
			}
			k++;
		}
		while(i<=mid) {
			B[k]=A[i];
			i++;
			k++;
		}
		while(j<=right) {
			B[k]=A[j];
			j++;
			k++;
		}
		for(int x=left;x<right+1;x++) {
			A[x]=B[x];
		}
		
	}
	public void display(int A[]) {
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		MergeSort ss = new MergeSort();
		int A[] = {3,5,8,9,6,2};
		ss.display(A);
		ss.mergeSort(A,0, A.length-1);
		ss.display(A);

	}

}
