package poo.array;

public class Principal {

	public static void main(String[] args) {

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

		aluno.getListaDisciplinas().add(disciplina);
		aluno.getListaDisciplinas().add(disciplina2);

		System.out.println("Nome do Aluno: " + aluno.getNome());

		// lista da disciplina
		for (Disciplina d : aluno.getListaDisciplinas()) {
			System.out.println("------------- Disciplinas do aluno -------------");
			System.out.println(d.getMateria());

			System.out.println("------------- Notas do aluno -------------");
			
			// array das notas
			for (int i = 0; i < d.getNota().length; i++) {
				System.out.println("Resultado prova " + (i + 1) + "= " + d.getNota()[i]);

			}
			System.out.println("Média da nota: " + d.getMediaNota());
		}

	}

}
