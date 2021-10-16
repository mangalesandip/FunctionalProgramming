package io.java8.predicate;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		int[] sumNumbers = {1,2,3,4};
		int key = 0 ;
		process(sumNumbers, key, (v,k) -> System.out.println(v/k) );
	}

	private static void process(int[] sumNumbers, int key, BiConsumer<Integer, Integer>  biConsumer) {
		for (int i : sumNumbers) {
			biConsumer.accept(i, key);
		}
		
	}
	
	

}
