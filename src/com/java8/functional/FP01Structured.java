package com.java8.functional;

import java.util.Arrays;
import java.util.List;

public class FP01Structured {
	public static void main(String[] args) {
		printAllNumbersInListStructure(Arrays.asList(45,56,70,88));
		
	}

	private static void printAllNumbersInListStructure(List<Integer> numbers) {
		numbers.stream()
			.forEach(System.out :: println);// Method reference
	}
}
