package aula07.model;

public class Cliente {

	private int id;
	private String nome;
	private String email;
	private String telefone;
	private String dataNasc;
	
	
	public Cliente(int id, String nome, String email, String telefone, String dataNasc) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.dataNasc = dataNasc;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getDataNasc() {
		return dataNasc;
	}


	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	
	public void visualizar() {
		
		System.out.println("************************************************");
		System.out.println("                DADOS DO CLIENTE                ");
		System.out.println("************************************************");
		System.out.println("Número de identificação pessoal: " + this.id);
		System.out.println("Nome do Cliente: " + this.nome);
		System.out.println("Data de nascimento: " + this.dataNasc);
		System.out.println("Endereço de e-mail: " + this.email);
		System.out.println("Telefone para contato: " + this.telefone);
		System.out.println("\n");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
