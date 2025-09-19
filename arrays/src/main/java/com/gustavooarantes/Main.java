package com.gustavooarantes;

public class Main {

	/**
	 * Arrays store a specific data type in a contiguous memory space that can not
	 * be changed.
	 * Each element has its memory space and a unique index used for accessing it.
	 *
	 * Arrays can be one dimensional or multidimensional (often called matrices).
	 */

	public static void main(String[] args) {

		int[] oneDimensionalArray = new int[5];

		for (int i = 0; i < oneDimensionalArray.length; i++) {
			oneDimensionalArray[i] = i + 1;
			System.out.print(oneDimensionalArray[i]);
			System.out.print(" ");
		}

		System.out.println();

	}
}
