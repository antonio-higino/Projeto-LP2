package br.ufrn.imd.controle;

import java.io.IOException;

import br.ufrn.imd.dao.Banco;
import br.ufrn.imd.modelo.Comanda;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaIdentificacaoClienteController {
	
	private Stage clienteStage;
	
	@FXML
    private Button botaoEntrar;

    @FXML
    private TextField textFieldNomeDoCliente;

    @FXML
    private Button botaoCadastrar;

    @FXML
    private MenuItem menuItemFecharJanela;

    @FXML
    private TextField textFieldNumeroDaComanda;

    @FXML
    void checarExistenciaComanda(ActionEvent event) {
    	Banco banco = Banco.getInstance();
    	
    	String input = textFieldNumeroDaComanda.getText();
    	int id = Integer.parseInt(input);
    	
    	if(banco.getBancoComandas().buscarComanda(id)) {
    		abrirTelaMenuCliente();
    	}
    }

    @FXML
    void fecharJanela(ActionEvent event) {
    	clienteStage.close();
    }

    @FXML
    void gerarNovaComanda(ActionEvent event) {
    	Banco banco = Banco.getInstance();
    	
    	int id = banco.getBancoComandas().getContadorParaId();
    	
    	Comanda comanda = new Comanda();
    	
    	comanda.setId(id);
    	
    	comanda.setNomeDoCliente(textFieldNomeDoCliente.getText());
    	
    	banco.getBancoComandas().cadastrarComanda(comanda);
    	
    	abrirTelaMenuCliente();
    }

	public void setClienteStage(Stage clienteStage) {
		this.clienteStage = clienteStage;
	}
	
	void abrirTelaMenuCliente() {
		
	}
}