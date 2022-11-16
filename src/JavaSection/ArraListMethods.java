package JavaSection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraListMethods {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> number = new ArrayList<Integer> (Arrays.asList(10,20,30,40));
		System.out.println(number);
		
		int i[] = {10,20,30,40,50,60};// Array literals
		System.out.println(i[2]);
		
		for( int e : i) {
			System.out.println(e);
		}
		
		ArrayList<String> name = new ArrayList<String> (Arrays.asList("Java","Python","JS"));
		System.out.println(name);
		
		ArrayList<String> l8 = new ArrayList<String> (Arrays.asList("A","B","C","D","F"));
		
		l8.add(5,"N");
		System.out.println(l8);
			
		
		
		
		

	}

}
