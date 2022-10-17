package poo.thread7ModoSuspender;

public class ChamandoMinhaThread {

	public static void main(String[] args) {

		MinhaThread thread1 = new MinhaThread("Thread#1");
		MinhaThread thread2 = new MinhaThread("Thread#2");

		thread1.suspend();

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		thread2.suspend();

		thread1.resume();

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		thread2.resume();

		// A thread2 vai ser terminada depois do indice 0 do array, no caso, a thread2, 1 . 
		thread2.stop();
	}

}
