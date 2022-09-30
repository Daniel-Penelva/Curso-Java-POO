package poo.hashCode_Equals_toString;

import java.util.Objects;

public class Estado {

	private String nome;
	private String uf;

	public Estado() {

	}

	public Estado(String nome, String uf) {
		this.nome = nome;
		this.uf = uf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	
	
	@Override
	public String toString() {
		return "Estado [nome=" + nome + ", uf=" + uf + "]";
	}
	
	public String toString1() {
		return "nome=" + getNome() + ", uf=" + getUf();
	}


	@Override
	public int hashCode() {
		return Objects.hash(nome, uf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(uf, other.uf);
	}

}
