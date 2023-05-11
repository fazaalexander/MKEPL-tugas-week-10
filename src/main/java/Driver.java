import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Count:" + counter.getCount());
		
		System.out.prin("increment");

		counter.increment();
		
		System.out.println("Count:" + counter.getCount());

		System.out.printl("decrement");

		counter.decrement();
		
		System.out.println("Count:" + counter.getCount());
		
	}

}
