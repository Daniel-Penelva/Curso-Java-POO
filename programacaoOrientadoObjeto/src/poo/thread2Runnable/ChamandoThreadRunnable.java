package poo.thread2Runnable;

import poo.thread1.MinhaThread;

public class ChamandoThreadRunnable {

	public static void main(String[] args) {
//obs. Runnable representa uma instancia de execução de uma Thread + implementar o método run.
		
		// Vão ser executados três tarefas paralelamente.

		MinhaThreadRunnable thread = new MinhaThreadRunnable("Thread #1", 1000);

		// Vamos usar a biblioteca da thread runnable

		/*
		 * Podemos fazer o código abaixo no construtor
		 * 
		 * Thread t1 = new Thread(thread); 
		 * t1.start();
		 */

		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread #2", 200);

		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread #3", 600);

	}

}
