package poo.thread7ModoSuspender;

public class MinhaThread implements Runnable {

	private String nome;
	private boolean estaSuspensa; // para o método suspend e resume
	private boolean foiTerminada; // para o método stop

	public MinhaThread(String nome) {
		this.nome = nome;
		this.estaSuspensa = false;

		new Thread(this, nome).start();
	}

	@Override
	public void run() {

		System.out.println("Executando " + this.nome);

		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("Thread " + nome + ", " + i);
				Thread.sleep(300);

				synchronized (this) {
					while (estaSuspensa) {
						wait();
					}
					if (this.foiTerminada) {
						break;
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread terminada " + this.nome);
	}

	void suspend() {
		this.estaSuspensa = true;
	}

	// é chamado o método notify porque ela dará um wait.
	synchronized void resume() {
		this.estaSuspensa = false;
		notify();
	}

	// É chamado o método notify porque ela dará um wait.
	// Vai terminar a execução da Thread - ou seja, vai sair do for entrar no if e terminar a thread.
	synchronized void stop() {
		this.foiTerminada = true;
		notify();
	}

}
