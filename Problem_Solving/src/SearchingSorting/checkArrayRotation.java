package SearchingSorting;

public class checkArrayRotation {
	
	public static void checkArrayRotation(int arr[]) {
		int min=arr[0], index=0;
		
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
				index=i;
				//index++;
			}
		}
		System.out.println(index);
		//return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int arr[]= {5, 6, 1, 2, 3, 4};
		   int arr[] ={10, 20, 30, 1};
		checkArrayRotation(arr);

	}

}
