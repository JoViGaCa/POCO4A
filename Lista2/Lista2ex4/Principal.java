package Lista2ex4;

import java.util.ArrayList;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		float bonificacao = 200f;
		float salarioBase = 1200f;
		float salarioSemanal = 450f;
		float taxaComissao = 0.15f;
		int horas = 120;
		
        Bonificado b1 = new Bonificado("Joao","Silva",salarioBase,bonificacao,salarioSemanal);
        Comissionado c1 = new Comissionado("Maria", "Soares", salarioBase, taxaComissao);
        Horista h1 = new Horista("Jomar", "Silva Soares", salarioBase,horas);
        
        ArrayList<Empregado> lista = new ArrayList<>();
        lista.add(b1);
        lista.add(c1);
        lista.add(h1);
        
        for (Empregado emp : lista) {
        	System.out.println(emp.imprimir());
        	System.out.println(emp.ganhos());
        }
        

	}

}
