package br.ufrn.imd.controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class TelaSucessoPagamentoController {
	
	private Stage sucessoPagamentoStage;
	
	@FXML
    private MenuItem menuItemFecharJanela;

    @FXML
    private Button botaoOK;

    @FXML
    void fecharJanela(ActionEvent event) {
    	sucessoPagamentoStage.close();
    }

	public void setSucessoPagamentoStage(Stage sucessoPagamentoStage) {
		this.sucessoPagamentoStage = sucessoPagamentoStage;
	}
}