package Lista2ex6;

public class ExceptionA extends Exception {

	public ExceptionA() {
		super("Excecao A: todos coeficientes nulos");
	}
	
	public ExceptionA(String msg) {
		super(msg);
	}

}
