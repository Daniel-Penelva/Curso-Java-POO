package poo.data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) {

		// data dd MM yyyy
		LocalDate agora = LocalDate.now();
		System.out.println("Data: " + agora);

		// Soma 17 dias, logo vai para o dia 07 e tb muda o mês que passa a ser 11
		System.out.println("Soma 17 dias: " + agora.plusDays(17));

		// Soma 5 meses, vai para o mês 3
		System.out.println("Soma 5 meses: " + agora.plusMonths(5));

		// minus(mes, unidade temporal) - Para subtrair um mês da data de hoje
		System.out.println("Vai diminuir um mês da data atual: " + agora.minus(1, ChronoUnit.MONTHS));

		// Mostra o dia da semana de hoje, do mês e do ano
		System.out.println("Dia da semana de hoje: " + agora.getDayOfWeek());
		System.out.println("Mostra o mês de hoje: " + agora.getDayOfMonth());
		System.out.println("Mostra o ano de hoje: " + agora.getDayOfYear());

		// Verifica se é um ano bisiestos - retorna um boolean
		System.out.println("É ano bisiesto: " + agora.isLeapYear());
		System.out.println("É ano bisiesto: " + LocalDate.parse("2020-02-01").isLeapYear());

		// Mostra o horario de agora
		LocalTime horarioAgora = LocalTime.now();
		System.out.println("Horário de agora: " + horarioAgora);

		// Adicionando minutos e horas
		System.out.println("Somando 10 minutos: " + horarioAgora.plusMinutes(10));
		System.out.println("Somando 2 hora: " + horarioAgora.plusHours(2));
		
		// Diminui os minutos
		System.out.println("Diminuindo 20 minutos: " + horarioAgora.minusMinutes(20));
		//ou
		System.out.println("Diminuindo 20 minutos: " + horarioAgora.minus(20, ChronoUnit.MINUTES));
		System.out.println("Diminuindo 4 Horas: " + horarioAgora.minus(4, ChronoUnit.HOURS));

		// Passando a hora e os minutos
		System.out.println(LocalTime.of(20, 30));
		System.out.println(LocalTime.parse("20:30"));

		// of (ano, mes, dia)
		System.out.println(LocalDate.of(2022, 10, 3));
		System.out.println(LocalDate.parse("2022-12-10"));
		
		//Data completa = data + hora
		LocalDateTime dataHoraAgora = LocalDateTime.now();
		System.out.println("Data Completa: " + dataHoraAgora);
		
		//Pode passar a data e a hora - tem vários construtores
		System.out.println(LocalDateTime.of(1987, 12, 17, 20, 50));
		
		//convertendo - está em formato iso
		System.out.println(LocalDateTime.parse("2022-10-18T09:35"));

	}

}
