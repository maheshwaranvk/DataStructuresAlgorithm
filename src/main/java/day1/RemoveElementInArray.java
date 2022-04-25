package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveElementInArray {

	/*
	 * 
	 * Problem : Given an integer array and the target, remove the matching target
	 * from the array
	 * 
	 * PseudoCode 1. Get the Input Array & Target 2. Traverse through the array
	 * using while loop 3. if the array element is equal to the target element,
	 * ignore 4. if not add the element to the list 5. convert the list to array &
	 * return it
	 * 
	 * 
	 */

	@Test
	private void example1() {
		int[] array1 = { 4, 2, 3, 6, 8 };
		int target = 4;
		int[] output = { 2, 3, 6, 8 };

		removeElementFromArray(array1, target, output);
	}

	private void removeElementFromArray(int[] array1, int target, int[] output) {
		List<Integer> newArray = new ArrayList<Integer>();
		int i = 0;
		while (i < array1.length) {
			if (array1[i] != target) {
				newArray.add(array1[i]);
			}

			i++;
		}

		for (Integer integer : newArray) {
			System.out.println(integer);
		}

	}

}
