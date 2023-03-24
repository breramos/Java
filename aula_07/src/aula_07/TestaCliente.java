package aula_07;

import java.util.Scanner;

import aula07.model.Cliente;

public class TestaCliente {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
					
			int id;
			String nome, email, telefone, dataNasc;
			
			Cliente cli1 = new Cliente(12345678, "Aldo Alberto Altino","01/01/1980","aldo.alberto@altino.com","11 98765-4321");
			
			cli1.visualizar();
		
			Cliente cli2 = new Cliente(87654321, "Altino Alberto Aldo","08/09/2001","altino.alberto@aldo.com","11 91234-5678");
						
			cli2.visualizar();
		

	}

}
