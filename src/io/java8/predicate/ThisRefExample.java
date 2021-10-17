package io.java8.predicate;

public class ThisRefExample {
	public void doProcess(int i, Process p) {
		p.process(i);
	}
	
	public void execute() {
		doProcess(50, i ->{
			System.out.println("i=>" + i);
			System.out.println(this);
		});
	}

	public static void main(String[] args) {
		ThisRefExample thisRefExample = new ThisRefExample();

//		thisRefExample.doProcess(55, i -> {
//			System.out.println("i=>" + i);
//		});
		
		thisRefExample.execute();
	}
	
	public String toString() {
		return "This ref.";
	}

}

interface Process {
	void process(int i);
}