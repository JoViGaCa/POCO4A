package lista2ex3;

public class Euro implements IConversorMoeda{
	
	private float valorEuro;
	
	public float getvalorEuro(){
		return valorEuro;
	}
	
	public void setvalorEuro(float valorEuro){
		this.valorEuro = valorEuro;
	}
	
	public float getConversaoDolar(){
		float valorDolar = 0;
		
		valorDolar = valorEuro * 1.12f;
		
		return valorDolar;
	}
	
}
