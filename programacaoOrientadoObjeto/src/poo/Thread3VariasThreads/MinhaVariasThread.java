package poo.Thread3VariasThreads;

// Objetivo: Usando método isAlive e join

public class MinhaVariasThread implements Runnable {

	private String nome;
	private int tempo;

	public MinhaVariasThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		
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
