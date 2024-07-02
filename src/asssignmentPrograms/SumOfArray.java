package asssignmentPrograms;


public class SumOfArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		int sum=0;
		
		
		// for loop
		
		for(int i=0; i<=a.length-1; i++) {
			
			
			sum+=a[i];
			
			/*
			int even=0;
			int odd=0;
			if(a[i]%2==0) {
				even=even+a[i];
			}
			else {
				odd=odd+a[i];
			}
			System.out.println(even);
			System.out.println(odd);
			*/
		}
		
		
		System.out.println(sum);
		System.out.println("---------------");
		
		// Enhanced for loop
		int b[]= {10,20,30,40,50};
		int res=0;
		for(int x:b) {
			res+=x;
			
		}
		System.out.println(res);
	}

}
