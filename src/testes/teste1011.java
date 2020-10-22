package testes;

import java.util.Locale;
import java.util.Scanner;

public class teste1011 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int r = scan.nextInt();
		double pi = 3.14159;

		double calc = ((4.0 / 3) * pi * r * r * r);

		System.out.printf("VOLUME = %.3f%n", calc);

		scan.close();
	}

}
