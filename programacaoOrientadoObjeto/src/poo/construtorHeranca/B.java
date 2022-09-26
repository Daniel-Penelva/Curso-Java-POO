package poo.construtorHeranca;

public class B extends A{

	/*
	 * O comando super() chama o construtor padrão de A
	 */

	public B(String s) {
		super();
		System.out.println("B");
	}

}
