package Lista2ex4;

public class Bonificado extends Assalariado {
	private float bonificacao;

	public Bonificado(String nome, String sobrenome, float salarioBase, float bonificacao, float salarioSemanal) {
		super(nome, sobrenome, salarioBase, salarioSemanal);
		this.bonificacao = bonificacao;
	}
	
	public float ganhos() {
		return (this.salarioSemanal - bonificacao);
	}
	
	public String imprimir() {
		return ("Nome: " + this.nome + "Sobrenome: " + this.sobrenome +
				  "Ganhos: " + this.ganhos() + "por semana");
	}

}
