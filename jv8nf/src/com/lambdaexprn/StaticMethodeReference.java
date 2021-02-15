package com.lambdaexprn;

interface MethodeRefence{
	void hellomethodreference();
}


public class StaticMethodeReference {
	static void hellomethodreference() {
		System.out.println("asadadadadadada");
	}

	public static void main(String[] args) {

		MethodeRefence methodeRefence = StaticMethodeReference::hellomethodreference;
		methodeRefence.hellomethodreference();
	}

}
