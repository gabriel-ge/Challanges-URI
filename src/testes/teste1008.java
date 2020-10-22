package testes;

import java.util.Locale;
import java.util.Scanner;

public class teste1008 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int quantidade = scan.nextInt();
		int horasTrabalhadas = scan.nextInt();
		double salarioPorHora = scan.nextDouble();

		int numero = quantidade;
		double salario = horasTrabalhadas * salarioPorHora;

		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n" , salario);

	}

}