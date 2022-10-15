package poo.thread;
//Objetivo: Tempo de interrupção com o sleep

public class Exemplo1Thread {

	public static void main(String[] args) throws InterruptedException {

		for (int i = 0; i < 5; i++) {

			// A função sleep causa um tempo de interrupção de milissegundos - muito util para gerar pdf
			Thread.sleep(1000);

			// Quero executar esse envio com um tempo de parada, ou com um tempo determinado
			System.out.println("Imagina que seja uma rotina de email");
		}
		
		System.out.println("CHEGOU AO FIM DO CÓGIGO DE TESTE DE THREAD!");

	}

}
