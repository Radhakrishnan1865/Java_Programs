package asssignmentPrograms;

public class Compare_Two_String {

	public static void main(String[] args) {
		
		String s1="Radha";
		String s2="Rakkis";
		
		boolean bo=false;
		
		for(int i=0; i<s1.length(); i++) {
			
			if(s1.charAt(i)!=s2.charAt(i)) {
				bo= false;
				break;
			}
			bo= true;
		}
			System.out.println(bo);
	
			
	}

}
