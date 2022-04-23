package day1;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class TwoSumProblem {

	/*
	 * 
	 * Given the input int array, find the sum of any two indices of the matching
	 * given target
	 * 
	 * 
	 * Pseudo- Code 1. Take the input array 2. Traverse through each element of the
	 * array using loop 3. Add the next element with the outer loop 4. Compare with
	 * the target, i. if it matches, store them in a list ii. if not, continue
	 * 
	 */

	// @Test //PositiveTestCase
	private void example1() {

		int[] exe1 = { 2, 3, 1, 4, 0, 5 };
		int target = 5;
		problemImplementation(exe1, target);

	}

	// @Test //NegativeTestCase
	private void example2() {

		int[] exe2 = {};
		int target2 = 5;
		problemImplementation(exe2, target2);
	}

	@Test // EdgeCaseScenario
	private void example3() {

		int[] exe3 = { -10, -1, -4, 2, 3, 1, 4, 0, 5, 15 };
		int target3 = 5;
		problemImplementation(exe3, target3);
	}

	// 1stApproach
	private void problemImplementation(int[] inputArray, int target) {

		List<String> twoSum = new ArrayList<String>();

		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {

				if (inputArray[i] + inputArray[j] == target) {
					twoSum.add("" + inputArray[i] + "," + inputArray[j] + "");
					break;

				} else
					continue;
			}

		}
		for (String string : twoSum) {
			System.out.println(string);
		}
	}

}
