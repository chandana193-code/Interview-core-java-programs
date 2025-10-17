//Find Second Largest Element

package com.arrays.programs;

public class SecondLargestElement {

	public static void main(String[] args) {

      int[] arr = {6, 7, 33, 8, 25, 9, 10, 19};
		
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
		System.out.print("Greatest element in an Array : "+arr[1]);
	}

}
