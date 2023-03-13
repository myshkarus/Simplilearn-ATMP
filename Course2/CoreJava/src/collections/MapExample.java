package collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();

		map1.put(1, "Matt");
		map1.put(2, "Kate");
		map1.put(3, "Matt");
		map1.put(4, "Paul");
		map1.put(5, "Kathy");
		map1.put(100, "Ronny");

		System.out.println(map1);

		System.out.println("Data at 4th key is " + map1.get(4));
		System.out.println("Data at 100th key is " + map1.get(100));

		map1.remove(100);
		System.out.println(map1);

		for (Integer key : map1.keySet()) {
			System.out.print("Key is: " + key);
			System.out.println(" Value is: " + map1.get(key));
		}
	}
}
