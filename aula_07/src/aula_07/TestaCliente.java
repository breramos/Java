package aula_07;

import java.util.Scanner;

import aula07.model.Cliente;
import aula07.model.PessoaFisica;
import aula07.model.PessoaJuridica;

public class TestaCliente {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
					
			int id;
			String nome, email, telefone, dataNasc;
			
			Cliente cli1 = new Cliente(12345678, "Aldo Alberto Altino", "01/01/1980", "aldo.alberto@altino.com.br", "11 98765-4321");
			cli1.visualizar();
		
			Cliente cli2 = new Cliente(87654321, "Altino Alberto Aldo","08/09/2001", "altino.alberto@aldo.com.br", "15 91234-5678");			
			cli2.visualizar();
			
			PessoaFisica pf1 = new PessoaFisica(13579113, "Bruno Braga Bragança","20/06/1970","brunosbraga.bg@bruno.com.br","17 97530-0159", "Engenheiro");
			pf1.visualizar();
			
			PessoaFisica pf2 = new PessoaFisica(34567890, "Joaquim José Josefino","03/02/1968","joaquijjosef@joseph.com.br","48 97568-3296", "Advogado");
			pf2.visualizar();
			
			PessoaJuridica pj1 = new PessoaJuridica(23541980, "Chocolate Chocolito Crocante","30/10/1975","chococroc@chocolito.com.br","31 97895-2475", "Confeitos Chocolito Ltda", 1235789510);
			pj1.visualizar();
			
			PessoaJuridica pj2 = new PessoaJuridica(95103268, "Fernando Freire","21/07/1979","nandofer.freire@fern.com.br","63 97412-3654", "Nando Papelaria Ltda", 1478963205);
			pj2.visualizar();
		

	}

}
