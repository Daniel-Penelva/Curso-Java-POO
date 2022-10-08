package poo.castingEInstaceOf;

//Analogia: Aluno é uma pessoa.
public class Principal {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		Pessoa pessoaAluno = aluno; // Upcasting (da subclasse para a superclasse)

		// ou pode fazer o exemplo abaixo de casting = conversão
		Pessoa aluno1 = (Pessoa) new Aluno();

		/*
		 * Downcasting (da superclasse para a subclasse) OBS. Essa conversão dá erro,
		 * pois não é possivel fazer uma conversao de pessoa para aluno. Por que? Por
		 * exemplo, a Classe Pessoa tem cinco atributos que as representa, já a Classe
		 * Aluno tem dois atributos que a representa, logo não pode pegar uma pessoa e
		 * transformar num aluno porque faltam as informações dos demais atributos.
		 */

		// Aluno alunoPessoa = (Aluno) new Pessoa();

		Object obj = obterString();
		String s1 = (String) obj;

		Object obj1 = "Minha String"; // upcasting
		String obj2 = (String) obj1; // downcasting

		// Exemplo InstaceOf

		Pessoa pessoa2 = new Pessoa();
		Aluno aluno2 = new Aluno();
		Diretor diretor2 = new Diretor();

		if (pessoa2 instanceof Pessoa) {
			System.out.println("É do tipo Pessoa");
		}
		if (aluno2 instanceof Aluno) {
			System.out.println("É do tipo Pessoa");
		}
		if (diretor2 instanceof Diretor) {
			System.out.println("É do tipo Pessoa");
		}

	}

	public static String obterString() {
		return "Minha string";
	}

}
