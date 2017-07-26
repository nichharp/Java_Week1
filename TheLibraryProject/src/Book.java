
public class Book extends Item {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int pages;
	
	public Book(String type1, String name1, String author1, int pages1) {
		super(type1, name1, author1);
		this.pages = pages1;
	}
}
