package SearchingSorting;

public class Largest2Num {
	
	public static void BubbleSort(int arr[]) {
		
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		//int secondNum=n-1;
		System.out.print("Second Largest Number in the array : " + arr[n-2]);
		
		/*
		 * for(int i=0;i<arr.length;i++) { System.out.print(arr[i]+" "); }
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2, 13, 4, 1, 3, 6, 28};
		BubbleSort(arr);

	}

}
