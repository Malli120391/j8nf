package com.lambdaexprn;

import java.util.function.Function;

public class FunctionandThenDemo1 {

	public static void main(String[] args) {

		Function<String, String> function1 = s -> s.toUpperCase();
		Function<String, String> function2 = s -> s + "World";
		
		System.out.println("OutPut Of Function1: " + function1.apply("Hello"));
		
		System.out.println("OutPut Of Function2: " + function1.andThen(function2).apply("Hello"));
	}

}
