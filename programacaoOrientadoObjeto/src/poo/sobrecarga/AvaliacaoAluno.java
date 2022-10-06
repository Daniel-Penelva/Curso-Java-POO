package poo.sobrecarga;

public class AvaliacaoAluno {

	public int gerarMedia(int n1, int n2) {
		return (n1 + n2) / 2;
	}

	// Sobrecarregar - vai ter o mesmo nome do método, porém com o tipo diferente ou entradas diferentes

	// Método sobrecarregado de tipo diferente
	public Double gerarMedia(double n1, double n2) {
		return (n1 + n2) / 2;
	}

	// Método sobrecarregado com entrada diferentes
	public int gerarMedia(int n1, int n2, int n3) {
		return (n1 + n2 + n3) / 3;
	}

	public String VerificarSituaçao(Aluno aluno) {

		String msg = null;

		AvaliacaoAluno situacao = new AvaliacaoAluno();

		double media = situacao.gerarMedia(aluno.getN1(), aluno.getN2());

		if (media >= 7) {
			msg = aluno.getNome() + ", aprovado";
		} else {
			if (media < 7 && media >= 5) {
				msg = aluno.getNome() + ", Recuperação.";
			} else {
				msg = aluno.getNome() + ", Reprovado.";
			}
		}
		return msg;
	}

}
