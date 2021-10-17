package io.java8.unit3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.java8.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charlers", "Dicknes", 42), new Person("Lewis", "Cornell", 49),
				new Person("Charlle", "Branote", 35), new Person("Mathew", "Arnold", 32));

		System.out.println("======= For: Loop exmple ===========");
		for(int i=0;i<people.size();i++) {
			System.out.println(people.get(i));
		}
		
		//External iterator
		System.out.println("======= For Each: Loop exmple ===========");
		for (Person person : people) {
			System.out.println(person);
		}
		
		//Internal order
		System.out.println("======= For Each Internal: Loop exmple ===========");
		people.forEach(p -> System.out.println(p));
		
		System.out.println("======= For Each Internal: Loop exmple Method ref. Example ===========");
		people.forEach(System.out:: println);
	}


}
