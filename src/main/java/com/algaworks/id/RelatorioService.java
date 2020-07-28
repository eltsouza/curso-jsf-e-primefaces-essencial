package com.algaworks.id;

import java.math.BigDecimal;

import javax.inject.Inject;

//classe para exemplificar injecao de dependencias (ID)

public class RelatorioService {
	
	@Inject
	private Pedidos pedidos; // dependencia de RelatorioServices
	
	public RelatorioService(Pedidos pedidos) { // construtor para receber como parametro
		this.pedidos = pedidos;
	}
	public RelatorioService() { // construtor para receber como parametro
	}

	public BigDecimal totalPedidosMesAtual() {
		return pedidos.totalPedidosMesAtual();
	}
	
	public void setPedidos(Pedidos pedidos) {
		this.pedidos = pedidos;
	}

}
