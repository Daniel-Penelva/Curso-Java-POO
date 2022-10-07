package poo.objetosNaPratica;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Relação: Uma venda tem um ou vários produtos
public class Produto {

	private Long id;
	private String nome;
	private BigDecimal valor;

	public Produto() {

	}

	public Produto(Long id, String nome, BigDecimal valor) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", valor=" + valor + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, valor);
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
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome) && Objects.equals(valor, other.valor);
	}

}
