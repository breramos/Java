package aula_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
        Scanner leia = new Scanner(System.in);
        int opcao = 0;
        String nome = "";

        do {
        	
	        System.out.println("***************************************");
	        System.out.println("Selecione uma opção:");
	        System.out.println("1 - Adicionar novo cliente na fila");
	        System.out.println("2 - Listar todos os clientes na fila");
	        System.out.println("3 - Chamar (retirar) um cliente da fila");
	        System.out.println("0 - Finalizar programa");
	        System.out.println("***************************************");
	        System.out.println("Entre com a opção desejada: ");
	        
	        opcao = leia.nextInt();
	        
	        switch (opcao) {
	        case 1:
	        	System.out.println("***************************************");
	        	System.out.println("Digite o nome do cliente:\n");	
	        	
	        	nome = leia.next();	
	        	fila.add(nome);
	        	
	        	System.out.println("Cliente adicionado na fila!");
	        	break;
	        case 2:
	        	System.out.println("***************************************");
	        	System.out.println("Listar os nomes dos clientes\n");
	        	
	        	for(var listarClientes : fila)
	        		System.out.println(listarClientes);
	        	break;	
	        case 3:
	        	System.out.println("Retirar o primeiro cliente da fila\n");
				fila.poll();
				System.out.println(fila);
				System.out.println("O cliente foi chamado!");
				
	        	break;
	        default:
	        	if(opcao > 3)
	        		System.out.println("Opção inválida!\n");
	        }
	       
        }while (opcao != 0);
        
        System.out.println("Programa finalizado!");
        
        leia.close();
        
      }

}
