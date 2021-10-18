package Lista1ex10;
import java.util.Scanner;

public class Principal {
	
	public Principal() {
	// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nNome:");
		String nome = entrada.nextLine();
		System.out.println("\nCpf:");
		String cpf = entrada.nextLine();
		System.out.println("\nCurso:");
		String curso = entrada.nextLine();
		System.out.println("\nNota 1:");
		float nota1 = entrada.nextFloat();
		System.out.println("\nNota 2:");
		float nota2 = entrada.nextFloat();
		Estudante et = new Estudante(nome, cpf, curso, nota1, nota2);
		System.out.println(et);
		
		Nota aux = new Nota (nota1, nota2);
		System.out.println(aux);
	}
}

