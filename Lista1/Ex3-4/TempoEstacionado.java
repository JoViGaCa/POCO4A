/* Exercicio 4
 * Essa classe tem como objetivo a transformação do tempo de entrada e saída 
 * em minutos, para então conseguir melhor calcular o intervalo de tempo 
 * em que o carro esteve estacionado
*/


package lista1ex3e4;

public class TempoEstacionado {
	
	private int tempomin;//tempo total, em minutos
	
	public TempoEstacionado(){
		
	}
	
	public TempoEstacionado(int hora, int min, int horaSaida, int minSaida){
		hora = hora * 60;
		horaSaida = horaSaida * 60;
		if(hora > horaSaida){//caso tenha entrado antes da meia noite e saído depois
			horaSaida += 1440;//numero de minutos em 24h
		}
		
		tempomin = (horaSaida + minSaida) - (hora + min);		
	}
	
	public int getTempo(){
		return tempomin;
	}
	
	
}
