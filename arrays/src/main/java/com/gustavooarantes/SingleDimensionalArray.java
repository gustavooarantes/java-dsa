package com.gustavooarantes;

public class SingleDimensionalArray {

	int arr[] = null;

	public SingleDimensionalArray(int sizeOfArray) {
		arr = new int[sizeOfArray];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

	public void insertElement(int location, int valueToInsert) {
		try {
			if (arr[location] == Integer.MIN_VALUE) {
				arr[location] = valueToInsert;
			} else {
				System.out.println("This cell is already occupied");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("[ERROR] " + e);
		}
	}
}
