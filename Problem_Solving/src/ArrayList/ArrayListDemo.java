package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(10);
		arr.add(20);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(10);
		arr.add(40);
		arr.add(60);
		arr.add(90);
		// System.out.println(arr.get(1));
		System.out.println("before size :"+arr.size());
        arr.set(0, 100);
        System.out.println("before size set :"+arr.size());
        arr.add(3, 160);
        System.out.println("before size add :"+arr.size());
		System.out.println("For Loop");
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("Each for loop");
		for (Integer a : arr) {
			System.out.println(a);
		}

	}

}
