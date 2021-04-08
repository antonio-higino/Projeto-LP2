package br.ufrn.imd.modelo;

public class Funcionario extends Pessoa {
	
	private String funcao;
	private int cargaHoraria;
	private double salario;
	
	public Funcionario() {
		
	}
	
	public String getFuncao() {
		return funcao;
	}
	
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void atribuiEspecificacoes() {
		if(getFuncao() == "Garçom") {
			setSalario(400.89);
			setCargaHoraria(8);
		}else if(getFuncao() == "Caixa") {
			setSalario(350);
			setCargaHoraria(12);
		}else if(getFuncao() == "Cozinheiro") {
			setSalario(550);
			setCargaHoraria(12);
		}
	}
}