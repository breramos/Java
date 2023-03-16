package aula_02;

import java.util.Scanner;

public class Lista2Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int item, quantidade;
		
		System.out.println("Lista de Produtos:");
        System.out.println("1\tCachorro-Quente");
        System.out.println("2\tX-Salada");
        System.out.println("3\tX-Bacon");
        System.out.println("4\tX-Bauru");
        System.out.println("5\tRefrigerante");
        System.out.println("6\tSuco de Laranja\n\n");
        
        System.out.println("Digite o número correspondente ao seu pedido: ");
		item = leia.nextInt();
		
		System.out.println("Digite a quantidade de produtos: ");
		quantidade = leia.nextInt();
        
        

	}

}
