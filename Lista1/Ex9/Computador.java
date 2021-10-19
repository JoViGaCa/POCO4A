package lista1ex9;

public class Computador {
	
	private String nome, marca;
	Data data = new Data();
	
	public Computador(){	
	}
	
	public Computador setNome(String nome){
		this.nome = nome;
		return this;
	}
	
	public Computador setMarca(String marca){
		this.marca = marca;
		return this;
	}
	
	public Data setData(int dia, int mes, int ano){
		return data.setData(dia, mes, ano);
	}
	
	
}
