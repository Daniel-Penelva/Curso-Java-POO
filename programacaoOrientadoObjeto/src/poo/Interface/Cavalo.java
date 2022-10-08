package poo.Interface;

//Um cavalo é um mamífero e um animal domesticado
public class Cavalo extends Mamifero implements AnimalDomesticado{

	@Override
	public void amamentar() {
		System.out.println("potrinho gosta de leite");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Cavalo relincha");
		
	}

	//método da interface
	@Override
	public void levarVeterinario() {
		System.out.println("Cavalo vai ao veterinário");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Cavalo come capim");
		
	}

}
