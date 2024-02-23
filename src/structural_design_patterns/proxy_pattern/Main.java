package structural_design_patterns.proxy_pattern;

/**
 * The proxy pattern is employed in scenarios where we aim to optimize resource usage by deferring the loading of objects until they 
 * are actually needed. In the provided example, we may have a large collection of books, but we only intend to read or open a few of 
 * them during the application's runtime. Loading all books into memory unnecessarily would lead to inefficiency.
 * <p>
 * By implementing the proxy pattern, we introduce proxy objects for the actual book objects. When a book is required, the proxy object 
 * serves as a placeholder. It loads the real book object only when necessary, i.e., when it is requested for reading or opening. This 
 * lazy loading mechanism prevents the application from unnecessarily loading all books upfront, thereby conserving memory and improving 
 * performance.
 * <p>
 * Persistence frameworks like Hibernate and JPA commonly utilize the proxy pattern, particularly for implementing lazy loading of 
 * database entities. This means that associated entities are only loaded from the database when accessed, reducing the overhead of 
 * fetching unnecessary data.
 * <p>
 * In summary, the proxy pattern is beneficial in situations where we want to defer the loading of objects until they are needed, 
 * thus optimizing resource utilization and enhancing application performance.
 */
public class Main {

	public static void main(String[] args) {
		Library library = new Library();
		String [] fileNames = {"a","b","c"};
		
		for (String fileName : fileNames) {
			library.add(new EbookProxy(fileName));
		}
		
		library.openEbook("a");
		library.openEbook("b");
	}

}
