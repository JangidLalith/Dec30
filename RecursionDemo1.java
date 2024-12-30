package com.lalith;

public class RecursionDemo1 {

	public static void main(String[] args) {
		// n!
		// 1 2 3....n
		int n = 10;
		int res = factorial(n);
		System.out.println(res);
		

}

	private static int factorial(int n) {
		return n > 1 ? n * factorial(n-1):1;
		
	}
}