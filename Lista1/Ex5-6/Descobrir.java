package Lista1ex5e6;
import java.util.Random;

public class Descobrir {
	
	private int numero;
	
	
	public Descobrir() {
		
	}
	
	public int numRandom() {
		//cria o objeto random, gera um numero entre 0 e 25 e retorna
		Random gerador = new Random();
		this.numero = gerador.nextInt(26);
		return this.numero;
	}
	
	public boolean Verifica(int numero) {
		if(this.numero == numero) {
			return true;
		} else {
			return false;
		}
	}
	
	

}
