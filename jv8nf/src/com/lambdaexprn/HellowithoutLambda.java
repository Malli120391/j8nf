package com.lambdaexprn;

interface HelloInterface{
	public void displayhello();
}

class HelloInterafcewithoutlambda implements HelloInterface{

	@Override
	public void displayhello() {

		System.out.println("Hello with out Lambda");
	}

}

public class HellowithoutLambda {

	public static void main(String[] args) {

		HelloInterafcewithoutlambda helloInterafcewithoutlambda = new HelloInterafcewithoutlambda();
		helloInterafcewithoutlambda.displayhello();
	}

}
