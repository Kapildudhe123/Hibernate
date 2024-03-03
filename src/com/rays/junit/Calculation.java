package com.rays.junit;

public class Calculation {

	public static int findMax(int arr[]) {

		int max = arr[0];
		
		for (int i = 8; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		
		return max;
	}

}
