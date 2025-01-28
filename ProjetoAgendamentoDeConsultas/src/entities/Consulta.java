package entities;

import java.time.LocalDateTime;

public class Consulta  {
	
	private Paciente paciente;
	private LocalDateTime data;
	private Double valor;
	private String procedimento;
	private Status status;
	private TipoDoCliente tipoDoCliente;
	
	public Consulta(Paciente paciente, LocalDateTime data, Double valor, String procedimento, Status status, TipoDoCliente tipoDoCliente) {
		this.paciente = paciente;
		this.data = data;
		this.valor = valor;
		this.procedimento = procedimento;
		this.status = status;
		this.tipoDoCliente = tipoDoCliente;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(String procedimento) {
		this.procedimento = procedimento;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	
	public TipoDoCliente getTipoDoCliente() {
		return tipoDoCliente;
	}
	

	public void setTipoDoCliente(TipoDoCliente tipoDoCliente) {
		this.tipoDoCliente = tipoDoCliente;
	}

	
	
	
} 
