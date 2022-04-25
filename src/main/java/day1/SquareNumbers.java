package day1;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareNumbers {

	/*
	 * Problem : Given sorted integer array in non decreasing order, return the
	 * array of square of each number sorted in non decreasin order
	 * 
	 * 
	 * PseudoCode
	 * 
	 * 1. Get the input array 2. Traverse through the array and multiple the number
	 * by itself and store in the same location 3. Finally, sort the array 4. Print
	 * & return
	 * 
	 */

	@Test // +ve TestCase
	private void example1() {
		int[] array1 = { 2, 3, 5, 7, 9 };
		int[] output = { 4, 9, 25, 49, 81 };
		squareOfNumber(array1, output);

	}

	@Test // Edge TestCase
	private void example2() {
		int[] array1 = { -2, -6, 2, 3, 5, 7, 9 };
		int[] output = { 4, 4, 9, 25, 36, 49, 81 };
		squareOfNumber(array1, output);
	}

	@Test // Edge TestCase
	private void example3() {
		int[] array1 = { 0 };
		int[] output = { 0 };
		squareOfNumber(array1, output);
	}

	private void squareOfNumber(int[] array1, int[] output) {
		for (int i = 0; i < array1.length; i++) {
			array1[i] = array1[i] * array1[i];
		}

		Arrays.sort(array1);
		Assert.assertTrue(Arrays.equals(array1, output));
		// System.out.println(Arrays.toString(array1));

	}

}
