package com.examples;

import java.io.File;
import java.io.FileInputStream;
import java.util.StringJoiner;

public class SplitByComma {
	public static void main(String[] args) throws Exception {

		int count = 0;
		File file = new File("test.txt");
		FileInputStream fis = new FileInputStream(file);
		byte[] bytesArray = new byte[(int) file.length()];
		fis.read(bytesArray);
		String s = new String(bytesArray);

		// Split text to array of words
		String[] words = s.split("");

		for (int i = 0; i < words.length; i++) {
			words[i] = words[i] + ",";
		}

		// Put them back as sentence
		StringJoiner sj = new StringJoiner("");
		for (String word : words) {
			sj.add(word);
		}

		String sentence = sj.toString();

		System.out.println(sentence);
	}

}
