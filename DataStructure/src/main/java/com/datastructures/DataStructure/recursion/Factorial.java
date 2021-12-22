package com.datastructures.DataStructure.recursion;

public class Factorial {
	public int fact(int n) {
		if(n==0)
			return 1;
		return fact(n-1)*n;
	}

	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		System.out.println(factorial.fact(5));

	}

}
