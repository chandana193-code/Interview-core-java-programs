/*
1.Find the Largest Element in an Array
2.Find the Smallest Element in an Array
3️⃣ Sort an Array (Ascending Order)
4️⃣ Search an Element in an Array (Linear Search)
5️⃣ Find Duplicate Elements in an Array
6️⃣ Remove Duplicates from an Array (using Set)
7️⃣ Find Second Largest Element
8️⃣ Reverse an Array
9️⃣ Check if Array is Sorted
🔟 Merge Two Arrays
 */

//Find the Largest Element in an Array

package com.arrays.programs;

public class LargestElementInArr {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 19};
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;		
				}
			}
			
		}
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.print("Greatest element in an Array : "+arr[0]);
	}

}
