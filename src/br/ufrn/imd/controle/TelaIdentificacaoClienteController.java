package br.ufrn.imd.controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TelaIdentificacaoClienteController {
	
	private Stage clienteStage;
	
	@FXML
    private Button botaoEntrar;

    @FXML
    private Button botaoCadastrar;

    @FXML
    void abrirTelaCadastroCliente(ActionEvent event) {

    }

    @FXML
    void checarCliente(ActionEvent event) {

    }

	public void setClienteStage(Stage clienteStage) {
		this.clienteStage = clienteStage;
	}
}