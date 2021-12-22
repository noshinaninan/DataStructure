package com.datastructures.DataStructure.search;

public class BinarySearch {
	public int search(int A[], int key, int n) {
		int l = 0;
		int r = n - 1;
		while (l <= r) {
			int mid = (l + r) / 2;
			if (key == A[mid])
				return mid;
			else if (key < A[mid])
				r = mid - 1;
			else if (key > A[mid]) 
				l = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int A[] = { 15, 21, 47, 84, 96 };
		System.out.println(bs.search(A, 96, A.length));

	}

}
