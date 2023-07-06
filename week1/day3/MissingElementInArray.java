package week1.day3;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] arr = {1,3,4,6,8,5,10,12};
		
		int count = 1;
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i+ count) {
				System.out.println("The missing value is " +(i+count));
				count++;

			}
		} 
		
		
	}

}
