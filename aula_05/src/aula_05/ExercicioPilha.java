package aula_05;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		
		Stack<String> listaLivros = new Stack<String>();
		
		Scanner leia = new Scanner(System.in);
		int opcao = 0;
		String livro = "";
		
		do {
			System.out.println("***************************************");
			System.out.println("Opção 1 - Adicionar um novo livro");
			System.out.println("Opção 2 - Listar todos os livros");
			System.out.println("Opção 3 - Retirar um livro da pilha");
			System.out.println("Opção 0 - Sair");
			System.out.println("***************************************");
			System.out.println("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			
			switch (opcao) {
			
			case 1:
				System.out.println("******************************");
				System.out.println("Adicionar livro na pilha.");
				System.out.println("Digite o nome do livro:");
				
				livro = leia.next();
				listaLivros.push(livro);
		
				System.out.println("Livro foi adicionado!\n");
				break;
			case 2:
				System.out.println("******************************");
				System.out.println("Listar todos os livros.");
				
				for(var elementoLivros : listaLivros)
	        		System.out.println(elementoLivros);
				
				break;	
				
			case 3:
				if(listaLivros.size() > 0) {
					System.out.println("******************************");
					System.out.println("Retirar um livro da pilha.");
					listaLivros.pop();
					
					System.out.println("O último livro foi retirado!");
					break;
				} else {
					System.out.println("A pilha está vazia!");
				}
				
			default:	
				if(opcao > 3 )
				System.out.println("Opção inválida!");	
				break;
			}
		
		} while(opcao != 0);

		System.out.println("Você optou por sair do programa.");	
		
		leia.close();
	}

}
