package week4.day1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		
		List<Integer> large =  new LinkedList<Integer>();
		
		for (int i = 0; i < data.length; i++) {
			
			large.add(data[i]);
		}
		
		Collections.sort(large);
		
		System.out.println(large);
		
		int size = large.size();
		
		System.out.println("The second largest is "+large.get(size-2));
	}
}