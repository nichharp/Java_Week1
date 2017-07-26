
public class Theses extends Item {
	
	private static final long serialVersionUID = 1L;
	String field;

	public Theses (String type1, String name1, String author1, String field1) {
		super(type1, name1, author1);
		this.field = field1;
	}
}
