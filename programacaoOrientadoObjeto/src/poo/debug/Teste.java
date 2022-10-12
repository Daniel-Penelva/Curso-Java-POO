package poo.debug;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("Calculadora");
		soma(10, 20);
		divisao(10, 5);
		
		Subtracao subtrair = new Subtracao();
		subtrair.calculaSubtracao(30, 20);
		
		Subtracao subtrair1 = new Subtracao(50, 1);
	}

	public static void soma(int num1, int num2) {
		System.out.println("Soma: " + num1 + " + " + num2 + " = " + (num1+num2));
	}
	
	public static void divisao(int num1, int num2) {
		//para entrar na condição com debug -> CTRL + SHIFT + I
		if(num2 >= 0) {
			System.out.println("Divisão: " + num1 + " / " + num2 + " = " + (num1/num2));
		}else {
			System.out.println("Não existe divisão por zero!");
		}
	}
}
