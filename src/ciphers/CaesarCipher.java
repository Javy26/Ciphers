package ciphers;

import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {

		String caesar;
		@SuppressWarnings("resource")
		Scanner caesarcipher = new Scanner(System.in);

		System.out.println("Enter something to be encrypted");

		caesar = caesarcipher.nextLine();

		for (int i = 0; i < caesar.length(); i++) {
			char temp = (char) (caesar.charAt(i) + 3);
			System.out.println("");
			System.out.print(temp);

		}
	
}
}
