package testes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class teste1009 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		String nome = scan.next();
		double salario = scan.nextDouble();
		double tv = scan.nextDouble();
		double porcentagem = 15;

		System.out.printf("TOTAL = R$ %.2f%n", salario + (tv*porcentagem) /100);

	}

}
   