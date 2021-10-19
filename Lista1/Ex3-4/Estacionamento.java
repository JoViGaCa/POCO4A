package lista1ex3e4;
import java.util.Scanner;

public class Estacionamento {
	private static float preco;
	
	public Estacionamento(){
		
	}
	
	public static void main(String[] args){
		
		int hora, min, horaSaida, minSaida;
		String tipo, placa;
		
		System.out.println("Insira o tipo de ve�culo.");
		Scanner sc = new Scanner(System.in); 
		tipo = sc.nextLine();
		
		System.out.println("Insira a placa do ve�culo.");
		placa = sc.nextLine();
		
		System.out.println("Digite o hor�rio de entrada.");
		hora = sc.nextInt();
		min = sc.nextInt();
		
		System.out.println("Digite o hor�rio de sa�da.");
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
		
		System.out.println("Tipo: "+tipo+"\nPlaca: "+placa+"\nPre�o: R$"+preco);
		
		
		sc.close();	
	}	
	
}
