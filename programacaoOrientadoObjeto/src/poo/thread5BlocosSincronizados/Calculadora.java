package poo.thread5BlocosSincronizados;

public class Calculadora {

	private int soma;

	public synchronized int somaArray(int[] array) {
		int soma = 0;

		for (int i = 0; i < array.length; i++) {

			soma += array[i];

			// O método "currentThread" define a Thread atual que está executando esse
			// recurso.
			System.out.println("Executando a soma " + Thread.currentThread().getName() +
					" somando o valor " + array[i] + " com total de: " + soma);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		return soma;
	}

}
