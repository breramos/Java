package exercicio_farmacia;

import exercicio_farmacia.model.Farmacia;

public class TestaFarmacia {

	public static void main(String[] args) {
		
		int id;
		String nomeFarmaco, dosagem, laboratorio;
		float preco;
		
		Farmacia med1 = new Farmacia(1234567,"Dipirona","EMX", "500mg", 3.00f);
		
		med1.visualizar();
		
		Farmacia med2 = new Farmacia(7654321,"Simeticona", "Medlix", "125mg", 5.20f);
				
		med2.visualizar();
		
		

	}

}
