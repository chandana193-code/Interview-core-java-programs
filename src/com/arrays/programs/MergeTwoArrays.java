//Merge Two Arrays

package com.arrays.programs;

public class MergeTwoArrays {

	public static void main(String[] args) {

		int[] arr1 = {1, 2, 3, 4};
		int[] arr2 = {5, 6, 7, 8};
		
		int l1 = arr1.length;
		int l2 = arr2.length;
		
		int[] mergeArr = new int[l1+l2];
		
		for(int i = 0; i < l1; i++) {
			mergeArr[i] = arr1[i];
		}
		for(int i = 0; i < l2; i++) {
			mergeArr[l1+i] = arr2[i];
		}
		
		for(int i = 0; i < mergeArr.length; i++) {
			System.out.print(mergeArr[i]+" ");
		}
		
		
	}

}
