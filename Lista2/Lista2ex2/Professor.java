package Lista2ex2;

public class Professor extends MembroUniversitario {

	public Professor(float pagamento, String area, String bloco, String materia, int horas_sem) {
		super(pagamento, area, bloco, materia, horas_sem);
	}
	
	public float getPagamento() {
		return this.pagamento;
	}
	
	public String getArea() {
		return this.area;
	}
	
	public String getBloco() {
		return this.bloco;
	}
	
	public String getMateria() {
		return this.materia;
	}
	
	public int getHorasSemanais() {
		return this.horas_semanais;
	}


}
