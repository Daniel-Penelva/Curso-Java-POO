package poo.listas;

import javax.swing.JOptionPane;

public class Principal2 {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();

		String nome = JOptionPane.showInputDialog("Entre com o seu nome? ");
		aluno.setNome(nome);

		String matricula = JOptionPane.showInputDialog("Digite sua matricula? ");
		aluno.setMatricula(matricula);

		for (int pos = 1; pos <= 3; pos++) {

			Disciplina disciplina = new Disciplina();

			String materia = JOptionPane.showInputDialog("Digite a matéria " + pos + " ? ");
			disciplina.setMateria(materia);

			String notaMateria = JOptionPane.showInputDialog("Digite a nota total do aluno" + pos + " ? ");
			disciplina.setNota(Double.valueOf(notaMateria));

			aluno.getListaDisciplinas().add(disciplina);
		}

		for (Disciplina d : aluno.listaDisciplinas) {
			JOptionPane.showMessageDialog(null, "Disciplina :" + d.getMateria() + "\n" + "Nota: " + d.getNota());
		}

		JOptionPane.showMessageDialog(null, "Aluno:" + aluno.getNome() + "\n" + "Matricula" + aluno.getMatricula()
				+ "\n" + "Media: " + aluno.getMediaNota());

		JOptionPane.showMessageDialog(null, "Situação: " + aluno.getSituacao());

		// Exclusao de matéria
		int continua = JOptionPane.showConfirmDialog(null, "Deseja excluir alguma matéria?");
		if (continua == 0) {

			// inicia o while
			int continuarRemover = 0;
			int posicao = 1;
			while (continuarRemover == 0) {
				
				String removerDisciplina = JOptionPane.showInputDialog("Entre com o indice que deseja excluir - 1, 2, ou 3");
				aluno.getListaDisciplinas().remove(Integer.valueOf(removerDisciplina).intValue() - posicao);
				posicao++;
				
				continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja continuar remover disciplina? ");
				
				/**
				 * Chines:
				 * <lista disciplina>
				 * 0  (posição 1)
				 * 1  (posição 2)
				 * 2  (posição 3)
				 * 
				 * remove = 1
				 * posicao++ = 1
				 * 1 - 1 = 0
				 * 
				 * <lista disciplina>
				 * 0  (posição 1)
				 * 1  (posição 2)
				 * 
				 * remove = 2
				 * posicao++ = 2
				 * 2 - 2 = 0
				 * 
				 * <lista disciplina>
				 * 0  (posição 1)
				 * 
				 * sair da lista
				 * 
				 * */
			}
		}

		// imprime a lista das disciplinas que não foram excluidas
		for (Disciplina d : aluno.listaDisciplinas) {
			JOptionPane.showMessageDialog(null, "Disciplina :" + d.getMateria() + "\n" + "Nota: " + d.getNota());
		}

	}

}

