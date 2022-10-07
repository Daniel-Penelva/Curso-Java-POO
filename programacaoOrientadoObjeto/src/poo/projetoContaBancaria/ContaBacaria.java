package poo.projetoContaBancaria;

public class ContaBacaria {

	private String nome;
	private String numeroConta;
	private double saldo;

	// método depositar
	public void depositar(double valor) {
		saldo += valor;
	}

	// método sacar
	public boolean sacar(double valor) {
		if (saldo - valor >= 0) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		String s = "Conta Bancária [";
		s += " Nome: " + nome;
		s += " Conta bancária: " + numeroConta;
		s += " Saldo: " + saldo;
		s += "]";

		return s;
	}

}
