package poo.classes;

import poo.classes.Cidade;
import poo.classes.Pessoa;
import poo.classes.Estado;

public class Principal {

	public static void main(String[] args) {

		// Instância de Estado
		Estado estado = new Estado();
		estado.setNome("Rio de Janeiro");
		estado.setUf("RJ");

		// Instância de Cidade
		// OBS. Associando a propriedade nome estado a classe Cidade
		Cidade cidade = new Cidade();
		cidade.setNome("Rio de Janeiro");
		cidade.setEstado(estado); // Relacionamento do objeto Cidade com o objeto Estado

		// Instância do Cliente
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Daniel");
		pessoa.setRg("1111111-1");
		pessoa.setCpf("11111111111");
		pessoa.setCidade(cidade); // Relacionamento do objeto Cliente com o objeto Cidade

		// imprimindo a instância cliente cli
		System.out.println("Nome: " + pessoa.getNome() + " CPF: " + pessoa.getCpf() + " RG: " + pessoa.getRg()
				+ " Nome da Cidade: " + pessoa.getCidade().getNome() + " Estado: "
				+ pessoa.getCidade().getEstado().getNome() + " UF: " + pessoa.getCidade().getEstado().getUf());
	}

}
