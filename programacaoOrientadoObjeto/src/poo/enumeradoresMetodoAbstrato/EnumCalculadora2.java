package poo.enumeradoresMetodoAbstrato;

public enum EnumCalculadora2 {

	SOMA {
		@Override
		public double calculando(double num1, double num2) {

			Calculadora calcula = new Calculadora();
			return calcula.somar(num1, num2);
			
		}
	},
	SUBTRACAO {
		@Override
		public double calculando(double num1, double num2) {
			
			Calculadora calcula = new Calculadora();
			return calcula.subtrair(num1, num2);
		}
	},
	MULTIPLICACAO {
		@Override
		public double calculando(double num1, double num2) {

			Calculadora calcula = new Calculadora();
			return calcula.multiplicar(num1, num2);
		}
	},
	DIVISAO {
		@Override
		public double calculando(double num1, double num2) {
			
				Calculadora calcula = new Calculadora();
				return calcula.dividir(num1, num2);
		}
	};
	
	//método abstrato recebe dois numeros.
	public abstract double calculando(double num1, double num2);
}
