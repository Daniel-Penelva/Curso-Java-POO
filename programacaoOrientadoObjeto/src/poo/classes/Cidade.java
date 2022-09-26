package poo.classes;

public class Cidade {

	 
	public Cidade(){
		super();
	}
	
	private String nome;
	private Estado estado;

	// Método para capturar o valor
	public String getNome() {
		return nome;
	}

	// Método para atribuir o valor
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}
