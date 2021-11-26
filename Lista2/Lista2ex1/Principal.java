package lista2ex1;
import java.util.ArrayList;

public class Principal {
	
	public Principal(){
		
	}
	
	public static void main(String []args){
		
		Animal sapo = new Sapo("Sapo-cururu","Rhinella marina",'f',"Marrom","pouco");
		Animal ra = new Ra("Rã-leopardo", "Lithobates pipiens", 'f', "Verde","pouco");
		Animal leao = new Leao("Leão", "Panthera leo", 'm', "Alaranjado", "pouco");
		Animal macaco = new Macaco("Macaco", "Leontopithecus rosalia", 'm', "Dourado", "pouco");
		
		ArrayList<Animal> lista = new ArrayList<>(); 
		
		lista.add(sapo);
		lista.add(ra);
		lista.add(leao);
		lista.add(macaco);
		
		for(Animal membro : lista){
			System.out.print(membro.toString()+"\n");
		}
		
	}
}
