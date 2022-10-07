package poo.objetosNaPratica;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Venda {

	private Long id;
	private String descricaoVenda;
	private String nomecliente;
	private String enderecoEntrega;
	private BigDecimal valorTotal;
	private List<Produto> listaProduto = new ArrayList<Produto>();

	public Venda() {

	}

	public Venda(Long id, String descricaoVenda, String nomeCliente, String enderecoEntrega, BigDecimal valorTotal) {
		this.id = id;
		this.descricaoVenda = descricaoVenda;
		this.nomecliente = nomeCliente;
		this.enderecoEntrega = enderecoEntrega;
		this.valorTotal = valorTotal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaoVenda() {
		return descricaoVenda;
	}

	public void setDescricaoVenda(String descricaoVenda) {
		this.descricaoVenda = descricaoVenda;
	}

	public String getNomecliente() {
		return nomecliente;
	}

	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}

	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public BigDecimal getValorTotal() {
		this.valorTotal = BigDecimal.valueOf(totalVenda());
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Produto> getListaProduto() {
		return listaProduto;
	}

	public void setListaProduto(List<Produto> listaProduto) {
		this.listaProduto = listaProduto;
	}
	
	//Exemplo usando método para adicionar na lista de produto
	public void addProduto(Produto produto) {
		/*Poderia fazer validações*/
		this.listaProduto.add(produto);
	}
	
	//Método para o somar o valor total de todos os produtos
	public double totalVenda() {
		double total = 0.0;
		
		for(Produto p: listaProduto) {
			total += p.getValor().doubleValue();
		}
		return total;
	}

	@Override
	public String toString() {
		return "Venda [id=" + id + ", descricaoVenda=" + descricaoVenda + ", nomecliente=" + nomecliente
				+ ", enderecoEntrega=" + enderecoEntrega + ", valorTotal=" + valorTotal + ", listaProduto="
				+ listaProduto + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricaoVenda, enderecoEntrega, id, listaProduto, nomecliente, valorTotal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venda other = (Venda) obj;
		return Objects.equals(descricaoVenda, other.descricaoVenda)
				&& Objects.equals(enderecoEntrega, other.enderecoEntrega) && Objects.equals(id, other.id)
				&& Objects.equals(listaProduto, other.listaProduto) && Objects.equals(nomecliente, other.nomecliente)
				&& Objects.equals(valorTotal, other.valorTotal);
	}

}
