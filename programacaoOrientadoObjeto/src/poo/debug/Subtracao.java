package poo.debug;

public class Subtracao {

	private int numero1;
	private int numero2;

	public Subtracao() {
		
	}
	
	public Subtracao(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
		
		int resultado = this.numero1 - this.numero2;
		System.out.println(resultado);
	}

	public void calculaSubtracao(int numero1, int numero2) {
		System.out.println("Subtração: " + numero1 + " - " + numero2 + " = " + (numero1 - numero2));
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

}
