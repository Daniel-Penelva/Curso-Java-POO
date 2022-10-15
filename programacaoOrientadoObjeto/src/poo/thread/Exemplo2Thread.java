package poo.thread;
// Objetivo: Criando a primeira Thread

public class Exemplo2Thread {

	public static void main(String[] args) {
		
     System.out.println("TESTE 1 DE THREAD RODANDO EM PARALELO!");
     
		// Criando uma thread
		new Thread() {

			// Código da rotina
			public void run() {
				for (int i = 0; i < 5; i++) {

					// Quero executar esse envio com um tempo de parada, ou com um tempo determinado
					System.out.println("Imagina que seja uma rotina de email");
					
					// A função sleep causa um tempo de interrupção de milissegundos - muito util para gerar pdf
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};

		}.start(); // liga a thread para processar paralelamente.

		System.out.println("TESTE 2 DE THREAD RODANDO EM PARALELO!");
	}
}
