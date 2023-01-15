package Array;

public class PairSum_Dublicate {

	public static void PairSum_Dublicate(int arr[]) {
		int i, j;
        int sum=0;
		for (i = 0; i < arr.length; i++) {
			
			for (j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]+" ");
					sum+=arr[j];
				}
				
			}
			
		}
		if(sum>0) {
			System.out.println("SUM:"+sum);
		}else {
			System.out.println("No Dublicate");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]= {1, 3, 6, 2, 5, 4, 3, 2, 4};
		int arr[]= {1, 3, 6, 2 ,5, 4, 3, 9, 4};
		//int arr[]= {1, 3, 0, 2 ,5, 6, 8, 9, 4};
		PairSum_Dublicate(arr);

	}

}
