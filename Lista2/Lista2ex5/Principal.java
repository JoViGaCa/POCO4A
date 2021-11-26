package lista2ex5;
import java.util.ArrayList;

public class Principal {
	
	public Principal(){}
	
	public static void main(String[] args) {
		
		ArrayList<IOperacoes> lista = new ArrayList<>();
		lista.add(new Soma());
		lista.add(new Subtracao());
		lista.add(new Divisao());
		lista.add(new Multiplicacao());
		
		for(IOperacoes i : lista){
			i.setOperando1(5.0f);
			i.setOperando2(5.0f);
			System.out.println("Resultado "+i.getNome()+": "+i.getResultado());
			System.out.println("Iteração "+i.getQuantidade()+" da "+i.getNome());
		}
		
		
	}
}
