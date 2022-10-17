package poo.thread5BlocosSincronizados;

public class ChamandoThread {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 50 };

		/*
		 * Vamos ter duas threads acessando o mesmo recurso, ou seja, duas threads
		 * acessando a calculadora Para que seja sincronizado o acesso vai ser utilizado
		 * a palavra chave "synchronized" no método somaArray na classe Calculadora,
		 * portanto, não vai ser permitido que as duas threads acessem este método
		 * alterando o valor erradamente.
		 */

		MinhaThreadSoma thread1 = new MinhaThreadSoma("Thread #1", array);

		MinhaThreadSoma thread2 = new MinhaThreadSoma("Thread #2", array);

	}

}
