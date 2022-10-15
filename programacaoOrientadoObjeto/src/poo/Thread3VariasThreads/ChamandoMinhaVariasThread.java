package poo.Thread3VariasThreads;

//Objetivo: Usando método isAlive e join

public class ChamandoMinhaVariasThread {

	public static void main(String[] args) {
//obs. Runnable representa uma instancia de execução de uma Thread + implementar o método run.

		// Vão ser executados três tarefas paralelamente.

		MinhaVariasThread thread1 = new MinhaVariasThread("Thread #1", 1000);

		MinhaVariasThread thread2 = new MinhaVariasThread("Thread #2", 200);

		MinhaVariasThread thread3 = new MinhaVariasThread("Thread #3", 600);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();
		t2.start();
		t3.start();

		// Pergunta: Como colocar a informação abaixo depois de ter terminado todos os threads?
		// Pode ser feito com três exemplos (sendo o terceiro exemplo o mais limpo)
		
		// Exemplo1: Pode ser colocado um contador
		// System.out.println("Programa finalizado!");

		/* Exemplo1
		for (int i = 0; i < 7; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Programa finalizado!");
		*/
		
		
		/*Exemplo2
		 * 
		 * Com o método isAlive() - Este método é usado para descobrir se um encadeamento das Threads foi 
		 * realmente iniciado e ainda não foi encerrado. Ou seja, para saber se o método de início da thread 
		 * foi chamado ou se a thread foi encerrada.
		 */
		
		/*
		while(t1.isAlive() || t2.isAlive() || t3.isAlive()) {
			for (int i = 0; i < 7; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Programa finalizado!");
		*/
		
		/*Exemplo3 
		 * 
		 * Usando o método join - Join é um método de sincronização que bloqueia o thread de chamada 
		 * (ou seja, o thread que chama o método) até que o thread cujo Join método for chamado tenha sido 
		 * concluído. Use esse método para garantir que um thread tenha sido encerrado. O chamador bloqueará
		 * indefinidamente se o thread não for encerrado.
		 * 
		 * Esse exemplo vai ser feito no arquivo "ChamandoMinhaVariasThread2"*/
		
		try {
			
			t1.join(); 
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Programa finalizado!");
	}

}
