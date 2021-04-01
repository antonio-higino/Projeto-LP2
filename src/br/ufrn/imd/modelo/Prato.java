package br.ufrn.imd.modelo;

public class Prato extends Item {
	
	private int quantidadeDePessoasServida;
	private boolean contemGluten;
	
	public Prato() {
		
	}

	public int getQuantidadeDePessoasServida() {
		return quantidadeDePessoasServida;
	}

	public void setQuantidadeDePessoasServida(int quantidadeDePessoasServida) {
		this.quantidadeDePessoasServida = quantidadeDePessoasServida;
	}

	public boolean isContemGluten() {
		return contemGluten;
	}

	public void setContemGluten(boolean contemGluten) {
		this.contemGluten = contemGluten;
	}
}