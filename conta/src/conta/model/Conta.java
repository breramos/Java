package conta.model;

public abstract class Conta {
	
	/*Classe abstract tem que ser genérica, servir de base para criar as classe filhas e suas heranças.
	Como se fosse uma criação de contrato: tem que usar tudo que está na classe mãe*/
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public Conta () { } //usado para testes de software
	/*polimorfismo de sobrecarga: dois métodos com o mesmo nome, na mesma classe, com assinaturas diferentes
	(parâmetros diferentes); retorna valores nulos quando utilizado p criar algum objeto na classe main*/

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacar(float valor) {
		
		if(this.getSaldo() < valor) {
			System.out.println("\nSaldo insuficiente para efetuar saque!");
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor); //setSaldo define o novo valor do saldo depois do saque
		return true; //nesse método, o valor é definido depois do saque
		
	}
	
	public void depositar(float valor) {
		this.setSaldo(this.getSaldo() + valor);
		
	}
	
	
	public void visualizar() {
		
		String tipo = "";
		
		switch(this.tipo) {  //por que preciso referenciar this.tipo no switch, e não a variavel tipo?
			case 1 -> tipo = "Conta Corrente";
			case 2 -> tipo = "Conta Poupança";
		}
		
		System.out.println("*******************************");
		System.out.println("         DADOS DA CONTA        ");
		System.out.println("*******************************");
		System.out.println("Número da conta: " + this.numero);
		System.out.println("Número da agência: " + this.agencia);
		System.out.println("Tipo da conta: " + tipo);
		System.out.println("Nome do titular da conta: " + this.titular);
		System.out.println("Saldo da conta: " + this.saldo);
	}
	
	
	
}
