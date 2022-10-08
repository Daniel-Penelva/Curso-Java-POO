package poo.Interface;

//Um papagaio é uma ave e um animal de estimação
public class Papagaio extends Ave implements AnimalEstimacao {

	// Métodos abstratos
	@Override
	public void voar() {
		System.out.println("Papagaio voa");

	}

	@Override
	public void emitirSom() {
		System.out.println("som de papagaio");

	}

	// método da interface
	@Override
	public void brincar() {
		System.out.println("Papagaio brincando");

	}

	@Override
	public void levarPassear() {
		System.out.println("Papagaio voando");

	}

}
