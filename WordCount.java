package com.examples;

import java.io.File;
import java.io.FileInputStream;
import java.util.StringJoiner;

public class WordCount {

	public static void main(String[] args) throws Exception {
		int count = 0;
		String FileName = args[0];
		File file = new File(FileName);
		FileInputStream fis = new FileInputStream(file);
		byte[] bytesArray = new byte[(int) file.length()];
		fis.read(bytesArray);
		String s = new String(bytesArray);

		String[] words = s.split("\\s");

		int[] fr = new int[words.length];

		for (int i1 = 0; i1 < fr.length; i1++)
			fr[i1] = 0;

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (words[i].equals(words[j])) {

					fr[i]++;

				}
			}
		}

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					if (i != j) {
						words[i] = "";
					}

				}
			}
		}

		int total = 0;
		System.out.println("Words and words count:");
		for (int i = 0; i < words.length; i++) {

			if (words[i] != "") {

				System.out.println(words[i] + "=" + fr[i]);

				total += fr[i];

			}

		}
		System.out.println("Total words counted: " + total);
	}

}
