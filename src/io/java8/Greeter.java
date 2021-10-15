package io.java8;

public class Greeter {
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter greeter  = new Greeter();
//		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
//		greeter.greet(helloWorldGreeting);
		
		Greeting myLambadaFunction = () -> System.out.println("Hello World");
		//greeter.greet(myLambadaFunction);
		myLambadaFunction.perform();
	}
}

interface MyLambda {
	public void perform();
}
