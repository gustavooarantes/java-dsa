package com.gustavooarantes;

import java.util.Arrays;

public class Main {

	/**
	 * Arrays store a specific data type in a contiguous memory space that can not
	 * be changed.
	 * Each element has its unique memory address and index.
	 *
	 * Arrays can be one dimensional or multidimensional (often called matrices).
	 * This fact doesnt't change the way the elements of the array are stored
	 * differently. Multidimensional arrays are still stored in a contiguous manner.
	 *
	 * Zero indexing is justified by the way the storaging occurs.
	 * If an array's first element starts at, say, memory address 0x101, the way to
	 * access it would be to just reference 0x101 + 0.
	 * The second element could be accessed by referencing position 0x101 + 1 and so
	 * forth.
	 */

	public static void main(String[] args) {

		// dataType[] arr -> declaration (creates a reference to the memory)
		// arr = new dataType[] -> instantiation (effectively creates the memory space)
		// arr[i] = firstElement -> initialization (assigns values to the array cells)
		// It could all be done at the same time as -> int[] arr = {1, 2, 3, 4, 5}
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1; // element insertion
		}

		System.out.println(Arrays.toString(arr));

	}
}
