package com.miit;

public class Calculator {

	public static void main(String[] args) {
		

		System.out.println(add(3,4));
		System.out.println(sub(3,4));
		System.out.println(mul(3,4));
		System.out.println(div(3,4));

	}
	public static int add(int a, int b) {
		return a+b;
	
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	public static int div(int a, int b) {
		return a/b;
	}
}

