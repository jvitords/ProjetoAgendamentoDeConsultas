package entities;

public enum Status {
	
	AGENDADO("Agendado"), CANCELADO("Cancelado"), CONCLUIDO("Concluido");
	
	private String status;
	
	private Status(String status) {
		this.status = status;
	}

	public String getStatusDaConsulta() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
