package br.ufrn.imd.controle;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaMenuClienteController {
	
	private Stage menuClienteStage;
	
	@FXML
    private MenuItem menuItemFecharJanela;

    @FXML
    private Button botaoFazerPedido;

    @FXML
    private Button botaoPagar;

    @FXML
    void abrirTelaCardapio(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(TelaCardapioController.class.getResource("/br/ufrn/imd/visao/TelaCardapio.fxml"));
    	AnchorPane page = (AnchorPane) loader.load();
    	
    	Stage cardapioStage = new Stage();
    	cardapioStage.setTitle("Cardápio");
    	cardapioStage.setResizable(false);
    	Scene scene = new Scene(page);
    	cardapioStage.setScene(scene);
    	
    	TelaCardapioController controller = loader.getController();
    	controller.setCardapioStage(cardapioStage);
    	controller.preencherTextAreas();
    	cardapioStage.showAndWait();
    }

    @FXML
    void abrirTelaPagamento(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(TelaPagamentoController.class.getResource("/br/ufrn/imd/visao/TelaPagamento.fxml"));
    	AnchorPane page = (AnchorPane) loader.load();
    	
    	Stage pagamentoStage = new Stage();
    	pagamentoStage.setTitle("Pagamento");
    	pagamentoStage.setResizable(false);
    	Scene scene = new Scene(page);
    	pagamentoStage.setScene(scene);
    	
    	TelaPagamentoController controller = loader.getController();
    	controller.setPagamentoStage(pagamentoStage);
    	pagamentoStage.showAndWait();
    	menuClienteStage.close();
    }

    @FXML
    void fecharJanela(ActionEvent event) {
    	menuClienteStage.close();
    }

	public void setMenuClienteStage(Stage menuClienteStage) {
		this.menuClienteStage = menuClienteStage;
	}
}