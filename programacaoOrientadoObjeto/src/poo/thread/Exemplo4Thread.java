package poo.thread;
// Objetivo: Processamento concorrente entre duas threads

public class Exemplo4Thread {

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
			};

		}.start(); 

		System.out.println("TESTE 2 DE THREAD RODANDO EM PARALELO!");

		
		// Criando thread 2
		new Thread() {

			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Imagina que seja uma rotina de nota fiscal");

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};

		}.start();
		
		System.out.println("TESTE 3 DE THREAD RODANDO EM PARALELO!");
	}
}
