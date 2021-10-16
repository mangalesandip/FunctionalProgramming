package io.java8.predicate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import io.java8.Person;

public class ExcerciseJava8Predicate {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charlers", "Dicknes", 42, 10000), new Person("Lewis", "Cornell", 49, 6000),
				new Person("Charlle", "Branote", 35, 7090), new Person("Mathew", "Arnold", 32, 1000));

		System.out.println("=======Print all persons sort  by last name ===========");
		Collections.sort(people, (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));
		printConditionally(people, p -> true);
		System.out.println("=======Pring persons last name starts with C===========");
		printConditionally(people, p -> p.getLastName().startsWith("C"));
		System.out.println("=======Pring persons First name starts with C===========");
		printConditionally(people, p -> p.getFirstName().startsWith("C"));
		System.out.println("Highest salary of employe");
		printConditionally(people, p -> p.getSalary().compareTo(p2.getLastName()));
	}

	private static void printConditionally(List<Person> people,Predicate<Person> predicate) {
		for (Person person : people) {
			if (predicate.test(person)) {
				System.out.println(person);
			}
		}
	}

}
