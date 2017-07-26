// not finished

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HashmapMain {
	HashMap<String, Integer> b = new HashMap<>();
	ArrayList<String> a = new ArrayList<String>();

	public static void main(String[] args) {

	}

	public void fileToArray() {
		try {
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Documents\\Anagram.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		a = (ArrayList<String>) ois.readObject();
		ois.close();	
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

	public void arrayToHashmap() {
		for (int i = 0; i<a.size();i++) {
			String holder = a.get(i);
			String newHolder = sortAlphabetically(holder);
			if (b.get(newHolder)==null ) {
				b.put(newHolder, 1);
			} else {
				int x = b.get(newHolder);
				b.put(newHolder, x+1);
			}
		}
	}

	public String sortAlphabetically(String kkk) {
		char[] chars = kkk.toCharArray();
		Arrays.sort(chars);
		String newWord = new String(chars);
		return newWord;
	}
}
//	public class Anagram {
//		String word;
//		int instances;
//
//		public Anagram(String word1, int instances1) {
//			word = word1;
//			instances = 0;
//		}
//	}
//}
