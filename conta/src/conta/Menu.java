package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float saldo, limite, valor;
		
		ContaController contas = new ContaController();
		
		/*Conta c1 = new Conta(1,123,1,"Jennifer", 100000.00f); não é possível instanciar objetos dessa classe, porque ela se tornou abstrata
		c1.visualizar();*/
		
		/*ContaCorrente cc1 = new ContaCorrente(2,123,1,"Gabriel Machado", 10000.00f, 1000.00f);
		cc1.visualizar();
		cc1.sacar(9000.00f);
		cc1.visualizar();
		cc1.depositar(2500.00f);
		cc1.visualizar();
		
		ContaPoupanca cp1 = new ContaPoupanca(1,321,2, "Paula da Silva", 10000.00f, 28);
		cp1.visualizar();
		cp1.sacar(8000.00f);
		cp1.visualizar();
		cp1.depositar(3200.00f);
		cp1.visualizar();*/
		
		//System.out.println("Saldo da conta: " + c1.getSaldo()); c1.setTitular("Jeniffer Souza Ribeiro");
		//c1.visualizar(); c1.sacar(1000.0f);c1.visualizar();
		
		while(true) {
			
			System.out.println(Cores.TEXT_CYAN + Cores.ANSI_BLACK_BACKGROUND + 
					"*************************************************");
			System.out.println("                                                 ");
			System.out.println("         LA BANQUE DU BRÉZIL AVEC LE Z           ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("                                                 ");
			System.out.println("         1 - Criar Conta                         ");
			System.out.println("         2 - Listar todas as contas              ");
			System.out.println("         3 - Buscar Conta por Número             ");
			System.out.println("         4 - Atualizar Dados da Conta            ");
			System.out.println("         5 - Apagar conta                        ");
			System.out.println("         6 - Sacar                               ");
			System.out.println("         7 - Depositar                           ");
			System.out.println("         8 - Transferir valores entre contas     ");
			System.out.println("         9 - Sair                                ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("                                                 ");
			System.out.println("           Entre com a opção desejada:           ");
			System.out.println("                                                 " + Cores.TEXT_RESET);
			
			try {
				opcao = leia.nextInt(); //Recebe um valor e armazena ele
			}catch(InputMismatchException e) {
				System.out.println("Digite valores inteiros!");
				leia.nextLine(); //Pula linha e não lê valores repetidos
				opcao = 0;
			}
			if(opcao == 9) {
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			
				case 1 -> {
					System.out.println(Cores.TEXT_YELLOW_BOLD + "Criar conta\n\n");
					
					System.out.println("Digite o Numero da Agência: ");
	                agencia = leia.nextInt();
	                System.out.println("Digite o Nome do Titular: ");
	                leia.skip("\\R?");
	                titular = leia.nextLine();

	                do {
	                    System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");
	                    tipo = leia.nextInt();
	                } while (tipo < 1 && tipo > 2);

	                System.out.println("Digite o Saldo da Conta (R$): ");
	                saldo = leia.nextFloat();

	                switch (tipo) {
		                case 1 -> {
		                    System.out.println("Digite o Limite de Crédito (R$): ");
		                    limite = leia.nextFloat();
	
		                    contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
		                }
		                case 2 -> {
		                    System.out.println("Digite o dia do Aniversario da Conta: ");
		                    aniversario = leia.nextInt();
	
		                    contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
		                }
	                }	
	                keyPress();
				}
				case 2 -> {
					System.out.println(Cores.TEXT_YELLOW + "Listar todas as contas\n\n");
					contas.listarTodas();
					keyPress();
				}
				case 3 -> {
					System.out.println(Cores.TEXT_YELLOW + "Buscar conta por número\n\n");
					System.out.println("Digite o número da conta: ");
	                numero = leia.nextInt();
	                contas.procurarPorNumero(numero);
	                keyPress();
				}
				case 4 -> {
					System.out.println(Cores.TEXT_YELLOW + "Atualizar dados da conta\n\n");
					System.out.println("Digite o número da conta: ");
	                numero = leia.nextInt();

	                tipo = 1;
	                // condicional buscar na collection

	                System.out.println("Digite o Numero da Agência: ");
	                agencia = leia.nextInt();
	                System.out.println("Digite o Nome do Titular: ");
	                leia.skip("\\R?");
	                titular = leia.nextLine();

	                System.out.println("Digite o Saldo da Conta (R$): ");
	                saldo = leia.nextFloat();

	                // retornar tipo

	                switch (tipo) {
		                case 1 -> {
		                    System.out.println("Digite o Limite de Crédito (R$): ");
		                    limite = leia.nextFloat();
	
		                    // criar o objeto conta corrente
		                }
		                case 2 -> {
		                    System.out.println("Digite o dia do Aniversario da Conta: ");
		                    aniversario = leia.nextInt();
	
		                    // criar o objeto conta poupanca
	
		                }
		                default -> {
		                    System.out.println("Tipo de conta inválido!");
		                }
		              
	               }
	                
	                // fim do condicional buscar na collection
					
	                keyPress();	
				}
				case 5 -> {
					System.out.println(Cores.TEXT_YELLOW + "Apagar conta\n\n");
					System.out.println("Digite o número da conta: ");
	                numero = leia.nextInt();
	                keyPress();
				}
				case 6 -> {
					System.out.println(Cores.TEXT_YELLOW + "Saque\n\n");
					
					System.out.println("Digite o número da conta: ");
	                numero = leia.nextInt();
	                
	                System.out.println("Digite o valor do Saque: ");
	                valor = leia.nextFloat();
	                keyPress();    
				}
				case 7 -> {
					System.out.println(Cores.TEXT_YELLOW + "Depósito\n\n");
					
					System.out.println("Digite o número da conta: ");
	                numero = leia.nextInt();
	                
	                System.out.println("Digite o valor do Depósito: ");
	                valor = leia.nextFloat();
	                keyPress();    
				}
				case 8 -> {
					System.out.println(Cores.TEXT_YELLOW + "Transferência entre contas\n\n");
					System.out.println("Digite o Numero da Conta de Origem: ");
	                numero = leia.nextInt();
	                System.out.println("Digite o Numero da Conta de Destino: ");
	                numeroDestino = leia.nextInt();

	                do {
	                    System.out.println("Digite o Valor da Transferência (R$): ");
	                    valor = leia.nextFloat();
	                } while (valor <= 0);
	                keyPress();	
				}
				default -> {
					System.out.println(Cores.TEXT_RED + "Opção Inválida!" + Cores.TEXT_RESET);
					keyPress();
				}
			}
				
		}
		
	}
	
	public static void sobre() {
		System.out.println("                                                          ");
		System.out.println(Cores.TEXT_PURPLE + " La Banque du Brézil Avec le Z - O Seu Futuro Começa Aqui!     ");
		System.out.println("                                                          ");
		System.out.println("**********************************************************");
		System.out.println("                                                          ");
		System.out.println("   Brenda Ramos Bezerra - brendaramos.bezerra@gmail.com   ");
		System.out.println("               https://github.com/breramos                ");
		System.out.println("                                                          ");
		System.out.println("**********************************************************");
		
	}
	
	
	public static void keyPress() {
		
		try {
			System.out.println(Cores.TEXT_RESET + "Pressione a tecla ENTER para continuar...");
			System.in.read(); //método fica esperando que alguém pressione alguma tecla
		}catch (IOException e) {
			System.out.println("Erro de digitação!");
		}
		
	}
}
