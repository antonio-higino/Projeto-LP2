package br.ufrn.imd.controle;

import br.ufrn.imd.dao.Cardapio;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TelaCardapioController {
	
	private Stage cardapioStage;
	
	@FXML
    private TextArea textAreaPratos;

    @FXML
    private CheckBox checkBoxFrango;

    @FXML
    private CheckBox checkBoxCarne;

    @FXML
    private CheckBox checkBoxPeixe;

    @FXML
    private CheckBox checkBoxHamburger;

    @FXML
    private TextField textFieldQntFrango;

    @FXML
    private TextField textFieldQntCarne;

    @FXML
    private TextField textFieldQntPeixe;

    @FXML
    private TextField textFieldQntHamburger;

    @FXML
    private TextArea textAreaBebidas;

    @FXML
    private CheckBox checkBoxAgua;

    @FXML
    private CheckBox checkBoxSuco;

    @FXML
    private CheckBox checkBoxCoca;

    @FXML
    private CheckBox checkBoxGuarana;

    @FXML
    private TextField textFieldQntAgua;

    @FXML
    private TextField textFieldQntSuco;

    @FXML
    private TextField textFieldQntCoca;

    @FXML
    private TextField textFieldQntGuarana;

    @FXML
    private MenuItem menuItemFecharJanela;

    @FXML
    private Button botaoFinalizarPedido;

    @FXML
    private TextField textFieldIdDaComanda;

    @FXML
    private TextField textFieldAvisoCardapio;

    @FXML
    void fecharJanela(ActionEvent event) {
    	cardapioStage.close();
    }

    @FXML
    void finalizarPedido(ActionEvent event) {

    }
    
    public void preencherTextAreas() {
    	Cardapio cardapio = new Cardapio();
    	
    	textAreaPratos.setText(cardapio.listarPratos());
    	textAreaBebidas.setText(cardapio.listarBebidas());
    }

	public void setCardapioStage(Stage cardapioStage) {
		this.cardapioStage = cardapioStage;
	}
}