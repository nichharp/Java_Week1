import java.io.Serializable;

public abstract class Item implements Serializable {
	private static final long serialVersionUID = 1L; // dunno what this is for. ASK!

	String name;
	String author;
	boolean inUse;
	String type;
	
	public Item(String type1, String name1, String author1){
		this.name= name1;
		this.author=author1;
		this.inUse = false;
		this.type = type1;
	}

	
}
