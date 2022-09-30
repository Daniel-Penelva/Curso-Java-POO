package poo.listas;

import java.util.Objects;

public class Disciplina {

	private String materia;
	private double nota;

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Disciplina [materia=" + materia + ", nota=" + nota + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(materia, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(materia, other.materia)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}

}
