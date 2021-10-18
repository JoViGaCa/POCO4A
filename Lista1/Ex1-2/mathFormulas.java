//Essa classe tem como o objetivo usar fórmulas de 
// matemárica para calcular valores
// como por exemplo Báshara, ou pitágoras.


package Lista1ex1e2;
import java.lang.Math;

public class mathFormulas {
	private double resultado;
	
	public mathFormulas(){
		
	}
	
	public double getHipotenusa(double cat1, double cat2) {
		// recebe os valores dos catetos e
		// retorna o valor da hipotenusa
		this.resultado = Math.sqrt((cat1 * cat1) + (cat2*cat2));
		return this.resultado;
	}
	
	public double getRaizMais(double a, double b, double c) {
		// recebe os coeficientes a, b e c da esquação
		// e retorna a raiz seguindo o caminho "+" da fórmula
		double delta = Math.pow(b,2) - 4*a*c;
		this.resultado = (-b + (Math.sqrt(delta)))/(2*a);
		return this.resultado;
	}
	
	public double getRaizMenos(double a, double b, double c) {
		// recebe os coeficientes a, b e c da esquação
		// e retorna a raiz seguindo o caminho "-" da fórmula
		double delta = Math.pow(b,2) - 4*a*c;
		this.resultado = (-b - (Math.sqrt(delta)))/(2*a);
		return this.resultado;
	}
	
	public double getNumProgAri(double a, double n, double r) {
		// retorna o termo N de uma progreção aritimética
		this.resultado = a + (n-1)*r;
		return this.resultado;
	}
	
	public double getNumProgGeo(double a, double n, double q) {
		// retorna o termo N de uma progressão geométrica
		this.resultado = a + Math.pow(q, n-1);
		return this.resultado;
	}
	

}
