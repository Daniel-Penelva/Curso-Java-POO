package poo.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {

	private String nome;
	private String matricula;
	private double mediaNota;
	private String situacao;

	List<Disciplina> listaDisciplinas = new ArrayList<Disciplina>();

	public Aluno() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getMediaNota() {
		double somaNotas = 0;

		// "disciplina" é a variavel onde vai ser armazenados os valores
		for (Disciplina disciplina : listaDisciplinas) {
			somaNotas += disciplina.getMediaNota(); // getNota é da classe Disciplina
		}

		/*
		 * o método size() vai gerar um número total de quantas disciplinas possui na
		 * lista de disciplina (lista dinamica), o intuito é pegar esse valor total e
		 * dividir pelo total de nota para gerar a média.
		 */

		return somaNotas / listaDisciplinas.size();
	}

	public void setMediaNota(double mediaNota) {
		this.mediaNota = mediaNota;
	}

	public String getSituacao() {

		double aprovado = this.getMediaNota();
		if (aprovado >= 7) {
			return SituacaoAluno.APROVADO;
		}
		return SituacaoAluno.REPROVADO;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public List<Disciplina> getListaDisciplinas() {
		return listaDisciplinas;
	}

	public void setListaDisciplinas(List<Disciplina> listaDisciplinas) {
		this.listaDisciplinas = listaDisciplinas;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", mediaNota=" + mediaNota + ", situacao="
				+ situacao + ", listaDisciplinas=" + listaDisciplinas + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(listaDisciplinas, matricula, mediaNota, nome, situacao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(listaDisciplinas, other.listaDisciplinas) && Objects.equals(matricula, other.matricula)
				&& Double.doubleToLongBits(mediaNota) == Double.doubleToLongBits(other.mediaNota)
				&& Objects.equals(nome, other.nome) && Objects.equals(situacao, other.situacao);
	}

}
