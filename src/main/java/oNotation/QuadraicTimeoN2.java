package oNotation;

import org.testng.annotations.Test;

public class QuadraicTimeoN2 {
	
	/*
	 * Find smallest Number in an array
	 * 
	 * Pseudo Code
	 * 
	 * 1. Get the input array
	 * 2. Traverse through the array by comparing the next number with current number
	 * 3. if currentNum < nextNum --> set smallnumber = currentNum
	 * 4. else iterate through next number in outer loop
	 * 
	 */

	
	private static void findSmallestNumber(int []a) {
		int smallNum = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) 
				{
					smallNum = a[i];
					continue;
				}
				else {
					continue;
				}
			}
		}
System.out.println(smallNum);
	}
	
	public static void main(String[] args) {
		int [] a = {32,23,45,111,13};
		
		findSmallestNumber(a);
	}
}
