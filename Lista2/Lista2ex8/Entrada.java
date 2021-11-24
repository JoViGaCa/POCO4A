package Lista2ex8;
import javax.swing.JOptionPane;

public class Entrada {

	public Entrada() {
		// TODO Auto-generated constructor stub
	}
	
	public double getA() {
		return Double.parseDouble(JOptionPane.showInputDialog("Digite  coeficiente a: ")); 
	}
	
	public double getB() {
		return Double.parseDouble(JOptionPane.showInputDialog("Digite  coeficiente b: "));
	}
	
	public double getC() {
		return Double.parseDouble(JOptionPane.showInputDialog("Digite  coeficiente c: "));
	}

}
