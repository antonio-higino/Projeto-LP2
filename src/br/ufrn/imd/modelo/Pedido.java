package br.ufrn.imd.modelo;

import java.util.ArrayList;

import br.ufrn.imd.dao.Cardapio;

public class Pedido implements CalculoValorTotal {
	
	private int id;
	private ArrayList<Item> itens;
	private String nomeDoCliente;
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

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}

	public double getValorTotal() {
		calcularValorTotal();
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void adicionarItem(int id) {
		Cardapio cardapio = new Cardapio();
		itens.add(cardapio.getItemEspecifico(id));
	}
	
	public void listarItens() {
		System.out.println("Itens deste pedido: ");
		for(Item item : itens) {
			System.out.println("************************************");
			System.out.println(item.getNome());
		}
		System.out.println("************************************");
	}
	
	@Override
	public void calcularValorTotal() {
		double soma = 0;
		for(Item item : itens) {
			soma += item.getPreco();
		}
		setValorTotal(soma);
	}
}