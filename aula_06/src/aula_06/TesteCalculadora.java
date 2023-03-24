package aula_06;

import java.util.Scanner;

import aula_06.calculos.Calculos;

public class TesteCalculadora {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Calculos calc = new Calculos();
		int opcao;
		double numero1, numero2;
		
		while(true) {
			
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			
			System.out.println("Qual a operação?");
			opcao = leia.nextInt();
			
			if(opcao == 0) {
				sobre();
				leia.close(); //fecha a opção do system.in
				System.exit(0); //para o programa, fecha tudo, não retorna mensagem nenhuma
			}
			
			System.out.println("Digite o 1º número: ");
			numero1 = leia.nextDouble();
			
			System.out.println("Digite o 2º número: ");
			numero2 = leia.nextDouble();
			
			switch(opcao) {
				case 1 -> System.out.println("Soma: " + calc.soma(numero1, numero2));
				case 2 -> System.out.println("Subtração: " + calc.subtracao(numero1, numero2));
				case 3 -> System.out.println("Multiplicação: " + calc.multiplicacao(numero1, numero2));
				case 4 -> System.out.println("Divisão: " + calc.divisao(numero1, numero2));
				default -> System.out.println("Opção inválida!");
			
			}
			
			
		}
		

	}

	public static void sobre () { //método
		System.out.println("Calculadora com Métodos");
		System.out.println("Feita por Brenda Ramos Bezerra");
		
	}
}
