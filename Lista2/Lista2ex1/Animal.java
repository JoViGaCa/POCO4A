package lista2ex1;

public class Animal {
	public String nome;
	protected String especie;
	protected char genero;
	protected String cor;
	protected String pelugem;
	
	public Animal(String nome, String especie, char genero, String cor, String pelugem){
		this.nome = nome;
		this.especie = especie;
		this.genero = genero;
		this.cor = cor;
		this.pelugem = pelugem;
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
		return this.pelugem;
	}
	
	public String toString(){
		return "Nome: "+this.nome+"\nEsp�cie: "+this.especie+
				"\nG�nero: "+this.genero+"\nCor: "+this.cor+
				"\nMuito p�lo/escama?: "+this.pelugem+"\n";
	}
	
}
