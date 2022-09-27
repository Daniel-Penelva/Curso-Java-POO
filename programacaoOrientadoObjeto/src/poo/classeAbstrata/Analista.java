package poo.classeAbstrata;

public class Analista extends Funcionario {

	// Construtor
	public Analista() {
		super(); // pertence ao funcionario
	}

	// Construtor para atribuir valores aos atributos de funcionario
	public Analista(String nome, float salario) {
		setNome(nome);
		setSalario(salario);
	}

	/*
	 * O método abaixo, corresponde ao método abstract. Como a classe Programador
	 * extend a classe Funcionario, ela irá herdar, obrigatoriamente, o método
	 * abstract.
	 */
	@Override
	public float calcularSalario() {

		return getSalario() + (getSalario() * 10 / 100);
	}

}
