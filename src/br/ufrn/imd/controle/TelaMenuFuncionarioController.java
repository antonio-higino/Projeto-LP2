package br.ufrn.imd.controle;

import br.ufrn.imd.dao.Banco;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TelaMenuFuncionarioController {
	
	private Stage menuFuncionarioStage;
	
	@FXML
    private TextArea textAreaPedidos;

    @FXML
    private MenuItem menuitemFecharJanela;

    @FXML
    private TextField textFieldMostrarSaldoDoCaixa;

    @FXML
    private Button botaoGerarSaldoCaixa;

    @FXML
    void gerarSaldoDoCaixa(ActionEvent event) {
    	Banco banco = Banco.getInstance();
    	double valor = banco.getSaldoDoCaixa();
    	textFieldMostrarSaldoDoCaixa.setText(Double.toString(valor));
    }
    
    @FXML
    void fecharJanela(ActionEvent event) {
    	menuFuncionarioStage.close();
    }
    
    public void preencherPedidos() {
    	Banco banco = Banco.getInstance();
  
    	textAreaPedidos.setText(banco.getFilaDaCozinha().listarPedidos());
    }
    
    public void setMenuFuncionarioStage(Stage menuFuncionarioStage) {
    	this.menuFuncionarioStage = menuFuncionarioStage;
    }
}