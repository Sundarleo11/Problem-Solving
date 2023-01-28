package SearchingSorting;

public class PushZerostoend {
	
	public static void PushZerostoend(int arr[]) {
		
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] !=0) {
				int temp=0;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
		
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {2, 0, 0, 1, 3, 0, 0};
		PushZerostoend(arr1);
	}

}
