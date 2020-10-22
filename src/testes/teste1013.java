package testes;

import java.util.Locale;
import java.util.Scanner;

public class teste1013 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int maiorAb = (a + b + Math.abs(a - b)) / 2;

		int maiorAbc = (maiorAb + c + Math.abs(maiorAb - c)) / 2;

		System.out.println(maiorAbc + " eh o maior");

		scan.close();

	}

}
