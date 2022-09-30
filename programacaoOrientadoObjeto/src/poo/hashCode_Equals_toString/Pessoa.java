package poo.hashCode_Equals_toString;

import java.util.Objects;

public class Pessoa {
	private String nome;
	private String cpf;
	private String rg;
	private Cidade cidade;
	// Adicionado linha
	private int idade;

	// Construtor padrão
	public Pessoa() {
		super();
	}

	public Pessoa(String nome, String cpf, String rg, Cidade cidade, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.cidade = cidade;

		/*
		 * Podemos chamar pelo método setIdade(), para facilitar a atribuição do valor
		 * idade a uma regra de negócio que está dentro do seu método setters.
		 */
		setIdade(idade);
	}

	// Construtor que recebe o tipo cidade
	public Pessoa(Cidade cidade) {
		this.cidade = cidade;
	}

	// Construtor que recebe três parametros
	public Pessoa(String nome, String cpf, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade < 18) {
			this.idade = idade;
			System.out.println("Menor de idade!");
		} else if (idade >= 18 && idade < 60) {
			this.idade = idade;
			System.out.println("Fase Adulta!");
		} else {
			this.idade = idade;
			System.out.println("Aposentado!");
		}
	}

	// Por padrao é feito da maneira abaixo, mas você pode alterar usando o getters
	// Veja o exemplo toString1()
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", cidade=" + cidade + ", idade=" + idade + "]";
	}

	public String toString1() {
		return "Pessoa - nome=" + getNome() + ", cpf=" + getCpf() + ", rg=" + getRg() + ", cidade=" + getCidade()
				+ ", idade=" + getIdade();
	}

	@Override
	public int hashCode() {
		return Objects.hash(cidade, cpf, idade, nome, rg);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(cidade, other.cidade) && Objects.equals(cpf, other.cpf) && idade == other.idade
				&& Objects.equals(nome, other.nome) && Objects.equals(rg, other.rg);
	}

}
