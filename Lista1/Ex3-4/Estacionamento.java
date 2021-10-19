package lista1ex3e4;
import java.util.Scanner;

public class Estacionamento {
	private static float preco;
	
	public Estacionamento(){
		
	}
	
	public static void main(String[] args){
		
		int hora, min, horaSaida, minSaida;
		String tipo, placa;
		
		System.out.println("Insira o tipo de veículo.");
		Scanner sc = new Scanner(System.in); 
		tipo = sc.nextLine();
		
		System.out.println("Insira a placa do veículo.");
		placa = sc.nextLine();
		
		System.out.println("Digite o horário de entrada.");
		hora = sc.nextInt();
		min = sc.nextInt();
		
		System.out.println("Digite o horário de saída.");
		horaSaida = sc.nextInt();
		minSaida = sc.nextInt();
		
		TempoEstacionado tempo = new TempoEstacionado(hora,min,horaSaida,minSaida);
		
		if(tempo.getTempo()<=30){
			preco = 0;
		}else if(tempo.getTempo()>30 && tempo.getTempo()<=60){
			preco = 10;
		}else{
			preco = 20;
		}	
		
		System.out.println("Tipo: "+tipo+"\nPlaca: "+placa+"\nPreço: R$"+preco);
		
		
		sc.close();	
	}	
	
}
