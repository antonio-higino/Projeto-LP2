package br.ufrn.imd.controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class TelaIdentificacaoFuncionarioController {
	
	private Stage funcionarioStage;
	
	@FXML
    private MenuItem menuItemFecharJanela;
	
	@FXML
    private Button botaoEntrar;

    @FXML
    private Button botaoCadastrar;

    @FXML
    void abrirTelaCadastroFuncionario(ActionEvent event) {

    }

    @FXML
    void checarFuncionario(ActionEvent event) {

    }
    
    @FXML
    void fecharJanela(ActionEvent event) {

    }

	public void setFuncionarioStage(Stage funcionarioStage) {
		this.funcionarioStage = funcionarioStage;
	}
}