package poo.array;

public class Principal2 {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Daniel");

		// Dentro de aluno tem disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setMateria("JAVA");

		double notasJava[] = { 8.9, 9.0, 6.5, 7.2 };
		disciplina.setNota(notasJava);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setMateria("Banco de dados");

		double notasBD[] = { 4.5, 3.2, 6.5, 4.2 };
		disciplina2.setNota(notasBD);

		aluno.getListaDisciplinas().add(disciplina);
		aluno.getListaDisciplinas().add(disciplina2);

		System.out.println("Nome do Aluno: " + aluno.getNome());

		for (Disciplina d : aluno.getListaDisciplinas()) {
			System.out.println("------------- Disciplinas do aluno -------------");
			System.out.println(d.getMateria());

			System.out.println("------------- Notas do aluno -------------");

			// Maior nota
			double maiorNota = 0.0;
			double menorNota = 10.01;
			for (int i = 0; i < d.getNota().length; i++) {
				System.out.println("Resultado prova " + (i + 1) + "= " + d.getNota()[i]);
				
				//Maior Nota
				if(i == 0) {
					maiorNota = d.getNota()[i];
				}else {
					//vai comparar sempre com a MAIOR nota
					if(d.getNota()[i] > maiorNota) {
						maiorNota = d.getNota()[i];
					}
				}
				
				/* Para saber a menor nota basta apenas inverter o valor da lógica do maior para o menor.
				  
				    if(i == 0) {
					    maiorNota = d.getNota()[i];
				    }else {
					    //vai comparar sempre com a MENOR nota
					    if(d.getNota()[i] < maiorNota) {
						   maiorNota = d.getNota()[i];
					    }
				     }
				     
				     Ou pode fazer o exemplo abaixo
				 */
				
				//Menor Nota
				if(i == 0) {
					menorNota = d.getNota()[i];
				}else {
					if(d.getNota()[i] < menorNota) {
						menorNota = d.getNota()[i];
					}
				}

			}
			System.out.println("Média da nota: " + d.getMediaNota());
			System.out.println("A maior nota da disciplina " + d.getMateria() + " é " + maiorNota);
			System.out.println("A menor nota da disciplina " + d.getMateria() + " é " + menorNota);
		}

	}

}
