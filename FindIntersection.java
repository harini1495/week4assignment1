package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
	
		int [] arr1= {3,2,11,4,6,7};
		int [] arr2= {1,2,8,4,9,7};
		
		Set<Integer> arr = new LinkedHashSet<Integer>();
		
		for(int i= 0;i<arr1.length;i++) 
		{
			
			for(int j= 0;j<arr2.length;j++) 
			{
				
				if(arr1[i]==arr2[j]) 
				{
					
					arr.add(arr1[j]);
					
				}
			}
			
		}
		System.out.println(arr);
	}
}
