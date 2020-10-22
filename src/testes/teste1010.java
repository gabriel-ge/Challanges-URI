package testes;

import java.util.Locale;
import java.util.Scanner;

public class teste1010 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int a1 = scan.nextInt();
		int a2 = scan.nextInt();
		double a3 = scan.nextDouble();

		int b1 = scan.nextInt();
		int b2 = scan.nextInt();
		double b3 = scan.nextDouble();
		
		double calc = (a2 * a3 + b2 * b3);
	
		System.out.printf("VALOR A PAGAR: R$ %.2f%n" , calc);
		
		scan.close();
	}

}
