package aula_05;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		
		pilha.push("Michelle");
		pilha.push("Guilherme");
		pilha.push("Daisy Cristina");
		pilha.push("Kaique");
		pilha.push("Camille");
		//push = inserir.
		for(var elemento : pilha) //for each: usado para imprimir cada item no console, não deve ser usado quando deve-se imprimir um índice específico da lista.
			System.out.println(elemento);
		
		System.out.println("Retirar o elemento: ");
		pilha.pop(); //pop = tirar o último valor.
		System.out.println(pilha);
		
		pilha.push("Reynaldo");
		System.out.println(pilha); //acrescenta na última posição.
		
		System.out.println(pilha.size());
		
		System.out.println(pilha.contains("Michelle"));
		System.out.println(pilha.contains("Kaique"));
		

	}

}
