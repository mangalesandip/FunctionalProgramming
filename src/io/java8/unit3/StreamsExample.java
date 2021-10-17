package io.java8.unit3;

import java.util.Arrays;
import java.util.List;

import io.java8.Person;

public class StreamsExample {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charlers", "Dicknes", 42),
				new Person("Lewis", "Cornell", 49),
				new Person("Charlle", "Branote", 35),
				new Person("Mathew", "Arnold", 32));
		
		people.stream()
		.filter(p-> p.getLastName().startsWith("C"))
		.forEach(p -> System.out.println(p.getFirstName() + " "+ p.getLastName()));
	}
}
