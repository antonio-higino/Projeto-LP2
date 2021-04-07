package br.ufrn.imd.dao;

import java.util.Queue;
import java.util.LinkedList;
import br.ufrn.imd.modelo.Pedido;

public class FilaDaCozinha {
	
	private Queue<Pedido> fila;
	private int contadorParaId = 0;
	
	public FilaDaCozinha() {
		fila = new LinkedList<Pedido>();
	}
	
	public int getContadorParaId() {
		contadorParaId++;
		return contadorParaId;
	}
}