package br.ufrn.imd.modelo;

import java.util.ArrayList;

public class Comanda implements CalculoValorTotal {
	
	private int id;
	private ArrayList<Pedido> pedidos;
	private String nomeDoCliente;
	private double valorTotal = 0;
	private boolean foiPaga = false;
	
	public Comanda() {
		pedidos = new ArrayList<Pedido>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}

	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	public double getValorTotal() {
		calcularValorTotal();
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public boolean isFoiPaga() {
		return foiPaga;
	}

	public void setFoiPaga(boolean foiPaga) {
		this.foiPaga = foiPaga;
	}
	
	public void adicionarPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	public String listarPedidos() {
		String output = "";
		
		output += "Comanda número " + getId() + ":" + "\n";
		output += "Pedidos desta comanda: " + "\n";
		
		for(Pedido pedido : pedidos) {
			output += pedido.listarItens();
		}

		output += "Valor Total da comanda: " + getValorTotal() + "\n";
		
		return output;
	}
	
	@Override
	public void calcularValorTotal() {
		double soma = 0;
		for(Pedido pedido : pedidos) {
			soma += pedido.getValorTotal();
		}
		setValorTotal(soma);
	}
}