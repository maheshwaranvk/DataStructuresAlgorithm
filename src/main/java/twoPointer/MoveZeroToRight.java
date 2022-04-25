package twoPointer;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MoveZeroToRight {
	
	
	/*
	 * 
	 * Problem : in the given array, move all the zeros to last indexes
	 * 
	 * Pusedo Code
	 * 
	 * 1. Get in input array
	 * 2. initialize left = 0, right = length of array - 1
	 * 3. iterate the loop with the condition left < right
	 * 		i.if number at left = 0 & num at right!=0 --> swap
	 *		ii. num at left!= 0 & num at right = 0 --> left++
	 *		iii. num at left = 0 & num at right =0 --> right--
	 *		iv. num at left !=0 & num at right != 0 --> right--
	 * 4. Print the array
	 */
	@Test//positiveCase
	private void example1() {
		int [] a = {0,5,0,6,0,7};
		moveZeroToLast(a);

	}
	
	@Test //EdgeCase
	private void example2() {
		int [] a = {5,7,8,0,0};
		moveZeroToLast(a);

	}
	
	@Test //NegativeCase
	private void example3() {
		int [] a = {0,0,0,0};
		moveZeroToLast(a);

	}

	private void moveZeroToLast(int[] a) {
		int left = 0, right = a.length-1;
		while(left<right) {
			if(a[left]==0 && a[right]!=0) {
				int temp = a[left];
				a[left++]=a[right];
				a[right--]=temp;
			}
			
			else if (a[left]!=0 && a[right]==0) left++;
			else right--;
		}
		System.out.println(Arrays.toString(a));
		
	}

}
