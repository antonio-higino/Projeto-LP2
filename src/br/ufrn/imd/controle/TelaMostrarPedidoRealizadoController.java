package br.ufrn.imd.controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class TelaMostrarPedidoRealizadoController {
	
	private Stage pedidoStage;
	
	@FXML
    private TextArea textAreaMostrarPedido;

    @FXML
    private Button botaoFechar;

    @FXML
    private MenuItem menuItemFecharJanela;

    @FXML
    void fecharJanela(ActionEvent event) {
    	pedidoStage.close();
    }
    
    public void preencherTextAreaMostrarPedido(String dadosDoPedido) {
    	textAreaMostrarPedido.setText(dadosDoPedido);
    }

	public void setPedidoStage(Stage pedidoStage) {
		this.pedidoStage = pedidoStage;
	}
}