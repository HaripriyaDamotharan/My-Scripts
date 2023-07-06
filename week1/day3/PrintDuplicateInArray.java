package week1.day3;

import java.util.Arrays;

public class PrintDuplicateInArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int count = 1;
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]==arr[i+1]) {
				System.out.println("Duplicate value is " +arr[i]);
				count++;
			}
			
		}
		
	}

}
