package poo.Interface;

public class Principal {
	
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		cachorro.amamentar();
		cachorro.emitirSom();
		cachorro.levarVeterinario();
		cachorro.alimentar();
		
		System.out.println("\n");
		
		Cavalo cavalo = new Cavalo();
		cavalo.amamentar();
		cavalo.emitirSom();
		cavalo.levarVeterinario();
		cavalo.alimentar();
		
		//Exibindo atributo final 
		System.out.println(AnimalDomesticado.caracteristica);
	}
}
