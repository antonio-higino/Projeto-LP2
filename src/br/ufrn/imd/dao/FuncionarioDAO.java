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
	
	public boolean buscarFuncionario(String nome) {
		for(Funcionario employer : funcionarios) {
			if(employer.getNome().equals(nome)) {
				return true;
			}
		}
		return false;
	}
}