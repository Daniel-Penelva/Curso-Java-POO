package poo.Interface;

//Um cachorro é um mamífero e um animal de estimação
public class Cachorro extends Mamifero implements AnimalDomesticado{

	private int tamanho;
	private String raca;

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	// Métodos abstratos
	@Override
	public void amamentar() {
		System.out.println("cachorrinho gosta de leite");

	}

	@Override
	public void emitirSom() {
		System.out.println("cachorro latindo");

	}

	//Métodos da interface
	@Override
	public void levarVeterinario() {
		System.out.println("cachorro vai ao veterinario");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Cachorro comendo ração");
		
	}

}
