// O propósito desta classe é calcular a porcentagem
//    de erro do jogador na principal
package Lista1ex5e6;

public class Analise {
	
	private double porcentagem;
	
	public Analise() {
		
	}
	
    public String getPorcentagem(int erros, int total) {
    	// o método recebe os erros e o total de jogadas e calcula a porcentagem
    	this.porcentagem = (1 - ((double) erros/ (double)total)) * 100;
    	return ("Sua porcentagem de erros é: " + porcentagem + "%");
    }

}
