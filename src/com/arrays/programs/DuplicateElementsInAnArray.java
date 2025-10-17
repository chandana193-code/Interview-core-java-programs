//Find Duplicate Elements in an Array

package com.arrays.programs;

public class DuplicateElementsInAnArray {

	public static void main(String[] args) {

		int[] arr = {1, 2, 2, 2, 3, 3, 4, 5,3,2};
		
		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;

			for (int k = 0; k < i; k++) {
				if (arr[i] == arr[k]) {
					isDuplicate = true;
					break;
				}
			}
			if (isDuplicate) {
				continue;
			}

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}

	}

}
