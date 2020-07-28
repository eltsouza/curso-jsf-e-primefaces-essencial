package com.algaworks.id;

public class Main {

	public static void main(String[] args) {
        Pedidos pedidos = new Pedidos();
        
		RelatorioService relatorioService = new RelatorioService(); //fazendo a injecao da dependencia usando o contrutor com parametro
		//relatorioService.setPedidos(pedidos); //outra maneira de fazer inejcao de dependencia o metodo set sem o construtor com parametro
		
        
	    
    }
    
}
