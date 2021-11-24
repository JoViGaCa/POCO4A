package Lista2ex4;

public abstract class Assalariado extends Empregado {
    
	protected float salarioSemanal;

	public Assalariado(String nome, String sobrenome, float salarioBase, float salarioSemanal) {
		super(nome, sobrenome, salarioBase);
		this.salarioSemanal = salarioSemanal;
	}
	

}
