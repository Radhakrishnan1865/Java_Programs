package asssignmentPrograms;

public class ReverseString_Uppercase {

	public static void main(String[] args) {
		
		String s="Radhakrishnan";
		String s1="";
		String rev="";
		char[]ch= s.toCharArray();
		for(int i=0; i<ch.length; i++) {
			char c=ch[i];
			if(c>='a'&&c<'z') {
				char up=Character.toUpperCase(c);
				s1=s1+up;
			}
			else
				s1=s1+c;
		}

		System.out.println(s1);
		char[] ch1= s1.toCharArray();
		for(int j=ch1.length-1; j>=0; j--) {
			char a=ch1[j];
			rev=rev+a;
		}
		System.out.println(rev);
	}

}
