package lista1ex7e8;
import java.util.Scanner;


public class Principal {
	
	private static int num, a, b, c;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Pendulo oscila = new Pendulo();
		Display mostra = new Display();
		
		num = sc.nextInt();//recebe do teclado
		
		oscila.setOscila(num);//executa os calculos
		
		a = oscila.getOscilaA();
		b = oscila.getOscilaB();
		c = oscila.getOscilaC();
		
		mostra.setDisplay(a,b,c);
		System.out.println(mostra);
		
		sc.close();
	}
	
}
