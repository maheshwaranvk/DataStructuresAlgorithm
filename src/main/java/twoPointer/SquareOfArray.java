package twoPointer;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SquareOfArray {
	
	/*
	 * Problem : Given the array, return with sorted square of array
	 * 
	 * Pseudo Code
	 * 1. Get the input array
	 * 2. initialize left = 0, right = array length -1
	 * 3. initialize a new array with the same length of input array
	 * 4. interate through the loop with conidition left < right
	 * 		 use Math.Abs() to convert the -ve number to +ve
	 * 			i. if num at left < num at right --> num at array length -1 = right * right right --
	 * 			ii. else --> num at array length -1 = left * left left++
	 * 5. Print the new Array
	 * 
	 */
	
	@Test
	private void example1() {
		int a[] = {1,4,7,9};
		sortSquareArray(a);

	}
	
	@Test
	private void example2() {
		int a[] = {-10,-6,1,4,7,9};
		sortSquareArray(a);

	}

	private void sortSquareArray(int[] a) {
	
		int left = 0, right = a.length-1;
		int [] finalArray = new int[a.length];
		int indexArray = a.length-1;
		
		while (left <= right) {
			if(Math.abs(a[left])<Math.abs(a[right])) 
					finalArray[indexArray--]=a[right]*a[right--];
			else 
					finalArray[indexArray--]=a[left]*a[left++];
		}
		
		System.out.println(Arrays.toString(finalArray));
		
	}

}
