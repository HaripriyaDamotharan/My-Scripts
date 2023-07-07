package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,7,6,8};
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			list1.add(arr[i]);
			
		}
		
		Collections.sort(list1);
		
		for (int i = 1; i < arr.length-1; i++) {
			if (list1.get(i-1) !=i) {
				System.out.println("Missing value is " +i);
				
			}
			
		}
		
	}

}
