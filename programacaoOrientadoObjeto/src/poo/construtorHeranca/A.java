package poo.construtorHeranca;

public class A {

	
	/* OBS.
	 * Construtor padrão A - é aquele que não recebe nada no parâmetro, ao contrário
	 * de um construtor sobrecarregado que recebe um valor como parametro, podendo
	 * ser de qlq tipo.
	 * 
	 * O comando super() só consegue chamar contrutores padrão (sem parametro) e
	 * nunca chama um construtor sobrecarregado (com parametro).
	 * 
	 * O comando super() chama o construtor padrão do Object.
	 */

	public A() {

		super();
		System.out.println("A");
	}
}
