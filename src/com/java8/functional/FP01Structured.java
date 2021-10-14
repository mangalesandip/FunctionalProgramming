package com.java8.functional;

import java.util.Arrays;
import java.util.List;

public class FP01Structured {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(45,56,70,25,67,53,88);
		printEvenNumbersInListStructure(numbers);
	}

	private static void printEvenNumbersInListStructure(List<Integer> numbers) {
		System.out.println("Strucural");
		for (Integer number : numbers) {
			if(number%2 == 0) {
				System.out.println(number);
			}
		}
		
	}
	

	
}
