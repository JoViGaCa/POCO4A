package lista2ex3;
import java.util.ArrayList;

public class Principal{
	
	public Principal(){}
	
	public static void main(String []args){
		
		ArrayList<IConversorMoeda> lista = new ArrayList<>();
		
		lista.add(new BitCoin());
		lista.add(new Euro());
		lista.add(new Real());
		
		for(IConversorMoeda moeda : lista){
			System.out.println(moeda.getConversaoDolar());
		}
		
	}
}
