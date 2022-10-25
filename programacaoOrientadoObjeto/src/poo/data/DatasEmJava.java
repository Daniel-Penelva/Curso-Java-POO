package poo.data;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) {

		// data (yyyy - MM - dd)
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
		System.out.println("Mostra o mês de hoje: " + agora.getMonth());
		System.out.println("Mostra o ano de hoje: " + agora.getDayOfYear());
		System.out.println("Mostra o ano de hoje: " + agora.getYear());

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
		
		LocalDate dataAntiga = LocalDate.of(2020, 11, 25);
		LocalDate dataNova = LocalDate.of(2022, 10, 5);
		
		// retorna um bollean os métodos isAfter, isBefore, equals
		System.out.println("Data antiga é maior que a data nova: " + dataAntiga.isAfter(dataNova));
		System.out.println("Data antiga é anterior a nova: " + dataAntiga.isAfter(dataNova));
		System.out.println("Datas são iguais: " + dataAntiga.equals(dataNova));
		
		Period periodo = Period.between(dataAntiga, dataNova);
		System.out.println("Periodo de quantos dias entre a data antiga e a nova: " + periodo.getDays());
		System.out.println("Periodo de quantos meses entre a data antiga e a nova: " + periodo.getMonths());
		System.out.println("Periodo de quantos anos entre a data antiga e a nova: " + periodo.getYears());
			
		//Data completa = data + hora
		LocalDateTime dataHoraAgora = LocalDateTime.now();
		System.out.println("Data Completa: " + dataHoraAgora);
		
		//Pode passar a data e a hora - tem vários construtores
		System.out.println(LocalDateTime.of(1987, 12, 17, 20, 50));
		
		//convertendo - está em formato iso
		System.out.println(LocalDateTime.parse("2022-10-18T09:35"));
		
		// formatação de data
		LocalDateTime dataEHoraAtual = LocalDateTime.now();
		System.out.println("Data e Hora atual: " + dataEHoraAtual.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println("Data e Hora atual: " + dataEHoraAtual.format(DateTimeFormatter.ISO_DATE));
		System.out.println("Data e Hora atual: " + dataEHoraAtual.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println("Data e Hora atual: " + dataEHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
		
		// Classe Instant
		Instant inicio = Instant.now();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println("Duração em nano segundos: " + duracao.toNanos());
		System.out.println("Duração em segundos segundos: " + duracao.toSeconds());
		System.out.println("Duração em minutos segundos: " + duracao.toMinutes());

	}

}
