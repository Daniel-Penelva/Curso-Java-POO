package poo.thread9ProjetoSemaforo;

public class ThreadSemaforo implements Runnable {

	private CorSemaforo cor;
	private boolean parar;
	private boolean corMudou; // para sincronizar as execuções das cores - Vermelho/Verde/Amarelo

	public ThreadSemaforo() {
		this.cor = CorSemaforo.VERMELHO;

		this.parar = false; // Bom saber: Esse false é opcional, por padrão inicia-se como false.
		this.corMudou = false;

		// Este this é a instancia da Classe Runnable
		new Thread(this).start();
	}

	@Override
	public void run() {

		while (!parar) {
			try {
				switch (this.cor) {
				case VERMELHO:
					Thread.sleep(2000);
					break;

				case VERDE:
					Thread.sleep(1000);
					break;

				case AMARELO:
					Thread.sleep(500);
					break;

				default:
					break;
				}

				// mudar a cor
				this.mudarCor();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private synchronized void mudarCor() {
		switch (this.cor) {
		case VERMELHO:

			// muda do vermelho para o verde
			this.cor = cor.VERDE;
			break;

		case AMARELO:

			// muda do amarelo para o vermelho
			this.cor = cor.VERMELHO;
			break;

		case VERDE:

			// muda do verde para o amarelo
			this.cor = cor.AMARELO;
			break;

		default:
			break;
		}

		// Sincronizar as mudanças das cores do semaforo
		this.corMudou = true;
		notify();
	}

	// Garantir o modo de espera ao sincronizar a cor na ordem certa.
	public synchronized void esperaCorMudar() {
		while (!this.corMudou) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// Quando a cor mudar volta a ser false
		this.corMudou = false;

	}

	// Para encerrar a execução da Thread
	public synchronized void desligarSemaforo() {
		this.parar = true;
	}

	// Para chamar a cor ao ser instanciada pela Classe.
	// Vai sair do while(!parar)...
	public CorSemaforo getCor() {
		return cor;
	}
}
