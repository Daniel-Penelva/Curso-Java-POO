package poo.projetoContaBancaria;

public class Principal {

	public static void main(String[] args) {

		/*----------------------------- Conta Bancária ----------------------------- */
		ContaBacaria contaSimples = new ContaBacaria();
		contaSimples.setNome("Conta simples");
		contaSimples.setNumeroConta("12011");

		
		contaSimples.depositar(100);

		// chamando o método static
		realizarSaque(contaSimples, 50);

		realizarSaque(contaSimples, 70);
		
		System.out.println(contaSimples);

		/*----------------------------- Conta Poupança ----------------------------- */
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNome("Conta poupança");
		contaPoupanca.setNumeroConta("13011");
		contaPoupanca.setDiaRendimento(2);

		contaPoupanca.depositar(300);

		/*
		 * Mesmo que em seu método receba um parametro de contaBancaria, a conta
		 * poupança estende a conta bancaria, logo também irá realizar saque.
		 */

		realizarSaque(contaPoupanca, 50);

		realizarSaque(contaPoupanca, 70);
		
		if(contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Novo rendimento aplicado, novo saldo é de: " + contaPoupanca.getSaldo());
		}else {
			System.out.println("Hoje não é dia de rendimento, novo saldo não calculado!");
		}
		
		System.out.println(contaPoupanca);
		
		
		/*----------------------------- Conta Especial ----------------------------- */
		
		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setNome("Conta especial");
		contaEspecial.setNumeroConta("14011");
		contaEspecial.setLimite(50);
		
		contaEspecial.depositar(400);
		realizarSaque(contaEspecial, 200);
		realizarSaque(contaEspecial, 20);
		
		System.out.println(contaEspecial);

	}

	public static void realizarSaque(ContaBacaria conta, double valor) {
		if (conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso - novo saldo = " + conta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para saque de: " + conta.getSaldo());
		}
	}

}
