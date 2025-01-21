package service;

import entities.Consulta;

public class ServicoDePagamentoSemConvenio implements ServicoDePagamento{

	Consulta consulta;
	
	public ServicoDePagamentoSemConvenio(Consulta consulta) {
		this.consulta = consulta;
	}

	public ServicoDePagamentoSemConvenio() {
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	@Override
	public void calcularValorDaConsulta(Double valorDoServico) {
		
		consulta.setValor(valorDoServico - valorDoServico * 0.2);
	}
}
