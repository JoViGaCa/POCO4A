package lista2ex1;

public class Ra extends Anfibio{
	
	public Ra(String nome, String especie, char genero, String cor, String quantidadeEscamas){
		super(nome, especie, genero, cor, quantidadeEscamas);
	}
	
	public String nome(){
		return this.nome;
	}
	public String especie(){
		return this.especie;
	}
	public char genero(){
		return this.genero;
	}
	public String cor(){
		return this.cor;
	}
	
}
