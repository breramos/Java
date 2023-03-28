package aula07.model;

public class PessoaFisica extends Cliente {
	
	private String profissao;

	public PessoaFisica(int id, String nome, String email, String telefone, String dataNasc, String profissao) {
		super(id, nome, email, telefone, dataNasc);
		this.profissao = profissao;
		
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Profissão: " + this.profissao);
	}

	
}
