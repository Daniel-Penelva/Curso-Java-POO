package poo.enumeradoresMetodoAbstrato;

public enum EnumCalculadora {

	SOMA {
		@Override
		public double calculando(double num1, double num2) {

			double somar = num1 + num2;
			return somar;
		}
	},
	SUBTRACAO {
		@Override
		public double calculando(double num1, double num2) {
			
			double subtrair = num1 - num2;
			return subtrair;
		}
	},
	MULTIPLICACAO {
		@Override
		public double calculando(double num1, double num2) {

			double multiplicar = num1 * num2;
			return multiplicar;
		}
	},
	DIVISAO {
		@Override
		public double calculando(double num1, double num2) {

			if (num2 <= 0) {
				return 0;
			} else {
				double dividir = num1 / num2;
				return dividir;
			}
		}
	};
	
	//método abstrato recebe dois numeros.
	public abstract double calculando(double num1, double num2);
}
