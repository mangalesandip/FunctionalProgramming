package io.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExcerciseJava7 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
			new Person("Charlers","Dicknes",42),
			new Person("Lewis","Cornell",49),
			new Person("Charlle","Branote",35),
			new Person("Mathew","Arnold",32)
		);
		
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
		System.out.println("+===============Sorted by Last Name================");
		printAll(people);
		
		System.out.println("+===============Last name beginig with C ================");
		printConditionally(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
		});
		
		System.out.println("+===============Fist name beginig with C ================");
		printConditionally(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("C");
			}
		});
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person person : people) {
			if(condition.test(person)) {
				System.out.println(person);
			}
		}
	}

	private static void printAll(List<Person> people) {
		for (Person person : people) {
			System.out.println(person);
		}
		
	}

}

interface Condition{
	public boolean test(Person p);
}
