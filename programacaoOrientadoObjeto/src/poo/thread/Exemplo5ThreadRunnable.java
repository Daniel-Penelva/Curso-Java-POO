package poo.thread;

//Objetivo: criando o Thread Runnable
public class Exemplo5ThreadRunnable {

	public static void main(String[] args) {

		System.out.println("TESTE 1 DE THREAD RODANDO EM PARALELO!");

		// Criando thread 1
		new Thread() {

			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Imagina que seja uma rotina de email");

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("FIM DA THREAD DE EMAIL!");
			};

		}.start();

		// chamando o thread 2
		Thread t2 = new Thread(thread2);
		t2.start();

		// chamando o thread 2
		Thread t3 = new Thread(thread3);
		t3.start();

	}// fim do main

	// Criando Thread 2
	private static Runnable thread2 = new Runnable() {

		// Automaticamente cria o método run
		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				System.out.println("Imagina que seja uma rotina de nota fiscal");

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("FIM DA THREAD NOTA FISCAL!");
		};

	};

	// Criando Thread 3
	private static Runnable thread3 = new Runnable() {

		// Automaticamente cria o método run
		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				System.out.println("Imagina que seja uma rotina de banco de dados");

				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("FIM DA THREAD DE BANCO DE DADOS!");
		};

	};

}
