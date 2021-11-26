package lista2ex1;

public class Terrestre extends Animal{
	
	protected String quantidadePelos = new String ("pouco");
	
	public Terrestre(String nome, String especie, char genero, String cor, String quantidadePelos){
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
	public String pelugem(){
		return this.quantidadePelos;
	}
	
}
