package poo.polimorfismo;

public class Secretario extends Pessoa {

	private String registro;
	private String nivelDeCargo;

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getNivelDeCargo() {
		return nivelDeCargo;
	}

	public void setNivelDeCargo(String nivelDeCargo) {
		this.nivelDeCargo = nivelDeCargo;
	}

	// Testar o polimorfismo - sobrescrevendo método
	public String obterRegistroGeral() {
		String s = "Método sobrescrito -";
		s += " Registro Geral do Secretario ";
		s += super.getRegistroGeral();

		return s;
	}

}
