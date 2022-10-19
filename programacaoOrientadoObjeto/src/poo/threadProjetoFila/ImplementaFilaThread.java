package poo.threadProjetoFila;

import java.util.Iterator;

/*Ele pode ser usado quando uma fila ilimitada é compartilhada entre vários threads. Esta classe não 
 *permite elementos nulos. Os iteradores são fracamente consistentes. 
 * */

import java.util.concurrent.ConcurrentLinkedQueue;

import javax.xml.stream.events.StartDocument;

public class ImplementaFilaThread extends Thread {

	// É uma fila única por isso é static - vai ser instanciado uma fila
	private static ConcurrentLinkedQueue<FilaThread> fila = new ConcurrentLinkedQueue<FilaThread>();

	// Vai adicionando objetos na lista
	public static void add(FilaThread filaThread) {
		fila.add(filaThread);
	}

	@Override
	public void run() {

		System.out.println("Fila rodando!");

		// Enquanto estiver dados na lista irá executar!!!
		while (true) {

			// Bloquear o acesso a esta lista por outro processos.
			synchronized (fila) {
				
				Iterator iteracao = fila.iterator();
				
				// Enquanto estiver dados na lista irá processar!!!
				while (iteracao.hasNext()) {

					// Pega o objeto atual e processa
					FilaThread processar = (FilaThread) iteracao.next();

					/**
					 * Por exemplo, Podemos processar 10 mil notas fiscais; Gerar uma lista enorme
					 * de PDF; Gerar um array em massa de email; etc...
					 */

					System.out.println("-------------------------------------");

					System.out.println(processar.getEmail());
					System.out.println(processar.getNome());

					// Depois irá remover.
					iteracao.remove();

					// Para dar um tempo de descarga de memória.
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}

			// Depois de processar a lista dará um tempo para limpeza de memória.
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
