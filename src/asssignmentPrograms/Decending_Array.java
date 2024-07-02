package asssignmentPrograms;

public class Decending_Array {

	public static void main(String[] args) {

		int []b= {400,300,900,100,500,800};

		for(int i=0; i<b.length; i++) {
			
			for(int j=i+1; j<b.length; j++) {
				
				if(b[i]<b[j]) {
					
					int tem=b[i];
					b[i] =b[j];
					b[j]=tem;
					
				}
			}
			
		}
		//System.out.println(Arrays.toString(b));
		
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}

	}

}
