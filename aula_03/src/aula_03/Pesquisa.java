package aula_03;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int idade, sexo, genero = 0, esporte, contador = 0, futebolFeminino = 0, maioresDezoitoVolei = 0, gamesTNBF = 0;
		char continua = 'S';
		
		
		while(continua == 'S') {
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
		do {
			System.out.println("Digite o seu sexo\n(1) M, (2) F, (3) T, (4) NB: ");
			sexo = leia.nextInt();
		}while (sexo < 1 || sexo > 4);
			
		if(sexo == 3 || sexo == 4) {
			System.out.println("Digite o gênero com o qual se identifica\n(1) M , (2) F, (3) NB: ");
			genero = leia.nextInt();
		}
			
			System.out.println("Digite o seu esporte favorito\n(1) Futebol, (2) Vôlei, (3) Basquete, (4) Games: ");
			esporte = leia.nextInt();
			
			contador ++;
			
			if(sexo == 2 && esporte == 1)
				futebolFeminino ++;
			
			if(idade >= 18 && esporte == 2)
				maioresDezoitoVolei ++;
			
			if((sexo == 3 || sexo == 4) && genero == 2 && esporte == 4)
				gamesTNBF ++;
			
			genero = 0;
			
			System.out.println("Deseja continuar? Digite S/N: "); 
			continua = leia.next().toUpperCase().charAt(0);
			
			
		}
		
		System.out.println("Total de fichas preenchidas: " + contador);
		System.out.println("Total de pessoas do sexo feminino que gostam de Futebol: " + futebolFeminino);
		System.out.println("Total de pessoas maiores de 18 anos que "
				+ "gostam de Vôlei: " + maioresDezoitoVolei);
		System.out.println("Total de pessoas trans e não binárias que "
				+ "se identificam com o sexo feminino e gostam de Games: " + gamesTNBF);
		
		
		leia.close();
		
		
		//Última linha do loop while: define o valor da variável "continua"
		//, que é minha condição de saída. Sem ela, o while não para de rodar.
	}

}
