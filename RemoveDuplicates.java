package week4.day1;
import java.util.TreeSet;
import java.util.Set;

public class RemoveDuplicates {	
	
	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";	
        String[] split = text.split(" ");
		
		Set<String> removedup = new TreeSet<String>();
		
		for (int i = 0; i < split.length; i++) {
			
			removedup.add(split[i]);
			
			}
		System.out.println(removedup);

	}

}
