package br.ufrn.imd.modelo;

import java.util.ArrayList;

public class Pedido {
	
	private int id;
	private ArrayList<Item> itens;
	private Cliente cliente;
	private double valorTotal = 0;
	
	public Pedido() {
		itens = new ArrayList<Item>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Item> getItens() {
		return itens;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void adicionarItem(Item item) {
		itens.add(item);
	}
	
	public void listarItens() {
		System.out.println("Itens deste pedido: ");
		for(Item item : itens) {
			System.out.println("************************************");
			System.out.println(item.getNome());
		}
		System.out.println("************************************");
	}
	
	public void calcularValorTotal() {
		double soma = getValorTotal();
		for(Item item : itens) {
			soma += item.getPreco();
		}
		setValorTotal(soma);
	}
}