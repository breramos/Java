package exercicio_farmacia.model;

import java.text.NumberFormat;

public class Farmacia {

	private int id;
	private String nomeFarmaco;
	private String laboratorio;
	private String dosagem;
	private float preco;
	
	
	public Farmacia(int id, String nomeFarmaco, String laboratorio, String dosagem, float preco) {
		this.id = id;
		this.nomeFarmaco = nomeFarmaco;
		this.laboratorio = laboratorio;
		this.dosagem = dosagem;
		this.preco = preco;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNomeFarmaco() {
		return nomeFarmaco;
	}


	public void setNomeFarmaco(String nomeFarmaco) {
		this.nomeFarmaco = nomeFarmaco;
	}


	public String getLaboratorio() {
		return laboratorio;
	}


	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}


	public String getDosagem() {
		return dosagem;
	}


	public void setDosagem(String dosagem) {
		this.dosagem = dosagem;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void visualizar() {
			
			NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();
			
			System.out.println("************************************************");
			System.out.println("              DADOS DO MEDICAMENTO               ");
			System.out.println("************************************************");
			System.out.println("Número do código de barras: " + this.id);
			System.out.println("Nome do medicamento: " + this.nomeFarmaco);
			System.out.println("Dosagem: " + this.dosagem);
			System.out.println("Laboratório: " + this.laboratorio);
			System.out.println("Preço: " + nfMoeda.format(this.preco));
			System.out.println("\n");
		}
	
	
	
	
	
	
	
	
	
}
