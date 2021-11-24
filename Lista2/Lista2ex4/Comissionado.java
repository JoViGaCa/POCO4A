package Lista2ex4;

public class Comissionado extends Empregado {
	private float taxaComissao;

	public Comissionado(String nome, String sobrenome, float salarioBase, float taxaComissao) {
		super(nome, sobrenome, salarioBase);
		this.taxaComissao = taxaComissao;
	}
	
	public float ganhos() {
		return (this.salarioBase + this.taxaComissao*this.salarioBase);
	}
	
	public String imprimir() {
		return ("Nome: " + this.nome + "Sobrenome: " + this.sobrenome + 
				 "Ganhos: " + this.ganhos());
	}

}
