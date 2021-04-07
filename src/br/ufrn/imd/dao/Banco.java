package br.ufrn.imd.dao;

public class Banco {
	
	private ComandaDAO bancoComandas;
	private FuncionarioDAO bancoFuncionarios;
	private Cardapio cardapio;
	private FilaDaCozinha filaDaCozinha;
	
	private String senhaDoSistema = "DuplaDinamica";
	
	private static Banco banco;
	
	private Banco() {
		bancoComandas = new ComandaDAO();
		bancoFuncionarios = new FuncionarioDAO();
		cardapio = new Cardapio();
		filaDaCozinha = new FilaDaCozinha();
		
	}

	public static Banco getInstance() {
		if(banco == null) {
			banco = new Banco();
		}
		return banco;
	}

	public ComandaDAO getBancoComandas() {
		return bancoComandas;
	}

	public FuncionarioDAO getBancoFuncionarios() {
		return bancoFuncionarios;
	}

	public Cardapio getCardapio() {
		return cardapio;
	}

	public FilaDaCozinha getFilaDaCozinha() {
		return filaDaCozinha;
	}

	public String getSenhaDoSistema() {
		return senhaDoSistema;
	}
}