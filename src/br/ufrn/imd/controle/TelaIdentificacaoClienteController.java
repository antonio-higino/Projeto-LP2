package br.ufrn.imd.controle;

import java.io.IOException;

import br.ufrn.imd.dao.Banco;
import br.ufrn.imd.modelo.Comanda;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaIdentificacaoClienteController {
	
	private Stage clienteStage;
	
	@FXML
    private Button botaoEntrar;

    @FXML
    private TextField textFieldNomeDoCliente;

    @FXML
    private Button botaoGerarComanda;

    @FXML
    private MenuItem menuItemFecharJanela;

    @FXML
    private TextField textFieldNumeroDaComanda;
    
    @FXML
    private TextField textFieldResultadoDaBusca;
    
    @FXML
    private TextField textFieldIdDaComandaGerada;

    @FXML
    void checarExistenciaComanda(ActionEvent event) throws IOException {
    	try {
    		Banco banco = Banco.getInstance();
    		
    		String input = textFieldNumeroDaComanda.getText();
    		
    		int id = Integer.parseInt(input);
    		
    		if(banco.getBancoComandas().buscarComanda(id)) {
    			if(!banco.getBancoComandas().getComandaEspecifica(id).isFoiPaga()) {
    				abrirTelaMenuCliente();
    			}else {
    				textFieldResultadoDaBusca.setText("Comanda não encontrada");
    			}
        	}else {
        		textFieldResultadoDaBusca.setText("Comanda não encontrada");
        	}
    		
    	} catch(NumberFormatException ex){
    		textFieldResultadoDaBusca.setText("Número de comanda inválido");
    	}
    }

    @FXML
    void fecharJanela(ActionEvent event) {
    	clienteStage.close();
    }

    @FXML
    void gerarNovaComanda(ActionEvent event) {
    	String input = textFieldNomeDoCliente.getText();
    	
    	if(!input.equals("")) {
			Banco banco = Banco.getInstance();
			
			int id = banco.getBancoComandas().getContadorParaId();
			
			Comanda comanda = new Comanda();
			
			comanda.setId(id);
			
			comanda.setNomeDoCliente(input);
			
			banco.getBancoComandas().cadastrarComanda(comanda);
			
			textFieldIdDaComandaGerada.setText("A sua comanda é número " + id);
    	}else {
    		textFieldIdDaComandaGerada.setText("Por favor preencha seu nome");
    	}
    }

	public void setClienteStage(Stage clienteStage) {
		this.clienteStage = clienteStage;
	}
	
	void abrirTelaMenuCliente() throws IOException {
		FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(TelaMenuClienteController.class.getResource("/br/ufrn/imd/visao/TelaMenuCliente.fxml"));
    	AnchorPane page = (AnchorPane) loader.load();
    	
    	Stage menuClienteStage = new Stage();
    	menuClienteStage.setTitle("Menu dos clientes");
    	menuClienteStage.setResizable(false);
    	Scene scene = new Scene(page);
    	menuClienteStage.setScene(scene);
    	
    	TelaMenuClienteController controller = loader.getController();
    	controller.setMenuClienteStage(menuClienteStage);
    	menuClienteStage.showAndWait();
    	clienteStage.close();
	}
}