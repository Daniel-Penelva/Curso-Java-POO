package poo.thread6ModoDeEspera;

public class ChamandoThreadTiqueTaque {

	public static void main(String[] args) {

		TiqueTaque tt = new TiqueTaque();

		ThreadTiqueTaque tique = new ThreadTiqueTaque("Tique", tt);
		ThreadTiqueTaque taque = new ThreadTiqueTaque("Taque", tt);

		// Vai esperar a execução de cada uma.
		try {
			tique.t.join();
			taque.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		/*
		 * OBS. Se comentar o try...catch e o notify() o tique será impresso primeiro e
		 * depois o taque, ou seja, não terá mais a sincronização.
		 */
	}

}
