import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Count:" + counter.getCount());
		
		System.out.printn("increment");

		counter.increment();
		
		System.out.println("Count:" + counter.getCount());

		System.out.printnnl("decrement");

		counter.decrement();
		
		System.out.println("Count:" + counter.getCount());
		
	}

}
