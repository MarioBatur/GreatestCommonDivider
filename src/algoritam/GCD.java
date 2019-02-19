package algoritam;

import java.util.Scanner;

public class GCD {
	@SuppressWarnings("unused")
	private static Scanner input;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, temp, rest;

		System.out.print("Number a: ");
		a = input.nextInt();
		System.out.print("Number b: ");
		b = input.nextInt();

		if (a > 99 && a < 1000 && b > 99 && b < 1000) {
			if (a > b) {
				temp = a;
				a = b;
				b = temp;
			}
			System.out.print("Number " + a + " and number " + b);
			do {
				rest = b % a;
				b = a;
				a = rest;
			} while (a > 0);
			System.out.println(" greatest divider is " + b);
			// System.out.println("Frequency is");
			// System.out.println("");
		} else {
			System.out.println("Numbers are not between 100 and 999 ");
		}
	}
}