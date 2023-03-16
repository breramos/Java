package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###, ###, ##0.00");
				
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, noturno, horasExtras, descontos, salarioLiquido;
		String nome;
		
		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite o salário bruto: R$ ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o adicional noturno: R$ ");
		noturno = leia.nextFloat();
		
		System.out.println("Digite as horas extras: R$ ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite os descontos: R$ ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + noturno + (horasExtras * 5) - descontos;
		
		System.out.println(nome + ", o valor do seu salário líquido é: R$ " + df.format(salarioLiquido));
		
		
		leia.close();

	}

}
