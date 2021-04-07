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

public class TelaPrincipalController {
	
	@FXML
    private MenuItem menuItemSair;

    @FXML
    private Button botaoCliente;

    @FXML
    private Button botaoFuncionario;

    @FXML
    void abrirTelaIdentificacaoCliente(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(TelaIdentificacaoClienteController.class.getResource("/br/ufrn/imd/visao/TelaIdentificacaoCliente.fxml"));
    	AnchorPane page = (AnchorPane) loader.load();
    	
    	Stage clienteStage = new Stage();
    	clienteStage.setTitle("Identifica��o dos clientes");
    	clienteStage.setResizable(false);
    	Scene scene = new Scene(page);
    	clienteStage.setScene(scene);
    	
    	TelaIdentificacaoClienteController controller = loader.getController();
    	controller.setClienteStage(clienteStage);
    	clienteStage.showAndWait();
    }

    @FXML
    void abrirTelaIdentificacaoFuncionario(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(TelaIdentificacaoFuncionarioController.class.getResource("/br/ufrn/imd/visao/TelaIdentificacaoFuncionario.fxml"));
    	AnchorPane page = (AnchorPane) loader.load();
    	
    	Stage funcionarioStage = new Stage();
    	funcionarioStage.setTitle("Identifica��o dos funcion�rios");
    	funcionarioStage.setResizable(false);
    	Scene scene = new Scene(page);
    	funcionarioStage.setScene(scene);
    	
    	TelaIdentificacaoFuncionarioController controller = loader.getController();
    	controller.setFuncionarioStage(funcionarioStage);
    	funcionarioStage.showAndWait();
    }

    @FXML
    void fecharAplicacao(ActionEvent event) {

    }
}