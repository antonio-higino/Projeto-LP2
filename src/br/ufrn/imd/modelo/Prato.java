package br.ufrn.imd.modelo;

public class Prato extends Item {
	
	private int quantidadeDePessoasServida;
	private String descricao;
	private boolean contemGluten;
	
	public Prato() {
		
	}

	public int getQuantidadeDePessoasServida() {
		return quantidadeDePessoasServida;
	}

	public void setQuantidadeDePessoasServida(int quantidadeDePessoasServida) {
		this.quantidadeDePessoasServida = quantidadeDePessoasServida;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
			output += "CONTÉM GLÚTEN";
		}else {
			output += "NÃO CONTÉM GLÚTEN";
		}
		
		return output;
	}
}