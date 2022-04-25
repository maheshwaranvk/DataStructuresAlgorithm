package twoPointer;

import org.testng.annotations.Test;

public class TwoSumProblem {
	
	/*
	 * 
	 * Given the input int array, find the sum of any two indices of the matching
	 * given target
	 * 
	 * 
	 *  Pseudo Code
	 *  
	 *  1. Get the Input Array & the Sum Value
	 *  2. initialize left = 0 ; right = arrayLength -1 
	 *  3. Sum the elements at left & right indexes in the array
	 *  	i. if sum=k, return left & right
	 *  	ii. if sum < k, left ++
	 *  	iii. if sum > k , right --
	 */
	
	@Test
	private void example1() {
		int[] a = {0,1,3,4,5,6,7};
		int k = 7;
		
		twoSum(a,k);

	}

	private void twoSum(int[] a, int k) {
		int left = 0, right = a.length-1;
		boolean found = false;
		
		while(left<right) {
			if(a[left]+a[right]==k) {
				System.out.println(""+a[left++]+", "+a[right--]+"");
				found=true;
				continue;
			}
			else if (a[left]+a[right]<k) left ++;
			else right--;
		}
		
		if(!found) System.out.println("Value not found");
		
	}

}
