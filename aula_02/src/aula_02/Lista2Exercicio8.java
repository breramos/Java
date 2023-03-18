package aula_02;

import java.util.Scanner;

public class Lista2Exercicio8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        float saldo = 1000;
        int operacao;
        int consulta = 1;
        int saque = 2;
        int deposito = 3;
        int saque2 = 1000;
        
        System.out.println("Operações Bancárias:");
        System.out.println("-------------------------");
        System.out.println(consulta + "\tSaldo");
        System.out.println(saque + "\tSaque" );
        System.out.println(deposito + "\tDepósito");
        System.out.println("-------------------------");
        
        System.out.println("Digite o código referente à operação desejada: ");
        operacao = leia.nextInt();
        
        System.out.println("Operação - " + operacao + " Saldo - R$" + saldo + "\nValor disponível para saque: R$ " + saque2);
        
        if(operacao <1 && operacao > 3) {
        	if(saque2 > 1000)
        		System.out.println("Saldo insuficiente!");
        	else 
        		System.out.println("Operação válida!");
        }else
        	System.out.println("Operação inválida!");
        
        switch(operacao) {
        case 1: 
        	System.out.println("A operação selecionada foi: " + operacao + ". Saldo - R$ " + saldo);
        break;
        
        }
        
        
        
	}

}
