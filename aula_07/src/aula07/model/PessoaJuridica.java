package aula07.model;

public class PessoaJuridica extends Cliente {
	
	private int cnpj;
	private String razaoSocial;
	
	public PessoaJuridica(int id, String nome, String email, String telefone, String dataNasc, String razaoSocial, int cnpj) {
		super(id, nome, email, telefone, dataNasc);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Razão Social: " + this.razaoSocial);
		System.out.println("Número do CNPJ: " + this.cnpj);
	}
	
	
}
