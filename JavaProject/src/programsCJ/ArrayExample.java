package programsCJ;

public class ArrayExample {

	public static void main(String[] args) {

		// TODO Auto-generated method

		// int arr[];

		int arr1[];
		int arr2[]; // Array variable

		int arr3[] = new int[5]; // Array object
		{

			arr3[0] = 10;
			arr3[1] = 20;
			arr3[2] = 30;
			arr3[3] = 40;
			arr3[4] = 50;

			/*
			 * int aa[]; int ab[]= {1}; int abc[]=new int[2]; abc[0]=1; abc[1]=1;
			 */

			System.out.println("Accessing array value 3rd position :" + arr3[2]);
			System.out.println("\n  ");

			int arr[] = { 10, 20, 30, 40, 50 };

			for (int i = 0; i <= arr.length - 1; i++) {

				System.out.println("Array Index " + i + " and element is : " + arr[i]);
			}
			System.out.println("\n ");

			// Reverse order

			int arr4[] = { 10, 20, 30, 40, 50 };

			for (int i = 4; i >= 0; i--) {
				System.out.println("Array Index " + i + " and element is : " + arr4[i]);
			}
			System.out.print("\nReverse order:  ");

			// Char array
			char arr5[] = { 'A', 'B', 'C', 'D' };
			for (int i = 3; i >= 0; i--) {
				System.out.println("Char arr :" + arr5[i]);

				// System.out.println("\nchar array ");

			}

			// String array

			String strarr[] = { "India ", "America", "Japan", "London", "Iran" };

			for (int i = 0; i <= strarr.length - 1; i++) {
				System.out.println("String array :" + strarr[i]);

			}
			// String strarr1[] = { "India ", "America", "Japan", "London", "Iran" };
			for (int i = 0; i <= strarr.length - 1; i++) {

				String str = strarr[i];

				for (int k = str.length() - 1; k >= 0; k--) {

					System.out.print(str.charAt(k));
				}
				System.out.println("");
			}
			System.out.println(" \nString array");

			// Reverse

			System.out.println("-------Reverse-----------");
			String strarr2[] = { "India ", "America", "Japan", "London", "Iran" };

			for (int a = 0; a <= strarr2.length - 1; a++) {

				String str1 = strarr2[a];

				for (int l = str1.length() / 2; l >= 0; l--) {

					System.out.print(str1.charAt(l));

				}

				System.out.println("");
			}
			int arr6[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } }; // 2-D array

			for (int i = 0; i <= 2; i++) { // Row Index

				for (int k = 0; k <= 2; k++) {// column Index

					System.out.println("\tValue of " + i + "Row and" + k + "column is " + arr6[i][k]);

				}
				System.out.println("\nDiagonal ");
			}

		}
	}
}