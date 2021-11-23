package Lista2ex2;

public abstract class MembroUniversitario {
	protected float pagamento;
	protected String area;
	protected String bloco;
	protected String materia;
	protected int horas_semanais;

	public MembroUniversitario(float pagamento, String area, String bloco, String materia, int horas_sem) {
		this.pagamento = pagamento;
		this.area = area;
		this.bloco = bloco;
		this.materia= materia;
		this.horas_semanais = horas_sem;
	}
	
	public abstract float getPagamento();	
	
	public abstract String getArea();
	
	public abstract String getBloco();
	
	public abstract String getMateria();
	
	public abstract int getHorasSemanais();
	
	public String toString() {
		return ("Area: " + this.area + "\nPagamento: " +this.pagamento +
				   "\nBloco: " + this.bloco + "\nMateria: " + this.materia +
				   "\nHoras Semanais: " + this.horas_semanais + "\n");
	}

}
