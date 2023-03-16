package aula_02;

import java.util.Scanner;

public class PlanoSaudeV2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int faixa;
		
		System.out.println("Faixas Etárias:");
        System.out.println("1\taté 10 anos");
        System.out.println("2\tde 11 a 29 anos");
        System.out.println("3\tde 30 a 45 anos");
        System.out.println("4\tde 46 a 59 anos");
        System.out.println("5\tde 60 a 65 anos");
        System.out.println("6\tacima de 65 anos\n\n");
		
		System.out.println("Digite o número correspondente à sua faixa etária para saber qual será o valor do seu plano de saúde: ");
		faixa = leia.nextInt();
		
		
		switch(faixa) {
			case 1:
				System.out.println("Para essa idade, o valor do plano é R$ 100,00.\"");
				break;
			case 2:
				System.out.println("Para essa idade, o valor do plano é R$ 200,00.");
				break;
			case 3:
				System.out.println("Para essa idade, o valor do plano é R$ 300,00.");
				break;
			case 4:
				System.out.println("Para essa idade, o valor do plano é R$ 500,00.");
				break;
			case 5:
				System.out.println("Para essa idade, o valor do plano é R$ 600,00.");
				break;
			case 6:
				System.out.println("Para essa idade, o valor do plano é R$ 1.000,00.");
				break;
			default:
				System.out.println("Por favor, digite outro valor! Essa idade é inválida!");
		
		}
		
		leia.close();
		
	

	}

}
