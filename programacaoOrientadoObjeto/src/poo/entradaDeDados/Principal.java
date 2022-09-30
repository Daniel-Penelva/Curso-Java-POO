package poo.entradaDeDados;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		Pessoa p1 = new Pessoa();
		String nome = JOptionPane.showInputDialog("Digite seu nome ?");
		p1.setNome(nome);
		
		String idade = JOptionPane.showInputDialog("Digite sua idade ?");
		// Foi feito uma coversão para integer, já que JOption retorna somente uma String
		p1.setIdade(Integer.valueOf(idade)); 
		
		String dataNascimento = JOptionPane.showInputDialog("Digite sua data de Nascimento ?");
		p1.setDataNascimento(dataNascimento);
		
		String altura = JOptionPane.showInputDialog("Digite sua altura ?");
		p1.setAltura(Double.valueOf(altura));
		
		JOptionPane.showMessageDialog(null, nome);
		JOptionPane.showMessageDialog(null, idade);
		JOptionPane.showMessageDialog(null, dataNascimento);
		JOptionPane.showMessageDialog(null, altura);
		
		//Exemplo 2 com Scanner
		Scanner ler = new Scanner(System.in);
		
		Pessoa p2 = new Pessoa();
		
		System.out.println("Digite seu nome ?");
		String nome1 = ler.next();
		p2.setNome(nome1);
		
		
		System.out.println("Digite sua idade ?");
		int idade1 = ler.nextInt();
		p2.setIdade(idade1);
		
		System.out.println("Digite sua data de nascimento ?");
		String dataNascimento1 = ler.next();
		p2.setDataNascimento(dataNascimento1);
		
		System.out.println("Digite sua altura ?");
		double altura2 = ler.nextDouble();
		p2.setAltura(altura2);
		
		System.out.println("Nome: " + nome1);
		System.out.println("Nome: " + p2.getIdade());
		System.out.println("Nome: " + p2.getDataNascimento());
		System.out.println("Nome: " + p2.getAltura());
	}

}
