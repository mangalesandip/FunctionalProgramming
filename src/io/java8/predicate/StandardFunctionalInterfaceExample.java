package io.java8.predicate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.java8.Person;

public class StandardFunctionalInterfaceExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charlers", "Dicknes", 42),
				new Person("Lewis", "Cornell", 49),
				new Person("Charlle", "Branote", 35),
				new Person("Mathew", "Arnold", 32));

		System.out.println("=======Print all persons sort  by last name ===========");
		printConditionally(people, p -> true, System.out :: println);
	}

	private static void printConditionally(List<Person> people,Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person person : people) {
			if (predicate.test(person)) {
				consumer.accept(person);
			}
		}
	}

}
