package iterator_pattern;

public class IteratorPattern {
	public static void main(String[] args) {
		BrowsHitory history = new BrowsHitory();
		history.push("url 1");
		history.push("url 2");
		history.push("url 2");
		
		Iterator it = history.createIterator();
		
		while(it.hasNext()) {
			System.out.println(it.current());
			it.next();
		}
	}
}
