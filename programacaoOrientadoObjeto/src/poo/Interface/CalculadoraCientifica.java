package poo.Interface;

public class CalculadoraCientifica implements Calculadora {

	double resultado;

	@Override
	public double soma(double numero1, double numero2) {
		resultado = numero1 + numero2;
		return resultado;
	}

	@Override
	public double subtracao(double numero1, double numero2) {
		resultado = numero1 - numero2;
		return resultado;
	}

	@Override
	public double multiplicacao(double numero1, double numero2) {
		resultado = numero1 * numero2;
		return resultado;
	}

	@Override
	public double divisao(double numero1, double numero2) {

		if (resultado <= 0) {
			return -1;
		} else {
			resultado = numero1 + numero2;
			return resultado;
		}
	}

}
