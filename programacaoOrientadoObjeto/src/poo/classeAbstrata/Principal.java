package poo.classeAbstrata;

public class Principal {

	public static void main(String[] args) {
		
		//Exemplo 1
		Funcionario funcionario = new Programador();
		funcionario.setSalario(3000);
		
		System.out.println("Salario calculado: " + funcionario.calcularSalario());
		
		
		//Exemplo 2
		Funcionario funcionario1 = new Analista("Daniel", 4000);

		System.out.println("Salario calculado: " + funcionario1.calcularSalario());
		
		
		//Exemplo 3
		Funcionario funcionario2 = new Diretor();
		funcionario2.setNome("Carla");
		funcionario2.setSalario(9000);
		
		float salarioPorcentagem = funcionario2.calcularSalario();
		
		System.out.println("Nome: " +  funcionario2.getNome() + 
				" Seu Salario: " + funcionario2.getSalario() + 
				" Com acrescimo de salario : " + salarioPorcentagem);
	}

}
