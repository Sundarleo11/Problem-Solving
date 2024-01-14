package TimeComplexity;

public class FinduniqueNumber {
	
	public static int UniqueNumber(int arr[]) {
		
		int xor=0;
		for(int i=0;i<arr.length;i++) {
			xor^=arr[i];
		}
		return xor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,1,3,4,4,3,2,6};
		int num=UniqueNumber(arr);
		
		System.out.println("UniqueNumber :"+num);
		

	}

}
