package lista2ex5;

public class Subtracao implements IOperacoes {
	private float n1, n2;
	private String nomeOp = new String("Subtração");
	private int cont = 0;
	
	public void setOperando1(float n1){
		this.n1 = n1;
	}
	
	public void setOperando2(float n2){
		this.n2 = n2;
	}
	
	public float getResultado(){
		return n1 - n2;
	}
	
	public String getNome(){
		return nomeOp;
	}
	
	public int getQuantidade(){
		return cont + 1;
	}
}
