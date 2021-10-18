package Lista1ex5e6;
import java.util.Scanner;

public class Principal {
	
	public Principal() {
		
	}

	public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);       
		Descobrir numero = new Descobrir();
		Analise analise = new Analise();
		int num1; // numero que deve ser adivinhado
		int num2; // numero que sera lido
		int total = 0;
		int erros = 0;
		
		num1 = numero.numRandom();
		
		
		while (true) {
			System.out.println("Digite um numero entre 0 e 25:");
			num2 = leitura.nextInt();
			total++;
			
			if(numero.Verifica(num2)) {
				System.out.println("Parabéns, você acertou!!");
				System.out.println(analise.getPorcentagem(erros, total));
				break;
			} else {
				erros++;
				if(num2 > num1) {
					System.out.println("O numero digitado é maior que o aleatório");
				} else {
					System.out.println("O numero digitado é menor que o aleatório");
				}	
			}
			
		}

	}

}
