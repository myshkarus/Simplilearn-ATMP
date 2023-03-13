package collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> list1 = new LinkedList<String>();
		
		list1.add("John");
		list1.add("Leeana");
		list1.add("Priyanka");
		list1.add("Rohan");
		list1.add("Laurence");

		System.out.println("List is this " + list1);
		System.out.println("Size of LinkedList is " + list1.size());

	}

}
