package aula_04;

import java.util.Scanner;

public class ExercicioDiagonal {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int [][] matrizEntrada = new int [3][3];
		float somaPrincipal = 0, somaSecundaria = 0;
		
		for(int indiceLinha = 0; indiceLinha < matrizEntrada.length; indiceLinha ++) {
			for(int indiceColuna = 0; indiceColuna < matrizEntrada.length; indiceColuna ++) {
				System.out.println("\nDigite o número da posição:[" + indiceLinha + "] [" + indiceColuna + "]" );
				matrizEntrada[indiceLinha][indiceColuna] = leia.nextInt();
			}
		}
		
		System.out.println("\nElementos de uma diagonal principal: ");
		
		for(int indiceLinha = 0; indiceLinha < matrizEntrada.length; indiceLinha ++) {
			for(int indiceColuna = 0; indiceColuna < matrizEntrada.length; indiceColuna++) {
				if(indiceLinha == indiceColuna) {
					System.out.println(matrizEntrada[indiceLinha][indiceColuna]);
					somaPrincipal += matrizEntrada[indiceLinha][indiceColuna];
				}
			}
		}
		
		System.out.println("\nA soma dos elementos da diagonal principal é: " + somaPrincipal);
		
		System.out.println("\nElementos da diagonal secundária: ");
		
		for(int indiceLinha = 0; indiceLinha < matrizEntrada.length; indiceLinha ++) {
			for(int indiceColuna = 0; indiceColuna < matrizEntrada.length; indiceColuna ++) {
				if(indiceLinha + indiceColuna == 2) {
					System.out.println(matrizEntrada[indiceLinha][indiceColuna]);
					somaSecundaria = somaSecundaria + matrizEntrada[indiceLinha][indiceColuna];
				}
			}
		
		}
		
		System.out.println("\nA soma dos elementos da diagonal secundária é: " + somaSecundaria);
	
	}

}
