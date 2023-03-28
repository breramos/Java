package conta.model;

public class ContaCorrente extends Conta {
	
	private float limite;

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite; //pq criar método construtor?
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	
	@Override
	public boolean sacar(float valor) {
				
		if(this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\nSaldo insuficiente para efetuar saque!");
			return false;
		}
				
		this.setSaldo(this.getSaldo() - valor); //setSaldo define o novo valor do saldo depois do saque
			return true; //nesse método, o valor é definido depois do saque
				
		}
	
	@Override //chama-se polimorfismo de sobrescrita: significa que esse método está subescrevendo o método da super classe nessa sub classe.
	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de crédito: " + this.limite);
	}
	
	
	
	
}
