package testes;

import java.util.Locale;
import java.util.Scanner;

public class teste1014 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		double y = scan.nextDouble();
		
		double calc = x / y ;

		System.out.printf("%.3f km/l%n" , calc);

		scan.close();

	}

}
