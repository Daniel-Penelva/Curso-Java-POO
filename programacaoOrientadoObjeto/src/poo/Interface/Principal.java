package poo.Interface;

public class Principal {

	public static void main(String[] args) {

		// Calculadora Cientifica
		Calculadora calc = new CalculadoraCientifica();

		double somar = calc.soma(10, 5);
		double subtrair = calc.subtracao(20, 12);
		double multiplicar = calc.multiplicacao(10, 2);
		double dividir = calc.divisao(90, 3);

		System.out.println("Calculadora Cientifica - Resultado Soma: " + somar);
		System.out.println("Calculadora Cientifica - Resultado Subtração: " + subtrair);
		System.out.println("Calculadora Cientifica - Resultado Multiplicação: " + multiplicar);
		System.out.println("Calculadora Cientifica - Resultado Divisão: " + dividir);

		System.out.println("\n");
		
		// Calculadora Simples
		Calculadora calc1 = new CalculadoraSimples();

		System.out.println("Calculadora Simples - Resultado Soma: " + calc1.soma(5, 5));
		System.out.println("Calculadora Simples - Resultado Subtração: " + calc1.subtracao(20, 1));
		System.out.println("Calculadora Simples - Resultado Multiplicação: " + calc1.multiplicacao(20, 2));
		System.out.println("Calculadora Simples - Resultado Divisão: " + calc1.divisao(100, 4));

	}

}
