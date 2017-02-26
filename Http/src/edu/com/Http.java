//read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)
package edu.com;

import java.util.Scanner;

public class Http {
	int error;

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please input error number: ");
		int error = Integer.parseInt(keyboard.nextLine());

		switch (error) {
		case 400:
			HTTPError http = HTTPError.HTTPERROR_400;
			System.out.println("the name of this error: HTTPERROR_400");
			break;
		case 401:
			http = HTTPError.HTTPERROR_401;
			System.out.println("the name of this error: HTTPERROR_401");
			break;
		case 402:
			http = HTTPError.HTTPERROR_402;
			System.out.println("the name of this error: HTTPERROR_402");
			break;
		case 403:
			http = HTTPError.HTTPERROR_403;
			System.out.println("the name of this error: HTTPERROR_403");
			break;
		case 404:
			http = HTTPError.HTTPERROR_404;
			System.out.println("the name of this error: HTTPERROR_404");
			break;
		default:
			System.out.println("no such error");
			System.exit(0);
			keyboard.close();
            
		}
	}
}
