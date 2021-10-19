package lista1ex7e8;

public class Pendulo {
	
	private int oscilacoes, a, b, c;
	
	public Pendulo(){	
	}
	
	public void setOscila(int oscilacoes){//método mutador
		this.oscilacoes = oscilacoes;
		c = this.oscilacoes;
		
		while(c > 30){
				b++;
				c -= 30;
				if(b > 30){
					a++;
					b -= 30;
				}//incrementa A
			}//incrementa B enquanto necessário
	}//setter
	
	public int getOscilaA(){//método acessor
		return a;
	}//getter
	
	public int getOscilaB(){
		return b;
	}//getter
	
	public int getOscilaC(){
		return c;
	}//getter
	
}
