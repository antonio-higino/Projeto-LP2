package br.ufrn.imd.controle;

import br.ufrn.imd.dao.Banco;
import br.ufrn.imd.modelo.Funcionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TelaCadastroFuncionarioController {
	
	private Stage cadastroStage;
	
	private boolean novoFuncionarioCadastrado = false;
	
	@FXML
    private MenuItem menuItemFecharJanela;

	@FXML
    private Button botaoCadastrarFuncionario;
	
	@FXML
    private Button botaoEntrarMenuFuncionario;
	
	@FXML
	private TextField textFieldNomeDoFuncionario;

    @FXML
    private TextField textFieldFuncaoDoFuncionario;

    @FXML
    private TextField textFieldResultadoCadastro;
    
    @FXML
    void cadastrarFuncionario(ActionEvent event) {
    	String input = textFieldNomeDoFuncionario.getText();
    	String input2 = textFieldFuncaoDoFuncionario.getText();
    	
    	if(!input.equals("") && !input2.equals("")) {
			Banco banco = Banco.getInstance();
			
			int id = banco.getBancoFuncionarios().getContadorParaId();
			
			Funcionario employer = new Funcionario();
			
			employer.setId(id);
			
			employer.setNome(input);
			
			banco.getBancoFuncionarios().cadastrarFuncionario(employer);
			
			textFieldResultadoCadastro.setText("Funcionario Nº: " + id + " cadastrado com sucesso!");
			
			novoFuncionarioCadastrado = true;
    	}else {
    		textFieldResultadoCadastro.setText("Por favor preencha seu nome e/ou função!");
    	}
    }

    @FXML
    void abrirTelaMenuFuncionario(ActionEvent event) {

    }
    
    @FXML
    void fecharJanela(ActionEvent event) {
    	cadastroStage.close();
    }
    
    public void setCadastroFuncionarioStage(Stage cadastroStage) {
    	this.cadastroStage = cadastroStage;
    }
}