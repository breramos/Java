package aula_02;

import java.util.Scanner;

public class Lista2Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float valorTotal;
		int produto, quantidade;
		
		System.out.println("Lista de Produtos:");
        System.out.println("1\tCachorro-Quente.  R$ 10,00");
        System.out.println("2\tX-Salada.  R$ 15,00");
        System.out.println("3\tX-Bacon.  R$ 18,00");
        System.out.println("4\tX-Bauru.  R$ 12,00");
        System.out.println("5\tRefrigerante.  R$ 8,00");
        System.out.println("6\tSuco de Laranja.  R$ 13,00\n\n");
        
        System.out.println("Digite o número correspondente ao seu pedido: ");
		produto = leia.nextInt();
		
		System.out.println("Digite a quantidade de produtos: ");
		quantidade = leia.nextInt();
        
		
		switch(produto) {
			case 1: 
				System.out.println("O valor total do produto é: " + (valorTotal = 10 * quantidade));
			break;	
			case 2:
	            System.out.println("O valor do produto é: " + (valorTotal = 15 * quantidade));
	            break;
	        case 3:
	            System.out.println("O valor do produto é: " + (valorTotal = 18 * quantidade));
	            break;
	        case 4:
	            System.out.println("O valor do produto é: " + (valorTotal = 19 * quantidade));
	            break;
	        case 5:
	            System.out.println("O valor do produto é: " + (valorTotal = 8 * quantidade));
	            break;
	        case 6:
	            System.out.println("O valor do produto é: " + (valorTotal = 13 * quantidade));
	            break;
	        default:			   
	                System.out.println("Produto Inválido");
				
				
		}

	}
}
