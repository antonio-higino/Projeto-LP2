package br.ufrn.imd.controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class TelaCadastroClienteController {
	private Stage cadastroStage;
	
	@FXML
    private MenuItem menuItemFecharJanela;

	@FXML
    private Button botaoCadastrarCliente;

    @FXML
    void abrirTelaComandaCliente(ActionEvent event) {

    }
    
    @FXML
    void fecharJanela(ActionEvent event) {

    }
    
    public void setCadastroClientStage(Stage cadastroStage) {
    	this.cadastroStage = cadastroStage;
    }
}