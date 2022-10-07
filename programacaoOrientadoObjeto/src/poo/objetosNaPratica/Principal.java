package poo.objetosNaPratica;

import java.math.BigDecimal;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		Venda venda = new Venda();

		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Bola de Futebol");
		produto1.setValor(BigDecimal.valueOf(250.99));

		Produto produto2 = new Produto();
		produto2.setId(2L);
		produto2.setNome("Bola de Basquete");
		produto2.setValor(BigDecimal.valueOf(130.00));

		Produto produto3 = new Produto();
		produto3.setId(3L);
		produto3.setNome("Bola de Volei");
		produto3.setValor(BigDecimal.valueOf(100.00));

		// adicionando na lista de produto
		venda.getListaProduto().add(produto1);
		venda.getListaProduto().add(produto2); // Não é possivel fazer validações
		venda.addProduto(produto3); // É possível fazer validações

		// Imprimindo a lista de produto
		for (Produto p : venda.getListaProduto()) {
			System.out.println("Produtos: " + p.getNome());
		}

		// Ex1: Valor total da vendo dos produtos - chamando pelo método totalVenda()
		System.out.println("Total da venda: " + venda.totalVenda());

		// Ex2: Valor total da vendo dos produtos - chamando pelo método getValorTotal()
		System.out.println("Total da venda: " + venda.getValorTotal());

	}

}
