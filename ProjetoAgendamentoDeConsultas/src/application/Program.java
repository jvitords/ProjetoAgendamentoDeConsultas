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
import service.Atendimento;
import service.FiltrosEOrdenacao;
import service.ServicoDePagamento;
import service.ServicoDePagamentoComConvenio;
import service.ServicoDePagamentoSemConvenio;

public class Program {

	public static void main(String[] args) {
		
		//Scanner digitar = new Scanner(System.in);
		//List<Consulta> listDeConsultas = new ArrayList<Consulta>();
		
		System.out.println("======== AGENDAMENTO DE CONSULTAS ========\n");
		DateTimeFormatter formatoDaData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		//Agenda.registrarNovaConsulta();
		
		/*Agenda.mostrarTodasAsConsultas().forEach(consulta -> System.out.println(consulta.getPaciente().getNome() + " - " + consulta.getProcedimento() + " - " + consulta.getData().format(formatoDaData ) + 
		" - " + consulta.getTipoDoCliente().getTipo() + " - R$" + consulta.getValor()));*/
		
		//FiltrosEOrdenacao.ordenarPeloNomeDoPaciente().forEach(c -> System.out.println(c.getPaciente().getNome() + ", " + c.getProcedimento() + " - " + c.getData().format(formatoDaData) + " - " + c.getTipoDoCliente().getTipo()  + " - "  + c.getStatus().getStatusDaConsulta()));
		
		//System.out.println(FiltrosEOrdenacao.somaTotalDoValorDasConsultasConcluidas());
		
		//Consulta consultaEscolhida = FiltrosEOrdenacao.ordenarPeloNomeDoPaciente().get(0);
		//System.out.println(consultaEscolhida.getPaciente().getNome()); 
		
		//FiltrosEOrdenacao.filtrarConsultasConcluidas().forEach(c -> System.out.println(c.getPaciente().getNome()));
		
		//Consulta consulta = FiltrosEOrdenacao.filtrarPeloCPF(400381518);
		//System.out.println(consulta.getPaciente().getNome() + ", " + consulta.getPaciente().getCpf());
		
		// mudei apenas aqui no eclipse, falta mudar o status no arquivo txt
		//Consulta consulta = Atendimento.atenderConsulta();
		//System.out.println(consulta.getPaciente().getNome() + ", " + consulta.getPaciente().getCpf() + " - Novo status: " + consulta.getStatus().getStatusDaConsulta());
		
		Atendimento.atenderConsulta();
		//Atendimento.cancelarConsulta();
		FiltrosEOrdenacao.filtrarConsultasCanceladas().forEach(consulta -> System.out.println(consulta.getPaciente().getNome() + " - " + consulta.getProcedimento() + " - " + consulta.getData().format(formatoDaData ) + 
		" - " + consulta.getTipoDoCliente().getTipo() + " - R$" + consulta.getValor() + " - " + consulta.getStatus()));
		//System.out.println(FiltrosEOrdenacao.somaTotalDoValorDasConsultasConcluidas());
		//Agenda.registrarNovaConsulta();
	}
}