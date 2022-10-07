package poo.heranca;

public class Principal {

	public static void main(String[] args) {
		
		//Aluno
		Aluno aluno = new Aluno();
		aluno.setNome("Daniel");
		aluno.setIdade(23);
		aluno.setDataNascimento("17/12/1989");
		aluno.setCpf("11111111111");
		aluno.setRegistroGeral("registro x");
		aluno.setDataMatricula("18/02/2022");
		aluno.setNomeEscola("CEFET-RJ");
		aluno.setDisciplinas("Progamação JAVA");
		aluno.setSerieMatriculada("2º período");
		
		System.out.println("Saída da Classe generica (superclasse) Pessoa");
		System.out.println("Nome: " + aluno.getNome() + " Idade: " + aluno.getIdade() + 
				" Data Nascimento: " + aluno.getDataNascimento() + " CPF" + aluno.getCpf() + 
				" Registro Geral: " + aluno.getRegistroGeral());
		
		System.out.println("\n");
		
		
		System.out.println("Saída da Classe específica (subclasse) Aluno");
		System.out.println("Nome escola: " + aluno.getNomeEscola() + " Serie : " + aluno.getSerieMatriculada() + 
				" Data Matricula: " + aluno.getDataMatricula() + " Disciplina: " + aluno.getDisciplinas());

	}

}
