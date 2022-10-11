package poo.exception;

import java.util.Scanner;

public class ExceptionThrows {

	public static void main(String[] args) {
		// Teremos erros do número fracionado
		System.out.println("Entre com um número decimal (Ex: 4.6)?");
		try {
			double num = leNumero();
			System.out.println("Você digitou o número: " + num);
		} catch (Exception e) {
			System.out.println("Entrada Inválida");
			e.printStackTrace();
		}
	}

	public static double leNumero() throws Exception {
		Scanner ler = new Scanner(System.in);
		double numero = ler.nextDouble();
		return numero;
	}
}
