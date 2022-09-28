package poo.exception;

public class CnpjInvalidaException extends Exception {

	public CnpjInvalidaException() {
		super();
		System.out.println("CNPJ inválido!");
	}
}
