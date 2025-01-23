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
		
		//Scanner digitar = new Scanner(System.in);
		//List<Consulta> listDeConsultas = new ArrayList<Consulta>();
		
		System.out.println("======== AGENDAMENTO DE CONSULTAS ========\n");
		Agenda.mostrarTodasAsConsultas();
		//Agenda agenda = new Agenda(listDeConsultas);
		//agenda.registrarNovaConsulta();
		//agenda.mostrarTodasAsConsultas(listDeConsultas); // pensar em como deixar isso static, pq não é necessário inicializar para ver as consultas
		// criar um método para agendar novas consultas e registrar no arquivo txt
		
	}
}