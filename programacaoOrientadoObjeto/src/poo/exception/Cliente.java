package poo.exception;

public class Cliente {

	private String nome;
	private String cpf;
	private String cnpj;
	private Long CNPJ;

	public Long getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(Long cNPJ) {
		CNPJ = cNPJ;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
