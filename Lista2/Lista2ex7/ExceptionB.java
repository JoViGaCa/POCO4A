package lista2ex7;

public class ExceptionB extends ExceptionA{
	public ExceptionB(){
		super("Exce��o B: ambos os n�meros s�o zero.");
	}
	
	public ExceptionB(String texto){
		super(texto);
	}
}
