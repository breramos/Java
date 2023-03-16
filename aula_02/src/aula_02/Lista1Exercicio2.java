package aula_02;

import java.util.Scanner;

public class Lista1Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int valor1;
		
		System.out.println("Vamos começar! Primeiro, digite um número: ");
		valor1 = leia.nextInt();
			
		if(valor1 >= 0 && valor1%2 == 0 )
			System.out.println("O número " + valor1 + " é positivo e par.");
		else if(valor1 < 0 && valor1%2 == 0)
			System.out.println("O número " + valor1 + " é negativo e par.");
		else if(valor1 >= 0 && valor1%2 != 0)
			System.out.println("O número " + valor1 + " é positivo e ímpar.");
		else if(valor1 < 0 && valor1%2 != 0)
			System.out.println("O número " + valor1 + " é negativo e ímpar.");
		
		
		leia.close();
	}

}
