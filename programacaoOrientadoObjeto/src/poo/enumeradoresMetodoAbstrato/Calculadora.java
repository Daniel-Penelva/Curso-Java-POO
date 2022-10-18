package poo.enumeradoresMetodoAbstrato;

public class Calculadora {

	private double num1;
	private double num2;

	public Calculadora() {

	}

	public Calculadora(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double somar(double num1, double num2) {
		return num1 + num2;
	}

	public double subtrair(double num1, double num2) {
		return num1 - num2;
	}

	public double multiplicar(double num1, double num2) {
		return num1 * num2;
	}

	public double dividir(double num1, double num2) {
		if (num2 <= 0) {
			return -1;
		} else {
			return num1 / num2;
		}
	}
}
