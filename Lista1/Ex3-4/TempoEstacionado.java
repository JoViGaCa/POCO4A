/* Exercicio 4
 * Essa classe tem como objetivo a transforma��o do tempo de entrada e sa�da 
 * em minutos, para ent�o conseguir melhor calcular o intervalo de tempo 
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
		if(hora > horaSaida){//caso tenha entrado antes da meia noite e sa�do depois
			horaSaida += 1440;//numero de minutos em 24h
		}
		
		tempomin = (horaSaida + minSaida) - (hora + min);		
	}
	
	public int getTempo(){
		return tempomin;
	}
	
	
}
