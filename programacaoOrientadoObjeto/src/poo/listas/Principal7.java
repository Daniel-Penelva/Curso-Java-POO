package poo.listas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal7 {

	public static void main(String[] args) {

		// Vou fazer uma lista de alunos

		// Lista de alunos
		List<Aluno> listaAlunos = new ArrayList<Aluno>();

		// Hash Map
		/*
		 * Uma lista que dentro dela tem uma chave que identifica uma sequência de
		 * valores
		 */
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

		for (int qtd = 0; qtd <= 1; qtd++) {

			Aluno aluno = new Aluno();

			String nome = JOptionPane.showInputDialog("Entre com o " + qtd + "º aluno: ");
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

					// Vai filtrar caso o usuario entre com um indice que não existe.
					try {
						aluno.getListaDisciplinas().remove(Integer.valueOf(removerDisciplina).intValue());
					} catch (IndexOutOfBoundsException e) {
						JOptionPane.showMessageDialog(null,
								"O índice informado não existe! Favor entre com o índice correto!");
					}

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

			listaAlunos.add(aluno);
		} // fim do for

		// Encontrar aluno
		String encontrarAluno = JOptionPane.showInputDialog("Entre com o aluno que deseja encontrar?");
		for (Aluno aluno1 : listaAlunos) {

			if (encontrarAluno.equals(aluno1.getNome())) {
				JOptionPane.showMessageDialog(null, "Aluno encontrado - Nome: " + aluno1.getNome() + " Media: "
						+ aluno1.getMediaNota() + " Situação: " + aluno1.getSituacao());
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Aluno não encontrado!");
				break;
			}
		}

		// Remover aluno
		String removerAluno = JOptionPane.showInputDialog("Entre com o aluno que deseja remover? ");
		for (Aluno aluno1 : listaAlunos) {
			if (removerAluno.equals(aluno1.getNome())) {
				JOptionPane.showMessageDialog(null, "Aluno removido!");
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Aluno não encontrado!");
				break;
			}
		}

		// Para saber a posição da lista
		for (int pos = 0; pos < listaAlunos.size(); pos++) {

			Aluno aluno = listaAlunos.get(pos);
			JOptionPane.showMessageDialog(null, "Posição: " + pos + " - Aluno: " + aluno.getNome());
		}

		// Para substituir um aluno por outro na lista
		// OBS. A disciplina também será substituida, pq faz associação com o aluno.
		// Para fazer substituição de objeto é preciso instanciar um novo objeto.

		String substituirAluno = JOptionPane.showInputDialog("Entre com o aluno que deseja substituir? ");
		for (int pos = 0; pos < listaAlunos.size(); pos++) {

			Aluno posicao = listaAlunos.get(pos);

			// compara o aluno de entrada com o aluno na lista
			if (substituirAluno.equals(posicao.getNome())) {

				String subtituirAluno = JOptionPane.showInputDialog("Aluno encontrado - Entre com o novo aluno?");
				Aluno trocar = new Aluno();
				trocar.setNome(subtituirAluno);

				for (int x = 1; x <= 3; x++) {

					Disciplina disciplina = new Disciplina();

					String materia = JOptionPane.showInputDialog("Digite a matéria " + x + " ? ");
					disciplina.setMateria(materia);

					String notaMateria = JOptionPane.showInputDialog("Digite a nota total do aluno" + x + " ? ");
					disciplina.setNota(Double.valueOf(notaMateria));

					trocar.getListaDisciplinas().add(disciplina);
				}

				// trocar o aluno
				listaAlunos.set(pos, trocar);
				posicao = listaAlunos.get(pos);
				break;

			} else {
				JOptionPane.showMessageDialog(null, "Aluno não encontrado para substituir!");
				break;
			}
		} // fim do for

		// Para saber se a lista foi substituida
		for (Aluno aluno : listaAlunos) {
			JOptionPane.showMessageDialog(null, "Alunos: " + aluno.getNome());
		}

		// Hash map da situação do aluno - inicializa - seta os valores e cria a lista
		// de aluno
		maps.put(SituacaoAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(SituacaoAluno.REPROVADO, new ArrayList<Aluno>());

		// Lista de aprovados - vai ser adicionado a lista todos os alunos aprovados, o
		// mesmo para os reprovados
		for (Aluno aluno : listaAlunos) {

			if (aluno.getSituacao().equals(SituacaoAluno.APROVADO)) {
				maps.get(SituacaoAluno.APROVADO).add(aluno);
			} else {
				maps.get(SituacaoAluno.REPROVADO).add(aluno);
			}
		} // fim for

		// Lista dos aprovados
		for (Aluno aluno : maps.get(SituacaoAluno.APROVADO)) {
			JOptionPane.showMessageDialog(null, "Nome alunos aprovados: " + aluno.getNome());
		}

		// Lista dos reprovados
		for (Aluno aluno : maps.get(SituacaoAluno.REPROVADO)) {
			JOptionPane.showMessageDialog(null, "Nome alunos Reprovados: " + aluno.getNome());
		}

	}
}
