package io.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

public class HighestSalaryDemo {
	public static void main(String[] args) {
		List<Employee> allEmployees = Arrays.asList(new Employee("Dicknes", "IT", 10000), new Employee("Lewis", "Dept1", 6000),
				new Employee("Charlle", "IT", 7090), new Employee("Mathew", "Dept1", 1000));
				
				Map<String, Employee> topEmployees =
			    allEmployees.stream()
			                .collect(groupingBy(
			                    e -> e.department,
			                    collectingAndThen(maxBy(comparingInt(e -> e.salary)), Optional::get) 
			                ));
				topEmployees.forEach((k, v) -> {
					System.out.println("Key: " + k + ", Value: " + v.getSalary());
				});
	}
	
}
