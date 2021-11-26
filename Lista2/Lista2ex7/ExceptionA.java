package lista2ex7;

public class ExceptionA extends Exception{
	
	public ExceptionA(){
		super("Exceção A: divisão por zero.");
	}
	
	public ExceptionA(String texto){
		super(texto);
	}
}
