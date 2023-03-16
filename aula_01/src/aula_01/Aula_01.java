package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula_01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//Scanner é uma classe que permite fazer leitura de dados através do teclado; usada na formatação de dados de saída.
		
		DecimalFormat df = new DecimalFormat("###, ###, ##0.00");
		
		double numero1, numero2;
		String nome;
		
		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine();
		//Usou-se nextLine porque é o método para ler string da classe Scanner
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextDouble();
				
		System.out.println("Digite o segundo número: ");
		numero2 =  leia.nextDouble();
		
		System.out.println("Adição: " + df.format((numero1 + numero2)));
		System.out.println("Subtração: " + df.format((numero1 - numero2)));
		System.out.println("Multiplicação: " + df.format((numero1 * numero2)));
		System.out.println("Potenciação: " + df.format(Math.pow(numero1, numero2)));
		System.out.println("Radiciação: " + df.format(Math.sqrt(numero1)));
		System.out.println("Radiciação: " + df.format(Math.sqrt(numero2)));
		
		System.out.println("Nome: "+ nome);
		
		leia.close();
		
	}

}
