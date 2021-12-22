package com.datastructures.DataStructure.search;

public class LinearSearch {
	public int search(int A[],int key,int n) {
		int index = 0;
		while(index<n) {
			if(A[index]==key)
				return index;
			index++;
		}
		return -1;
	}

	public static void main(String[] args) {
		int A[] = {84,21,47,96,15};
		
		LinearSearch search = new LinearSearch();
		System.out.println(search.search(A, 15, A.length));

	}

}
