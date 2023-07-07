package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLarget {

	public static void main(String[] args) {


		int[] data = {3,2,11,4,6,7};
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < data.length; i++) {
			list.add(data[i]);
					
		}
		
		Collections.sort(list);
		
		int size = list.size();
		System.out.println(list.get(size-2));
		
		//Arrays.sort(data);
		
		//int length = data.length;
		//System.out.println("Second largest number is : "+data[length-2]);
		
		}
	}

