package testes;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class teste1002 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double raio = scan.nextDouble();
		double n = 3.14159;
		double area = n * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f%n", area);
		
		scan.close();

	}
}