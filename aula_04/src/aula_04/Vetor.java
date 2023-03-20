package aula_04;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int numero;
		int vetorInteiros[] = {4,5,8,10,12,17,9,11,6,15};
		float [] vetorFloat = new float [5];
		
		System.out.println("Digite um número qualquer: ");
		numero = leia.nextInt();
		
		for(int contador = 0; contador < vetorInteiros.length; contador ++) {
			if(vetorInteiros[contador] == numero) //O contador precisa percorrer cada posição do vetor para saber se existe o número que foi digitado.
			System.out.println("Posição [" + contador + "] = " + vetorInteiros[contador]); //vetorInteiros[contador] = retorna o número que o contador encontrou dentro do vetor
		}
		
		for(int contador = 0; contador < vetorFloat.length; contador ++) {
			System.out.println("Digite um valor para a posição [" + contador + "]:");
			vetorFloat[contador] = leia.nextFloat();
		}
		
		for(int contador = 0; contador < vetorFloat.length; contador ++) {
			System.out.println("Posição [" + contador + "] = " + vetorFloat[contador] );
		}
		
		//Embaixo, tem outra maneira de mostrar na tela os valores digitados e suas posições no vetor
		
		for(float vFloat : vetorFloat) {
			System.out.println(vFloat);
		}	
		
		//Organizar os valores dentro do vetor
		
		System.out.println("A organização dos valores de vetorInteiros é: ");
		Arrays.sort(vetorInteiros);
		
		
		for(float vInt : vetorInteiros) {
			System.out.println(vInt);
			
		}	
		
		
		
			
	}

}
