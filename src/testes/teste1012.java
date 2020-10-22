package testes;

import java.util.Locale;
import java.util.Scanner;

public class teste1012 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double pi = 3.14159;

		double triangulo = (a * c / 2);
		double circulo = (pi * c * c);
		double trapezio = (c * (a + b) / 2);
		double quadrado = (b * b);
		double retangulo = (a * b);

		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);

		scan.close();

	}
}
