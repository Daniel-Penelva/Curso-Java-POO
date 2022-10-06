package poo.sobrecarga;

import java.util.Objects;

public class Produto {

	private String nome;
	private String fabrica;
	private int qtd;
	private Double preco;

	public Produto() {

	}

	public Produto(String nome, String fabrica, int qtd, Double preco) {
		this.nome = nome;
		this.fabrica = fabrica;
		this.qtd = qtd;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFabrica() {
		return fabrica;
	}

	public void setFabrica(String fabrica) {
		this.fabrica = fabrica;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", fabrica=" + fabrica + ", qtd=" + qtd + ", preco=" + preco + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(fabrica, nome, preco, qtd);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(fabrica, other.fabrica) && Objects.equals(nome, other.nome)
				&& Objects.equals(preco, other.preco) && qtd == other.qtd;
	}

}
