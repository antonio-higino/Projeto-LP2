package br.ufrn.imd.dao;

import java.util.ArrayList;
import br.ufrn.imd.modelo.Cliente;

public class ClienteDAO {

	private ArrayList<Cliente> clientes;
	
	public ClienteDAO() {
		clientes = new ArrayList<Cliente>();
	}
	
	public void cadastrarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void listarClientes() {
		System.out.println("--Clientes--");
		for(Cliente cliente : clientes) {
			System.out.println("************************************");
			System.out.println("Nome: " + cliente.getNome() + " - Valor da comanda: R$ " + cliente.getComanda().getValorTotal());
		}
		System.out.println("************************************");
	}
	
	public boolean buscarCliente(String nome) {
		
		
		
		return false;
	}
	
}