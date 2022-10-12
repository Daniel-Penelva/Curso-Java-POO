package poo.arrayEMatrizes;

public class Principal {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Daniel");
		
		//Dentro de aluno tem disciplina 
		Disciplina disciplina = new Disciplina();
		disciplina.setMateria("JAVA");
		
		double notasJava[] = {8.9, 9.0, 6.5, 7.2};
		disciplina.setNota(notasJava);
		
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setMateria("Banco de dados");
		
		double notasBD[] = {4.5, 3.2, 6.5, 4.2};
		disciplina.setNota(notasBD);
		
		aluno.getListaDisciplinas().add(disciplina);
		aluno.getListaDisciplinas().add(disciplina2);
	}

}
