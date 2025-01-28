package entities;

public enum TipoDoCliente {
	COM_CONVENIO("Convênio"), SEM_CONVENIO("Particular");
	
	private String tipo;

	private TipoDoCliente(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
