package poo.classes;

public class Pessoa {
	private String nome;
	private String cpf;
	private String rg;
	private Cidade cidade;

	//Construtor padrão 
	public Pessoa() {
		super();
	}
	
	// Método para capturar o valor
	public String getNome() {
		return nome;
	}

	// Método para atribuir o valor
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
}
