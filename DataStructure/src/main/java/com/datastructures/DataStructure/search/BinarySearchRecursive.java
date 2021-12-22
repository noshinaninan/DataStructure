package com.datastructures.DataStructure.search;

public class BinarySearchRecursive {
	public int search(int A[],int key,int l,int r) {
		if(l>r)
			return -1;
		else {
			int mid=(l+r)/2;
			if(key==A[mid])
				return mid;
			else if(key<A[mid])
				return search(A, key, l, mid-1);
			else if(key>A[mid])
				return search(A, key, mid+1, r);
		}
		return -1;
	}

	public static void main(String[] args) {
		BinarySearchRecursive bs = new BinarySearchRecursive();
		int A[] = { 15, 21, 47, 84, 96 };
		System.out.println(bs.search(A, 96,0, A.length));

	}

}
