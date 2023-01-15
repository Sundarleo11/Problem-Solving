package Array;

public class PrimitivesandNonPrimitives  {
	
	
	public static int []  input(int arr[]) {
		
		System.out.println("First"+ arr);
		arr=new int[7];
		int sum=0;
		for(int i=0;i<5;i++) {
			sum+=arr[i];
		}
		System.out.println("input last"+arr);
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5};
		input(arr);
		System.out.println("main"+ arr);
		

	}

}
