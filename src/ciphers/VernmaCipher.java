package ciphers;

import java.util.Scanner;
import java.util.Random;

public class VernmaCipher {

	public static class Vernam {

		public static void main(String[] args) {

			String vernam;
			@SuppressWarnings("resource")
			Scanner cipher = new Scanner(System.in);
			Random random = new Random();

			System.out.println("Enter something to be encrypted");
			vernam = cipher.nextLine();
			vernam = vernam.toUpperCase();

			for (int i = 0; i < vernam.length(); i++) {

				int rand_temp;

				if (vernam.charAt(i) > 64 && vernam.charAt(i) < 91) {
					System.out.println("Random Values("
							+ (rand_temp = random.nextInt(5))
							+ ")will be added to your letter value "
							+ vernam.charAt(i) + ")");

					char temp = (char) ((vernam.charAt(i)) + rand_temp);
					if (temp > 90) {
						temp = (char) (temp - 26);
					}
					System.out.println(temp);
				}
			}

		}

	}

}
