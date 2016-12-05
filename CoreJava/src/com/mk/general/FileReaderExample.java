package com.mk.general;

import java.io.*;

public class FileReaderExample {

	public static void main(String as[]) {
		System.out
				.println("***************************FileReader-Read(): Character wise read*****************************");
		/*
		 * try{ FileReader fReader = new
		 * FileReader("C:/MyImp/WorkspaceEclipse/TestFile.txt"); int isChar;
		 * 
		 * while((isChar = fReader.read()) != -1){ System.out.println(isChar
		 * +"\t"+ (char)isChar); }
		 * 
		 * } catch(Exception e){ e.printStackTrace(); }
		 */
		System.out
				.println("***************************FileReader-Read(): Character wise read*****************************");
		try {
			FileInputStream inputStream = new FileInputStream(
					"C:/MyImp/WorkspaceEclipse/TestFile.txt");
			ObjectInputStream ois = new ObjectInputStream(inputStream);

			/*
			 * InputStreamReader reader = new InputStreamReader(inputStream,
			 * "UTF-16"); int character;
			 * 
			 * while ((character = reader.read()) != -1) {
			 * System.out.println(character +"\t"+ (char) character); }
			 */
			// reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
