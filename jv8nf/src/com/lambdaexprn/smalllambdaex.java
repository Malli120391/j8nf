package com.lambdaexprn;

interface DisplayInterface1{
	public void displayjff();
}


public class smalllambdaex {

	public static void main(String[] args) {
		 
	DisplayInterface1 daisplayInterface = () -> System.out.println("Hello Lambda");
	daisplayInterface.displayjff();
}
}