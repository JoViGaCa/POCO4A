package Lista2ex4;

public abstract class Empregado {
	
	protected String nome;
	protected String sobrenome;
	protected float salarioBase;

	public Empregado(String nome, String sobrenome, float salarioBase) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioBase = salarioBase;
	}
	
	public abstract float ganhos();
	
	public abstract String imprimir();

}
