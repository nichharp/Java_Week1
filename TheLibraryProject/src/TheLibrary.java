
//I have not closed any Scanners. I keep getting errors when i do.
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

public class TheLibrary {
//	static int itemID = 0;
//	static int perID = 0;
	static HashMap<Integer, Item> l = new HashMap<>();
	static HashMap<Integer, Person> p = new HashMap<>();

	public static void main(String[] args) {
		TheLibrary x = new TheLibrary();

		Book b1 = new Book("Book", "The Theory of Everything", "Stephen Hawking", 132);	x.addItem(b1);
		Book b2 = new Book("Book", "Eragon", "Chris Paolini", 544);						x.addItem(b2);
		Book b3 = new Book("Book", "Eldest", "Chris Paolini", 694);						x.addItem(b3);
		Book b4 = new Book("Book", "Brisingr", "Chris Paolini", 831);					x.addItem(b4);
		Book b5 = new Book("Book", "Inheritance", "Chris Paolini", 860);				x.addItem(b5);
		Book b6 = new Book("Book", "Fellowship of the Ring", "JRR Tolkien", 423);
		
		Theses t1 = new Theses("Theses", "Modelling the Bloodhound SSC" , "Nick Harper" , "Mathematics");												x.addItem(t1);
		Theses t2 = new Theses("Theses" , "Is it possibly to prevent broadcast storms to disable networks", "Mary has a little lamb" , "Computers");	x.addItem(t2);
		Theses t3 = new Theses("Theses", "Junior Monopoly", "Shreya Gund", "Computers");																x.addItem(t3);
		Theses t4 = new Theses("Theses", "Image Recognition", "Aaron", "Computers");																	x.addItem(t4);
		Theses t5 = new Theses("Theses", "Making a game", "Adam Rate", "Gaming" );																x.addItem(t5);

		Newspaper n1 = new Newspaper("Newspaper", "People Die","Daily Male", "25-07-17"); 									x.addItem(n1);
		Newspaper n2 = new Newspaper("Newspaper", "People Die AGain", "Get With The Times", "26-08-17"); 					x.addItem(n2);
		Newspaper n3 = new Newspaper("Newspaper", "Why do People Keep Dying?" , "The Sun", "01-01-00"); 					x.addItem(n3);
		Newspaper n4 = new Newspaper("Newspaper", "Yoyoyo", "Skateboarding Relative", "69-69-69"); 							x.addItem(n4);
		Newspaper n5 = new Newspaper("Newspaper", "Help Me I'm Trapped in a Newspaper Factory","NoHelp4U", "99-90-00"); 	x.addItem(n5);
		
		Person p1 = new Person("Larry", 22); 	x.registerPerson(p1);
		Person p2 = new Person("Faker", 19); 	x.registerPerson(p2);
		Person p3 = new Person("Nigel", 44); 	x.registerPerson(p3);
		Person p4 = new Person("Gary",  29); 	x.registerPerson(p4);
		Person p5 = new Person("James", 26); 	x.registerPerson(p5);
		Person p6 = new Person("NuckleDu", 21);
		
		x.showMeAllItems();
//		x.addItemsToFile(l);
//		x.addFileToItem();
//		x.updatePerson();
//		x.showMeAllItems();
//		x.deletePerson();
//		x.removeItem();
//		x.showMeAllPeople();
		x.registerPerson(p6);
//		x.showMeAllPeople();
		x.addItem(b6);
		x.showMeAllItems();
		x.checkoutItem();
		x.showMeAllItems();
		x.checkinItem();
		x.showMeAllItems();

	}

	
	public void addItem(Item z) {
//		l.put(itemID, z);
//		System.out.println("The " + z.type + " called " + z.name + " by " + z.author + " has been added. Item ID of " + itemID);
//		itemID++;
		for (int i = 0; i<=l.size() ; i++) {
			if (l.get(i)==null){
				l.put(i, z);
				break;
			}
		}
		

	}
	public void removeItem() {
		try{		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the ID of the Item you wish to delete?");
		int PO = sc.nextInt();

		System.out.println("The " + l.get(PO).type + " called " + l.get(PO).name + " by " + l.get(PO).author + " has been removed");
		l.put(PO, null);

		} catch (Exception e) {
			e.printStackTrace();
	} 
}
	public void checkoutItem(int i) {
		if (l.get(i).inUse == true) {
			System.out.println("The item" + i + " is not available");
		} else if (l.get(i).inUse == false) {
			l.get(i).inUse = true;
			System.out.println("The item" + i + " has now been checked out. Enjoy");
		}
	}
	public void checkinItem(int i) {
		Item z = l.get(i);
		if (z.inUse == true) {
			z.inUse = false;
			l.put(i, z);
			System.out.println("The item" + i + " has been checked in");
		} else if (z.inUse == false) {
			System.out.println("The item" + i + " was never checked out in the first place. We still have the item");
		}
	}
	public void checkinItem(){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("What is the ID of the Item you want to checkin?");
			int k = sc.nextInt();
			Item z = l.get(k);
			if (z.inUse == true) {
				z.inUse = false;
				l.put(k, z);
				System.out.println("The " + z.type + " called "+z.name +" by " +z.author+ " with ID of " + k + " has been checked in");
			} else if (z.inUse == false) {
				System.out.println("The " + z.type + " called "+z.name +" by " +z.author+ " with ID of " + k + " was never checked out in the first place. We still have the item");
			}
		} catch (Exception e){
			e.printStackTrace();
		} 
	}
	public void checkoutItem(){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("What is the ID of the Item you want to checkout?");
			int k = sc.nextInt();
			Item z = l.get(k);
			if (z.inUse == false) {
				z.inUse = true;
				l.put(k, z);
				System.out.println("The " + z.type + " called "+z.name +" by " +z.author+ " with ID of " + k + " has been checked out");
			} else if (z.inUse == false) {
				System.out.println("The " + z.type + " called "+z.name +" by " +z.author+ " with ID of " + k + " was never checked out in the first place. We still have the item");
			}
		} catch (Exception e){
			e.printStackTrace();
		} 
	}
	public void updateItem() {
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("What is the Item ID of the Item that you want to update?");
			
			int i = sc.nextInt();
			Item z = l.get(i);
	//		Book y = l.get(i);
			
			if (z.inUse == false) {
				System.out.println("Currently the item with the itemID of " + i + " is a " + z.type + " called " + z.name + " by " + z.author + "and it is not in use" );
			} else {
				System.out.println("Currently the item with the itemID of " + i + " is a " + z.type + " called " + z.name + " by " + z.author + "and it is in use");
			} 
			String holder = sc.nextLine();
			int kkk=0;
			do {
				if (holder.equals("Name")) {
					System.out.println("Please input the new name");
					holder  = sc.nextLine();
					z.name = holder;
					System.out.println("The name has now been changed to " + holder);
					kkk++;
				} else if (holder.equals("Author")){
					System.out.println("Please input the new Author");
					holder  = sc.nextLine();
					z.author = holder;
					System.out.println("The Author has now been changed to " + holder);
					kkk++;
	//			} else if (holder == "Pages" & z.type=="Book"){
	//				
	//				System.out.println("Please input the new Author");
	//				int numHolder  = sc.nextInt();
	//				z.pages = numHolder;
	//				System.out.println("The number of Pages has now been changed to " + numHolder);
	//				kkk++;
				} else if (holder.equals("inUse")){
					System.out.println("Please input the new inUse state (true/false)");
					boolean inUseHolder  = sc.nextBoolean();
					z.inUse = inUseHolder;
					System.out.println("The inUse state has now been changed to " + inUseHolder);		
					kkk++;
				} else if (holder.equals("Type")){
					System.out.println("Please input the new Type");
					holder  = sc.nextLine();
					z.type = holder;
					System.out.println("The Type has now been changed to " + holder);
					kkk++;
				} else {
					System.out.println("Please input what field you want you change (Name, Author, inUse, Type)");
					holder = sc.nextLine();
				}
			} while (kkk == 0);
		sc.close();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	public void registerPerson(Person z) {
//		p.put(perID, z);
//		System.out.println("Your account has been registered. Thank you " + z.name + ". Person ID of " + perID);
//		perID++;
		
		for (int i = 0; i<=p.size() ; i++) {
			if (p.get(i)==null){
				p.put(i, z);
				System.out.println("Your account has been registered. Thank you " + z.name + ". Person ID of " + i);
				break;
			}
		}
	}
	public void deletePerson() {
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("What is the ID of the Person you wish to delete?");
//			System.out.println(LOL);
			int PO = sc.nextInt();
			
			System.out.println("The Person named " + p.get(PO).name + " will get deleted");
			
			p.put(PO, null);
			System.out.println("Your account has been deleted. Good Day.");
			} catch (Exception e) {
				e.printStackTrace();
			} 
	}
	public void updatePerson() { 
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("What is the Person ID of the Person that you want to update?");
			int i = sc.nextInt();
			
			Person z = p.get(i);
			
			System.out.println("The Person with the ID of " + i + " and the name and age of " + z.name + " " + z.age + ".");
			
			
			
			String holder = sc.nextLine();
			int kkkk = 0;
			do {
				if (holder.equals("Name")) {
					System.out.println("Please input the new Name");
					holder = sc.nextLine();
					z.name = holder;
					System.out.println("The name has now been changed to " + holder);
					kkkk++;
//					sc.close();

				} else if (holder.equals("Age")) {
					System.out.println("Please input the new Age");
					int numHolder = sc.nextInt();
					z.age = numHolder;
					System.out.println("The age has been changed to " + numHolder);
					kkkk++;
//					sc.close();

				} else {
					System.out.println("Please input what you would like to change (Name/Age)");
					holder = sc.nextLine();
				} 
			} while (kkkk == 0);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	public void addItemsToFile(HashMap<Integer, Item> q) {
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Documents\\Library.txt"); 	// assign the FileOutputStream to be in this location
			ObjectOutputStream oos = new ObjectOutputStream(fos);												// take the FileOutputStream and prepare it in the ObjectOutputStream
			oos.writeObject(q);																					// write the FileOutputStream into this file
			oos.close();																						// close the OOS
		} catch (FileNotFoundException e) { //error handling
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			// } catch (ClassNotFoundException e) {
			// e.printStackTrace();
		}

	}
	public void addFileToItem() {
		try {
			HashMap<Integer, Item> q = new HashMap<>();
//			int holderID = itemID;
			FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Documents\\Library.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			q = (HashMap<Integer ,Item>) ois.readObject();
			ois.close();
			for (int ii=0; ii<q.size(); ii++) {
//				System.out.println(q.get(ii));
				l.put(l.size(), q.get(ii)); //I want to add my own ID along with just the ITEM from the q HASHMAP
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// q.toString(list.toArray());
	}
	public void showMeAllItems() {
		try{
			System.out.println("");
			System.out.println("These are all the Items we have in stock");
			System.out.println("");
//			System.out.println(l.size());
			for (int k=0 ; k<l.size();k++) {
				if (l.get(k)==null){
					System.out.println("There is no Item with the Item ID of " + k);
				}else {
				
				Item z = l.get(k);
				System.out.println("The " + z.type + " called " + z.name + " by " + z.author + " has Item ID of " + k+ ". And it is in Use " + z.inUse);
				}
			}
			System.out.println("");

				
		} catch (Exception e) {
			e.printStackTrace();			
		}
	}
	public void showMeAllPeople() {
		try{
			System.out.println("");
			System.out.println("These are all the People in our register");
			System.out.println("");		
			for (int k=0; k<p.size();k++) {
				if (p.get(k) == null){
					System.out.println("There is no Person with the ID number of " + k);
				} else {
					Person z = p.get(k);
					System.out.println("The Person named " + z.name + " with the age of " + z.age);
				} 
			} System.out.println(" ");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

