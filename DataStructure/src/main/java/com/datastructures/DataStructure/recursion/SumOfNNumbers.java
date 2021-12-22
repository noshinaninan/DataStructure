package com.datastructures.DataStructure.recursion;

public class SumOfNNumbers {
	
	public int sumRecursive(int n) {
		if(n==1)
			return 1;
		return sumRecursive(n-1)+n;
	}
	
	public int sum(int n) {
		return n*(n+1)/2;
	}
	public static void main(String[] args) {
		SumOfNNumbers sum = new SumOfNNumbers();
		System.out.println("Result :"+sum.sum(5));
		System.out.println("Result :"+sum.sumRecursive(5));

	}

}
