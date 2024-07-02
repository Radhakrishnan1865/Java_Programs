package asssignmentPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Array_Duplicate {

	public static void main(String[] args) {
		
		int []ar= {10,40,20,60,10,20,90,60,30};
		
		Set<Integer> s= new LinkedHashSet<Integer>();
		
		for(int i=0; i<ar.length; i++) {
			
			s.add(ar[i]);
		}
		/*
		for(Integer arr:s) {
			
			System.out.println(arr);
		}*/
System.out.println(s);
	}

}
