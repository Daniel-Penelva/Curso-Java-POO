package poo.thread5BlocosSincronizados;

public class MinhaThreadSoma implements Runnable {

	private String nome;

	// receber os numeros inetiros para passar para o array
	private int[] nums;

	// Objetivo: todas as instancias irão compartilhar a Classe Calculadora
	private static Calculadora calculadora = new Calculadora();

	public MinhaThreadSoma(String nome, int[] nums) {
		this.nome = nome;
		this.nums = nums;

		// Passando a classe
		new Thread(this, nome).start();
	}

	@Override
	public void run() {

		System.out.println(this.nome + " iniciada.");

		// Chamando o método e adicionando numa variável "soma"
		int soma = calculadora.somaArray(this.nums);
		
		System.out.println("Resultado da soma para o thread " + this.nome + " é " + soma); 

		System.out.println(this.nome + " terminada.");
	}

}
