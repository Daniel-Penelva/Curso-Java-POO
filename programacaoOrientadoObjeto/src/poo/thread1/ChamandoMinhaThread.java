package poo.thread1;

public class ChamandoMinhaThread {

	public static void main(String[] args) {

		// Vão ser executados três tarefas paralelamente.
		
		MinhaThread thread1 = new MinhaThread("Thread #1", 1000);

		MinhaThread thread2 = new MinhaThread("Thread #2", 500);

		MinhaThread thread3 = new MinhaThread("Thread #3", 100);
	}
}
