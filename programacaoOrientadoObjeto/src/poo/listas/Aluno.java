package poo.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {

	private String nome;
	private String matricula;
	private double nota1;
	private double nota2;
	private double nota3;
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

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getMediaNota() {
		double somaNotas = 0;

		// "disciplina" é a variavel onde vai ser armazenados os valores
		for (Disciplina disciplina : listaDisciplinas) {
			somaNotas += disciplina.getNota(); // getNota é da classe Disciplina
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
			return "Aluno Aprovado";
		}
		return "Aluno reprovado";
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
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3="
				+ nota3 + ", mediaNota=" + mediaNota + ", situação=" + situacao + ", listaDisciplinas="
				+ listaDisciplinas + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(listaDisciplinas, matricula, mediaNota, nome, nota1, nota2, nota3, situacao);
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
				&& Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(nota1) == Double.doubleToLongBits(other.nota1)
				&& Double.doubleToLongBits(nota2) == Double.doubleToLongBits(other.nota2)
				&& Double.doubleToLongBits(nota3) == Double.doubleToLongBits(other.nota3) && situacao == other.situacao;
	}

}
