package poo.hashCode_Equals_toString;

import java.util.Objects;

public class Cidade {

	private String nome;
	private Estado estado;
	
	public Cidade(){
		super();
	}
	
	public Cidade(String nome, Estado estado) {
		this.nome = nome;
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	

	@Override
	public String toString() {
		return "Cidade [nome=" + nome + ", estado=" + estado + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(estado, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		return Objects.equals(estado, other.estado) && Objects.equals(nome, other.nome);
	}
	
	
}
