package poo.hashCode_Equals_toString;

public class Principal {

	public static void main(String[] args) {

		Estado e = new Estado();
		e.setNome("Sao Paulo");
		e.setUf("SP");

		System.out.println("Imprimindo toString classe Estado: " + e.toString());

		System.out.println("\n");

		Cidade c = new Cidade();
		c.setNome("São Paulo");
		c.setEstado(e);

		System.out.println("Imprimindo toString classe Cidade: " + c.toString());

		System.out.println("\n");

		Pessoa p = new Pessoa();
		p.setNome("Daniel");
		p.setCpf("11111111111");
		p.setRg("1111111-1");
		p.setIdade(34);
		p.setCidade(c);

		String pessoaToString = p.toString();
		System.out.println("Imprimindo toString classe Pessoa: " + pessoaToString);

		String pessoaToString1 = p.toString1();
		System.out.println("Imprimindo toString1 classe Pessoa: " + pessoaToString1);

		
		String cidadeToString1 = c.toString1();
		System.out.println("Imprimindo toString1 classe cidade: " + cidadeToString1);

		// Se fizemos como está o codigo abaixo teríamos que fazer uma conversão
		/*
		 * Então vc pergunta: Mas o Object não tem uma implementação padrao do método
		 * toString()? Sim, mas embora a nossa variavel seja do tipo Object não podemos
		 * achar que ele vai executar o toString padrão da classe Object, como estamos
		 * apontando para o objeto "Pessoa" que fez a sobrescrita do método, então mesmo
		 * a variável sendo do tipo mais genérico, ele vai ser o toString que
		 * corresponde ao objeto ou a instancia do método toString implementada na
		 * classe Pessoa.
		 */

		Object pessoa = new Pessoa();
		((Pessoa) pessoa).setNome("Carla");
		System.out.println("Nome: " + pessoa);

		Pessoa p1 = new Pessoa();
		p1.setNome("Daniel");

		Pessoa p2 = new Pessoa();
		p2.setNome("Carla");

		boolean compara = p1.equals(p2);
		System.out.println("É igual: " + compara);

		// imprimir o hashCode
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

	}

}
