package lista2ex3;

public class BitCoin implements IConversorMoeda{
	
	private float valorBit;//quantia em bitcoin
	
	public float getvalorBit(){
		return valorBit;
	}
	
	public void setvalorBit(float valorBit){
		this.valorBit = valorBit;
	}
	
	public float getConversaoDolar(){
		float valorDolar = 0;
		
		valorDolar = valorBit * 58943.10f;
		
		return valorDolar;
	}
	
}
