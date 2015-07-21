package com.practice.Array;

public class ArrayExample {

	public static void main(String[] args) {
		// int array[] =new int[5];
		int array[] = { 1, 2, 3, 4, 5 };
		int totalage = 0;
		// for(int i=0;i<array.length;i++)
		for (int age : array) 
			totalage += age;
			System.out.println(totalage);
		
	}
}