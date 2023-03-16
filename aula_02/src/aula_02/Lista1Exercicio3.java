package aula_02;

import java.util.Scanner;

public class Lista1Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int idade;
		String nome;
		boolean resposta;
		
		
		System.out.println("Vamos começar! Primeiro, digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Agora digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Essa é a sua primeira doação de sangue? Digite true para Sim ou false para Não.");
		resposta = leia.nextBoolean();
		
		if(idade >= 60 && idade <= 69) {
			if(resposta == true)
				System.out.println(nome + ", você não está apto(a) a doar sangue!");
			else
				System.out.println(nome + ", você está apto(a) a doar sangue!");	
		}else if(idade < 18 || idade > 69)
			System.out.println(nome + ", você não está apto(a) a doar sangue!");
		else
			System.out.println(nome + ", você está apto(a) a doar sangue!");
		
		
		leia.close();

	}

}
