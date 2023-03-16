package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###, ###, ##0.00");
		
		Scanner leia = new Scanner(System.in);
		
		float salario, abono, novoSalario;
		String nome;
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite um valor para o salário: R$ ");
		salario = leia.nextFloat();
		
		System.out.println("Digite um valor para o abono: R$ ");
		abono = leia.nextFloat();		
		
		novoSalario = salario + abono;
		
		System.out.println(nome + ", o valor total do seu salário é: R$ " + df.format(novoSalario));
		
		
		leia.close();
		
		
	}

}
