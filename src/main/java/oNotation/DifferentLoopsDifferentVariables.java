package oNotation;

import org.testng.annotations.Test;

public class DifferentLoopsDifferentVariables {
	
	
	@Test
	private void example1() {
		
		int [] a = {34,12,65,8};
		int [] b = {12,76,34,21,8};
		IntersectionOfTwoArrays(a, b);

	}
	
	private void IntersectionOfTwoArrays(int [] a, int [] b) {
		
		for (int i = 0; i < a.length; i++) { //O[n]
			for (int j = 0; j < b.length; j++) { //O[m]
				if(a[i]==b[j]) System.out.println(a[i]);
			}
		}

	}

}
