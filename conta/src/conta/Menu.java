package conta;

import java.util.Scanner;

import conta.model.Conta;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float saldo, limite, valor;
		
		Conta c1 = new Conta(1,123,1,"Jennifer", 100000.00f);
		
		c1.visualizar();
		
		System.out.println("Saldo da conta: " + c1.getSaldo());
		
		c1.setTitular("Jeniffer Souza Ribeiro");
		
		//c1.visualizar();
		
		//c1.sacar(1000.0f);
		
		//c1.visualizar();
		
		while(true) {
			
			System.out.println(Cores.TEXT_CYAN + Cores.ANSI_BLACK_BACKGROUND + 
					"*************************************************");
			System.out.println("                                                 ");
			System.out.println("              BANCO DO BRAZIL COM Z              ");
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
			
			opcao = leia.nextInt();
			
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
	
		                    // criar o objeto conta corrente
		                }
		                case 2 -> {
		                    System.out.println("Digite o dia do Aniversario da Conta: ");
		                    aniversario = leia.nextInt();
	
		                    // criar o objeto conta poupanca
		                }
	                }	
					
				}
				case 2 -> {
					System.out.println(Cores.TEXT_YELLOW_BOLD + "Listar todas as contas\n\n");
				}
				case 3 -> {
					System.out.println(Cores.TEXT_YELLOW_BOLD + "Buscar conta por número\n\n");
					System.out.println("Digite o número da conta: ");
	                numero = leia.nextInt();
				}
				case 4 -> {
					System.out.println(Cores.TEXT_YELLOW_BOLD + "Atualizar dados da conta\n\n");
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
					
					
				}
				case 5 -> {
					System.out.println(Cores.TEXT_YELLOW_BOLD + "Apagar conta\n\n");
					System.out.println("Digite o número da conta: ");
	                numero = leia.nextInt();
				}
				case 6 -> {
					System.out.println(Cores.TEXT_YELLOW_BOLD + "Saque\n\n");
					
					System.out.println("Digite o número da conta: ");
	                numero = leia.nextInt();
	                
	                System.out.println("Digite o valor do Saque: ");
	                valor = leia.nextFloat();
	                
				}
				case 7 -> {
					System.out.println(Cores.TEXT_YELLOW_BOLD + "Depósito\n\n");
					
					System.out.println("Digite o número da conta: ");
	                numero = leia.nextInt();
	                
	                System.out.println("Digite o valor do Depósito: ");
	                valor = leia.nextFloat();
	                
				}
				case 8 -> {
					System.out.println(Cores.TEXT_YELLOW_BOLD + "Transferência entre contas\n\n");
					System.out.println("Digite o Numero da Conta de Origem: ");
	                numero = leia.nextInt();
	                System.out.println("Digite o Numero da Conta de Destino: ");
	                numeroDestino = leia.nextInt();

	                do {
	                    System.out.println("Digite o Valor da Transferência (R$): ");
	                    valor = leia.nextFloat();
	                } while (valor <= 0);
					
				}
				default -> System.out.println(Cores.TEXT_RED + "Opção Inválida!" + Cores.TEXT_RESET);
			}
				
		}
		
	}
	
	public static void sobre() {
		System.out.println("                                                          ");
		System.out.println(Cores.TEXT_PURPLE + "    Banco do Brazil com Z - O Seu Futuro Começa Aqui!     ");
		System.out.println("                                                          ");
		System.out.println("**********************************************************");
		System.out.println("                                                          ");
		System.out.println("   Brenda Ramos Bezerra - brendaramos.bezerra@gmail.com   ");
		System.out.println("               https://github.com/breramos                ");
		System.out.println("                                                          ");
		System.out.println("**********************************************************");
		
	}
}
