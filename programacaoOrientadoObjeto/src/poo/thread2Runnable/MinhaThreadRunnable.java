package poo.thread2Runnable;

public class MinhaThreadRunnable implements Runnable {

	private String nome;
	private int tempo;

	public MinhaThreadRunnable(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		
		//Instancia a propria Classe Thread - esse This  é a instancia da Classe Runnable 
		Thread t = new Thread(this);
		t.start();
		
		//Ou pode fazer assim
		//Este this é a instancia da Classe Runnable
		// new Thread(this).start();
	}

	// Método gerado automaticamente
	@Override
	public void run() {
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(nome + " contador " + i);
				Thread.sleep(tempo);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(nome + " terminou a execução!");
	}
}
