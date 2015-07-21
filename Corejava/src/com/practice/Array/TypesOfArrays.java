package com.practice.Array;

public class TypesOfArrays {

	public static void main(String[] args) {

		oneDimensionalArray();
		twoDimensionalArray();
	}

	public static void oneDimensionalArray() {
		/*
		 * int array1[] = { 10, 20, 30, 40, 50 }; for (int i = 0; i <
		 * array1.length; i++) System.out.println(array1[i]);
		 */

		/*
		 * int totalage=0; for(int i=0;i<array1.length;i++) totalage +=
		 * array1[i]; System.out.println("total value is :" + totalage);
		 */

	}
	

	public static void twoDimensionalArray() {
		int array2[][] = { { 2, 3 }, { 4, 5 }, { 6, 7 }, { 8, 9 } };
		for (int i = 0; i < array2.length; i++)
			/*System.out.println(array2[i][1]);

		System.out.println(array2[0][1]);
		System.out.println(array2[1][1]);
		System.out.println(array2[2][1]);
		System.out.println(array2[3][1]);
*/
		System.out.println(array2[i][0]);
		
		System.out.println(array2[0][0]);
		System.out.println(array2[1][0]);
		System.out.println(array2[2][0]);
		System.out.println(array2[3][0]);

	}

}
