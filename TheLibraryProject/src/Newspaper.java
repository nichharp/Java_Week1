
public class Newspaper extends Item {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String date;

	public Newspaper(String type1, String name1, String author1, String date1) {
		super(type1, name1, author1);
		this.date = date1;
	}
}
