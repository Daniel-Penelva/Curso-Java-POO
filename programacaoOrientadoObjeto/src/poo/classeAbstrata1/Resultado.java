package poo.classeAbstrata1;

public class Resultado extends Calculadora {

	int resultado;

	@Override
	public int somar(int n1, int n2) {
		resultado = n1 + n2;
		return resultado;
	}

	@Override
	public int subtracao(int n1, int n2) {
		resultado = n1 - n2;
		return resultado;
	}

	@Override
	public int multiplicacao(int n1, int n2) {
		resultado = n1 * n2;
		return resultado;
	}

	@Override
	public double divisao(int n1, int n2) {
		if (n2 <= 0) {
			return 0;
		} else {
			resultado = n1 / n2;
			return resultado;
		}

	}

}
