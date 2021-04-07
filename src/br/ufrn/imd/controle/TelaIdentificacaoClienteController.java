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

public class TelaIdentificacaoClienteController {
	
	private Stage clienteStage;
	
	@FXML
    private MenuItem menuItemFecharJanela;
	
	@FXML
    private Button botaoEntrar;

    @FXML
    private Button botaoCadastrar;

    @FXML
    void abrirTelaCadastroCliente(ActionEvent event) throws IOException{
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(TelaCadastroClienteController.class.getResource("/br/ufrn/imd/visao/TelaCadastroCliente.fxml"));
    	AnchorPane page = (AnchorPane) loader.load();
    	
    	Stage cadastroClienteStage = new Stage();
    	cadastroClienteStage.setTitle("Cadastro do Cliente");
    	cadastroClienteStage.setResizable(false);
    	Scene scene = new Scene(page);
    	cadastroClienteStage.setScene(scene);
    	
    	TelaCadastroClienteController controller = loader.getController();
    	controller.setCadastroClientStage(cadastroClienteStage);
    	cadastroClienteStage.showAndWait();
    }

    @FXML
    void checarCliente(ActionEvent event) {

    }
    
    @FXML
    void fecharJanela(ActionEvent event) {
    	clienteStage.close();
    }

	public void setClienteStage(Stage clienteStage) {
		this.clienteStage = clienteStage;
	}
}