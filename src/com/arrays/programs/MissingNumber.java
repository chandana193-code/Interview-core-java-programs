// Find Missing Number (1 to n)

package com.arrays.programs;

public class MissingNumber {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 6};
        int n = arr.length + 1; // 5+1 = 6
        int sum = n * (n + 1) / 2; // 6*(6+1)/2 = 42/2 = 21
        int arraySum = 0;

        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i]; // 16
        }

        System.out.println("Missing Number: " + (sum - arraySum)); // 21 - 16 = 5
	}

}

