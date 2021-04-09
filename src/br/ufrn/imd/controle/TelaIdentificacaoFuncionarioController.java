package br.ufrn.imd.controle;

import java.io.IOException;

import br.ufrn.imd.dao.Banco;
import br.ufrn.imd.modelo.Comanda;
import br.ufrn.imd.modelo.Funcionario;
import br.ufrn.imd.modelo.Pedido;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaIdentificacaoFuncionarioController {
	
	private Stage funcionarioStage;
	
	@FXML
    private MenuItem menuItemFecharJanela;
	
	@FXML
    private Button botaoChecarFuncionario;

    @FXML
    private Button botaoCadastrarFuncionario;
    
    @FXML
    private TextField textFieldNomeDoFuncionario;
    
    @FXML
    private TextField textFieldNomeCadastroDoFuncionario;
    
    @FXML
    private TextField textFieldFuncaoDoFuncionario;
    
    @FXML
    private TextField textFieldResultadoBuscaFuncionario;
    
    @FXML
    private TextField textFieldResultadoCadastroFuncionario;
    
    @FXML
    private PasswordField textFieldSenhaDoSistema;
    
    @FXML
    void checarExistenciaFuncionario(ActionEvent event) throws IOException{
    	Banco banco = Banco.getInstance();
		
		String input1 = textFieldNomeDoFuncionario.getText();
		String input2 = textFieldSenhaDoSistema.getText();
		
		if(banco.getBancoFuncionarios().buscarFuncionario(input1) && banco.getSenhaDoSistema().equals(input2)) {
    		entrarMenuFuncionario();
    	}else {
    		textFieldResultadoBuscaFuncionario.setText("Funcionário não encontrado e/ou entrada inválida!");
    	}
    }
    
    @FXML
    void cadastrarFuncionario(ActionEvent event) {
    	String input1 = textFieldNomeCadastroDoFuncionario.getText();
    	String input2 = textFieldFuncaoDoFuncionario.getText();
    	
    	if(!input1.equals("") || input2.equals("")) {
			Banco banco = Banco.getInstance();
			
			int id = banco.getBancoFuncionarios().getContadorParaId();
			
			Funcionario employer = new Funcionario();
			employer.setId(id);
			employer.setNome(input1);
			banco.getBancoFuncionarios().cadastrarFuncionario(employer);
			
			textFieldResultadoCadastroFuncionario.setText("Funcionario Cadastrado!");
    	}else {
    		textFieldResultadoCadastroFuncionario.setText("Por favor preencha os campos!");
    	}
    }
    
    @FXML
    void fecharJanela(ActionEvent event) {
    	funcionarioStage.close();
    }
    
    void entrarMenuFuncionario() throws IOException {
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(TelaMenuFuncionarioController.class.getResource("/br/ufrn/imd/visao/TelaMenuFuncionario.fxml"));
    	AnchorPane page = (AnchorPane) loader.load();
    	
    	Stage menuFuncionarioStage = new Stage();
    	menuFuncionarioStage.setTitle("Menu do Funcionário");
    	menuFuncionarioStage.setResizable(false);
    	Scene scene = new Scene(page);
    	menuFuncionarioStage.setScene(scene);
    	
    	TelaMenuFuncionarioController controller = loader.getController();
    	controller.setMenuFuncionarioStage(menuFuncionarioStage);
    	controller.preencherPedidos();
    	menuFuncionarioStage.showAndWait();
    }

	public void setFuncionarioStage(Stage funcionarioStage) {
		this.funcionarioStage = funcionarioStage;
	}
}