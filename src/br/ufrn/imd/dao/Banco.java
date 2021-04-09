package br.ufrn.imd.dao;

public class Banco {
	
	private ComandaDAO bancoComandas;
	private FuncionarioDAO bancoFuncionarios;
	private Cardapio cardapio;
	private FilaDaCozinha filaDaCozinha;
	
	private double saldoDoCaixa = 0;
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

	public double getSaldoDoCaixa() {
		return saldoDoCaixa;
	}
	
	public void setSaldoDoCaixa(double saldoDoCaixa) {
		this.saldoDoCaixa = saldoDoCaixa;
	}

	public void adicionarSaldo(double pagamento) {
		setSaldoDoCaixa(getSaldoDoCaixa() + pagamento);
	}

	public String getSenhaDoSistema() {
		return senhaDoSistema;
	}
}