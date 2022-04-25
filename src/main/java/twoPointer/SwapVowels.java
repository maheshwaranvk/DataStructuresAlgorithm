package twoPointer;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SwapVowels {
	
	
	/*
	 * Problem : In a Given String "Hello", swap only the Vowels and the output 
	 * must be "holle"
	 * 
	 * Pesudo Code
	 * 1. Get the Input String and convert into Array
	 * 2. Set Left = 0; right = length of array - 1
	 * 3. Create a new method isVowel
	 * 		i. if the given character is a vowel, it should return true
	 * 		ii. else return false
	 * 4. if character at left & character & right is a vowel swap and left ++, right --
	 * 5. only left is vowel --> right --
	 * 6. only right is vowel --> left ++
	 * 
	 */
	@Test //PositiveCase
	private void example1() {
		String a = "mahesh";
		swapVowels(a);

	}
	
	@Test //EdgeCase
	private void example2() {
		String a = "sun";
		swapVowels(a);

	}
	
	@Test //EdgeCase
	private void example3() {
		String a = "Moon";
		swapVowels(a);

	}
	
	@Test //NegativeCase
	private void example4() {
		String a = "dry";
		swapVowels(a);

	}

	private void swapVowels(String a) {
	
		char[] ar = a.toCharArray();
		int left = 0, right = ar.length-1;
		boolean found=false;
		
		while (left<right) {
			
			if(isVowel(ar[left])==true && isVowel(ar[right])==true) {
				char temp = ar[left];
				ar[left++] = ar[right];
				ar[right--]= temp;
				found = true;
				continue;
			}
			else if(isVowel(ar[left])==true) right --;
			else left ++;
		}
		
		System.out.println(Arrays.toString(ar));

	}
	
	private boolean isVowel(char a) {
		if (a=='a' || a=='e' ||a=='i' ||a=='o' ||a=='u' ) return true;
		else return false;

	}

}
