package poo.classeAbstrata1;

public class Principal {

	public static void main(String[] args) {
		
		Calculadora soma = new Resultado();
		int calSoma = soma.somar(10, 90);
		System.out.println("Resultado Soma: " + calSoma);
		
		Calculadora subtracao = new Resultado();
		System.out.println("Resultado Subtração: " + subtracao.subtracao(80, 10));
		
		Calculadora multiplicacao = new Resultado();
		System.out.println("Resultado Multiplicação: " + multiplicacao.multiplicacao(80, 2));
		
		Calculadora divisao = new Resultado();
		System.out.println("Resultado Divisão: " + divisao.divisao(80, 4));

	}

}
