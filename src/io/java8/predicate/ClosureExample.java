package io.java8.predicate;

import java.util.function.Consumer;

public class ClosureExample {
	public static void main(String[] args) {
		int a= 10;
		int b= 20;
		processLambda(a, (i) -> System.out.println(i+b));
	}

	private static void processLambda(int a, Consumer<Integer> consumer) {
		consumer.accept(a);
	}
	
}
