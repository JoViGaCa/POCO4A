package lista2ex7;

public class ExceptionA extends Exception{
	
	public ExceptionA(){
		super("Exce��o A: divis�o por zero.");
	}
	
	public ExceptionA(String texto){
		super(texto);
	}
}
