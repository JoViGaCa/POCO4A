package lista2ex7;

public class ExceptionB extends ExceptionA{
	public ExceptionB(){
		super("Exceção B: ambos os números são zero.");
	}
	
	public ExceptionB(String texto){
		super(texto);
	}
}
