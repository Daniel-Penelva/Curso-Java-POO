package poo.projetoContaBancaria;

import java.util.Calendar;

public class ContaPoupanca extends ContaBacaria {

	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	
	public boolean calcularNovoSaldo(double taxaRendimento) {
		Calendar hoje = Calendar.getInstance();
		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			this.setSaldo(this.getSaldo() + this.getSaldo() * taxaRendimento);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String s = "Conta Poupança [";
		s += " Dia Rendimento: " + diaRendimento;
		s += "; " + super.toString();
		s += "]";

		return s;
	}
}
