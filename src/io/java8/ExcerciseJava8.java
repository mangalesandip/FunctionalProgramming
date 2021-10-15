package io.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExcerciseJava8 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
			new Person("Charlers","Dicknes",42),
			new Person("Lewis","Cornell",49),
			new Person("Charlle","Branote",35),
			new Person("Mathew","Arnold",32)
		);
		
		Collections.sort(people, (p1, p2)  -> p1.getLastName().compareTo(p2.getLastName()));
		System.out.println("+===============Sorted by Last Name================");
		printConditionally(people, p -> true);
		
		System.out.println("+===============Last name beginig with C ================");
		printConditionally(people, p -> p.getLastName().startsWith("C"));
		System.out.println("+===============Fist name beginig with C ================");
		printConditionally(people, p -> p.getFirstName().startsWith("C"));
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person person : people) {
			if(condition.test(person)) {
				System.out.println(person);
			}
		}
	}
}

