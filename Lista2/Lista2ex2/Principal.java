package Lista2ex2;

import java.util.ArrayList;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Administrativo admin = new Administrativo(850.0f,"Papelada","Bloco A","Nenhuma",40);
		Professor p = new Professor(1250.0f,"Fisica","Bloco C","Fisica",60);
		Tecnico tec = new Tecnico(650.0f,"Informatica","Bloco A","Nenhuma",25);
		Bolsista bol = new Bolsista(400.0f,"Robotica","Bloco M","Programacao",20);
		
		ArrayList<MembroUniversitario> lista = new ArrayList<>();
		
		lista.add(admin);
		lista.add(p);
		lista.add(tec);
		lista.add(bol);
		
		for(MembroUniversitario m : lista) {
			System.out.println(m.toString());
		}
		
		
	}
}