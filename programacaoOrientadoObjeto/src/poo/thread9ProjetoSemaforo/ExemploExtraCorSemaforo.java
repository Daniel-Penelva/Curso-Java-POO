package poo.thread9ProjetoSemaforo;

public enum ExemploExtraCorSemaforo {

	VERDE(1000), AMARELO(500), VERMELHO(2000);

	private int tempoEspera;

	ExemploExtraCorSemaforo(int tempoEspera) {
		this.tempoEspera = tempoEspera;
	}

	public int getTempoEspera() {
		return tempoEspera;
	}
}
