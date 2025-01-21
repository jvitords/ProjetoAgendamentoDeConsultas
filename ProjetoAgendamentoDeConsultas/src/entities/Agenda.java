package entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.List;

import service.ServicoDePagamento;
import service.ServicoDePagamentoComConvenio;
import service.ServicoDePagamentoSemConvenio;

public class Agenda {
	
	static List<Consulta> listaDeConsultas;
	
	public Agenda(List<Consulta> listaDeConsultas) {
		this.listaDeConsultas = listaDeConsultas;
	}

	public List<Consulta> getListaDeConsultas() {
		return listaDeConsultas;
	}

	public void setListaDeConsultas(List<Consulta> listaDeConsultas) {
		this.listaDeConsultas = listaDeConsultas;
	}

	public void mostrarTodasAsConsultas() { // método para ler todas as consultas registradas no meu arquivo txt
		
		System.out.println("----- CONSULTAS AGENDADAS -----\n");
		// abrir o arquivo e ler as informações
		try(BufferedReader leitorDoArquivo = new BufferedReader(new FileReader("C:\\Users\\JoãoVitorDuarteSanto\\Documents\\Estudos\\ProjetoAgendamento\\ProjetoAgendamentoDeConsultas\\Agendamentos.txt"))){
			
			String lerLinha = leitorDoArquivo.readLine();
			while (lerLinha != null) {
				// instanciar um "Paciente" e "Consulta" para mostrar as informações que estão na agenda 
				String [] separadorDasInformacoes = lerLinha.split(",");
				Paciente paciente = new Paciente(separadorDasInformacoes[0], Integer.parseInt(separadorDasInformacoes[1]));
				// encontrar um jeito de pegar a data e horário do arquivo txt(que estão formatadas) para conseguir instanciar ela e criar a "Consulta"
				
				
				// modelo de como posso mostrar as informações no console depois
				for(Consulta consulta : listaDeConsultas) {
					System.out.println( consulta.getPaciente().getNome() + " - " + consulta.getProcedimento() + " - " + consulta.getData() + " - R$" + consulta.getValor());
				}
			}
		}
		catch (Exception e) {
			// depois preciso criar excessões personalizadas
		}
		
	}
	
	public void adicionarNovaConsulta() {
		Consulta consulta = new Consulta(new Paciente("João Vitor", 400381518), LocalDateTime.now(), 100.0, "Manutenção", Status.AGENDADO, TipoDoCliente.SEM_CONVENIO);
		TipoDoCliente tipo = consulta.getTipoDoCliente();
		listaDeConsultas.add(consulta);
		
		switch (tipo){
		case COM_CONVENIO: 
			ServicoDePagamento servicoDePagamento = new ServicoDePagamentoComConvenio(consulta);
			servicoDePagamento.calcularValorDaConsulta(consulta.getValor());
			break;
		case SEM_CONVENIO:
			ServicoDePagamento servicoDePagamento2 = new ServicoDePagamentoSemConvenio(consulta);
			servicoDePagamento2.calcularValorDaConsulta(consulta.getValor());
			break;
		default:
			System.out.println("FIM");
		}
	}
}
