package optional;

import java.util.Optional;

public class Optional01 {

	public static void main(String[] args) {
		
			String[] palavras = new String[10];
			palavras[5] = "TURMA 62 DO BOOTCAMP";
			
			Optional<String> checarNulo = Optional.ofNullable(palavras[5]); //optional impede de mostrar o erro NullPointerException caso o objeto seja nulo.
			
			if(checarNulo.isPresent()) {
				String palavra = palavras[5].toLowerCase();
				System.out.println(palavra);
				
			}else
				System.out.println("A palavra é nula!");
			
			System.out.println("Opcional está vazio? " + checarNulo.isEmpty()); //booleano
			
		

	}

}
