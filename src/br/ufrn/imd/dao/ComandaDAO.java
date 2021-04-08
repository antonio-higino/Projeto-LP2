package br.ufrn.imd.dao;

import java.util.ArrayList;
import br.ufrn.imd.modelo.Comanda;

public class ComandaDAO {
	
	private ArrayList<Comanda> comandas;
	private int contadorParaId = 0;
	
	public ComandaDAO() {
		comandas = new ArrayList<Comanda>();
	}
	
	public void cadastrarComanda(Comanda comanda) {
		comandas.add(comanda);
		System.out.println("Comanda cadastrada com sucesso");
	}
	
	public int getContadorParaId() {
		contadorParaId++;
		return contadorParaId;
	}
	
	public Comanda getComandaEspecifica(int id) {
		for(Comanda comanda : comandas) {
			if(comanda.getId() == id) {
				return comanda;
			}
		}
		return null;
	}
	
	public boolean buscarComanda(int id) {
		for(Comanda comanda : comandas) {
			if(comanda.getId() == id) {
				//System.out.println("Comanda encontrada");
				return true;
			}
		}
		//System.out.println("Comanda não encontrada");
		return false;
	}
}