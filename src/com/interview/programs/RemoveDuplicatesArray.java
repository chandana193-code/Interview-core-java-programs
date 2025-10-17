package com.interview.programs;

public class RemoveDuplicatesArray {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 4, 5, 5, 6};
		int l = arr.length;
		
		for(int i = 0; i < l; i++) {
			boolean isDuplicate = false;
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					isDuplicate = true;
				System.out.print(arr[i]+" ");
					
				}
				
			}
		}
		
	}

}
