package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioCollections {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        ArrayList<String> cores = new ArrayList<String>();
        

        String cor;

        System.out.println("Digite 5 cores: ");

        for(int contador = 1; contador <=5; contador++) {

            System.out.println("\nDigite a " + contador + "º cor: ");
            cor = leia.nextLine();
            cores.add(cor);

        }

        System.out.println("Cores Adicionadas: ");
        for ( var umaCor: cores) 
            System.out.println(umaCor);

        //sort para ordenar
        System.out.println("Cores em Ordem: ");
        cores.sort(null);
            for ( var umaCor: cores) {
            System.out.println(umaCor);

            leia.close();
           }
	}
}
