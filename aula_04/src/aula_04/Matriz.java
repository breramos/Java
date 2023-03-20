package aula_04;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		float numero;
		
		int[][] matrizInteiros = {{10, 15, 35}, {70, 120, 140}, {50, 100, 150}};
		float matrizFloat [][] = new float [2][3];
		
		for (int indiceLinha = 0; indiceLinha < matrizInteiros.length; indiceLinha ++) {
			for (int indiceColuna = 0; indiceColuna < matrizInteiros.length; indiceColuna ++) {
				System.out.println(matrizInteiros[indiceLinha][indiceColuna]);
			}
		}
		
		for (int indiceLinha = 0; indiceLinha < matrizFloat.length; indiceLinha ++) {
			for (int indiceColuna = 0; indiceColuna < matrizFloat[indiceLinha].length; indiceColuna ++) {
				System.out.println("Digite um número: ");
				matrizFloat [indiceLinha][indiceColuna] = leia.nextFloat();
			}
		
		}
		
		for (int indiceLinha = 0; indiceLinha < matrizFloat.length; indiceLinha ++) {
			for (int indiceColuna = 0; indiceColuna < matrizFloat[indiceLinha].length; indiceColuna ++) {
				System.out.println(matrizFloat[indiceLinha][indiceColuna]);
			}
		
		}
		//indiceColuna < matrizFloat[indiceLinha] usado quando o numero de colunas é maior que o numero de linhas
		//length = comprimento da matriz, ou seja, comprimento das linhas.
		//quando escrevo indiceColuna < matrizFloat[indiceLinha], quero que o indice das colunas seja menor que o tamanho do comprimento da matriz
		
	}

}
