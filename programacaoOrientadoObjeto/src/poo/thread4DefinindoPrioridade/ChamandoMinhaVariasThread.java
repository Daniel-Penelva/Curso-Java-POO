package poo.thread4DefinindoPrioridade;

//Objetivo: Usando método isAlive e join

public class ChamandoMinhaVariasThread {

	public static void main(String[] args) {
//obs. Runnable representa uma instancia de execução de uma Thread + implementar o método run.

		// Vão ser executados três tarefas paralelamente.

		MinhaVariasThread thread1 = new MinhaVariasThread("Thread #1", 1000);

		MinhaVariasThread thread2 = new MinhaVariasThread("Thread #2", 500);

		MinhaVariasThread thread3 = new MinhaVariasThread("Thread #3", 700);
		
		MinhaVariasThread thread4 = new MinhaVariasThread("Thread #4", 400);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		Thread t4 = new Thread(thread4);
		
		//O método setPriority define valores de 1 até 10 de prioridade
		//Essa questão de prioridade depende de vários fatores, não significa que será sempre respeitada.
		t1.setPriority(5);
		t2.setPriority(3);
		t3.setPriority(1);
		
		//Outro Exemplo é que a Classe Thread tem métodos de valores constantes que podem ser utilizados
		t4.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		System.out.println("Programa finalizado!");
	}

}
