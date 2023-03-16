package aula_02;

import java.util.Scanner;

public class Lista1Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int valorA, valorB, valorC;
		
		System.out.println("Vamos começar! Primeiro, digite um número que será chamado de Valor A: ");
		valorA = leia.nextInt();
		
		System.out.println("Digite o segundo número que será chamado de Valor B: ");
		valorB = leia.nextInt();
		
		System.out.println("Digite o terceiro número que será chamado de Valor C: ");
		valorC = leia.nextInt();
		
		if(valorA + valorB > valorC)
			System.out.println("A soma do Valor A + Valor B é maior que o Valor C.");
		else if(valorA + valorB < valorC)
			System.out.println("A soma do Valor A + Valor B é menor que o Valor C.");
		else if(valorA + valorB == valorC)
			System.out.println("A soma do Valor A + Valor B é igual o Valor C.");
		
		
		leia.close();
	}

}
