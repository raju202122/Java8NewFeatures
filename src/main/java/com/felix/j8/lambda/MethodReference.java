package com.felix.j8.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author rajua
 *
 */
public class MethodReference {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc", "xyz", "pqr");

		// 1
		// Consumer is a FunctionalInterface which has "void accept(T)" abstract method.
		Consumer<String> c = s -> System.out.println(s);
		list.forEach(c); // prints the list

		// 2
		list.forEach(s -> System.out.println(s)); // prints the list

		// 3; By Using Method Reference
		list.forEach(System.out::println); // prints the list.

		// 4
		// Comparator is a FunctionalInterface which has "int compare(T, T)" abstract
		// method.
		Comparator<Integer> comp = (i1, i2) -> Integer.compare(i1, i2); // Integer.compare is static method

		// 5; By Using Method Reference on static method
		Comparator<Integer> compUsingMethodRef = Integer::compare;
	}
}
