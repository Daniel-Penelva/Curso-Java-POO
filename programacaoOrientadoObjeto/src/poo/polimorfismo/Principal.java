package poo.polimorfismo;

public class Principal {

	public static void main(String[] args) {

		Pessoa aluno = new Aluno();
		aluno.setNome("Daniel");
		aluno.setRegistroGeral("11112222");

		Pessoa diretor = new Diretor();
		diretor.setNome("Carla");
		diretor.setRegistroGeral("2888393");

		Pessoa secretario = new Secretario();
		secretario.setNome("Jão");
		secretario.setRegistroGeral("999920");

		// chamando método static no main
		chamandoNome(aluno);
		chamandoNome(diretor);
		chamandoNome(secretario);

		// chamando método do obterRegistroGeral na classe Pessoa
		System.out.println("Registro Geral aluno - " + aluno.obterRegistroGeral());
		System.out.println("Registro Geral diretor - " + diretor.obterRegistroGeral());

		// chamando o método sobrescrito da classe Pessoa
		System.out.println(secretario.obterRegistroGeral());

	}

	// testar polimorfismo
	public static void chamandoNome(Pessoa pessoa) {
		System.out.println("Nome: " + pessoa.getNome());
	}

}
