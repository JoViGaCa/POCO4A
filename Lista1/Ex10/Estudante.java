package Lista1ex10;

public class Estudante extends Nota {
	
	private String nome;
	private String cpf;
	private String curso;
	
	public Estudante () {
	
	}
	public Estudante(String nome, String cpf, String curso, float nota, float nota2) {
		this.nome = nome;
		this.cpf = cpf;
		this.curso = curso;
		this.nota = nota;
		this.nota2 = nota2;
	}
	
	public String toString() {
		return "Nome: " + this.nome + " / CPF: " + this.cpf + " / Curso: " + this.curso + " / Notas: " + this.nota + ", " + this.nota2;
	}
}

