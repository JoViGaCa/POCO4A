package Lista1ex10;

public class Nota {
	
	public float nota;
	public float nota2;
	
	
	public Nota() {
	// TODO Auto-generated constructor stub
	}
	
	public Nota(float nota, float nota2) {
		this.nota = nota;
		this.nota2 = nota2;
	}
	
	public float media() {
		float resultado;
		resultado = (nota + nota2) / 2 ;
		return resultado;
	}
	
	public String getSituacao() {
		if(this.media() > 6) {
			return ("Aprovado");
		} else {
			if (nota > nota2) {
				return ("Prova substitutiva, prova2");
			} else {
				return ("Prova substitutiva, prova1");
			}
		}
	}
	
	public String toString() {
		return "Media : " + this.media() + "\n Situacao:" + this.getSituacao();
	}
}

