package br.ufrn.imd.modelo;

public class Bebida extends Item {
	
	private int quantidadeDeMl;
	private boolean light;
	private boolean diet;
	
	public Bebida() {
		
	}

	public int getQuantidadeDeMl() {
		return quantidadeDeMl;
	}

	public void setQuantidadeDeMl(int quantidadeDeMl) {
		this.quantidadeDeMl = quantidadeDeMl;
	}

	public boolean isLight() {
		return light;
	}

	public void setLight(boolean light) {
		this.light = light;
	}

	public boolean isDiet() {
		return diet;
	}

	public void setDiet(boolean diet) {
		this.diet = diet;
	}
}