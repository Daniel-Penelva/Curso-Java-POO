package poo.enumeradoresProjeto;

public class Calculadora {

	// Implementações do método abstrato
	enum Operacao {
		SOMAR("+") {
			@Override
			public double executarOperacao(double num1, double num2) {
				return num1 + num2;
			}
		},
		SUBTRAIR("-") {
			@Override
			public double executarOperacao(double num1, double num2) {
				return num1 - num2;
			}
		},
		MULTIPLICAR("*") {
			@Override
			public double executarOperacao(double num1, double num2) {
				return num1 * num2;
			}
		},
		DIVIDIR("/") {
			@Override
			public double executarOperacao(double num1, double num2) {
				if (num2 <= 0) {
					return -1;
				} else {
					return num1 / num2;
				}
			}
		};

		private String simbolo;

		Operacao(String simbolo) {
			this.simbolo = simbolo;
		}

		// Método abstrato
		public abstract double executarOperacao(double num1, double num2);

		// Para imprimir o simbolo
		public String toString() {
			return this.simbolo;
		}
	};

	public static void main(String[] args) {

		double num1 = 2.0;
		double num2 = 3.0;
		
		//Todos os valores dos enumeradores
		for(Operacao op: Operacao.values()) {
			System.out.print(num1 + " ");
			System.out.print(op.toString() + " ");
			System.out.print(num2 + " = ");
			System.out.println(op.executarOperacao(num1, num2));
		}
	}

}
