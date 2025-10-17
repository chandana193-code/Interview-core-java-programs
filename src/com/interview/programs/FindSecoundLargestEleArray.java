package com.interview.programs;

public class FindSecoundLargestEleArray {

	public static void main(String[] args) {

		int[] arr = {49,20, 30, 40, 10, 50};
		int l = arr.length;
		
		for(int i = 0; i < l-1; i++) {
			System.out.println(arr[i]);
			for(int j = 0; j < l-1-i; j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < l; i++) {
			System.out.print( arr[i] + " ");
		}
		System.out.println();
		System.out.println("secound largest element in an array : " + arr[1]);
	}

}
