package io.java8.predicate;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		int[] sumNumbers = {1,2,3,4};
		int key = 0 ;
		process(sumNumbers, key, wrapperLambda((v,k) -> System.out.println(v/k)));
		process(sumNumbers, key, (v,k) -> System.out.println(v+k));
	}

	private static void process(int[] sumNumbers, int key, BiConsumer<Integer, Integer>  biConsumer) {
		for (int i : sumNumbers) {
			biConsumer.accept(i, key);
		}
	}
	
	private static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer){
		return (v,k)->{
			try {
			biConsumer.accept(v, k);
			}catch(Exception e) {
				System.out.println("Arithmetic exception occurred");
			}
		};
	}

}
