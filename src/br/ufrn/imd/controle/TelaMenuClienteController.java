package br.ufrn.imd.controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class TelaMenuClienteController {
	
	private Stage menuClienteStage;
	
	@FXML
    private MenuItem menuItemSair;

    @FXML
    private Button botaoFazerPedido;

    @FXML
    private Button botaoPagar;

    @FXML
    void abrirTelaCardapio(ActionEvent event) {

    }

    @FXML
    void abrirTelaPagamento(ActionEvent event) {

    }

    @FXML
    void fecharJanela(ActionEvent event) {
    	menuClienteStage.close();
    }

	public void setMenuClienteStage(Stage menuClienteStage) {
		this.menuClienteStage = menuClienteStage;
	}
}