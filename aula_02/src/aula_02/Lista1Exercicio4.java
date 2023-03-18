package aula_02;

import java.util.Scanner;

public class Lista1Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String classeAnimal, tipoAnimal, tipoAlimentacao; 
		
		
		System.out.println("Vamos começar! Primeiro, digite se o animal é vertebrado ou invertebrado: ");
		classeAnimal = leia.nextLine().toLowerCase();		
		
		System.out.println("Agora digite se o animal é uma Ave, Mamífero, Inseto ou Anelídeo: \nNão utilizar acentos nas palavras! ");
		tipoAnimal = leia.nextLine().toLowerCase();
		
		System.out.println("Por último, escolha se o animal é Carnívoro, Herbívoro, Onívoro ou Hematófago: \nNão utilizar acentos nas palavras!");
		tipoAlimentacao = leia.nextLine().toLowerCase();	
		
		if(classeAnimal == "vertebrado" && tipoAnimal == "ave" && tipoAlimentacao == "carnivoro")
			System.out.println("Você escolheu a águia!");
		else if (classeAnimal == "vertebrado" && tipoAnimal == "ave" && tipoAlimentacao == "onivoro")
			System.out.println("Você escolheu a pomba!");
		else if(classeAnimal == "vertebrado" && tipoAnimal == "mamifero" && tipoAlimentacao == "onivoro")
			System.out.println("Você escolheu o homem!");
		else if(classeAnimal == "vertebrado" && tipoAnimal == "mamifero" && tipoAlimentacao == "herbivoro")
			System.out.println("Você escolheu a vaca!");
		else if(classeAnimal == "invertebrado" && tipoAnimal == "inseto" && tipoAlimentacao == "hematofago")
			System.out.println("Você escolheu a pulga!");
		else if(classeAnimal == "invertebrado" && tipoAnimal == "inseto" && tipoAlimentacao == "herbivoro")
			System.out.println("Você escolheu a lagarta!");
		else if(classeAnimal == "invertebrado" && tipoAnimal == "anelideo" && tipoAlimentacao == "onivoro")
			System.out.println("Você escolheu a minhoca!");
		else if(classeAnimal == "invertebrado" && tipoAnimal == "anelideo" && tipoAlimentacao == "hematofago")
			System.out.println("Você escolheu a sanguessuga!");
		
		
		leia.close();
	}

}
