package aula_02;

import java.util.Scanner;

public class PlanoSaude {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade;
		
		System.out.println("Vamos começar! Primeiro, digite a sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 0 && idade <= 10) 
			System.out.println("Para essa idade, o valor do plano é R$ 100,00.");	
		else if(idade > 10 && idade <= 29) 
			System.out.println("Para essa idade, o valor do plano é R$ 200,00.");
		else if(idade > 29 && idade <= 45)
			System.out.println("Para essa idade, o valor do plano é R$ 300,00.");
		else if(idade > 45 && idade <= 59)
			System.out.println("Para essa idade, o valor do plano é R$ 500,00.");
		else if(idade > 59 && idade <= 65)
			System.out.println("Para essa idade, o valor do plano é R$ 600,00.");
		else if(idade > 65)
			System.out.println("Para essa idade, o valor do plano é R$ 1.000,00.");
		else
			System.out.println("Digite outro valor! Idade inválida!");

		
		leia.close();
	}

}
