package br.ufrn.imd.dao;

import java.util.ArrayList;
import br.ufrn.imd.modelo.Funcionario;

public class FuncionarioDAO {
	
	private ArrayList<Funcionario> funcionarios;
	private int contadorParaId = 0;
	
	public FuncionarioDAO() {
		funcionarios = new ArrayList<Funcionario>();
	}

	public void cadastrarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public int getContadorParaId() {
		contadorParaId++;
		return contadorParaId;
	}
	
	public String listarFuncionarios() {
		String output = "";
		
		output += "--Funcionários--" + "\n";
		
		for(Funcionario funcionario : funcionarios) {
			output += "\n";
			output += "Nome: " + funcionario.getNome() + " - " + funcionario.getFuncao() + "\n";
			output += "Carga horária: " + funcionario.getCargaHoraria() + " horas - Salário: R$ " + funcionario.getSalario() + "\n";
		}
		output += "\n";
		
		return output;
	}
	
	public boolean buscarFuncionario(String nome) {
		
		
		
		return false;
	}
}