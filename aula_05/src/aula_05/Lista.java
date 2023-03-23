package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Double> notasTotais = new ArrayList<Double>(); 
		
		int opcao = 0;
		double nota = 0.0;
		
		do {
			System.out.println("Opção 1: Cadastrar nota\n");
			System.out.println("Opção 2: Listar todas as notas\n");
			System.out.println("Opção 3: Buscar nota\n");
			System.out.println("Opção 4: Remover nota\n");
			System.out.println("Opção 5: Atualizar nota\n");
			System.out.println("Opção 6: Sair\n");
			
			opcao= leia.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Cadastrar nota\n");
				System.out.println("Digite uma nota");
				//nota = leia.nextDouble();
				
				notasTotais.add(leia.nextDouble()); //insere o valor da variável nota dentro da collection notas
				break;
			case 2:
				System.out.println("Listar todas as notas\n");
				if(notasTotais.isEmpty()) {
					System.out.println("Não existem notas cadastradas!");
				}else {
				for(var eNota : notasTotais) //var é um coringa, assume o tipo da variável que vem na sequência. Ele funciona como se fosse uma definição de intervalo, recebe um valor de cada rodada e mostra esse valor
					System.out.println(eNota); //para cada eNota do tipo Double dentro do ArrayList notas, faça isso
				}
				break;	
			case 3:
				System.out.println("Buscar nota\n");
				System.out.println("Digite uma nota");
				nota = leia.nextDouble();
				
				if(notasTotais.contains(nota))
					System.out.println("A nota está localizada na posição: " + notasTotais.indexOf(nota));
				break;	
			case 4:
				System.out.println("Remover nota\n");
				System.out.println("Digite uma nota");
				nota = leia.nextDouble();
				
				notasTotais.remove(nota);
				break;	
			case 5:
				System.out.println("Atualizar nota\n");
				System.out.println("Digite a nota atual: ");
				nota = leia.nextDouble();
				System.out.println("Digite a nova atual: ");
				var novaNota = leia.nextDouble();
				
				notasTotais.set(notasTotais.indexOf(nota), novaNota);
				
				break;		
			default:	
				if(opcao > 6)
					System.out.println("Opção inválida!");
			}
			
		}while(opcao !=6);
		
		leia.close();
		
		

	}

}
