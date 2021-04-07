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

public class TelaIdentificacaoFuncionarioController {
	
	private Stage funcionarioStage;
	
	@FXML
    private MenuItem menuItemFecharJanela;
	
	@FXML
    private Button botaoEntrar;

    @FXML
    private Button botaoCadastrar;

    @FXML
    void abrirTelaCadastroFuncionario(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(TelaCadastroFuncionarioController.class.getResource("/br/ufrn/imd/visao/TelaCadastroFuncionario.fxml"));
    	AnchorPane page = (AnchorPane) loader.load();
    	
    	Stage cadastroFuncionarioStage = new Stage();
    	cadastroFuncionarioStage.setTitle("Cadastro do Funcionário");
    	cadastroFuncionarioStage.setResizable(false);
    	Scene scene = new Scene(page);
    	cadastroFuncionarioStage.setScene(scene);
    	
    	TelaCadastroFuncionarioController controller = loader.getController();
    	controller.setCadastroFuncionarioStage(cadastroFuncionarioStage);
    	cadastroFuncionarioStage.showAndWait();
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