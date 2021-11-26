package lista2ex7;
import java.io.IOException;

public class Principal {
	
	public Principal(){
		iniciar();
	}
	
	public float divisao(float a, float b) throws ExceptionA{
		
		if(b == 0){
			throw new ExceptionA();
		}else if(a == 0 && b == 0){
			throw new ExceptionB();
		}
		return a/b;
	}
	
	public int atribuicao(Integer x, int z){
		z = x;
		if(x == null){
			throw new NullPointerException();
		}
		return z;
	}
	
	public void excecaoio() throws IOException{
		throw new IOException();//exceção de input/output
	}
	
	public void iniciar(){
		Integer x = null;//Exceção NullPointerException
		int z = 0;
		try{
			divisao(5,0);
			divisao(0,0);
			atribuicao(x, z);
			excecaoio();
		}catch(ExceptionB e){
			e.printStackTrace();
		}catch(NullPointerException e){
			System.out.print("NullPointerException. " + e.getMessage());
			e.printStackTrace();
		}catch(IOException e){
			System.out.print("IOException. " + e.getMessage());
			e.printStackTrace();
		}catch(ExceptionA e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Principal p = new Principal();
	}
}
