package poo.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class SimpleDateFormatEmJava {

	public static void main(String[] args) throws ParseException {

		Date data = new Date();

		// OBS. Para o BD é bom formatar (dd-MM-yyyy)
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(data));

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(sdf1.format(data));

		// Outra forma é o parse
		System.out.println(sdf.parse("1987/12/17"));
		System.out.println(sdf1.parse("1987/12/17 18:59:00"));

		// Comparação de datas
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

		Date dataVencimento = sdf2.parse("28/10/2022");

		Date dataAtualHoje = sdf2.parse("24/10/2022");

		System.out.println("-------------------------------");

		// after = se a data1 é maior que a data2
		if (dataVencimento.after(dataAtualHoje)) {
			System.out.println("Boleto não vencido!");
		} else {
			System.out.println("Boleto vencido!");
		}

		System.out.println("-------------------------------");

		// after = se a data1 é menor que a data2
		if (dataVencimento.before(dataAtualHoje)) {
			System.out.println("Boleto vencido!");
		} else {
			System.out.println("Boleto não vencido!");
		}

		// Faixa de data - usando ChronoUnit

		// ChronoUnit é um Enumerador (static) - ou seja, não precisa instanciar
		// total de dias de uma data até hoje (LocalDate()).
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2022-10-01"), LocalDate.now());
		System.out.println("Possui " + dias + " dias entra a faixa de data de hoje.");

		long anos = ChronoUnit.YEARS.between(LocalDate.parse("2020-10-01"), LocalDate.now());
		System.out.println("Possui " + anos + " anos entra a faixa de data de hoje.");
	}

}
