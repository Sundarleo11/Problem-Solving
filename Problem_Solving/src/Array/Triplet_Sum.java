package Array;

public class Triplet_Sum {
	
	
	public static void Triplet_Sum(int arr[],int n) {
		int c,sum=0;
		for(int i=0;i<arr.length-2;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				for(int k=j+1;k<arr.length;k++) {
					c=0;
					if(arr[i]+arr[j]+arr[k]==n) {
						int max=Math.max(arr[i], Math.max (arr[j], arr[k]));
						int min=Math.min(arr[i], Math.min (arr[j], arr[k]));
						int mid=n-max-min;
						c++;
						//System.out.println(min+""+mid+""+max);
						//System.out.println(c);
						sum+=c;
					}
					
				}
				
			}
			
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 2, 3, 4, 5, 6,7 };
		int n=12;
		Triplet_Sum(arr,n);

	}

}
