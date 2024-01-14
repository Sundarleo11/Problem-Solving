package TimeComplexity;

public class FindDublicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {0, 7, 2, 5, 4, 7, 1, 3, 6,};
		
		
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
					
		}
		int n=arr.length;
		int naturalNumber=((n-1)*(n-2)/2);
		
		
		
		int Dublicate=sum-naturalNumber;
		
		System.out.println("Dublicate Number :"+Dublicate);

	}

}
