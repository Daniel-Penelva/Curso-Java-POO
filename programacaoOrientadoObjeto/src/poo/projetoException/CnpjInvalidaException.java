package poo.projetoException;

public class CnpjInvalidaException extends Exception {

	public CnpjInvalidaException() {
		super();
		System.out.println("CNPJ inválido!");
	}
}
