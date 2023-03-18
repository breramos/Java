package aula_03;

import java.util.Scanner;

public class Exercicio1For {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        int numeroInicial, numeroFinal;

        System.out.println("Informe o intervalo inicial: ");
        numeroInicial = leia.nextInt();
        
        System.out.println("Informe o intervalo final: ");
        numeroFinal = leia.nextInt();
        
        if(numeroInicial > numeroFinal) {
        	System.out.println("Intervalo inválido!");
        	System.exit(0);
        }
        
        
        for(int contador = numeroInicial; contador <= numeroFinal; contador ++) {
        	
        	if(contador%3 == 0 && contador%5 == 0)
        		System.out.println(contador + " é múltiplo de 5 e 3.");
        	
        }
        
      //int contador = numeroInicial: enunciado perguntou para a pessoa onde ela quer começar,
       //aí tem que definir o início como o número que o usuário digitou
        
	}

}
