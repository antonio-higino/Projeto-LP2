package br.ufrn.imd.modelo;

public class Prato extends Item {
	
	private int quantidadeDePessoasServida;
	private String ingredientes;
	private boolean contemGluten;
	
	public Prato() {
		
	}

	public int getQuantidadeDePessoasServida() {
		return quantidadeDePessoasServida;
	}

	public void setQuantidadeDePessoasServida(int quantidadeDePessoasServida) {
		this.quantidadeDePessoasServida = quantidadeDePessoasServida;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public boolean isContemGluten() {
		return contemGluten;
	}

	public void setContemGluten(boolean contemGluten) {
		this.contemGluten = contemGluten;
	}
	
	public String booleanToString() {
		String output = "";
		
		if(isContemGluten()) {
			output += " CONT�M GL�TEN";
		}else {
			output += " N�O CONT�M GL�TEN";
		}
		
		return output;
	}
}