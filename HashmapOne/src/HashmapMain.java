
// not finished

//import java.io.FileInputStream;
//import java.io.ObjectInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HashmapMain {
	HashMap<String, Integer> b = new HashMap<>();
	
	public static void main(String[] args) {
		HashmapMain y = new HashmapMain();
//		ReadFile file = newReadFile(file_name);
		
		y.arrayToHashmap();
	}

	public void arrayToHashmap() {
		ArrayList<String> a = OpenFile();
		String holder = "";
		String newHolder = "";
		String mostHolder = "";
		String tiedHolder = "";
		int thehighestx = 0;
		String thehighestl = "";
		int secondholdernecc = 0;
		int x =0;
		int mostInstances=0;
		for (int i = 0; i < a.size(); i++) {
			holder = a.get(i);
			newHolder = sortAlphabetically((holder));
//			newHolder = sortAlphabetically(allToLowerCase(holder)); //to be used if cases matter

			
			if (b.get(newHolder) == null) {
				b.put(newHolder, 1);
			} else {
				x = b.get(newHolder);
//				System.out.println(x);
				b.put(newHolder, x + 1);
				
				//i couldn't, for the life of me, figure out why the following script didnt do exactly what the bullet points were asking for. Spent the next 45 minutes making text files to help visualise. it didnt help.
//				if ((x+1) > mostInstances) {
//					mostHolder = newHolder;
//					mostInstances = x+1;
//				} else if ((x+1) == mostInstances && mostHolder.length()<newHolder.length()) {
//					mostHolder = newHolder;
//				} else if ((x+1)==mostInstances && mostHolder.length()==newHolder.length()) {
//					tiedHolder = newHolder;
//					secondholdernecc = 1;
//				} 
				
				if (x>thehighestx) {
					thehighestx = x;
					thehighestl = newHolder;
				}
			}
		}
		if (secondholdernecc ==1) {
			if (tiedHolder.length() == mostHolder.length()) {
				System.out.println("Two anagrams are largest: " + thehighestl + " with " + thehighestx + " instances and " + tiedHolder + " with " + b.get(tiedHolder) + " instances");
			}
		} else {
			System.out.println("One anagram is the largest: " + thehighestl + " with " + thehighestx + " instances");
			System.out.println(mostHolder + b.get(mostHolder));
//			System.out.println(b.size());
//			System.out.println(thehighestx + "    " + thehighestl);
		}
	}
	public String sortAlphabetically(String kkk) {
		char[] chars = kkk.toCharArray();
		Arrays.sort(chars);
		String newWord = new String(chars);
		return newWord;
	}

	public String allToLowerCase(String mmm) {
		return mmm = mmm.toLowerCase();
	}

	public ArrayList<String> OpenFile() {
		ArrayList<String> a = new ArrayList<>();
		try {
			
			FileReader fr = new FileReader("C:\\Users\\Administrator\\Documents\\wordList.txt");
			BufferedReader textReader = new BufferedReader(fr);
			int holder = readLines();
			
			for (int i = 0; i < holder; i++) {
				a.add(textReader.readLine()); // make sure it can get to the

			}
			textReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} return a;

	}

	public int readLines() {
		int numOfLines = 0;

		try {
			FileReader file_to_read = new FileReader("C:\\Users\\Administrator\\Documents\\wordList.txt");
			BufferedReader bf = new BufferedReader(file_to_read);

//			String aLine;
			while ((bf.readLine()) != null) {
				numOfLines++;
			}
			System.out.println(numOfLines);
			bf.close();
		} catch (IOException e) {
			e.printStackTrace();
		} return numOfLines;
			

		

	}

}
