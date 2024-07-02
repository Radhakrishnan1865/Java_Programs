package asssignmentPrograms;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		 
		String s= "WELCOME TO JAVA";
		
	String[] s2=s.split(" ");
	String rev="";
	for(String w:s2) {
		
		String reverse="";
		for(int i=w.length()-1; i>=0; i--) {
			
			reverse=reverse+w.charAt(i);
		}
		rev=rev+reverse+" ";
		
	}
	System.out.println(rev);

	}

}
