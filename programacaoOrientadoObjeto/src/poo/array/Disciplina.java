package poo.array;

import java.util.Arrays;
import java.util.Objects;

public class Disciplina {

	private String materia;

	// cada disciplina terá quatro notas
	private double[] nota = new double[3];

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}

	public double getMediaNota() {

		double somaNota = 0;
		double mediaNota;

		for (int i = 0; i < nota.length; i++) {
			somaNota += nota[i];
		}

		mediaNota = somaNota / 3;

		return mediaNota;
	}

	@Override
	public String toString() {
		return "Disciplina [materia=" + materia + ", nota=" + Arrays.toString(nota) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(nota);
		result = prime * result + Objects.hash(materia);
		return result;
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
		return Objects.equals(materia, other.materia) && Arrays.equals(nota, other.nota);
	}
}
