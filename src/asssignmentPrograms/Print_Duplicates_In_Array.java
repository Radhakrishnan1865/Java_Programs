package asssignmentPrograms;

public class Print_Duplicates_In_Array {

	public static void main(String[] args) {
		
		int[]ar= {3,6,5,9,2,5,3,2};
		for(int i=0; i<ar.length; i++) {
			
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]==ar[j]) {
					System.out.println(ar[i]);
				}
			}
		}

	}

}
