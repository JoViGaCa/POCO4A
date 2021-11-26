package lista2ex3;

public class Real implements IConversorMoeda{
	
	private float valorReal;
	
	public float getvalorReal(){
		return valorReal;
	}
	
	public void setvalorReal(float valorReal){
		this.valorReal = valorReal;
	}
	
	public float getConversaoDolar(){
		float valorDolar = 0;
		
		valorDolar = valorReal * 0.18f;
		
		return valorDolar;
	}
	
}
