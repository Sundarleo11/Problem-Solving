package Array;

public class AllPairs {

	public static void Pair(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				System.out.println("("+arr[i]+","+arr[j]+")");
				count++;
			}
		}
		System.out.println(count);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,4,7,6,5};
		Pair(arr);

	}

}
