package poo.classes;

public class Estado {

	private String nome;
	private String uf;

	// Método para capturar o valor
	public Estado() {
		super();
	}
	
	// Método para atribuir o valor
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
