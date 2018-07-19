package bdd.counter;

public class Counter {
	
	int size = 0;
	
	public void count(String text) {
		size = text.length();
	}
	
	public int getSize() {
		return size;
	}
}
