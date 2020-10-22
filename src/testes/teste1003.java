package testes;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class teste1003 {

	public static void main(String[] args) throws IOException{
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int SOMA = a + b;
		
		System.out.println("SOMA = " + SOMA);
		
	}
	
}
