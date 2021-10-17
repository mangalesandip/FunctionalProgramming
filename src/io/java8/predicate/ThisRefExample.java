package io.java8.predicate;

public class ThisRefExample {
	public void doProcess(int i, Process p) {
		p.process(i);
	}
	public static void main(String[] args) {
		ThisRefExample thisRefExample =new ThisRefExample();
		thisRefExample.doProcess(10, new Process() {
			@Override
			public void process(int i) {
				System.out.println("i=>"+ i);
				System.out.println(this);
			}
			
			public String toString() {
				return "This is annoumous inner class";
			}
		});
		
	}
	
}

interface Process{
	void process(int i);
}