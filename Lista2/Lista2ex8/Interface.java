package Lista2ex8;

public class Interface {
	private Entrada entrada = null;
	private Saida saida = null;
	private double a;
	private double b;
	private double c;

	public Interface() {
		this.entrada = new Entrada();
		this.saida = new Saida();
	}
	
	public void roda() {
		getCoeficiente();
		saida.showRasultado(calculaRaiz1(), calculaRaiz2());
	}
	
	public void getCoeficiente() {
		this.a = entrada.getA();
		this.b = entrada.getB();
		this.c = entrada.getC();
	}
	
	public double calculaRaiz1() {		
		double delta = (b*b -4*a*c);
		double raiz = (-b + Math.sqrt(delta))/2*a;
		return raiz;
	}
	
	public double calculaRaiz2() {		
		double delta = (b*b -4*a*c);
		double raiz = (-b - Math.sqrt(delta))/2*a;
		return raiz;
	}
	

}
