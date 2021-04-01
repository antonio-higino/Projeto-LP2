package br.ufrn.imd.modelo;

public class Cliente extends Pessoa {
	
	private Comanda comanda;
	
	public Cliente() {
		
	}

	public Comanda getComanda() {
		return comanda;
	}

	public void setComanda(Comanda comanda) {
		this.comanda = comanda;
	}
}