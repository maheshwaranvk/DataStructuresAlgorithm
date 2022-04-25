package twoPointer;

import org.testng.annotations.Test;

public class ArrayIntersection {
	
	/*
	 * 
	 * 
	 * Problem : Given two array, find the intersection of two arrays
	 * 
	 * Pesudo Code : 
	 * 1. Get two arrays
	 * 2. point left = 0 index of first array & right = 0 index of second array
	 * 3. if number at left = number at right --> print the number
	 * 4. if number at left < number at right --> left ++
	 * 5. else --> right ++
	 * 
	 */
	
	@Test //positiveCase
	private void example1() {
		int [] a = {2,3,4,5,6};
		int [] b = {3,5,7,8};
		
		getArrayIntersection(a,b);
	}
	
	@Test //EdgeCase
	private void example2() {
		int [] a = {2,3,3,4,5,6};
		int [] b = {3,5,7,8};
		
		getArrayIntersection(a,b);
	}
	
	@Test //NegativeCase
	private void example3() {
		int [] a = {2,3,3,4,5,6};
		int [] b = {7,8,9,10};
		
		getArrayIntersection(a,b);
	}


	private void getArrayIntersection(int[] a, int[] b) {
		boolean intersection = false;
		int left=0,right = 0;
		while(left < a.length && right < b.length) {
			
			if(a[left]==b[right]) {
			System.out.println(a[left]);
			intersection=true;
			left++; right++;
			continue;
			}
			
			else if(a[left]<b[right])left ++;
			else right ++;
		}
		
		if(!intersection) System.out.println("No Intersection Found");
		
	}

}
