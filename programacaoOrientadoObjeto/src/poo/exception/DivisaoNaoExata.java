package poo.exception;

public class DivisaoNaoExata extends Exception {
	private int numero;
	private int denominador;

	public DivisaoNaoExata(int numero, int denominador) {
		super();
		this.numero = numero;
		this.denominador = denominador;
	}

	public String toString() {
		return "Resultado de " + numero + "/" + denominador + " não é um inteiro!";
	}

}
