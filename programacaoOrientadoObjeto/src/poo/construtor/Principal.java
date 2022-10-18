package poo.construtor;

import poo.construtor.Cidade;
import poo.construtor.Estado;
import poo.construtor.Pessoa;

public class Principal {

	public static void main(String[] args) {

		// Chamando 1º construtor
		Pessoa p = new Pessoa();
		System.out.println(p);
		
		System.out.println("\n");

		// Chamando 2º construtor
		Estado e = new Estado("Rio de Janeiro", "RJ");
		Cidade c = new Cidade("Niteroi", e);
		Pessoa p1 = new Pessoa("Daniel", "11111111111", "1111111-1", c, 34);

		System.out.println("\n");
		
		System.out.println("Nome: " + p1.getNome() + " CPF: " + p1.getCpf() + " RG: " + p1.getRg() + "1111111-1"
				+ " Nome da Cidade: " + p1.getCidade().getNome() + " Estado: " + p1.getCidade().getEstado().getNome()
				+ " UF: " + p1.getCidade().getEstado().getUf() + " Idade: " + p1.getIdade());

		System.out.println("\n");
		
		// Chamando 3º construtor
		Pessoa p2 = new Pessoa(c);
		System.out.println("Nome da Cidade: " + p1.getCidade().getNome() + " Estado: "
				+ p1.getCidade().getEstado().getNome() + " UF: " + p1.getCidade().getEstado().getUf());

		System.out.println("\n");
		
		// Chamando 4º construtor
		Pessoa p3 = new Pessoa("Pedro", "22222222222", "3333333-3");
		System.out.println("Nome: " + p3.getNome() + " CPF: " + p3.getCpf() + " RG: " + p3.getRg() + "1111111-1");
	}

}
