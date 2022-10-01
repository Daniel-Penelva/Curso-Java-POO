package poo.listas;

import javax.swing.JOptionPane;

public class Principal3 {

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
			while (continuarRemover == 0) {

				// imprime para conferir se ha disciplina na lista e se foi excluida
				for (Disciplina d : aluno.listaDisciplinas) {
					JOptionPane.showMessageDialog(null, "Indice: " + aluno.getListaDisciplinas().indexOf(d)
							+ " --> Disciplina : " + d.getMateria());
				}

				String removerDisciplina = JOptionPane
						.showInputDialog("Entre com o indice da disciplina que queira excluir: ");
				aluno.getListaDisciplinas().remove(Integer.valueOf(removerDisciplina).intValue());

				// Para conferir se a lista está vazia
				if (aluno.listaDisciplinas.size() != 0) {
					// Pergunta se deseja continuar a excluir a disciplina
					continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja continuar remover disciplina? ");
				} else {
					continuarRemover = 1;
					JOptionPane.showMessageDialog(null, "A lista de disciplina está vazia!");
				}
			}
		}

		// imprime a lista das disciplinas que não foram excluidas
		for (Disciplina d : aluno.listaDisciplinas) {
			JOptionPane.showMessageDialog(null, "Disciplina :" + d.getMateria() + "\n" + "Nota: " + d.getNota());
		}

	}

}
