package poo.classeAbstrata;

public class Programador extends Funcionario {

	public Programador() {
		super(); // pertence ao Funcionario
	}
	
	// Construtor para atribuir valores aos atributos de funcionario
	public Programador(String nome, float salario) {
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

		return getSalario() + (getSalario() * 5/100);
	}
}
