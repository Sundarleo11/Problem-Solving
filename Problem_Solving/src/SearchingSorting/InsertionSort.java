package SearchingSorting;

public class InsertionSort {

	public static void InsertionSort(int arr[]) {
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			
			int j=i-1;
			int temp=arr[i];
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
              int arr[]= {2, 13, 4, 1, 3 ,6, 28};
              InsertionSort(arr);
	}

}
