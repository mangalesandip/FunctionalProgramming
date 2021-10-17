package io.java8.unit3;

public class MethodReferenceExample1 {
	public static void main(String[] args) {
		Thread t = new Thread(()->pringMsg());
		t.start();
		
		Thread t1 = new Thread(MethodReferenceExample1 :: pringMsg); // without parameter
		t1.start();
		
	}
	public static void pringMsg() {
		System.out.println("This method ref.");
	}
}
