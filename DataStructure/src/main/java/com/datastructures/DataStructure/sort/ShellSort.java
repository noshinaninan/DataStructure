package com.datastructures.DataStructure.sort;

public class ShellSort {
	public void sort(int A[],int n) {
		int gap=n/2;
		while(gap>0) {
			int i=gap;
			while(i<n) {
				int temp=A[i];
				int j=i-gap;
				while(j>=0 && A[j]>temp) {
					A[j+gap]=A[j];
					j=j-gap;
				}
				A[j+gap]=temp;
				i=i+1;
			}
			gap=gap/2;
		}
	}
	public void display(int A[]) {
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ShellSort ss = new ShellSort();
		int A[] = {3,5,8,9,6,2};
		ss.display(A);
		ss.sort(A, A.length);
		ss.display(A);

	}

}
