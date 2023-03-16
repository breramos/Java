package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###, ###, ##0.00");
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, mediaFinal;
		String nome;
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a primeira nota: ");
		n1 = leia.nextFloat();
		
		
		System.out.println("Digite a segunda nota: ");
		n2 = leia.nextFloat();
		
		
		System.out.println("Digite a terceira nota: ");
		n3 = leia.nextFloat();
		
		
		System.out.println("Digite a quarta nota: ");
		n4 = leia.nextFloat();
		
		
		mediaFinal = (n1 + n2 + n3 + n4)/4;
		
		System.out.println(nome + ", a sua média final é: " + df.format(mediaFinal));
		
		
		leia.close();
	}

}
