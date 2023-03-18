package aula_03;

import java.util.Scanner;

public class Exercicio5DoWhile {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);

	        int numero = 0, soma = 0;
            
	         do { 
	             System.out.println("Digite um número: ");
	             numero = leia.nextInt();
	             		
	             if (numero > 0)
	                  soma += numero; //O mesmo que dizer soma = soma + numero;
	             	
	         } while(numero != 0 );

	        System.out.println("A Soma dos números positivos é: " + soma );

	}

}
