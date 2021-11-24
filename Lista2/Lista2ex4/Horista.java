package Lista2ex4;

public class Horista extends Empregado {
	private int horas;

	public Horista(String nome, String sobrenome, float salarioBase, int horas) {
		super(nome, sobrenome, salarioBase);
		this.horas = horas;
	}
	
	public float ganhos() {
		return (this.salarioBase / this.horas);
	}
	
	public String imprimir() {
		return ("Nome: " + this.nome + "Sobrenome: " + this.sobrenome +
				  "Ganhos: " + this.ganhos() + "Por hora");
	}

}
