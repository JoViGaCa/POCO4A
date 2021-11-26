package lista2ex1;

public class Macaco extends Terrestre{
	
	public Macaco(String nome, String especie, char genero, String cor, String quantidadePelos){
		super(nome, especie, genero, cor, quantidadePelos);
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
