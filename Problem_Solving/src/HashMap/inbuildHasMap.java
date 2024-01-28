package HashMap;

import java.util.HashMap;
import java.util.Set;

public class inbuildHasMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<>();

		// Insert
		map.put("abc", 1);
		map.put("def", 2);
		//map.put("abc", 1);
		map.put(null, null);

		// size of HashMap
		System.out.println("Size :" + map.size());

		if (map.containsKey("abc")) {
			System.out.println("it's contain key");
		}

		// not there key
		if (map.containsKey("abc1")) {
			System.out.println("it's contain key");
		}

		// get Value might be possible null value
		int value = map.get("abc");
		System.out.println("values: " + value);

		int v1 = 0;
		if (map.containsKey("abc1")) {
			v1 = map.get("abc1");
		}
		System.out.println("values :" + v1);

		map.remove("abc1");
		map.remove("abc");

		Set<String> keyvalue = map.keySet();

		for (String str : keyvalue) {
			System.out.println(str);
		}

	}

}
