package ArrayList;

import java.util.ArrayList;

public class RemovecontionusDublicateNumber {
	
	public static ArrayList<Integer> RemoveDublicateNumber(int arr[]) {
		
		ArrayList<Integer> num=new ArrayList<>();
		num.add(arr[0]);
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1]) {
				num.add(arr[i]);
			}
		}
		
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,10,20,20,30,30,40,50,40,10};
		
		ArrayList<Integer> num	=RemoveDublicateNumber(arr);

		for(int i:num) {
			System.out.println(i);
		}
	}

}
