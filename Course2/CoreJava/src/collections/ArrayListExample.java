package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {

		// String[] array1 = {"abc", "pqr", "xyz"};

		ArrayList<String> list1 = new ArrayList<String>();

		list1.add("John");
		list1.add("Leeana");
		list1.add("Priyanka");
		list1.add("Rohan");
		list1.add("Laurence");

		System.out.println("List is this " + list1);
		System.out.println("Size of Array ist is " + list1.size());

		list1.remove(1);

		System.out.println("List is this " + list1);
		System.out.println("Size of Array List is " + list1.size());

		System.out.println("The data at 4th position is " + list1.get(3));

		list1.set(0, "James");

		System.out.println("List is this after replacing John " + list1);

		list1.add(1, "Leana");
		System.out.println("List is this after adding Leana again " + list1);

		// sort in descending order
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("List is this after sort in descending order " + list1);

		Collections.sort(list1);
		System.out.println("List is this after sort " + list1);

		for (int index = 0; index < list1.size(); index++) {
			System.out.println(list1.get(index));
		}

		for (String name : list1) {
			System.out.println(name);
		}

		for (int index = 0; index < list1.size(); index++) {
			if (list1.get(index).equals("Priyanka")) {
				System.out.println(index);
				break;
			}
		}

	}

}
