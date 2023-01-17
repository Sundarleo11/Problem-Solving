package SearchingSorting;

public class SelectionSort {
	
	public static int[] SelectionSort(int arr[]) {
		
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			int min=arr[i];
			int MinIndex=i;
			for(int j=i;j<arr.length;j++) {
				if(min>arr[j]) {
					min=arr[j];
					 MinIndex=j;
				}
			
			}
			
			int temp=arr[i];
			arr[i]=arr[MinIndex];
			arr[MinIndex]=temp;
			
		}
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {2, 13, 4, 1, 3, 6, 28};
        int Selection[]=SelectionSort(arr);
        
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
	}

}
