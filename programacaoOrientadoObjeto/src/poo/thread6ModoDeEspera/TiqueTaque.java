package poo.thread6ModoDeEspera;

public class TiqueTaque {

	boolean tique;

	synchronized void tique(boolean estaExecutando) {

		// É chamado o método notify porque ela dará um wait.
		// Enquanto o tique estiver executando não vai passar pelo if
		if (!estaExecutando) {
			tique = true;
			notify();
			return;
		}

		System.out.print("tique");
		tique = true;
		notify();

		try {
			while (tique) {
				wait();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	synchronized void taque(boolean estaExecutando) {

		// É chamado o método notify porque ela dará um wait.
		// Enquanto o tique estiver executando não vai passar pelo if
		if (!estaExecutando) {
			tique = false;
			notify();
			return;
		}

		System.out.println("Taque");
		tique = false;
		notify();

		try {
			while (!tique) {
				wait();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
