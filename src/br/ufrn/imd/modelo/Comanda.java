package br.ufrn.imd.modelo;

import java.util.ArrayList;

public class Comanda implements CalculoValorTotal {
	
	private int id;
	private String nomeDoCliente;
	private ArrayList<Pedido> pedidos;
	private double valorTotal = 0;
	
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
	
	public void adicionarPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	public void listarPedidos() {
		System.out.println("Pedidos desta comanda: ");
		for(Pedido pedido : pedidos) {
			System.out.println("************************************");
			System.out.println("Pedido numero: " + pedido.getId());
			pedido.listarItens();
		}
		System.out.println("************************************");
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