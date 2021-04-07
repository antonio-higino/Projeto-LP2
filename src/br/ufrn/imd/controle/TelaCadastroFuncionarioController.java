package br.ufrn.imd.controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class TelaCadastroFuncionarioController {
	
	private Stage cadastroStage;
	
	@FXML
    private MenuItem menuItemFecharJanela;

	@FXML
    private Button botaoCadastrarFuncionario;

    @FXML
    void abrirTelaMenuFuncionario(ActionEvent event) {

    }
    
    @FXML
    void fecharJanela(ActionEvent event) {
    	cadastroStage.close();
    }
    
    public void setCadastroFuncionarioStage(Stage cadastroStage) {
    	this.cadastroStage = cadastroStage;
    }
}