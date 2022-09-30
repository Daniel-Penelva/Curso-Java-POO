package poo.listas;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		Disciplina disciplina = new Disciplina();
		disciplina.setMateria("Programação");
		disciplina.setNota(8);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setMateria("Banco de Dados");
		disciplina2.setNota(8);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setMateria("Sistemas Operacionais");
		disciplina3.setNota(8);
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("Daniel");
		aluno.setMatricula("111-1");
		
		//Adicionando na lista
		aluno.getListaDisciplinas().add(disciplina);
		aluno.getListaDisciplinas().add(disciplina2);
		aluno.getListaDisciplinas().add(disciplina3);
		
		for (Disciplina d : aluno.listaDisciplinas) {
			System.out.println("Disciplinas: " + d.getMateria() + " Notas: " + d.getNota());
		}
		
		System.out.println("Media: " + aluno.getMediaNota());
		System.out.println("Situação: " + aluno.getSituação());

	}

}
