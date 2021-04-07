package br.ufrn.imd.dao;

import java.util.ArrayList;
import br.ufrn.imd.modelo.Comanda;

public class ComandaDAO {
	
	private ArrayList<Comanda> comandas;
	
	public ComandaDAO() {
		comandas = new ArrayList<Comanda>();
	}
	
	public void cadastrarComanda(Comanda comanda) {
		comandas.add(comanda);
	}
	
	public boolean buscarComanda(int id) {
		
		
		
		return false;
	}

}