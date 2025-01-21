package service;

import entities.Consulta;

public class ServicoDePagamentoComConvenio implements ServicoDePagamento{

	Consulta consulta;
	
	public ServicoDePagamentoComConvenio(Consulta consulta) {
		this.consulta = consulta;
	}

	public ServicoDePagamentoComConvenio() {
	}
	
	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	@Override
	public void calcularValorDaConsulta(Double valorDoServico) {
		consulta.setValor(valorDoServico - valorDoServico * 0.6);
	}
}
