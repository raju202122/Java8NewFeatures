package com.felix.j8.lambda;

/**
 * @author rajua
 *
 */
@FunctionalInterface
//@FunctionalInterface Compiler gives error if CustomLambda has more than one abstract method except Object methods.
public interface CustomLambda {
	String test(String str);
//	String test2(String str); //compiler gives error here

	boolean equals(Object o); // compiler won't give error here

	public static void main(String[] args) {
		CustomLambda customLambda = (str) -> "test() of CustomLambda is called from " + str;
		new Test().m1(customLambda);
		System.out.println(customLambda.equals(customLambda));
		System.out.println(customLambda);
	}
}

class Test {
	public void m1(CustomLambda customLambda) {
		System.out.println("You've called m1() of Test.");
		String string = customLambda.test("m1() of Test");
		System.out.println(string);
	}
}
