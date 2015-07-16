package com.practice.operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		String array[] = { "0000", "0001", "0010", "0011", "0100", "0101",
				"0110", "0111", "1000", "1001", "1010" };
		int a = 3;
		int b = 6;
		int c = a | b;
		int d = a & b;
		int e = a ^ b;
		System.out.println("binary value of a is:" + array[a]);
		System.out.println("binary value of b is:" + array[b]);
		System.out.println("binary value of c is:" + array[c]);
		System.out.println("binary value of d is:" + array[d]);
		System.out.println("binary value of e is:" + array[e]);
	}
}
