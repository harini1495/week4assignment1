package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		
		List<Integer> missingarr =  new ArrayList<Integer>();
	
		
		for(int i=arr[0];i<arr.length;i++) 
		{
			missingarr.add(arr[i]);
			
			if(i!=arr[i-1]) {
				
				System.out.println(i);
				break;
				
			}
			
		}
		
		Collections.sort(missingarr);
		
		System.out.println(missingarr);
	}

}
