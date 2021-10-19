/* Exercício 8
 * O objetivo dessa classe é executar a impressão do display
 * de A, B e C a partir dos cálculos executados na classe Pendulo.
*/
package lista1ex7e8;

public class Display {
	
	public Display(){
	}
	
	private String display;
	
	public void setDisplay(int a, int b, int c){
		this.display = "A: "+a+" B: "+b+" C: "+c;
	}
	
	public String toString(){
		return this.display;
	}
	
}
