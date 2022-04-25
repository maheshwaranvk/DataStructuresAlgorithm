package twoPointer;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ReverseAString {
	
	
	/*
	 * Given a String 'Hello' , the output should be 'olleH'
	 * 
	 * Psudo Code
	 * 
	 * 1. Get the input String
	 * 2. make left as first variable instance & right as last variable instance
	 * 3. Convert the String to an Array
	 * 4. if Character at left != Character at right, swap the variable
	 * 4. else break;
	 * 
	 */
	
	@Test
	private void example1() {
		String s = "Hello";
		reverseString(s);

	}
	
	@Test
	private void example2() {
		String s = "afsfh";
		reverseString(s);

	}
	
	@Test
	private void example3() {
		String s = "";
		reverseString(s);

	}

	private void reverseString(String s) {
		int left = 0, right = s.length()-1;
		char[] charArray = s.toCharArray();
		
		
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[left]!=charArray[right]) {
				char temp = charArray[left];
				charArray[left++] = charArray[right];
				charArray[right--] = temp;
			}
			else break;
		}
		System.out.println(Arrays.toString(charArray));
	}

}
