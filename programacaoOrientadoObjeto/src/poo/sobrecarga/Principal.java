package poo.sobrecarga;

public class Principal {

	public static void main(String[] args) {

		// para criar uma instancia
		Aluno aluno = new Aluno();
		AvaliacaoAluno avaliacao = new AvaliacaoAluno();

		aluno.setNome("Rui");
		aluno.setMatricula("101");
		aluno.setN1(8);
		aluno.setN2(4);
		aluno.setN3(2);

		System.out.println("Matrícula: " + aluno.getMatricula());
		System.out.println("Nome.....: " + aluno.getNome());
		System.out.println("Nota1....: " + aluno.getN1());
		System.out.println("Nota2....: " + aluno.getN2());
		
		//Chamando os métodos sobrecarregados
		System.out.println("Média....: " + avaliacao.gerarMedia(aluno.getN1(), aluno.getN2()));
		System.out.println("Média....:" + avaliacao.gerarMedia(aluno.getN1(), aluno.getN2(), aluno.getN3()));
		System.out.println("Situação.: " + avaliacao.VerificarSituaçao(aluno));

		
		// Sobrecarga de construtores
		
		//Exemplo 1
		Aluno aluno1 = new Aluno("Daniel", "111-2a", 5, 5);

		System.out.println("Matrícula: " + aluno1.getMatricula());
		System.out.println("Nome.....: " + aluno1.getNome());
		System.out.println("Nota1....: " + aluno1.getN1());
		System.out.println("Nota2....: " + aluno1.getN2());
		//chamando o método sobrecarregado
		System.out.println("Média....: " + avaliacao.gerarMedia(aluno1.getN1(), aluno1.getN2()));
		System.out.println("Situação.: " + avaliacao.VerificarSituaçao(aluno1));
		
		
		// Exemplo 2
		Aluno aluno2 = new Aluno("Daniel", "111-2a", 9, 3, 6);
		System.out.println("Matrícula: " + aluno1.getMatricula());
		System.out.println("Nome.....: " + aluno1.getNome());
		System.out.println("Nota1....: " + aluno1.getN1());
		System.out.println("Nota2....: " + aluno1.getN2());
		//chamando o método sobrecarregado
		System.out.println("Média....: " + avaliacao.gerarMedia(aluno2.getN1(), aluno2.getN2(), aluno2.getN3()));
		System.out.println("Situação.: " + avaliacao.VerificarSituaçao(aluno1));
	}

}
