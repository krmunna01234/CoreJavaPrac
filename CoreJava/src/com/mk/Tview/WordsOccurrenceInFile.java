package com.mk.Tview;

/*
 * To find the each words occurrence from a file by using efficient way to read the file.
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordsOccurrenceInFile {

	public static void main(String[] args) {

		String fileName = "C:\\MyImp\\Workspace\\test.txt";
		// StringInFile(fileName);
		ArrayList<String> listOfWord = StringInFile(fileName);

		Map<String, Integer> hm = getWordsOccurrence(listOfWord);

		for (Map.Entry<String, Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + "  :  " + entry.getValue());
		}
		/*
		 * System.out.println(listOfWord.size()); for (String string :
		 * listOfWord) { System.out.println(string); }
		 */

		System.out.println("Wrting data into file ");

		writeToFile(hm);

	}

	public static void writeToFile(Map<String, Integer> hm) {
		
		BufferedWriter bwr = null;
		try {
			
			bwr = new BufferedWriter(new FileWriter("C:\\MyImp\\Workspace\\test1.txt"));
			bwr.write(hm.toString());
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bwr != null)
					bwr.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	public static ArrayList<String> StringInFile(String fileName) {
		BufferedReader reader = null;
		String[] words = null;
		ArrayList<String> wordList = new ArrayList<String>();
		try {
			reader = new BufferedReader(new FileReader(fileName));
			String line = reader.readLine().replace(".", "").replace("!", "").replace("-", "").replace(",", "")
					.replace(")", "").replace("(", "").replace("\"", "");

			while (line != null) {
				// System.out.println(line);
				words = line.split(" ");

				wordList.addAll(Arrays.asList(words));
				if (line != null)
					line = reader.readLine();// .replace(".", "").replace("!",
												// "").replace("-",
												// "").replace(",",
												// "").replace(")",
												// "").replace("(",
												// "").replace("\"", "");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return wordList;
	}

	public static Map<String, Integer> getWordsOccurrence(ArrayList<String> arlst) {

		Map<String, Integer> wordsOccurrence = new HashMap<String, Integer>();

		for (String str : arlst) {
			if (!wordsOccurrence.containsKey(str))
				wordsOccurrence.put(str, 1);
			else
				wordsOccurrence.put(str, wordsOccurrence.get(str) + 1);
		}
		return wordsOccurrence;
	}
}
