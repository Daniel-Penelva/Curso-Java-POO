package poo.arrayEMatrizes;

public class Principal3 {

	public static void main(String[] args) {

		// Aluno 1 criado
		Aluno aluno = new Aluno();
		aluno.setNome("Daniel");

		// Dentro de aluno tem disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setMateria("JAVA");

		double notasJava[] = { 8.9, 9.0, 6.5, 7.2 };
		disciplina.setNota(notasJava);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setMateria("Banco de dados");

		double notasBD[] = { 4.5, 3.2, 6.5, 4.2 };
		disciplina2.setNota(notasBD);

		// Aluno 2 criado
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Carla");

		// Dentro de aluno tem disciplina
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setMateria("JAVA");

		double notasJava1[] = { 4.9, 7.0, 9.5, 4.2 };
		disciplina3.setNota(notasJava1);

		Disciplina disciplina4 = new Disciplina();
		disciplina4.setMateria("Banco de dados");

		double notasBD1[] = { 9.5, 10.00, 5.0, 8.2 };
		disciplina4.setNota(notasBD1);

		// Adicionando na lista de disciplina
		aluno.getListaDisciplinas().add(disciplina);
		aluno.getListaDisciplinas().add(disciplina2);
		aluno1.getListaDisciplinas().add(disciplina3);
		aluno1.getListaDisciplinas().add(disciplina4);

		// Manipulando array de objetos
		Aluno[] arrayAlunos = new Aluno[2];
		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno1;

		for (int pos = 0; pos < arrayAlunos.length; pos++) {
			System.out.println("Nome do aluno: " + arrayAlunos[pos].getNome());

			for (Disciplina d : arrayAlunos[pos].getListaDisciplinas()) {
				System.out.println("Disciplina: " + d.getMateria());

				for (int i = 0; i < d.getNota().length; i++) {
					System.out.println("Resultado prova " + (i + 1) + "= " + d.getNota()[i]);
				}
			}

		}

	}

}
