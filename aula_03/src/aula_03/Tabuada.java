package aula_03;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero;
		
		System.out.println("Digite a tabuada do número: ");
		numero = leia.nextInt();
		
		for(int contador = 1; contador <= 10; contador ++) {
			System.out.println("------------------------------------");
			System.out.println(numero + "x " + contador + " = " + (numero * contador));
		}
		
		//for(int contador = 1; contador <= 10; contador ++) {
		//	if(contador%2 == 0)
				//System.out.println(numero + "x " + contador + " = " + (numero * contador));
		//}
		
		System.out.println("\n");
		System.out.println("Tabuada finalizada com sucesso!");
		System.out.println("------------------------------------");
		
		leia.close();
		
	}

}
