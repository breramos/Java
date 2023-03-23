package aula_05;

import java.util.HashSet;
import java.util.Set;

public class ExercicioSet {

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<Integer>();
		
		//numeros.add(20); se deixar essa linha ativa, o nº 20 aparece no meio da contagem
		
		for(int contador = 0; contador < 10; contador ++) 
			numeros.add(contador + 1);
		
		System.out.println("Listar elementos do conjunto:");
		
		for(var elemento : numeros)
			System.out.println(elemento);
		
		
	}

}
