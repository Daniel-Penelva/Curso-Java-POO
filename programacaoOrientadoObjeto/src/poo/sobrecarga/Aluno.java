package poo.sobrecarga;

import java.util.Objects;

public class Aluno {

	private String nome;
	private String matricula;
	private int n1;
	private int n2;
	private int n3;

	// Construtores
	public Aluno() {

	}

	public Aluno(String nome, String matricula, int n1, int n2) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.n1 = n1;
		this.n2 = n2;
	}

	public Aluno(String nome, String matricula, int n1, int n2, int n3) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
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

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int getN3() {
		return n3;
	}

	public void setN3(int n3) {
		this.n3 = n3;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula, n1, n2, n3, nome);
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
		return Objects.equals(matricula, other.matricula) && n1 == other.n1 && n2 == other.n2 && n3 == other.n3
				&& Objects.equals(nome, other.nome);
	}

}
