package testes;

import java.util.Locale;
import java.util.Scanner;

public class teste1006 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();

		double media = ((a * 2) + (b * 3) + (c * 5)) / 10.0;

		System.out.printf("MEDIA = %.1f%n", media);

	}

}
