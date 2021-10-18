package Lista1ex1e2;
import java.util.Scanner;
import java.lang.Math;

public class Principal {
	
	public Principal() {
	// construtor nulo	
	}
	
	public static void doAbs() {
		//recebe o numero, faz a operação e exibe o resultado
		Scanner numero = new Scanner(System.in);
		double resultado;
		System.out.println("Digite um numero: ");
		resultado = numero.nextDouble();
		resultado = Math.abs(resultado);
		System.out.println("Resultado = " + resultado);
	}
	
	public static void doCeil() {
		//recebe o numero, faz a operação e exibe o resultado
		Scanner numero = new Scanner(System.in);
		double resultado;
		System.out.println("Digite um numero: ");
		resultado = numero.nextDouble();
		resultado = Math.ceil(resultado);
		System.out.println("Resultado = " + resultado);
	}
	
	public static void doCos() {
		//recebe o numero, faz a operação e exibe o resultado
		Scanner numero = new Scanner(System.in);
		double resultado;
		System.out.println("Digite um numero: ");
		resultado = numero.nextDouble();
		resultado = Math.cos(resultado);
		System.out.println("Resultado = " + resultado);
	}
	
	public static void doExp() {
		//recebe o numero, faz a operação e exibe o resultado
		Scanner numero = new Scanner(System.in);
		double resultado;
		System.out.println("Digite um numero: ");
		resultado = numero.nextDouble();
		resultado = Math.exp(resultado);
		System.out.println("Resultado = " + resultado);
	}
	
	public static void doFloor() {
		//recebe o numero, faz a operação e exibe o resultado
		Scanner numero = new Scanner(System.in);
		double resultado;
		System.out.println("Digite um numero: ");
		resultado = numero.nextDouble();
		resultado = Math.floor(resultado);
		System.out.println("Resultado = " + resultado);
	}
	
	public static void doLog() {
		//recebe o numero, faz a operação e exibe o resultado
		Scanner numero = new Scanner(System.in);
		double resultado;
		System.out.println("Digite um numero: ");
		resultado = numero.nextDouble();
		resultado = Math.log(resultado);
		System.out.println("Resultado = " + resultado);
	}
	
	public static void doMax() {
		//recebe o numero, faz a operação e exibe o resultado
		Scanner numero = new Scanner(System.in);
		double resultado;
		double num1, num2;
		System.out.println("Digite um numero: ");
		num1 = numero.nextDouble();
		System.out.println("Digite um numero: ");
		num2 = numero.nextDouble();
		resultado = Math.max(num1,num2);
		System.out.println("Resultado = " + resultado);
	}
	
	public static void doMin() {
		//recebe o numero, faz a operação e exibe o resultado
		Scanner numero = new Scanner(System.in);
		double resultado;
		double num1, num2;
		System.out.println("Digite um numero: ");
		num1 = numero.nextDouble();
		System.out.println("Digite um numero: ");
		num2 = numero.nextDouble();
		resultado = Math.min(num1,num2);
		System.out.println("Resultado = " + resultado);
	}
	
	public static void doPow() {
		//recebe o numero, faz a operação e exibe o resultado
		Scanner numero = new Scanner(System.in);
		double resultado;
		double num1, num2;
		System.out.println("Digite um numero: ");
		num1 = numero.nextDouble();
		System.out.println("Digite um numero: ");
		num2 = numero.nextDouble();
		resultado = Math.pow(num1,num2);
		System.out.println("Resultado = " + resultado);
	}
	
	public static void doSqrt() {
		//recebe o numero, faz a operação e exibe o resultado
		Scanner numero = new Scanner(System.in);
		double resultado;
		System.out.println("Digite um numero: ");
		resultado = numero.nextDouble();
		resultado = Math.sqrt(resultado);
		System.out.println("Resultado = " + resultado);
	}
	
	
	public static void main (String [] args) {
		//cria o objeto que vai receber o valor da opcao
		Scanner opcao = new Scanner(System.in);
		
		//variavel da operação
		int operacao = 0;
		
		
		//apresenta o menu e recebe o valor da opcao
		do {
			System.out.println("Escolha uma opcao:");
			System.out.println("1-ABS");
			System.out.println("2-Ceil");
			System.out.println("3-Cos");
			System.out.println("4-Exp");
			System.out.println("5-Floor");
			System.out.println("6-Log");
			System.out.println("7-Max");
			System.out.println("8-Min");
			System.out.println("9-Pow");
			System.out.println("10-Sqrt");
		    operacao = opcao.nextInt();	
		} while(operacao == 0);
		
		//seleciona o método dependendo da operacao
		switch (operacao) {
		case 1:
			doAbs();
		    break;
		case 2:
			doCeil();
		    break;
		case 3:
			doCos();
		    break;
		case 4:
			doExp();
		    break;
		case 5:
			doFloor();
		    break;
		case 6:
			doLog();
		    break;
		case 7:
			doMax();
		    break;
		case 8:
			doMin();
		    break;
		case 9:
			doPow();
		    break;
		case 10:
			doSqrt();
		    break;	    
		}
		
		
		System.out.println("Digite uma opcao:");
		System.out.println("1-Hipotenusa");
		System.out.println("2-Baskhara pelo caminho +");
		System.out.println("3-Baskhara pelo caminho -");
		System.out.println("4-Progressao Aritimetica");
		System.out.println("5-Progressao Geometrica");
		
		//cria o objeto das fórmulas
		mathFormulas res = new mathFormulas();
		
		//recebe operação
		operacao = opcao.nextInt();
		
		//cria variaveis
		double resultado;
		double a, b, c, n, r, q;
		
		switch (operacao) {
		  case 1:
			  System.out.println("Digite os catetos:");
			  double cat1, cat2;
			  cat1 = opcao.nextDouble();
			  cat2 = opcao.nextDouble();
			  resultado = res.getHipotenusa(cat1, cat2);
			  System.out.println("Resultado = " + resultado);
		      break;
		  case 2:
			  System.out.println("Digite os coeficientes:");
			  a = opcao.nextDouble();
			  b = opcao.nextDouble();
			  c = opcao.nextDouble();
			  resultado = res.getRaizMais(a, b,c);
			  System.out.println("Resultado = " + resultado);
		      break;
		  case 3:
			  System.out.println("Digite os coeficientes:");
			  a = opcao.nextDouble();
			  b = opcao.nextDouble();
			  c = opcao.nextDouble();
			  resultado = res.getRaizMenos(a, b,c);
			  System.out.println("Resultado = " + resultado);
		      break;
		  case 4:
			  System.out.println("Digite os os valores de a, n e r:");
			  a = opcao.nextDouble();
			  n = opcao.nextDouble();
			  r = opcao.nextDouble();
			  resultado = res.getNumProgAri(a, n, r);
			  System.out.println("Resultado = " + resultado);
		      break;  
		  case 5:
			  System.out.println("Digite os os valores de a, n e q:");
			  a = opcao.nextDouble();
			  n = opcao.nextDouble();
			  q = opcao.nextDouble();
			  resultado = res.getNumProgAri(a, n, q);
			  System.out.println("Resultado = " + resultado);
		      break; 
			  
		}		
		
		
	}

}
