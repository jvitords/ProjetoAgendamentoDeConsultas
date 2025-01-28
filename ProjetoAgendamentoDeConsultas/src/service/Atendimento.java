package service;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import entities.Agenda;
import entities.Consulta;
import entities.Status;

public class Atendimento {

	public static Consulta atenderConsulta() {
		
		List<Consulta> lista = FiltrosEOrdenacao.filtrarConsultasQueDevemSerAtendidas();
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter formatoDaData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		int i = 1;
		System.out.println("=== ATENDER CONSULTA ===\n");
		for(Consulta c : lista) {
			System.out.println(i + "- " + c.getPaciente().getNome() + ", " + c.getProcedimento() + " - " + c.getData().format(formatoDaData) + " - " + c.getTipoDoCliente().getTipo());
			i++;
		}
		//lista.forEach(c -> System.out.println(i + "- " + c.getPaciente().getNome() + ", " + c.getProcedimento() + " - " + c.getData().format(formatoDaData) + " - " + c.getTipoDoCliente().getTipo()));
		System.out.print("Qual consulta deseja atender: ");
		int escolha = scanner.nextInt() - 1;
		Consulta consulta = lista.get(escolha);
		consulta.setStatus(Status.CONCLUIDO);
		return consulta;
	}
}
