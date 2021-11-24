package Lista2ex6;

public class Principal {

	public Principal() {
		iniciar();
	}
    
	public double eq2GrauC(double a, double b, double c) throws ExceptionC {
		double delta;
		delta = (b*b -4*a*c);
		if (delta < 0) {
			throw new ExceptionC();
		}
	    return delta;
	}
	
	public double eq2GrauB(double a, double b, double c) throws ExceptionB {
		if(a == 0) {
			throw new ExceptionB();
		}
		double delta;
		delta = (b*b -4*a*c);
		return delta;		
	}
	
	public void iniciar() {
		double delta;
		//excetion B, coeficiente a de uma equação de segundo grau é zero
		try {
		  delta = eq2GrauB(0,3,-5);
		} catch (ExceptionA e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		// exception C, o delta de uma equação de segundo grau é negativo
		try {
			delta = eq2GrauC(5,2,5);
		} catch(ExceptionA e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void main(String[] args) {
		Principal p = new Principal();

	}

}
