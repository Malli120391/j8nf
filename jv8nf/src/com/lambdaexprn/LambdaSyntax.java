package com.lambdaexprn;

interface AddInterfaceLam {
public int addTwonumbers(int a , int b);
	
}


public class LambdaSyntax {

	public static void main(String[] args) {

	}
	AddInterfaceLam addInterfaceLam = (a, b) -> a+b;

}
interface DisplayInterface {
	public void addTwonumbers();
	
}