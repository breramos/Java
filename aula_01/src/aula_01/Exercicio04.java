package aula_01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, diferenca;
		
		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o terceiro número: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o quarto número: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("A diferença do produto entre (N1 e N2) e (N3 e N4) é: " + (diferenca));
		
		leia.close();
		
	}

}
