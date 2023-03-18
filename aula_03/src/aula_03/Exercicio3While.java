package aula_03;

import java.util.Scanner;

public class Exercicio3While {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade, contador = 0, maiores50 = 0, menores21 =0;
		char continua = 'S';

        System.out.println("Digite a sua idade: "); 
        idade = leia.nextInt();

            while(continua == 'S') {
                System.out.println("Digite a sua idade: ");
                idade = leia.nextInt();

                contador ++;

                if(idade < 21 || idade > 50)
                    menores21 ++;
                	maiores50 ++;

                System.out.println("Deseja continua (S/N)? ");
                continua = leia.next().toUpperCase().charAt(0);

            }

            System.out.println("Total de pessoas menores de 21 anos: "+ contador);
            System.out.println("Total de pessoas maiores de 50 anos: "+ contador);
	

       leia.close();  
       
//		if(idade > 50)
//		maiores50++;
//	if(idade < 21)
//		menores21++;
//	if(idade>0)
//		System.out.println("Digite a sua idade: ");
       
       
       
		
	}

}
