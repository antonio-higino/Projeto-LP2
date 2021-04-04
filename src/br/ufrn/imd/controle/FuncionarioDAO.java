package br.ufrn.imd.controle;

import java.util.ArrayList;
import br.ufrn.imd.modelo.Funcionario;

public class FuncionarioDAO {
	
	private ArrayList<Funcionario> funcionarios;
	
	public FuncionarioDAO() {
		funcionarios = new ArrayList<Funcionario>();
	}
	
	public void cadastrarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public void listarFuncionarios() {
		System.out.println("--Funcion�rios--");
		for(Funcionario funcionario : funcionarios) {
			System.out.println("************************************");
			System.out.println("Nome: " + funcionario.getNome() + " - " + funcionario.getFuncao());
			System.out.println("Carga hor�ria: " + funcionario.getCargaHoraria() + " horas - Sal�rio: R$ " + funcionario.getSalario());
		}
		System.out.println("************************************");
	}
}