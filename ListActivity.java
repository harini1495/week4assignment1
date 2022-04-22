package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListActivity {
	
	public static void main(String[] args) {
		//Missing element finding program
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(7);
		arr.add(6);
		arr.add(8);
		Collections.sort(arr);
		for(int i=0;i<arr.size();i++) {
			 if(arr.get(i)!=i+1) {
                 System.out.println("Missing number is: "+(i+1));
              break;
                }
                }
		}
		
	}


