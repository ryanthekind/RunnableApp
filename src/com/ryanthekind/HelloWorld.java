/**
 * 
 * Simple Java App from Start To Finish
 * 
 * A simple Hello world app that takes you from starting a project to a shortcut on your desktop
 * 
 * @ Ryan Burns
 * @version 1.0
 * @since 11/27/2024
 */

package com.ryanthekind;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World! This is my first runnable app with the use of a runnable JAR file!");

		System.out.println("Press Enter to exit...");
		
		// the Scanner class allows the command line to appear and stay open for the user to interact with it.
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();

		scanner.close();
	}

}
