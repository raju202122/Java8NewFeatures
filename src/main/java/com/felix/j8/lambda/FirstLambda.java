package com.felix.j8.lambda;

import java.io.File;
import java.io.FileFilter;

/**
 * @author rajua
 *
 */
public class FirstLambda {
	public static void main(String[] args) {
		// By Using anonymous inner class
//		FileFilter filter = new FileFilter() {
//			@Override
//			public boolean accept(File file) {
//				return file.getName().endsWith(".java");
//			}
//		};

		// By Using Lambda
		FileFilter filter = file -> file.getName().endsWith(".java");

		File dir = new File("C:/tmp");
		File[] files = dir.listFiles(filter);

		if (files == null) {
			System.err.println("No Java files found at " + dir);
			return;
		}
		for (File file : files) {
			System.out.println(file);
		}
	}

}
