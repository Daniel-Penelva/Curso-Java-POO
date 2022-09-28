package poo.exception;

public class CpfInvalidaException extends Exception{

	//Construtor
	public CpfInvalidaException() {
		super();
		System.out.println("CPF inválido!");
	}
}
