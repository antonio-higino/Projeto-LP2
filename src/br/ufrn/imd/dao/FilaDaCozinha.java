package br.ufrn.imd.dao;

import java.util.ArrayList;
import br.ufrn.imd.modelo.Pedido;

public class FilaDaCozinha {
	
	private ArrayList<Pedido> fila;
	private int contadorParaId = 0;
	
	public FilaDaCozinha() {
		fila = new ArrayList<Pedido>();
	}
	
	public void adicionarPedidoNaFila(Pedido pedido) {
		fila.add(pedido);
	}
	
	public int getContadorParaId() {
		contadorParaId++;
		return contadorParaId;
	}
	
	public String listarPedidos() {
		String output = "";
		output += "--Historico da Cozinha--";
		output += "\n";
		for (Pedido pedido : fila) {
			output += pedido.listarItens();
		}
		output += "\n";
		return output;
	}
}