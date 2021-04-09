package br.ufrn.imd.controle;

import br.ufrn.imd.dao.Banco;
import br.ufrn.imd.modelo.Pedido;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TelaMenuFuncionarioController {
	
	@FXML
    private TextArea textAreaPedidos;

    @FXML
    private MenuItem menuitemFecharJanela;

    @FXML
    private TextField textFieldInformarPedido;

    @FXML
    private Button botaoDespacharPedido;

    @FXML
    void despacharPedido(ActionEvent event) {

    }

    @FXML
    void fecharJanela(ActionEvent event) {

    }
    
    public void preencherPedidos() {
    	Pedido pedido = new Pedido();
    	
    	textAreaPedidos.setText(pedido.listarItens());
    }

}