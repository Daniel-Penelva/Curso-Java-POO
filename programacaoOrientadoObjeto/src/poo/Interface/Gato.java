package poo.Interface;

//Um gato é um mamífero e um animal de estimação
public class Gato extends Mamifero implements AnimalEstimacao{

	private String raca;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	// Métodos abstratos
	@Override
	public void amamentar() {
		System.out.println("Gatinho gosta de leite");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Gato mia");
		
	}

	//métodos da interface
	@Override
	public void brincar() {
		System.out.println("gato brinca com lã");
		
	}

	@Override
	public void levarPassear() {
		System.out.println("Gato gosta de passear");
		
	}

}
