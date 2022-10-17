package poo.thread9ProjetoSemaforo1;

/*
 * Crie um semaforo usando Threads. O semáforo deve ficar verde por x segundos, depois brevemente
 * amarelo por y segundos e seguido de z segundos na cor vermelha. */

public class SimuladorSemaforo {

	public static void main(String[] args) {
		
		ThreadSemaforo semaforo = new ThreadSemaforo();
		
		for(int i= 0; i < 10; i++) {
			System.out.println(semaforo.getCor());
			
			semaforo.esperaCorMudar();
		}
		
		semaforo.desligarSemaforo();
	}

}
