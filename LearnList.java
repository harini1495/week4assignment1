package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		List<Object> obj = new ArrayList<Object>();
		obj.add("Harini");
		obj.add("Ganesh");
		obj.add(14111995);
		obj.add(26);
		obj.add(8754446485l);
		obj.add(5.7f);
		
		
		System.out.println(obj);
		//Arrange the order
		//Collections.sort(obj);		
		//to add the element in the list
		System.out.println(obj.add("Guhan"));
		System.out.println(obj);
		//get - particular element printed by using index
		System.out.println(obj.get(3));
		//size - count of the element
		System.out.println(obj.size());
		//contains - given element is present or not
		System.out.println(obj.contains("Guhan"));
		//remove -  delete the element
		System.out.println(obj.remove(2));
		System.out.println(obj);
		//isempty
		System.out.println(obj.isEmpty());
		
		
	}
}
