package twoPointer;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class RemoveAnElementArray {

	/*
	 * 
	 * Problem : In the given array, remove the given element
	 * 
	 * Pseudo Code
	 * 
	 * 1. Get the input array and the element to remove 2. Set left = 0; right =
	 * array length -1 3. Iterate through loop with condition left < right i. if
	 * number at left!= removeNumber && number at right!=removeNumber add number at
	 * left & number at right to list ii. if number of left!= removeNumber add
	 * number at left to list iii. else add number at right to list
	 * 
	 * 4. convert list to array and print
	 */

	@Test // positiveCase
	private void example1() {
		int[] a = { 2, 3, 4, 5, 6, 7, 8 };
		int k = 6;

		removeNumArray(a, k);

	}

	@Test // EdgeCase
	private void example2() {
		int[] a = { 2, 3, 4, 5, 6, 6, 7, 8 };
		int k = 6;
		removeNumArray(a, k);

	}
	
	@Test // NegativeCase
	private void example3() {
		int[] a = { 2, 3, 4, 5, 6, 6, 7, 8 };
		int k = 10;
		removeNumArray(a, k);

	}

	private void removeNumArray(int[] a, int k) {
		int left = 0, right = a.length - 1;
		boolean found = true;

		List<Integer> arr = new ArrayList<Integer>();

		while (left < right) {
			if (a[left] != k && a[right] != k) {
				arr.add(a[left++]);
				arr.add(a[right--]);
				found = true;
				continue;
			} else if (a[left] != k) {
				arr.add(a[left++]);
				found = true;
				continue;
			}

			else if (a[right] != k){
				arr.add(a[right--]);
				found = true;
				continue;
			}
			else {left++ ; right--;}
		}
		
		if (!found)
			System.err.println("Number not found in array");

		for (Integer integer : arr) {
			System.out.print(integer + ",");
		}

		
		System.out.println();
	}

}
