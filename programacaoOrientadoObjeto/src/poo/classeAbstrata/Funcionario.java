package poo.classeAbstrata;

//Pessoa fisica é um funcionário
public abstract class Funcionario extends PessoaFisica {

	/*
	 * Vale ressaltar que a Classe Funcionario por ser abstrata não poderemos mais
	 * instanciar um novo objeto.
	 */

	private String cargo;
	private String nome;
	private float salario;

	// Construtor
	public Funcionario() {
		super(); // pertence a PessoaFisica
	}

	// método abstrato
	public abstract float calcularSalario();

	
	// Métodos getters e setters
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

}
