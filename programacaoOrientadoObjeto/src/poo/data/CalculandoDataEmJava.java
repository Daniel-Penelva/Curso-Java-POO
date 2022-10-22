package poo.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CalculandoDataEmJava {

	public static void main(String[] args) {

		try {
			diferencaData();
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println(" -------------------------------------- ");

		diferencaData1();

		System.out.println(" -------------------------------------- ");

		diferencaDataComTempo();

		System.out.println(" -------------------------------------- ");

		diferencaDataComChronoUnit();

	}

	public static void diferencaData() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date data1 = sdf.parse("01/01/2021");
		Date data2 = sdf.parse("01/02/2021");

		long diferencaMilSeg = Math.abs(data1.getTime() - data2.getTime());
		System.out.println(diferencaMilSeg);

		long diff = TimeUnit.DAYS.convert(diferencaMilSeg, TimeUnit.MILLISECONDS);
		// ou
		int dias = (int) (diferencaMilSeg / (1000 * 60 * 60 * 24));

		System.out.println(diff);
		System.out.println(dias);
	}

	public static void diferencaData1() {
		LocalDate ld1 = LocalDate.of(2022, 01, 01);
		LocalDate ld2 = LocalDate.of(2022, 02, 01);

		// calcular o periodo entre as datas
		Period periodo = Period.between(ld1, ld2);
		int dia = periodo.getDays();
		int mes = periodo.getMonths();
		int ano = periodo.getYears();

		System.out.println(dia);
		System.out.println(mes);
		System.out.println(ano);
	}

	public static void diferencaDataComTempo() {
		LocalDateTime data1 = LocalDateTime.of(2022, 1, 1, 6, 30);
		LocalDateTime data2 = LocalDateTime.of(2022, 1, 1, 8, 30);

		Duration duracao = Duration.between(data1, data2);
		long diff = duracao.toHours();
		System.out.println(diff);
	}

	public static void diferencaDataComChronoUnit() {
		LocalDateTime data1 = LocalDateTime.of(2022, 1, 1, 6, 30);
		LocalDateTime data2 = LocalDateTime.of(2022, 1, 1, 8, 30);

		long diff = ChronoUnit.HOURS.between(data1, data2);
		long diffDias = ChronoUnit.DAYS.between(data1, data2);
		System.out.println(diff);
		System.out.println(diffDias);
	}
}
