package SearchingSorting;

public class BinarySearch {

	public static int  binarySearch(int []arr,int n) {
		int start=0;
		int end=arr.length-1;
		int index=-1;
		while(start<= end) {
			int mid=(start+end)/2;
			if(arr[mid]==n) {
				index=mid;
				break;
			}else if(arr[mid]<n){
				start=mid+1;
			
			}else {
				end=mid-1;
			}
	}
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1 ,3, 7, 9, 11, 12, 45};
        int n=13;
        int index= binarySearch(arr,n);
         System.out.print(index);
	}

}
