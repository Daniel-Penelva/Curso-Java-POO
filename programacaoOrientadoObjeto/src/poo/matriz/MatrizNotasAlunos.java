package poo.matriz;

public class MatrizNotasAlunos {

	public static void main(String[] args) {

		// Declarar 5 alunos para 4 notas --> aluno (linha) x notas (colunas)
		double[][] notasAlunos = new double[5][4];

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 10;
		notasAlunos[0][2] = 10;
		notasAlunos[0][3] = 10;

		notasAlunos[1][0] = 3.4;
		notasAlunos[1][1] = 5.8;
		notasAlunos[1][2] = 9.8;
		notasAlunos[1][3] = 5.8;

		notasAlunos[2][0] = 3;
		notasAlunos[2][1] = 4;
		notasAlunos[2][2] = 9;
		notasAlunos[2][3] = 6;

		notasAlunos[3][0] = 7.4;
		notasAlunos[3][1] = 8;
		notasAlunos[3][2] = 8;
		notasAlunos[3][3] = 2;

		notasAlunos[4][0] = 10;
		notasAlunos[4][1] = 5;
		notasAlunos[4][2] = 7.8;
		notasAlunos[4][3] = 6.8;

		for (int linha = 0; linha < notasAlunos.length; linha++) {
			System.out.println("========== Aluno " + linha + " ==============");
			for (int coluna = 0; coluna < notasAlunos[linha].length; coluna++) {
				System.out.println(
						"Matriz " + "[" + linha + "]" + " [" + coluna + "]" + " = " + notasAlunos[linha][coluna]);
			}
			System.out.println();
		}

		// Alterando o valor da matriz
		notasAlunos[1][0] = 9.5;
		notasAlunos[4][2] = 4.9;

		for (int linha = 0; linha < notasAlunos.length; linha++) {
			System.out.println("========== Aluno " + linha + " ==============");
			for (int coluna = 0; coluna < notasAlunos[linha].length; coluna++) {
				System.out.println(
						"Matriz " + "[" + linha + "]" + " [" + coluna + "]" + " = " + notasAlunos[linha][coluna]);
			}
			System.out.println();
		}

		// Calculando a soma aritmetica do aluno
		double somaNota;
		double mediaNota;

		for (int linha = 0; linha < notasAlunos.length; linha++) {
			somaNota = 0;
			for (int coluna = 0; coluna < notasAlunos[linha].length; coluna++) {
				somaNota += notasAlunos[linha][coluna];
			}
			mediaNota = somaNota / 4;
			System.out.println("Média Aluno " + linha + " :" + mediaNota);
		}
	}

}
