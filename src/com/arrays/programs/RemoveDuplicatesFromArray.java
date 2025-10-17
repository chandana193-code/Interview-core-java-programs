//Remove Duplicates from an Array (using Set)

package com.arrays.programs;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {

		int[] array = {1, 2, 3, 3, 4, 5};
		Set<Integer> set = new HashSet<>();
		
		for (int num : array) {
			set.add(num); 
		}

		System.out.println("Array without duplicates: " + set);
	}

}
