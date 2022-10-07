package poo.projetoContaBancaria;

public class ContaEspecial extends ContaBacaria {

	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	// sobrescrevendo o método sacar
	public boolean sacar(double valor) {
		double saldoLimite = this.getSaldo() + limite;
		if ((saldoLimite - valor) >= 0) {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		}
		return false;
	}

	public String toString() {
		String s = "Conta Especial [";
		s += " Limite: " + limite;
		s += "; " + super.toString();
		s += "]";

		return s;
	}
}
