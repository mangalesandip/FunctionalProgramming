package com.java8.functional;

import java.util.Arrays;
import java.util.List;

public class FP01Functional {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(45,56,70,25,67,53,88);
		printAllNumbersInListStructure(numbers);
		printEvenNumbersInListFunctional(numbers);
	}

	
	private static boolean isEven(Integer number) {
		return number%2 ==0;
	}
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		System.out.println("Functional");
//		numbers.stream()
//		.filter(FP01Functional::isEven)
//		.forEach(System.out :: println);// Method reference
		
		numbers.stream()
		.filter(number -> number%2 == 0)
		.forEach(System.out :: println);// Method reference

	}

	private static void printAllNumbersInListStructure(List<Integer> numbers) {
		numbers.stream()
			.forEach(System.out :: println);// Method reference
	}
	
	
}
