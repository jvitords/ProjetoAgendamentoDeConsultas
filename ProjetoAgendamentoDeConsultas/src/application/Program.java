package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Agenda;
import entities.Consulta;
import entities.Paciente;
import entities.Status;
import entities.TipoDoCliente;
import service.ServicoDePagamento;
import service.ServicoDePagamentoComConvenio;
import service.ServicoDePagamentoSemConvenio;

public class Program {

	public static void main(String[] args) {
		
		Scanner digitar = new Scanner(System.in);
		List<Consulta> listDeConsultas = new ArrayList<Consulta>();
		
		System.out.println("======== AGENDAMENTO DE CONSULTAS ========\n");
		
		Agenda agenda = new Agenda(listDeConsultas);
		agenda.adicionarNovaConsulta(listDeConsultas);
		
		//agenda.mostrarTodasAsConsultas(listDeConsultas);
		
		for(Consulta consulta : listDeConsultas) {
			System.out.println( consulta.getPaciente().getNome() + " - " + consulta.getProcedimento() + " - " + consulta.getData() + " - R$" + consulta.getValor());
		}
		System.out.println("))))");
	}
}